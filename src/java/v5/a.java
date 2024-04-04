package v5;

import b6.b;
import x5.g;

public final class a {
   public static final Class a(b var0) {
      g.e(var0, "<this>");
      Class var1 = ((x5.b)var0).a();
      g.c(var1, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
      return var1;
   }

   public static final Class b(b var0) {
      g.e(var0, "<this>");
      Class var2 = ((x5.b)var0).a();
      if (!var2.isPrimitive()) {
         g.c(var2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
         return var2;
      } else {
         switch (var1) {
            case "double":
               var2 = Double.class;
               break;
            case "int":
               var2 = Integer.class;
               break;
            case "byte":
               var2 = Byte.class;
               break;
            case "char":
               var2 = Character.class;
               break;
            case "long":
               var2 = Long.class;
               break;
            case "void":
               var2 = Void.class;
               break;
            case "boolean":
               var2 = Boolean.class;
               break;
            case "float":
               var2 = Float.class;
               break;
            case "short":
               var2 = Short.class;
         }

         g.c(var2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
         return var2;
      }
   }
}
