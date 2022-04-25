package hku.picshare.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author hqj
 * 用户实体类
 */


@Data
@ToString
public class User implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String email;
    @TableField("`desc`")
    private String description;
    @JsonProperty("password")
    private String pwd;
    private String avatar;

    public User(String name, String email, String description, String pwd, String avatar) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.pwd = pwd;
        this.avatar = avatar;
    }
}
