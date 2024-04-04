package r4;

import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import w3.q;

public class g implements j, k {
   private static final ThreadFactory f = new b();
   private final t4.b a;
   private final Context b;
   private final t4.b c;
   private final Set d;
   private final Executor e;

   private g(Context var1, String var2, Set var3, t4.b var4) {
      this(new f(var1, var2), var3, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f), var4, var1);
   }

   g(t4.b var1, Set var2, Executor var3, t4.b var4, Context var5) {
      this.a = var1;
      this.d = var2;
      this.e = var3;
      this.c = var4;
      this.b = var5;
   }

   // $FF: synthetic method
   public static l c(Context var0, String var1) {
      return k(var0, var1);
   }

   // $FF: synthetic method
   public static g d(w3.e var0) {
      return i(var0);
   }

   // $FF: synthetic method
   public static String e(g var0) {
      return var0.j();
   }

   // $FF: synthetic method
   public static Thread f(Runnable var0) {
      return m(var0);
   }

   // $FF: synthetic method
   public static Void g(g var0) {
      return var0.l();
   }

   public static w3.d h() {
      return w3.d.d(g.class, j.class, k.class).b(q.j(Context.class)).b(q.j(com.google.firebase.d.class)).b(q.l(h.class)).b(q.k(c5.i.class)).f(new e()).d();
   }

   // $FF: synthetic method
   private static g i(w3.e var0) {
      return new g((Context)var0.a(Context.class), ((com.google.firebase.d)var0.a(com.google.firebase.d.class)).n(), var0.b(h.class), var0.c(c5.i.class));
   }

   // $FF: synthetic method
   private String j() {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      Throwable var219;
      label1485: {
         List var2;
         JSONArray var220;
         try {
            l var3 = (l)this.a.get();
            var2 = var3.c();
            var3.b();
            var220 = new JSONArray();
         } catch (Throwable var217) {
            var10000 = var217;
            var10001 = false;
            break label1485;
         }

         int var1 = 0;

         while(true) {
            try {
               if (var1 >= var2.size()) {
                  break;
               }

               m var4 = (m)var2.get(var1);
               JSONObject var6 = new JSONObject();
               var6.put("agent", var4.c());
               JSONArray var5 = new JSONArray(var4.b());
               var6.put("dates", var5);
               var220.put(var6);
            } catch (Throwable var216) {
               var10000 = var216;
               var10001 = false;
               break label1485;
            }

            ++var1;
         }

         Base64OutputStream var218;
         JSONObject var224;
         ByteArrayOutputStream var226;
         try {
            var224 = new JSONObject();
            var224.put("heartbeats", var220);
            var224.put("version", "2");
            var226 = new ByteArrayOutputStream();
            var218 = new Base64OutputStream(var226, 11);
         } catch (Throwable var215) {
            var10000 = var215;
            var10001 = false;
            break label1485;
         }

         label1486: {
            Throwable var223;
            label1487: {
               GZIPOutputStream var222;
               try {
                  var222 = new GZIPOutputStream(var218);
               } catch (Throwable var214) {
                  var10000 = var214;
                  var10001 = false;
                  break label1487;
               }

               try {
                  var222.write(var224.toString().getBytes("UTF-8"));
               } catch (Throwable var213) {
                  Throwable var225 = var213;

                  try {
                     var222.close();
                  } catch (Throwable var211) {
                     var223 = var211;

                     label1450:
                     try {
                        var225.addSuppressed(var223);
                        break label1450;
                     } catch (Throwable var210) {
                        var10000 = var210;
                        var10001 = false;
                        break label1487;
                     }
                  }

                  try {
                     throw var225;
                  } catch (Throwable var208) {
                     var10000 = var208;
                     var10001 = false;
                     break label1487;
                  }
               }

               label1458:
               try {
                  var222.close();
                  break label1486;
               } catch (Throwable var212) {
                  var10000 = var212;
                  var10001 = false;
                  break label1458;
               }
            }

            var223 = var10000;

            try {
               var218.close();
            } catch (Throwable var207) {
               var219 = var207;

               label1438:
               try {
                  var223.addSuppressed(var219);
                  break label1438;
               } catch (Throwable var206) {
                  var10000 = var206;
                  var10001 = false;
                  break label1485;
               }
            }

            try {
               throw var223;
            } catch (Throwable var205) {
               var10000 = var205;
               var10001 = false;
               break label1485;
            }
         }

         label1447:
         try {
            var218.close();
            String var221 = var226.toString("UTF-8");
            return var221;
         } catch (Throwable var209) {
            var10000 = var209;
            var10001 = false;
            break label1447;
         }
      }

      while(true) {
         var219 = var10000;

         try {
            throw var219;
         } catch (Throwable var204) {
            var10000 = var204;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: synthetic method
   private static l k(Context var0, String var1) {
      return new l(var0, var1);
   }

   // $FF: synthetic method
   private Void l() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   private static Thread m(Runnable var0) {
      return new Thread(var0, "heartbeat-information-executor");
   }

   public y2.g a() {
      return androidx.core.os.l.a(this.b) ^ true ? y2.j.e("") : y2.j.c(this.e, new d(this));
   }

   public k.a b(String var1) {
      synchronized(this){}

      k.a var7;
      try {
         long var2 = System.currentTimeMillis();
         l var6 = (l)this.a.get();
         if (var6.i(var2)) {
            var6.g();
            var7 = k.a.p;
            return var7;
         }

         var7 = k.a.n;
      } finally {
         ;
      }

      return var7;
   }

   public y2.g n() {
      if (this.d.size() <= 0) {
         return y2.j.e((Object)null);
      } else {
         return androidx.core.os.l.a(this.b) ^ true ? y2.j.e((Object)null) : y2.j.c(this.e, new c(this));
      }
   }
}
