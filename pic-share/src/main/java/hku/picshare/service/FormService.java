package hku.picshare.service;

import com.baomidou.mybatisplus.extension.service.IService;
import hku.picshare.entity.Form;
import java.util.ArrayList;

/**
 * @author yhp
 *
 */
public interface FormService extends IService<Form>{
    ArrayList<Form> getAllFormList();
}
