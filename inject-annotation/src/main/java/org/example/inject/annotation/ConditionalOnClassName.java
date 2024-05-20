package org.example.inject.annotation;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 定义一个自定义条件注解，用于根据指定类名的配置值判断是否应用某个配置。
 */
@Target({ ElementType.TYPE, ElementType.METHOD }) // 注解可以应用于类和方法
@Retention(RetentionPolicy.RUNTIME) // 注解会在运行时保留
@Documented // 注解会被包含在javadoc中
@Conditional(ConditionalOnClassNameCustom.class) // 该注解条件受到 ConditionalOnClassNameCustom 类的限制
public @interface ConditionalOnClassName {
    Class<?>[] value() default {}; // 作为 value 属性的别名，用于更简洁地指定需要检查的类
    Class<?>[] name(); // 需要检查的类的全限定名数组
    String havingValue() default "default"; // 期望的配置值，默认为 "default"
    boolean matchIfMissing() default false; // 如果配置值缺失是否匹配，默认为 false
}


