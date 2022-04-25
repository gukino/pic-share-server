package hku.picshare.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hku.picshare.entity.photo;
import hku.picshare.mapper.PhotoMapper;
import hku.picshare.service.PhotoService;
import org.springframework.stereotype.Service;

/**
 * @author yhp
 *
 */
@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, photo> implements PhotoService {



}
