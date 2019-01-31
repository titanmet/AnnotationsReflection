package ru.ratnikov.reflection.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target({ElementType.PACKAGE})
public @interface PackageOwner {
    String owner() default "";
}