package com.wansoft.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The class TheClass has the annotation @MyAnnotation written ontop. 
 * Annotations are defined like interfaces. Here is the MyAnnotation definition
 * @author Juan Salinas Zavaleta
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
	public String name();
	public String value();
}
