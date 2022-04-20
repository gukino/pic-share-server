package hku.picshare.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author hqj
 * 用户实体类
 */

@Entity
@Getter
@Setter
@Table(name = "user")
public class User implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "desc")
    private String desc;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "avatar")
    private String avatar;


}
