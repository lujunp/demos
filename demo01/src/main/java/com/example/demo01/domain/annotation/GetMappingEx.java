package com.example.demo01.domain.annotation;

import com.example.demo01.domain.permission.Modules;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * Copyright (c) 2019 by CANSHU
 * 重构GetMapping注解
 *
 * @author lujunp Create on 2019/3/13 15:36
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping(method = RequestMethod.GET)
@SuppressWarnings("unused")
public @interface GetMappingEx {

    /**
     * Alias for {@link RequestMapping#name()}.
     */
    @AliasFor(annotation = RequestMapping.class)
    String name() default "";

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
     * Alias for {@link RequestMapping#params()}.
     */
    @AliasFor(annotation = RequestMapping.class)
    String[] params() default {};

    /**
     * Alias for {@link RequestMapping#headers()}.
     */
    @AliasFor(annotation = RequestMapping.class)
    String[] headers() default {};

    /**
     * Alias for {@link RequestMapping#consumes()}.
     * since 4.3.5
     */
    @AliasFor(annotation = RequestMapping.class)
    String[] consumes() default {};

    /**
     * Alias for {@link RequestMapping#produces()}
     */
    @AliasFor(annotation = RequestMapping.class)
    String[] produces() default {};

    /**
     * 功能名称
     */
    String funcName() default "";

    /**
     * 模块名称
     */
    Modules modules() default Modules.NONE;



}
