package hku.picshare.controller;


import hku.picshare.entity.*;
import hku.picshare.mapper.*;
import hku.picshare.util.RequestMsg;
import hku.picshare.util.ResponseMsg;
import hku.picshare.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ListController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    FormMapper formMapper;
    @Autowired
    FormTagMapper formTagMapper;
    @Autowired
    TagMapper tagMapper;
    @Autowired
    PhotoMapper photoMapper;

    private List<FormItem> getAllForm() {
        List<FormItem> retList = new ArrayList<>();
        List<Form> formList = formMapper.selectList(null);
        for (Form formO : formList) {
            FormItem item = new FormItem();
            item.user = userMapper.selectById(formO.getUserId());
            item.id = formO.getId();
            item.content = formO.getDescription();

            Map<String, Object> formTagQuery = new HashMap<>();
            formTagQuery.put("form_id", formO.getId());
            List<FormTag> formTagList = formTagMapper.selectByMap(formTagQuery);
            for (FormTag formTag: formTagList) {
                Tag tag = tagMapper.selectById(formTag.getTagId());
                item.tags.add(tag);
            }

            Map<String, Object> photoQuery = new HashMap<>();
            photoQuery.put("form_id", formO.getId());
            List<Photo> photoList = photoMapper.selectByMap(photoQuery);
            item.imageUrl = photoList.get(0).getUrl();
            retList.add(item);
        }
        return retList;
    }

    @RequestMapping(value = "/getList")
    @ResponseBody
    public FormListRsp getList(@RequestBody RequestMsg requestMsg){
        List<FormItem> allFormList = getAllForm();
        FormListRsp rsp = new FormListRsp(Result.SUCCESS);
        rsp.form = allFormList;
        return rsp;
    }

    @RequestMapping(value = "/search")
    @ResponseBody
    public FormListRsp search(@RequestBody SearchRequestMsg requestMsg){
        List<FormItem> allList = getAllForm();
        Iterator<FormItem> itemIterator = allList.iterator();
        while (itemIterator.hasNext()) {
            FormItem item = itemIterator.next();
            boolean fitTag = false;
            for (Tag tag: item.tags) {
                if (tag.getName().contains(requestMsg.searchText)) {
                    fitTag = true;
                }
            }
            if (!fitTag) {
                itemIterator.remove();
            }
        }
        FormListRsp rsp = new FormListRsp(Result.SUCCESS);
        rsp.form = allList;
        return rsp;
    }

    @RequestMapping(value = "/post")
    @ResponseBody
    public ResponseMsg post(@RequestBody FormItem formItem){
        User user = userMapper.selectById(formItem.user.getId());
        if (user == null) {
            ResponseMsg msg = new ResponseMsg(Result.FAIL);
            msg.setFailReason("no user id:" + formItem.user.getId());
            return msg;
        }
        Form form = new Form();
        form.setUserId(user.getId());
        form.setDescription(formItem.content);
        int formRet = formMapper.insert(form);
        for (Tag tag: formItem.tags) {
            Map<String, Object> tagQuery = new HashMap<>();
            tagQuery.put("name", tag.getName());
            List<Tag> existTagList = tagMapper.selectByMap(tagQuery);
            if (existTagList == null || existTagList.isEmpty()) {
                tagMapper.insert(tag);
            } else {
                tag = existTagList.get(0);
            }
            FormTag formTag = new FormTag();
            formTag.setFormId(form.getId());
            formTag.setTagId(tag.getId());
            formTagMapper.insert(formTag);
        }
        Photo photo = new Photo();
        photo.setFormId(form.getId());
        photo.setUrl(formItem.imageUrl);
        photoMapper.insert(photo);

        return new ResponseMsg(Result.SUCCESS);
    }

    public static class SearchRequestMsg extends RequestMsg {
        public String searchText;
    }

    public static class FormListRsp extends ResponseMsg {
        public List<FormItem> form;
        public FormListRsp(Result result) {
            super(result);
        }

        public FormListRsp(Result result, String reason) {
            super(result, reason);
        }
    }

    public static class FormItem {
        public User user;
        public int id;
        public String content;
        public String imageUrl;
        public List<Tag> tags = new ArrayList<>();
    }
}
