package w3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class s implements q4.d, q4.c {
   private final Map a = new HashMap();
   private Queue b = new ArrayDeque();
   private final Executor c;

   s(Executor var1) {
      this.c = var1;
   }

   // $FF: synthetic method
   public static void c(Map.Entry var0, q4.a var1) {
      f(var0, var1);
   }

   private Set e(q4.a var1) {
      synchronized(this){}

      Throwable var10000;
      label113: {
         boolean var10001;
         Map var15;
         try {
            var15 = (Map)this.a.get(var1.b());
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label113;
         }

         Set var16;
         if (var15 == null) {
            try {
               var16 = Collections.emptySet();
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label113;
            }
         } else {
            try {
               var16 = var15.entrySet();
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label113;
            }
         }

         return var16;
      }

      Throwable var17 = var10000;
      throw var17;
   }

   // $FF: synthetic method
   private static void f(Map.Entry var0, q4.a var1) {
      ((q4.b)var0.getKey()).a(var1);
   }

   public void a(Class var1, q4.b var2) {
      this.b(var1, this.c, var2);
   }

   public void b(Class var1, Executor var2, q4.b var3) {
      synchronized(this){}

      try {
         z.b(var1);
         z.b(var3);
         z.b(var2);
         if (!this.a.containsKey(var1)) {
            Map var5 = this.a;
            ConcurrentHashMap var4 = new ConcurrentHashMap();
            var5.put(var1, var4);
         }

         ((ConcurrentHashMap)this.a.get(var1)).put(var3, var2);
      } finally {
         ;
      }

   }

   void d() {
      synchronized(this){}

      Queue var1;
      label259: {
         Throwable var10000;
         boolean var10001;
         label260: {
            try {
               var1 = this.b;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label260;
            }

            if (var1 != null) {
               try {
                  this.b = null;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label260;
               }
            } else {
               var1 = null;
            }

            label246:
            try {
               break label259;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label246;
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
      }

      if (var1 != null) {
         Iterator var24 = var1.iterator();

         while(var24.hasNext()) {
            this.g((q4.a)var24.next());
         }
      }

   }

   public void g(q4.a var1) {
      z.b(var1);
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label222: {
         Queue var2;
         try {
            var2 = this.b;
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label222;
         }

         if (var2 != null) {
            label215:
            try {
               var2.add(var1);
               return;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label215;
            }
         } else {
            label226: {
               try {
                  ;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label226;
               }

               Iterator var26 = this.e(var1).iterator();

               while(var26.hasNext()) {
                  Map.Entry var3 = (Map.Entry)var26.next();
                  ((Executor)var3.getValue()).execute(new r(var3, var1));
               }

               return;
            }
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }
}
