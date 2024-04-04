package x0;

import android.annotation.SuppressLint;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class w {
   private UUID a;
   private f1.p b;
   private Set c;

   protected w(UUID var1, f1.p var2, Set var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public UUID a() {
      return this.a;
   }

   public String b() {
      return this.a.toString();
   }

   public Set c() {
      return this.c;
   }

   public f1.p d() {
      return this.b;
   }

   public abstract static class a {
      boolean a = false;
      UUID b = UUID.randomUUID();
      f1.p c;
      Set d = new HashSet();
      Class e;

      a(Class var1) {
         this.e = var1;
         this.c = new f1.p(this.b.toString(), var1.getName());
         this.a(var1.getName());
      }

      public final a a(String var1) {
         this.d.add(var1);
         return this.d();
      }

      public final w b() {
         w var2 = this.c();
         b var3 = this.c.j;
         boolean var1;
         if (!var3.e() && !var3.f() && !var3.g() && !var3.h()) {
            var1 = false;
         } else {
            var1 = true;
         }

         f1.p var4 = this.c;
         if (var4.q) {
            if (var1) {
               throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }

            if (var4.g > 0L) {
               throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
         }

         this.b = UUID.randomUUID();
         var4 = new f1.p(this.c);
         this.c = var4;
         var4.a = this.b.toString();
         return var2;
      }

      abstract w c();

      abstract a d();

      public final a e(b var1) {
         this.c.j = var1;
         return this.d();
      }

      @SuppressLint({"MissingGetterMatchingBuilder"})
      public a f(o var1) {
         f1.p var2 = this.c;
         var2.q = true;
         var2.r = var1;
         return this.d();
      }

      public a g(Duration var1) {
         this.c.g = var1.toMillis();
         if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
            return this.d();
         } else {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
         }
      }

      public final a h(androidx.work.b var1) {
         this.c.e = var1;
         return this.d();
      }
   }
}
