package hku.picshare.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
    @TableField(value = "form_id")
    private Integer formId;
    @TableField(value = "tag_id")
    private Integer tagId;
}
