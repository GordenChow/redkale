/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redkale.util;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

/**
 * 自动加载。 使用场景：
 * 1、被标记为@AutoLoad(false)的Service类不会被自动加载
 * 2、被标记为@AutoLoad(false)的Servlet类不会被自动加载
 *
 * <p> 详情见: http://redkale.org
 * @author zhangjx
 */
@Documented
@Target({TYPE})
@Retention(RUNTIME)
public @interface AutoLoad {

    boolean value() default true;
}
