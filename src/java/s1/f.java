package s1;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class f {
   private long a(int var1, long var2) {
      --var1;
      long var6;
      if (var2 > 1L) {
         var6 = var2;
      } else {
         var6 = 2L;
      }

      double var4 = Math.max(1.0, Math.log(10000.0) / Math.log((double)(var6 * (long)var1)));
      return (long)(Math.pow(3.0, (double)var1) * (double)var2 * var4);
   }

   public static a b() {
      return new a();
   }

   static f d(v1.a var0, Map var1) {
      return new s1.b(var0, var1);
   }

   public static f f(v1.a var0) {
      return b().a(i1.d.m, f.b.a().b(30000L).d(86400000L).a()).a(i1.d.o, f.b.a().b(1000L).d(86400000L).a()).a(i1.d.n, f.b.a().b(86400000L).d(86400000L).c(i(f.c.m, f.c.n)).a()).c(var0).b();
   }

   private static Set i(Object... var0) {
      return Collections.unmodifiableSet(new HashSet(Arrays.asList(var0)));
   }

   private void j(JobInfo.Builder var1, Set var2) {
      if (var2.contains(f.c.m)) {
         var1.setRequiredNetworkType(2);
      } else {
         var1.setRequiredNetworkType(1);
      }

      if (var2.contains(f.c.o)) {
         var1.setRequiresCharging(true);
      }

      if (var2.contains(f.c.n)) {
         var1.setRequiresDeviceIdle(true);
      }

   }

   public JobInfo.Builder c(JobInfo.Builder var1, i1.d var2, long var3, int var5) {
      var1.setMinimumLatency(this.g(var2, var3, var5));
      this.j(var1, ((b)this.h().get(var2)).c());
      return var1;
   }

   abstract v1.a e();

   public long g(i1.d var1, long var2, int var4) {
      long var5 = this.e().a();
      b var7 = (b)this.h().get(var1);
      return Math.min(Math.max(this.a(var4, var7.b()), var2 - var5), var7.d());
   }

   abstract Map h();

   public static class a {
      private v1.a a;
      private Map b = new HashMap();

      public a a(i1.d var1, b var2) {
         this.b.put(var1, var2);
         return this;
      }

      public f b() {
         if (this.a != null) {
            if (this.b.keySet().size() >= i1.d.values().length) {
               Map var1 = this.b;
               this.b = new HashMap();
               return f.d(this.a, var1);
            } else {
               throw new IllegalStateException("Not all priorities have been configured");
            }
         } else {
            throw new NullPointerException("missing required property: clock");
         }
      }

      public a c(v1.a var1) {
         this.a = var1;
         return this;
      }
   }

   @AutoValue
   public abstract static class b {
      public static a a() {
         return (new s1.c.b()).c(Collections.emptySet());
      }

      abstract long b();

      abstract Set c();

      abstract long d();

      @Builder
      public abstract static class a {
         public abstract b a();

         public abstract a b(long var1);

         public abstract a c(Set var1);

         public abstract a d(long var1);
      }
   }

   public static enum c {
      m,
      n,
      o;

      private static final c[] p;

      static {
         c var1 = new c("NETWORK_UNMETERED", 0);
         m = var1;
         c var0 = new c("DEVICE_IDLE", 1);
         n = var0;
         c var2 = new c("DEVICE_CHARGING", 2);
         o = var2;
         p = new c[]{var1, var0, var2};
      }
   }
}
