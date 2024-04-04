package x0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class c {
   private final Set a = new HashSet();

   public void a(Uri var1, boolean var2) {
      a var3 = new a(var1, var2);
      this.a.add(var3);
   }

   public Set b() {
      return this.a;
   }

   public int c() {
      return this.a.size();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && c.class == var1.getClass()) {
         c var2 = (c)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public static final class a {
      private final Uri a;
      private final boolean b;

      a(Uri var1, boolean var2) {
         this.a = var1;
         this.b = var2;
      }

      public Uri a() {
         return this.a;
      }

      public boolean b() {
         return this.b;
      }

      public boolean equals(Object var1) {
         boolean var2 = true;
         if (this == var1) {
            return true;
         } else if (var1 != null && a.class == var1.getClass()) {
            a var3 = (a)var1;
            if (this.b != var3.b || !this.a.equals(var3.a)) {
               var2 = false;
            }

            return var2;
         } else {
            return false;
         }
      }

      public int hashCode() {
         return this.a.hashCode() * 31 + this.b;
      }
   }
}
