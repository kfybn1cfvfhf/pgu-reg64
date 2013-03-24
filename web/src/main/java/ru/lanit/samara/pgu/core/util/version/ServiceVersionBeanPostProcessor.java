package ru.lanit.samara.pgu.core.util.version;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceVersionBeanPostProcessor implements BeanPostProcessor {

    //private String pattern;
    private Pattern controllerNamePattern;
    private Pattern serviceCodePattern;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanNameMatches(beanName)) {
            if (bean.getClass().isAnnotationPresent(Version.class)) {
                Version version = bean.getClass().getAnnotation(Version.class);
                ServiceVersion.setVersion(serviceCode(beanName), version.value());
            }
            else {
                ServiceVersion.setVersion(serviceCode(beanName), Version.DEFAULT_VERSION);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    private boolean beanNameMatches(String beanName) {
        return controllerNamePattern.matcher(beanName).matches();
    }

    private String serviceCode(String beanName) {
        Matcher matcher = serviceCodePattern.matcher(beanName);
        if (matcher.find()) {
            return matcher.group();
        }
        else {
            return beanName;
        }
    }

    public void setControllerPattern(String pattern) {
        this.controllerNamePattern = Pattern.compile(pattern);
    }

    public void setServiceCodePattern(String pattern) {
        this.serviceCodePattern = Pattern.compile(pattern);
    }
}
