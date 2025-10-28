package com.xdq.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 发布/上线请求
 *
 * @author xdq
 * 
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}