package com.liulei.cloud.annotations;

import java.lang.annotation.*;

/**
 * @author liulei
 * @date 2020/3/26 16:01
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Sensitive {
}
