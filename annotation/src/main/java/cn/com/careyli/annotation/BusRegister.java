package cn.com.careyli.annotation;

/**
 * Created by liming on 2018/6/13.
 * email liming@finupgroup.com
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在非Activity和Fragment中使用该注解，会自动在其方法体后面加注册逻辑
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BusRegister {
}
