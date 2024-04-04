package x0;

import java.util.List;

public abstract class i {
   private static final String a = k.f("InputMerger");

   public static i a(String var0) {
      try {
         i var6 = (i)Class.forName(var0).newInstance();
         return var6;
      } catch (Exception var5) {
         k var1 = k.c();
         String var4 = a;
         StringBuilder var2 = new StringBuilder();
         var2.append("Trouble instantiating + ");
         var2.append(var0);
         var1.b(var4, var2.toString(), var5);
         return null;
      }
   }

   public abstract androidx.work.b b(List var1);
}
