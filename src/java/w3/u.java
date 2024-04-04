package w3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class u implements t4.b {
   private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());
   private volatile Set b = null;

   u(Collection var1) {
      this.a.addAll(var1);
   }

   static u b(Collection var0) {
      return new u((Set)var0);
   }

   private void d() {
      synchronized(this){}

      Throwable var10000;
      label132: {
         Iterator var1;
         boolean var10001;
         try {
            var1 = this.a.iterator();
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label132;
         }

         while(true) {
            try {
               if (var1.hasNext()) {
                  t4.b var2 = (t4.b)var1.next();
                  this.b.add(var2.get());
                  continue;
               }
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break;
            }

            try {
               this.a = null;
               return;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break;
            }
         }
      }

      Throwable var16 = var10000;
      throw var16;
   }

   void a(t4.b var1) {
      synchronized(this){}

      try {
         if (this.b == null) {
            this.a.add(var1);
         } else {
            this.b.add(var1.get());
         }
      } finally {
         ;
      }

   }

   public Set c() {
      if (this.b == null) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label144: {
            try {
               if (this.b == null) {
                  ConcurrentHashMap var1 = new ConcurrentHashMap();
                  this.b = Collections.newSetFromMap(var1);
                  this.d();
               }
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label144;
            }

            label141:
            try {
               return Collections.unmodifiableSet(this.b);
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label141;
            }
         }

         while(true) {
            Throwable var15 = var10000;

            try {
               throw var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               continue;
            }
         }
      } else {
         return Collections.unmodifiableSet(this.b);
      }
   }
}
