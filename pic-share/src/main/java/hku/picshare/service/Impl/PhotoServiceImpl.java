package hku.picshare.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hku.picshare.entity.photo;
import hku.picshare.mapper.photoMapper;
import hku.picshare.service.PhotoService;
import org.springframework.stereotype.Service;

/**
 * @author yhp
 *
 */
@Service
public class PhotoServiceImpl extends ServiceImpl<photoMapper, photo> implements PhotoService {



}
