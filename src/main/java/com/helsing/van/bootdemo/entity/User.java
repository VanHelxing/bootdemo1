package com.helsing.van.bootdemo.entity;

import com.yyfly.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户表
 *
 * @author : yangjunqing
 * @version : 1.0
 * @ClassName User
 * @Date : 2019/1/3 16:54
 */
@Data
@Entity
@Table(name = "t_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = -6680646793038093043L;


    private String name;

    private String age;
}
