package d1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import x0.k;

public abstract class d {
   private static final String f = k.f("ConstraintTracker");
   protected final h1.a a;
   protected final Context b;
   private final Object c = new Object();
   private final Set d = new LinkedHashSet();
   Object e;

   d(Context var1, h1.a var2) {
      this.b = var1.getApplicationContext();
      this.a = var2;
   }

   public void a(b1.a var1) {
      Object var2 = this.c;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label197: {
         label196: {
            try {
               if (!this.d.add(var1)) {
                  break label196;
               }

               if (this.d.size() == 1) {
                  this.e = this.b();
                  k.c().a(f, String.format("%s: initial state = %s", new Object[]{this.getClass().getSimpleName(), this.e}));
                  this.e();
               }
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label197;
            }

            try {
               var1.a(this.e);
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label197;
            }
         }

         label189:
         try {
            return;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label189;
         }
      }

      while(true) {
         Throwable var24 = var10000;

         try {
            throw var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            continue;
         }
      }
   }

   public abstract Object b();

   public void c(b1.a var1) {
      Object var2 = this.c;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label130: {
         try {
            if (this.d.remove(var1) && this.d.isEmpty()) {
               this.f();
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label130;
         }

         label127:
         try {
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label127;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public void d(Object var1) {
      Object var2 = this.c;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label291: {
         Object var3;
         try {
            var3 = this.e;
         } catch (Throwable var35) {
            var10000 = var35;
            var10001 = false;
            break label291;
         }

         label283: {
            if (var3 != var1) {
               if (var3 == null) {
                  break label283;
               }

               try {
                  if (!var3.equals(var1)) {
                     break label283;
                  }
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label291;
               }
            }

            try {
               return;
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label291;
            }
         }

         label272:
         try {
            this.e = var1;
            ArrayList var37 = new ArrayList(this.d);
            Executor var38 = this.a.a();
            Runnable var4 = new Runnable(this, var37) {
               final List m;
               final d n;

               {
                  this.n = var1;
                  this.m = var2;
               }

               public void run() {
                  Iterator var1 = this.m.iterator();

                  while(var1.hasNext()) {
                     ((b1.a)var1.next()).a(this.n.e);
                  }

               }
            };
            var38.execute(var4);
            return;
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label272;
         }
      }

      while(true) {
         Throwable var36 = var10000;

         try {
            throw var36;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            continue;
         }
      }
   }

   public abstract void e();

   public abstract void f();
}
