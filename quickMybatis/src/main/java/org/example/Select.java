package org.example;

import java.lang.annotation.*;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/9/27 19:43
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {
    String[] value();
}
