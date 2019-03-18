package com.example.demo01.domain.annotation;

import com.example.demo01.domain.permission.Modules;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.*;

/**
 * Copyright (c) 2019 by CANSHU
 *
 * @author lujunp Create on 2019/3/13 16:09
 * @version 1.0
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping
@SuppressWarnings("unused")
public @interface RequestMappingEx {

    /**
     * Alias for {@link RequestMapping#value()}.
     */
    @AliasFor(annotation = RequestMapping.class)
    String[] value() default {};

    /**
     * Alias for {@link RequestMapping#path()}.
     */
    @AliasFor(annotation = RequestMapping.class)
    String[] path() default {};

    /**
     * 功能名称
     */
    String funcName() default "";

    /**
     * 模块名称
     */
    Modules module() default Modules.NONE;

}
