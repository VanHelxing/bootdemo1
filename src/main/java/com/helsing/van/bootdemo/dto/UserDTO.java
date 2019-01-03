package com.helsing.van.bootdemo.dto;

import com.yyfly.common.dto.BaseDTO;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : yangjunqing
 * @version : 1.0
 * @ClassName UserDTO
 * @Date : 2019/1/3 17:01
 */
@Data
public class UserDTO extends BaseDTO implements Serializable {
    private static final long serialVersionUID = 391668647172243239L;

    private String name;

    private String age;
}
