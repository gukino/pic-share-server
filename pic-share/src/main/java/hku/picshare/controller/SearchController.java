package hku.picshare.controller;

import hku.picshare.service.FormTagService;
import hku.picshare.service.UserService;
import hku.picshare.service.TagService;
//import hku.picshare.util.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yhp
 * @create 2022-04-25 23:37
 */

@RestController
public class SearchController {

    @Autowired
    UserService userService;

    @Autowired
    TagService tagService;

    @Autowired
    FormTagService formTagService;

    @Autowired
    UserService formService;

//    @RequestMapping(value = "/search")
//    public List<SearchResult> search(String keyword){
//        List<SearchResult> searchResults=new LinkedList<>();
//        QueryWrapper<tag> queryWrapper = new QueryWrapper<>();
//        queryWrapper.like("name", keyword);
//
//
//
//        return searchResults;
//
//
//    }



}
