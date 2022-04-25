package hku.picshare.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hku.picshare.entity.Form;
import hku.picshare.mapper.FormMapper;
import hku.picshare.service.FormService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yhp
 *
 */
@Service
public class FormServiceImpl extends ServiceImpl<FormMapper, Form> implements FormService {

    @Autowired
    FormMapper formMapper;

    @Override
    public ArrayList<Form> getAllFormList() {
        return (ArrayList<Form>) formMapper.selectList(null);
    }
    
}
