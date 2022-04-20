package hku.picshare.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author yhp
 * @create 2022-04-20 23:00
 * photo类
 */
@Data
@ToString
public class photo {
    private Integer id;
    private Integer form_id;
    private String url;
}
