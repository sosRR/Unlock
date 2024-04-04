package c5;

import java.util.HashSet;
import java.util.Set;

public class d {
   private static volatile d b;
   private final Set a = new HashSet();

   d() {
   }

   public static d a() {
      d var1 = b;
      d var0 = var1;
      if (var1 == null) {
         Class var2 = d.class;
         synchronized(d.class){}

         Throwable var10000;
         boolean var10001;
         label206: {
            try {
               var1 = b;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label206;
            }

            var0 = var1;
            if (var1 == null) {
               try {
                  var0 = new d();
                  b = var0;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label206;
               }
            }

            label193:
            try {
               return var0;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label193;
            }
         }

         while(true) {
            Throwable var23 = var10000;

            try {
               throw var23;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               continue;
            }
         }
      } else {
         return var0;
      }
   }

   Set b() {
      // $FF: Couldn't be decompiled
   }
}
