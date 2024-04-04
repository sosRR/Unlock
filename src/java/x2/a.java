package x2;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import e2.n;
import i2.g;
import i2.m;
import i2.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import r2.h;

@ThreadSafe
public class a {
   private static final long r;
   private static volatile ScheduledExecutorService s;
   private static final Object t;
   private static volatile e u;
   private final Object a;
   private final PowerManager.WakeLock b;
   private int c;
   private Future d;
   private long e;
   private final Set f;
   private boolean g;
   private int h;
   r2.b i;
   private i2.d j;
   private WorkSource k;
   private final String l;
   private final String m;
   private final Context n;
   private final Map o;
   private AtomicInteger p;
   private final ScheduledExecutorService q;

   static {
      r = TimeUnit.DAYS.toMillis(366L);
      s = null;
      t = new Object();
      u = new c();
   }

   public a(Context var1, int var2, String var3) {
      String var5 = var1.getPackageName();
      super();
      this.a = new Object();
      this.c = 0;
      this.f = new HashSet();
      this.g = true;
      this.j = i2.g.d();
      this.o = new HashMap();
      this.p = new AtomicInteger(0);
      e2.n.j(var1, "WakeLock: context must not be null");
      e2.n.f(var3, "WakeLock: wakeLockName must not be empty");
      this.n = var1.getApplicationContext();
      this.m = var3;
      this.i = null;
      if (!"com.google.android.gms".equals(var1.getPackageName())) {
         String var4 = String.valueOf(var3);
         if (var4.length() != 0) {
            var4 = "*gcore*:".concat(var4);
         } else {
            var4 = new String("*gcore*:");
         }

         this.l = var4;
      } else {
         this.l = var3;
      }

      PowerManager var32 = (PowerManager)var1.getSystemService("power");
      if (var32 != null) {
         PowerManager.WakeLock var33 = var32.newWakeLock(var2, var3);
         this.b = var33;
         if (i2.o.c(var1)) {
            var3 = var5;
            if (i2.m.a(var5)) {
               var3 = var1.getPackageName();
            }

            WorkSource var28 = i2.o.b(var1, var3);
            this.k = var28;
            if (var28 != null) {
               i(var33, var28);
            }
         }

         ScheduledExecutorService var31 = s;
         ScheduledExecutorService var29 = var31;
         if (var31 == null) {
            label337: {
               Object var34 = t;
               synchronized(var34){}

               Throwable var10000;
               boolean var10001;
               label336: {
                  try {
                     var31 = s;
                  } catch (Throwable var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label336;
                  }

                  var29 = var31;
                  if (var31 == null) {
                     try {
                        r2.h.a();
                        var29 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        s = var29;
                     } catch (Throwable var25) {
                        var10000 = var25;
                        var10001 = false;
                        break label336;
                     }
                  }

                  label317:
                  try {
                     break label337;
                  } catch (Throwable var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label317;
                  }
               }

               while(true) {
                  Throwable var30 = var10000;

                  try {
                     throw var30;
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     continue;
                  }
               }
            }
         }

         this.q = var29;
      } else {
         StringBuilder var27 = new StringBuilder(29);
         var27.append("expected a non-null reference", 0, 29);
         throw new zzi(var27.toString());
      }
   }

   // $FF: synthetic method
   public static void e(a var0) {
      Object var1 = var0.a;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label198: {
         try {
            if (!var0.b()) {
               return;
            }
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label198;
         }

         try {
            Log.e("WakeLock", String.valueOf(var0.l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
            var0.g();
            if (!var0.b()) {
               return;
            }
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label198;
         }

         label185:
         try {
            var0.c = 1;
            var0.h(0);
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label185;
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

   private final String f(String var1) {
      if (this.g) {
         TextUtils.isEmpty((CharSequence)null);
      }

      return null;
   }

   private final void g() {
      if (!this.f.isEmpty()) {
         ArrayList var1 = new ArrayList(this.f);
         this.f.clear();
         if (var1.size() > 0) {
            f var2 = (f)var1.get(0);
            throw null;
         }
      }
   }

   private final void h(int var1) {
      Object var3 = this.a;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      Throwable var408;
      label3145: {
         try {
            if (!this.b()) {
               return;
            }
         } catch (Throwable var405) {
            var10000 = var405;
            var10001 = false;
            break label3145;
         }

         label3132: {
            label3131: {
               try {
                  if (!this.g) {
                     break label3131;
                  }

                  var1 = this.c - 1;
                  this.c = var1;
               } catch (Throwable var404) {
                  var10000 = var404;
                  var10001 = false;
                  break label3145;
               }

               if (var1 > 0) {
                  try {
                     return;
                  } catch (Throwable var390) {
                     var10000 = var390;
                     var10001 = false;
                     break label3145;
                  }
               }
               break label3132;
            }

            try {
               this.c = 0;
            } catch (Throwable var403) {
               var10000 = var403;
               var10001 = false;
               break label3145;
            }
         }

         Iterator var4;
         try {
            this.g();
            var4 = this.o.values().iterator();
         } catch (Throwable var401) {
            var10000 = var401;
            var10001 = false;
            break label3145;
         }

         while(true) {
            try {
               if (!var4.hasNext()) {
                  break;
               }

               ((d)var4.next()).a = 0;
            } catch (Throwable var402) {
               var10000 = var402;
               var10001 = false;
               break label3145;
            }
         }

         Future var406;
         try {
            this.o.clear();
            var406 = this.d;
         } catch (Throwable var400) {
            var10000 = var400;
            var10001 = false;
            break label3145;
         }

         if (var406 != null) {
            try {
               var406.cancel(false);
               this.d = null;
               this.e = 0L;
            } catch (Throwable var399) {
               var10000 = var399;
               var10001 = false;
               break label3145;
            }
         }

         boolean var2;
         try {
            this.h = 0;
            var2 = this.b.isHeld();
         } catch (Throwable var398) {
            var10000 = var398;
            var10001 = false;
            break label3145;
         }

         if (var2) {
            label3141: {
               label3142: {
                  label3143: {
                     label3144: {
                        RuntimeException var407;
                        try {
                           try {
                              this.b.release();
                              break label3142;
                           } catch (RuntimeException var396) {
                              var407 = var396;
                           }
                        } catch (Throwable var397) {
                           var10000 = var397;
                           var10001 = false;
                           break label3144;
                        }

                        try {
                           if (var407.getClass().equals(RuntimeException.class)) {
                              Log.e("WakeLock", String.valueOf(this.l).concat(" failed to release!"), var407);
                              break label3143;
                           }
                        } catch (Throwable var395) {
                           var10000 = var395;
                           var10001 = false;
                           break label3144;
                        }

                        label3065:
                        try {
                           throw var407;
                        } catch (Throwable var389) {
                           var10000 = var389;
                           var10001 = false;
                           break label3065;
                        }
                     }

                     var408 = var10000;

                     try {
                        if (this.i != null) {
                           this.i = null;
                        }
                     } catch (Throwable var388) {
                        var10000 = var388;
                        var10001 = false;
                        break label3145;
                     }

                     try {
                        throw var408;
                     } catch (Throwable var387) {
                        var10000 = var387;
                        var10001 = false;
                        break label3145;
                     }
                  }

                  try {
                     if (this.i != null) {
                        this.i = null;
                     }
                     break label3141;
                  } catch (Throwable var393) {
                     var10000 = var393;
                     var10001 = false;
                     break label3145;
                  }
               }

               try {
                  if (this.i != null) {
                     this.i = null;
                  }
               } catch (Throwable var394) {
                  var10000 = var394;
                  var10001 = false;
                  break label3145;
               }
            }
         } else {
            try {
               Log.e("WakeLock", String.valueOf(this.l).concat(" should be held!"));
            } catch (Throwable var392) {
               var10000 = var392;
               var10001 = false;
               break label3145;
            }
         }

         label3069:
         try {
            return;
         } catch (Throwable var391) {
            var10000 = var391;
            var10001 = false;
            break label3069;
         }
      }

      while(true) {
         var408 = var10000;

         try {
            throw var408;
         } catch (Throwable var386) {
            var10000 = var386;
            var10001 = false;
            continue;
         }
      }
   }

   private static void i(PowerManager.WakeLock var0, WorkSource var1) {
      Object var4;
      try {
         var0.setWorkSource(var1);
         return;
      } catch (IllegalArgumentException var2) {
         var4 = var2;
      } catch (ArrayIndexOutOfBoundsException var3) {
         var4 = var3;
      }

      Log.wtf("WakeLock", var4.toString());
   }

   public void a(long var1) {
      this.p.incrementAndGet();
      long var3 = r;
      long var5 = Long.MAX_VALUE;
      long var7 = Math.max(Math.min(Long.MAX_VALUE, var3), 1L);
      var3 = var7;
      if (var1 > 0L) {
         var3 = Math.min(var1, var7);
      }

      Object var11 = this.a;
      synchronized(var11){}

      Throwable var10000;
      boolean var10001;
      label770: {
         try {
            if (!this.b()) {
               this.i = r2.b.a(false, (r2.c)null);
               this.b.acquire();
               this.j.b();
            }
         } catch (Throwable var102) {
            var10000 = var102;
            var10001 = false;
            break label770;
         }

         d var10;
         try {
            ++this.c;
            ++this.h;
            this.f((String)null);
            var10 = (d)this.o.get((Object)null);
         } catch (Throwable var101) {
            var10000 = var101;
            var10001 = false;
            break label770;
         }

         d var9 = var10;
         if (var10 == null) {
            try {
               var9 = new d((c)null);
               this.o.put((Object)null, var9);
            } catch (Throwable var100) {
               var10000 = var100;
               var10001 = false;
               break label770;
            }
         }

         try {
            ++var9.a;
            var7 = this.j.b();
         } catch (Throwable var99) {
            var10000 = var99;
            var10001 = false;
            break label770;
         }

         var1 = var5;
         if (Long.MAX_VALUE - var7 > var3) {
            var1 = var7 + var3;
         }

         label771: {
            Future var103;
            try {
               if (var1 <= this.e) {
                  break label771;
               }

               this.e = var1;
               var103 = this.d;
            } catch (Throwable var98) {
               var10000 = var98;
               var10001 = false;
               break label770;
            }

            if (var103 != null) {
               try {
                  var103.cancel(false);
               } catch (Throwable var97) {
                  var10000 = var97;
                  var10001 = false;
                  break label770;
               }
            }

            try {
               ScheduledExecutorService var104 = this.q;
               b var105 = new b(this);
               this.d = var104.schedule(var105, var3, TimeUnit.MILLISECONDS);
            } catch (Throwable var96) {
               var10000 = var96;
               var10001 = false;
               break label770;
            }
         }

         label739:
         try {
            return;
         } catch (Throwable var95) {
            var10000 = var95;
            var10001 = false;
            break label739;
         }
      }

      while(true) {
         Throwable var106 = var10000;

         try {
            throw var106;
         } catch (Throwable var94) {
            var10000 = var94;
            var10001 = false;
            continue;
         }
      }
   }

   public boolean b() {
      Object var3 = this.a;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label134: {
         boolean var1;
         label133: {
            label132: {
               try {
                  if (this.c > 0) {
                     break label132;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label134;
               }

               var1 = false;
               break label133;
            }

            var1 = true;
         }

         label126:
         try {
            return var1;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label126;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            continue;
         }
      }
   }

   public void c() {
      if (this.p.decrementAndGet() < 0) {
         Log.e("WakeLock", String.valueOf(this.l).concat(" release without a matched acquire!"));
      }

      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label377: {
         label376: {
            d var3;
            label375: {
               try {
                  this.f((String)null);
                  if (this.o.containsKey((Object)null)) {
                     var3 = (d)this.o.get((Object)null);
                     break label375;
                  }
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break label377;
               }

               try {
                  Log.w("WakeLock", String.valueOf(this.l).concat(" counter does not exist"));
                  break label376;
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label377;
               }
            }

            if (var3 != null) {
               int var1;
               try {
                  var1 = var3.a - 1;
                  var3.a = var1;
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label377;
               }

               if (var1 == 0) {
                  try {
                     this.o.remove((Object)null);
                  } catch (Throwable var44) {
                     var10000 = var44;
                     var10001 = false;
                     break label377;
                  }
               }
            }
         }

         label360:
         try {
            this.h(0);
            return;
         } catch (Throwable var42) {
            var10000 = var42;
            var10001 = false;
            break label360;
         }
      }

      while(true) {
         Throwable var47 = var10000;

         try {
            throw var47;
         } catch (Throwable var41) {
            var10000 = var41;
            var10001 = false;
            continue;
         }
      }
   }

   public void d(boolean param1) {
      // $FF: Couldn't be decompiled
   }
}
