package b1;

import android.content.Context;
import c1.e;
import c1.f;
import c1.g;
import c1.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x0.k;

public class d implements c1.c.a {
   private static final String d = k.f("WorkConstraintsTracker");
   private final c a;
   private final c1.c[] b;
   private final Object c;

   public d(Context var1, h1.a var2, c var3) {
      var1 = var1.getApplicationContext();
      this.a = var3;
      this.b = new c1.c[]{new c1.a(var1, var2), new c1.b(var1, var2), new h(var1, var2), new c1.d(var1, var2), new g(var1, var2), new f(var1, var2), new e(var1, var2)};
      this.c = new Object();
   }

   public void a(List var1) {
      Object var2 = this.c;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label402: {
         ArrayList var3;
         Iterator var48;
         try {
            var3 = new ArrayList();
            var48 = var1.iterator();
         } catch (Throwable var46) {
            var10000 = var46;
            var10001 = false;
            break label402;
         }

         while(true) {
            try {
               if (!var48.hasNext()) {
                  break;
               }

               String var4 = (String)var48.next();
               if (this.c(var4)) {
                  k.c().a(d, String.format("Constraints met for %s", new Object[]{var4}));
                  var3.add(var4);
               }
            } catch (Throwable var47) {
               var10000 = var47;
               var10001 = false;
               break label402;
            }
         }

         c var49;
         try {
            var49 = this.a;
         } catch (Throwable var45) {
            var10000 = var45;
            var10001 = false;
            break label402;
         }

         if (var49 != null) {
            try {
               var49.d(var3);
            } catch (Throwable var44) {
               var10000 = var44;
               var10001 = false;
               break label402;
            }
         }

         label378:
         try {
            return;
         } catch (Throwable var43) {
            var10000 = var43;
            var10001 = false;
            break label378;
         }
      }

      while(true) {
         Throwable var50 = var10000;

         try {
            throw var50;
         } catch (Throwable var42) {
            var10000 = var42;
            var10001 = false;
            continue;
         }
      }
   }

   public void b(List var1) {
      Object var2 = this.c;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label176: {
         c var3;
         try {
            var3 = this.a;
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label176;
         }

         if (var3 != null) {
            try {
               var3.c(var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label176;
            }
         }

         label165:
         try {
            return;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label165;
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

   public boolean c(String var1) {
      Object var4 = this.c;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      label241: {
         int var3;
         c1.c[] var5;
         try {
            var5 = this.b;
            var3 = var5.length;
         } catch (Throwable var26) {
            var10000 = var26;
            var10001 = false;
            break label241;
         }

         int var2 = 0;

         while(true) {
            if (var2 >= var3) {
               try {
                  return true;
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  break;
               }
            }

            c1.c var6 = var5[var2];

            try {
               if (var6.d(var1)) {
                  k.c().a(d, String.format("Work %s constrained by %s", new Object[]{var1, var6.getClass().getSimpleName()}));
                  return false;
               }
            } catch (Throwable var27) {
               var10000 = var27;
               var10001 = false;
               break;
            }

            ++var2;
         }
      }

      while(true) {
         Throwable var28 = var10000;

         try {
            throw var28;
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            continue;
         }
      }
   }

   public void d(Iterable var1) {
      Object var5 = this.c;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label745: {
         int var4;
         c1.c[] var6;
         try {
            var6 = this.b;
            var4 = var6.length;
         } catch (Throwable var79) {
            var10000 = var79;
            var10001 = false;
            break label745;
         }

         byte var3 = 0;

         int var2;
         for(var2 = 0; var2 < var4; ++var2) {
            try {
               var6[var2].g((c1.c.a)null);
            } catch (Throwable var78) {
               var10000 = var78;
               var10001 = false;
               break label745;
            }
         }

         try {
            var6 = this.b;
            var4 = var6.length;
         } catch (Throwable var77) {
            var10000 = var77;
            var10001 = false;
            break label745;
         }

         for(var2 = 0; var2 < var4; ++var2) {
            try {
               var6[var2].e(var1);
            } catch (Throwable var76) {
               var10000 = var76;
               var10001 = false;
               break label745;
            }
         }

         c1.c[] var80;
         try {
            var80 = this.b;
            var4 = var80.length;
         } catch (Throwable var75) {
            var10000 = var75;
            var10001 = false;
            break label745;
         }

         for(var2 = var3; var2 < var4; ++var2) {
            try {
               var80[var2].g(this);
            } catch (Throwable var74) {
               var10000 = var74;
               var10001 = false;
               break label745;
            }
         }

         label705:
         try {
            return;
         } catch (Throwable var73) {
            var10000 = var73;
            var10001 = false;
            break label705;
         }
      }

      while(true) {
         Throwable var81 = var10000;

         try {
            throw var81;
         } catch (Throwable var72) {
            var10000 = var72;
            var10001 = false;
            continue;
         }
      }
   }

   public void e() {
      Object var3 = this.c;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label215: {
         int var2;
         c1.c[] var4;
         try {
            var4 = this.b;
            var2 = var4.length;
         } catch (Throwable var25) {
            var10000 = var25;
            var10001 = false;
            break label215;
         }

         for(int var1 = 0; var1 < var2; ++var1) {
            try {
               var4[var1].f();
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label215;
            }
         }

         label199:
         try {
            return;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label199;
         }
      }

      while(true) {
         Throwable var26 = var10000;

         try {
            throw var26;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            continue;
         }
      }
   }
}
