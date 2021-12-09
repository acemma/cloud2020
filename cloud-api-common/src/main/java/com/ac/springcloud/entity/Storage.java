package com.ac.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author acemma
 * @Date 2021/12/6 11:19
 * @Description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage implements Serializable {


    private static final long serialVersionUID = 5883758906718744323L;

    private Long id;

    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;

}
