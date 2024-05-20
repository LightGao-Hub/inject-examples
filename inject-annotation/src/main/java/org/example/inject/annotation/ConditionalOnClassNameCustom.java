package org.example.inject.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

/**
 * 自定义的条件判断类，用于根据指定类名的配置值判断是否应用某个配置。
 */
public class ConditionalOnClassNameCustom implements Condition {

    /**
     * 判断是否满足条件。
     *
     * @param context  条件上下文
     * @param metadata 注解元数据
     * @return 如果满足条件，则返回true；否则返回false
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取ConditionalOnClassName注解的属性值
        Class<?>[] annotationValues = (Class<?>[]) metadata.getAnnotationAttributes(ConditionalOnClassName.class.getName()).get("name");
        String annotationClassName = annotationValues[0].getName(); // 获取类的全限定名
        String havingValue = (String) metadata.getAnnotationAttributes(ConditionalOnClassName.class.getName()).get("havingValue");
        boolean matchIfMissing = (boolean) metadata.getAnnotationAttributes(ConditionalOnClassName.class.getName()).get("matchIfMissing");

        // 获取配置值
        String propertyValue = context.getEnvironment().getProperty(annotationClassName);

        // 检查配置值是否符合预期
        if (StringUtils.hasText(propertyValue)) {
            return havingValue.equals(propertyValue);
        } else {
            return matchIfMissing;
        }
    }
}

