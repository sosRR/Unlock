package x0;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class u {
   private UUID a;
   private a b;
   private androidx.work.b c;
   private Set d;
   private androidx.work.b e;
   private int f;

   public u(UUID var1, a var2, androidx.work.b var3, List var4, androidx.work.b var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = new HashSet(var4);
      this.e = var5;
      this.f = var6;
   }

   public androidx.work.b a() {
      return this.c;
   }

   public a b() {
      return this.b;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && u.class == var1.getClass()) {
         u var2 = (u)var1;
         if (this.f != var2.f) {
            return false;
         } else if (!this.a.equals(var2.a)) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else if (!this.c.equals(var2.c)) {
            return false;
         } else {
            return !this.d.equals(var2.d) ? false : this.e.equals(var2.e);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("WorkInfo{mId='");
      var1.append(this.a);
      var1.append('\'');
      var1.append(", mState=");
      var1.append(this.b);
      var1.append(", mOutputData=");
      var1.append(this.c);
      var1.append(", mTags=");
      var1.append(this.d);
      var1.append(", mProgress=");
      var1.append(this.e);
      var1.append('}');
      return var1.toString();
   }

   public static enum a {
      m,
      n,
      o,
      p,
      q,
      r;

      private static final a[] s;

      static {
         a var0 = new a("ENQUEUED", 0);
         m = var0;
         a var5 = new a("RUNNING", 1);
         n = var5;
         a var1 = new a("SUCCEEDED", 2);
         o = var1;
         a var4 = new a("FAILED", 3);
         p = var4;
         a var2 = new a("BLOCKED", 4);
         q = var2;
         a var3 = new a("CANCELLED", 5);
         r = var3;
         s = new a[]{var0, var5, var1, var4, var2, var3};
      }

      public boolean d() {
         boolean var1;
         if (this != o && this != p && this != r) {
            var1 = false;
         } else {
            var1 = true;
         }

         return var1;
      }
   }
}
