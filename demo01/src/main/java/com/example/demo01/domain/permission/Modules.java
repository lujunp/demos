package com.example.demo01.domain.permission;

/**
 * Copyright (c) 2019 by CANSHU
 *
 * 模块id,name
 *
 * 单点登陆
 * @author lujunp Create on 2019/3/13 15:51
 * @version 1.0
 */
@SuppressWarnings("all")
public enum  Modules {

    NONE(0,"未设置");

    /**
     * id
     */
    private int id;

    /**
     * name
     */
    private String name;

    private Modules(int id, String name){
        this.id = id;
        this.name = name;
    }
}
