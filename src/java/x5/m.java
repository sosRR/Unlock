package x5;

public class m {
   private static final n a;
   private static final b6.b[] b;

   static {
      n var0 = null;

      label18: {
         n var1;
         try {
            var1 = (n)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ClassCastException var2) {
            break label18;
         }

         var0 = var1;
      }

      if (var0 == null) {
         var0 = new n();
      }

      a = var0;
      b = new b6.b[0];
   }

   public static b6.b a(Class var0) {
      return a.a(var0);
   }

   public static b6.c b(Class var0) {
      return a.b(var0, "");
   }

   public static b6.d c(j var0) {
      return a.c(var0);
   }

   public static String d(h var0) {
      return a.e(var0);
   }
}
