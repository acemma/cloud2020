package com.ac.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author acemma
 * @Date 2021/11/9 14:38
 * @Description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {


    private static final long serialVersionUID = -7831070772681492592L;

    private Long id;
    private String serial;
}
