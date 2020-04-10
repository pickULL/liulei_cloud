package com.liulei.cloud.aspect;

import cn.hutool.http.HttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

/**
 * @author liulei
 * @date 2020/3/26 11:44
 */
@Aspect
@Component
@Slf4j
public class SensitiveAspect {
    @Pointcut("@annotation(com.liulei.cloud.annotations.Sensitive)")
    public void point(){}

    @Around("point() && @annotation(com.liulei.cloud.annotations.Sensitive)")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object target = joinPoint.getTarget();
        log.info("+++++++++++target:"+target);
        System.out.println("+++++++++++target:"+target);
        System.out.println("目标方法名为:" + joinPoint.getSignature().getName());
        System.out.println("目标方法所属类的简单类名:" + joinPoint.getSignature().getDeclaringType().getSimpleName());
        System.out.println("目标方法所属类的类名:" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("目标方法声明类型:" + Modifier.toString(joinPoint.getSignature().getModifiers()));
        //获取传入目标方法的参数
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数为:" + args[i]);
        }
        System.out.println("被代理的对象:" + joinPoint.getTarget());
        System.out.println("代理对象自己:" + joinPoint.getThis());
        return joinPoint.proceed();
    }
}
