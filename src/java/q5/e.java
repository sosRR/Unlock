package q5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface e {
   String c() default "";

   String f() default "";

   int[] l() default {};

   String m() default "";

   int v() default 1;
}
