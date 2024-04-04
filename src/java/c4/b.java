package c4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class b {
   private final Map a = new HashMap();
   private final int b;
   private final int c;

   public b(int var1, int var2) {
      this.b = var1;
      this.c = var2;
   }

   private String b(String var1) {
      if (var1 != null) {
         return c(var1, this.c);
      } else {
         throw new IllegalArgumentException("Custom attribute key must not be null.");
      }
   }

   public static String c(String var0, int var1) {
      String var2 = var0;
      if (var0 != null) {
         var0 = var0.trim();
         var2 = var0;
         if (var0.length() > var1) {
            var2 = var0.substring(0, var1);
         }
      }

      return var2;
   }

   public Map a() {
      synchronized(this){}

      Map var5;
      try {
         HashMap var1 = new HashMap(this.a);
         var5 = Collections.unmodifiableMap(var1);
      } finally {
         ;
      }

      return var5;
   }

   public void d(Map var1) {
      synchronized(this){}

      Throwable var10000;
      label467: {
         Iterator var3;
         boolean var10001;
         try {
            var3 = var1.entrySet().iterator();
         } catch (Throwable var48) {
            var10000 = var48;
            var10001 = false;
            break label467;
         }

         int var2 = 0;

         label457:
         while(true) {
            while(true) {
               String var4;
               Map.Entry var49;
               try {
                  if (!var3.hasNext()) {
                     break label457;
                  }

                  var49 = (Map.Entry)var3.next();
                  var4 = this.b((String)var49.getKey());
                  if (this.a.size() >= this.b && !this.a.containsKey(var4)) {
                     break;
                  }
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label467;
               }

               Map var5;
               String var50;
               try {
                  var50 = (String)var49.getValue();
                  var5 = this.a;
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break label467;
               }

               if (var50 == null) {
                  var50 = "";
               } else {
                  try {
                     var50 = c(var50, this.c);
                  } catch (Throwable var45) {
                     var10000 = var45;
                     var10001 = false;
                     break label467;
                  }
               }

               try {
                  var5.put(var4, var50);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label467;
               }
            }

            ++var2;
         }

         if (var2 <= 0) {
            return;
         }

         label434:
         try {
            y3.f var52 = y3.f.f();
            StringBuilder var53 = new StringBuilder();
            var53.append("Ignored ");
            var53.append(var2);
            var53.append(" entries when adding custom keys. Maximum allowable: ");
            var53.append(this.b);
            var52.k(var53.toString());
            return;
         } catch (Throwable var43) {
            var10000 = var43;
            var10001 = false;
            break label434;
         }
      }

      Throwable var51 = var10000;
      throw var51;
   }
}
