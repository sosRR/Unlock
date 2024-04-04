package y2;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class g0 extends g {
   private final Object a = new Object();
   private final d0 b = new d0();
   @GuardedBy("mLock")
   private boolean c;
   private volatile boolean d;
   @GuardedBy("mLock")
   private Object e;
   @GuardedBy("mLock")
   private Exception f;

   @GuardedBy("mLock")
   private final void w() {
      e2.n.m(this.c, "Task is not yet complete");
   }

   @GuardedBy("mLock")
   private final void x() {
      if (this.d) {
         throw new CancellationException("Task is already canceled.");
      }
   }

   @GuardedBy("mLock")
   private final void y() {
      if (this.c) {
         throw DuplicateTaskCompletionException.a(this);
      }
   }

   private final void z() {
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label137: {
         try {
            if (!this.c) {
               return;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label137;
         }

         try {
            ;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label137;
         }

         this.b.b(this);
         return;
      }

      while(true) {
         Throwable var1 = var10000;

         try {
            throw var1;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public final g a(Executor var1, b var2) {
      this.b.a(new t(var1, var2));
      this.z();
      return this;
   }

   public final g b(Executor var1, c var2) {
      this.b.a(new v(var1, var2));
      this.z();
      return this;
   }

   public final g c(c var1) {
      Executor var2 = i.a;
      this.b.a(new v(var2, var1));
      this.z();
      return this;
   }

   public final g d(Executor var1, d var2) {
      this.b.a(new x(var1, var2));
      this.z();
      return this;
   }

   public final g e(d var1) {
      this.d(i.a, var1);
      return this;
   }

   public final g f(Executor var1, e var2) {
      this.b.a(new z(var1, var2));
      this.z();
      return this;
   }

   public final g g(Executor var1, a var2) {
      g0 var3 = new g0();
      this.b.a(new p(var1, var2, var3));
      this.z();
      return var3;
   }

   public final g h(a var1) {
      return this.g(i.a, var1);
   }

   public final g i(Executor var1, a var2) {
      g0 var3 = new g0();
      this.b.a(new r(var1, var2, var3));
      this.z();
      return var3;
   }

   public final Exception j() {
      // $FF: Couldn't be decompiled
   }

   public final Object k() {
      Object var1 = this.a;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label163: {
         Exception var2;
         try {
            this.w();
            this.x();
            var2 = this.f;
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label163;
         }

         if (var2 == null) {
            label157:
            try {
               Object var25 = this.e;
               return var25;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label157;
            }
         } else {
            label159:
            try {
               RuntimeExecutionException var3 = new RuntimeExecutionException(var2);
               throw var3;
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label159;
            }
         }
      }

      while(true) {
         Throwable var26 = var10000;

         try {
            throw var26;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   public final Object l(Class var1) {
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label255: {
         Exception var3;
         label254: {
            try {
               this.w();
               this.x();
               if (!var1.isInstance(this.f)) {
                  var3 = this.f;
                  break label254;
               }
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label255;
            }

            try {
               throw (Throwable)var1.cast(this.f);
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label255;
            }
         }

         if (var3 == null) {
            label242:
            try {
               Object var35 = this.e;
               return var35;
            } catch (Throwable var31) {
               var10000 = var31;
               var10001 = false;
               break label242;
            }
         } else {
            label244:
            try {
               RuntimeExecutionException var37 = new RuntimeExecutionException(var3);
               throw var37;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label244;
            }
         }
      }

      while(true) {
         Throwable var36 = var10000;

         try {
            throw var36;
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            continue;
         }
      }
   }

   public final boolean m() {
      return this.d;
   }

   public final boolean n() {
      // $FF: Couldn't be decompiled
   }

   public final boolean o() {
      Object var4 = this.a;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      label300: {
         boolean var3;
         try {
            var3 = this.c;
         } catch (Throwable var36) {
            var10000 = var36;
            var10001 = false;
            break label300;
         }

         boolean var2 = false;
         boolean var1 = var2;
         if (var3) {
            label301: {
               var1 = var2;

               try {
                  if (this.d) {
                     break label301;
                  }
               } catch (Throwable var35) {
                  var10000 = var35;
                  var10001 = false;
                  break label300;
               }

               var1 = var2;

               try {
                  if (this.f != null) {
                     break label301;
                  }
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label300;
               }

               var1 = true;
            }
         }

         label280:
         try {
            return var1;
         } catch (Throwable var33) {
            var10000 = var33;
            var10001 = false;
            break label280;
         }
      }

      while(true) {
         Throwable var5 = var10000;

         try {
            throw var5;
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            continue;
         }
      }
   }

   public final g p(Executor var1, f var2) {
      g0 var3 = new g0();
      this.b.a(new b0(var1, var2, var3));
      this.z();
      return var3;
   }

   public final g q(f var1) {
      Executor var2 = i.a;
      g0 var3 = new g0();
      this.b.a(new b0(var2, var1, var3));
      this.z();
      return var3;
   }

   public final void r(Exception param1) {
      // $FF: Couldn't be decompiled
   }

   public final void s(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean t() {
      Object var1 = this.a;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label137: {
         try {
            if (this.c) {
               return false;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label137;
         }

         try {
            this.c = true;
            this.d = true;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label137;
         }

         this.b.b(this);
         return true;
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public final boolean u(Exception var1) {
      e2.n.j(var1, "Exception must not be null");
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label137: {
         try {
            if (this.c) {
               return false;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label137;
         }

         try {
            this.c = true;
            this.f = var1;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label137;
         }

         this.b.b(this);
         return true;
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

   public final boolean v(Object var1) {
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label137: {
         try {
            if (this.c) {
               return false;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label137;
         }

         try {
            this.c = true;
            this.e = var1;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label137;
         }

         this.b.b(this);
         return true;
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
}
