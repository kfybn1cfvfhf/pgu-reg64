package ru.lanit.samara.pgu.core.util.version;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Version {

    static final String DEFAULT_VERSION = "version not specified";

    String value() default Version.DEFAULT_VERSION;
}