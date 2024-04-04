package y0;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import g1.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import x0.k;

public class d implements b, e1.a {
   private static final String x = k.f("Processor");
   private PowerManager.WakeLock m;
   private Context n;
   private androidx.work.a o;
   private h1.a p;
   private WorkDatabase q;
   private Map r;
   private Map s;
   private List t;
   private Set u;
   private final List v;
   private final Object w;

   public d(Context var1, androidx.work.a var2, h1.a var3, WorkDatabase var4, List var5) {
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.q = var4;
      this.s = new HashMap();
      this.r = new HashMap();
      this.t = var5;
      this.u = new HashSet();
      this.v = new ArrayList();
      this.m = null;
      this.w = new Object();
   }

   private static boolean e(String var0, j var1) {
      if (var1 != null) {
         var1.d();
         k.c().a(x, String.format("WorkerWrapper interrupted for %s", new Object[]{var0}));
         return true;
      } else {
         k.c().a(x, String.format("WorkerWrapper could not be found for %s", new Object[]{var0}));
         return false;
      }
   }

   private void m() {
      Object var1 = this.w;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      Throwable var60;
      label414: {
         label418: {
            Intent var2;
            try {
               if (this.r.isEmpty() ^ true) {
                  break label418;
               }

               var2 = androidx.work.impl.foreground.a.f(this.n);
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label414;
            }

            try {
               this.n.startService(var2);
            } catch (Throwable var59) {
               var60 = var59;

               label403:
               try {
                  k.c().b(x, "Unable to stop foreground service", var60);
                  break label403;
               } catch (Throwable var57) {
                  var10000 = var57;
                  var10001 = false;
                  break label414;
               }
            }

            PowerManager.WakeLock var61;
            try {
               var61 = this.m;
            } catch (Throwable var56) {
               var10000 = var56;
               var10001 = false;
               break label414;
            }

            if (var61 != null) {
               try {
                  var61.release();
                  this.m = null;
               } catch (Throwable var55) {
                  var10000 = var55;
                  var10001 = false;
                  break label414;
               }
            }
         }

         label397:
         try {
            return;
         } catch (Throwable var54) {
            var10000 = var54;
            var10001 = false;
            break label397;
         }
      }

      while(true) {
         var60 = var10000;

         try {
            throw var60;
         } catch (Throwable var53) {
            var10000 = var53;
            var10001 = false;
            continue;
         }
      }
   }

   public void a(String var1, boolean var2) {
      Object var3 = this.w;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label198: {
         Iterator var4;
         try {
            this.s.remove(var1);
            k.c().a(x, String.format("%s %s executed; reschedule = %s", new Object[]{this.getClass().getSimpleName(), var1, var2}));
            var4 = this.v.iterator();
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label198;
         }

         while(true) {
            try {
               if (var4.hasNext()) {
                  ((b)var4.next()).a(var1, var2);
                  continue;
               }
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break;
            }

            try {
               return;
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break;
            }
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

   public void b(String param1) {
      // $FF: Couldn't be decompiled
   }

   public void c(String var1, x0.f var2) {
      Object var3 = this.w;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label259: {
         j var5;
         try {
            k.c().d(x, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{var1}));
            var5 = (j)this.s.remove(var1);
         } catch (Throwable var36) {
            var10000 = var36;
            var10001 = false;
            break label259;
         }

         if (var5 != null) {
            try {
               if (this.m == null) {
                  PowerManager.WakeLock var4 = g1.m.b(this.n, "ProcessorForegroundLck");
                  this.m = var4;
                  var4.acquire();
               }
            } catch (Throwable var35) {
               var10000 = var35;
               var10001 = false;
               break label259;
            }

            try {
               this.r.put(var1, var5);
               Intent var37 = androidx.work.impl.foreground.a.e(this.n, var1, var2);
               androidx.core.content.a.k(this.n, var37);
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label259;
            }
         }

         label243:
         try {
            return;
         } catch (Throwable var33) {
            var10000 = var33;
            var10001 = false;
            break label243;
         }
      }

      while(true) {
         Throwable var38 = var10000;

         try {
            throw var38;
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            continue;
         }
      }
   }

   public void d(b param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean f(String param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean g(String var1) {
      Object var3 = this.w;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label151: {
         boolean var2;
         label150: {
            label149: {
               try {
                  if (!this.s.containsKey(var1) && !this.r.containsKey(var1)) {
                     break label149;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label151;
               }

               var2 = true;
               break label150;
            }

            var2 = false;
         }

         label140:
         try {
            return var2;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label140;
         }
      }

      while(true) {
         Throwable var17 = var10000;

         try {
            throw var17;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            continue;
         }
      }
   }

   public boolean h(String param1) {
      // $FF: Couldn't be decompiled
   }

   public void i(b param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean j(String var1) {
      return this.k(var1, (WorkerParameters.a)null);
   }

   public boolean k(String var1, WorkerParameters.a var2) {
      Object var3 = this.w;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label137: {
         try {
            if (this.g(var1)) {
               k.c().a(x, String.format("Work %s is already enqueued for processing", new Object[]{var1}));
               return false;
            }
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label137;
         }

         j var5;
         try {
            j.c var4 = new j.c(this.n, this.o, this.p, this, this.q, var1);
            var5 = var4.c(this.t).b(var2).a();
            u3.a var21 = var5.b();
            a var20 = new a(this, var1, var21);
            var21.d(var20, this.p.a());
            this.s.put(var1, var5);
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label137;
         }

         this.p.c().execute(var5);
         k.c().a(x, String.format("%s: processing %s", new Object[]{this.getClass().getSimpleName(), var1}));
         return true;
      }

      while(true) {
         Throwable var19 = var10000;

         try {
            throw var19;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            continue;
         }
      }
   }

   public boolean l(String var1) {
      Object var6 = this.w;
      synchronized(var6){}

      Throwable var10000;
      boolean var10001;
      label466: {
         k var4;
         String var5;
         try {
            var4 = k.c();
            var5 = x;
         } catch (Throwable var63) {
            var10000 = var63;
            var10001 = false;
            break label466;
         }

         boolean var2 = true;

         j var66;
         try {
            var4.a(var5, String.format("Processor cancelling %s", new Object[]{var1}));
            this.u.add(var1);
            var66 = (j)this.r.remove(var1);
         } catch (Throwable var62) {
            var10000 = var62;
            var10001 = false;
            break label466;
         }

         if (var66 == null) {
            var2 = false;
         }

         j var65 = var66;
         if (var66 == null) {
            try {
               var65 = (j)this.s.remove(var1);
            } catch (Throwable var61) {
               var10000 = var61;
               var10001 = false;
               break label466;
            }
         }

         boolean var3;
         try {
            var3 = e(var1, var65);
         } catch (Throwable var60) {
            var10000 = var60;
            var10001 = false;
            break label466;
         }

         if (var2) {
            try {
               this.m();
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label466;
            }
         }

         label443:
         try {
            return var3;
         } catch (Throwable var58) {
            var10000 = var58;
            var10001 = false;
            break label443;
         }
      }

      while(true) {
         Throwable var64 = var10000;

         try {
            throw var64;
         } catch (Throwable var57) {
            var10000 = var57;
            var10001 = false;
            continue;
         }
      }
   }

   public boolean n(String param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean o(String param1) {
      // $FF: Couldn't be decompiled
   }

   private static class a implements Runnable {
      private b m;
      private String n;
      private u3.a o;

      a(b var1, String var2, u3.a var3) {
         this.m = var1;
         this.n = var2;
         this.o = var3;
      }

      public void run() {
         boolean var1;
         try {
            var1 = (Boolean)this.o.get();
         } catch (ExecutionException | InterruptedException var3) {
            var1 = true;
         }

         this.m.a(this.n, var1);
      }
   }
}
