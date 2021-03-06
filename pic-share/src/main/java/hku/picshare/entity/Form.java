package hku.picshare.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.JdbcType;

/**
 * @author yhp
 * @create 2022-04-20 22:56
 * Form类
 */
@Data
@ToString
public class Form {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField(value = "user_id")
    private Integer userId = 0;
    private String description;
}
