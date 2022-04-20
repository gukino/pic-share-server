package hku.picshare.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author yhp
 * @create 2022-04-20 22:58
 * FormTag类
 */
@Data
@ToString
public class FormTag {
    private Integer id;
    private Integer form_id;
    private Integer tag_id;
}
