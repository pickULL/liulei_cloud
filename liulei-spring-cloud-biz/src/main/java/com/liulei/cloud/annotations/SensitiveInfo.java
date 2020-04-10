package com.liulei.cloud.annotations;


import com.liulei.cloud.enums.SensitiveType;

import java.lang.annotation.*;


/** 
 * 敏感信息注解标记 
 * ClassName: SensitiveInfo 
 * @Description: TODO
 * @author hsl.Mr.C 862711826@qq.com
 * @date 2019年6月22日
 */
@Target({ElementType.FIELD,ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME)  
@Inherited  
@Documented  
public @interface SensitiveInfo {  
  
    public SensitiveType type() ;
}  

