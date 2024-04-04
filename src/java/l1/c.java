package l1;

import android.content.Context;

final class c extends h {
   private final Context a;
   private final v1.a b;
   private final v1.a c;
   private final String d;

   c(Context var1, v1.a var2, v1.a var3, String var4) {
      if (var1 != null) {
         this.a = var1;
         if (var2 != null) {
            this.b = var2;
            if (var3 != null) {
               this.c = var3;
               if (var4 != null) {
                  this.d = var4;
               } else {
                  throw new NullPointerException("Null backendName");
               }
            } else {
               throw new NullPointerException("Null monotonicClock");
            }
         } else {
            throw new NullPointerException("Null wallClock");
         }
      } else {
         throw new NullPointerException("Null applicationContext");
      }
   }

   public Context b() {
      return this.a;
   }

   public String c() {
      return this.d;
   }

   public v1.a d() {
      return this.c;
   }

   public v1.a e() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof h)) {
         return false;
      } else {
         h var3 = (h)var1;
         if (!this.a.equals(var3.b()) || !this.b.equals(var3.e()) || !this.c.equals(var3.d()) || !this.d.equals(var3.c())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CreationContext{applicationContext=");
      var1.append(this.a);
      var1.append(", wallClock=");
      var1.append(this.b);
      var1.append(", monotonicClock=");
      var1.append(this.c);
      var1.append(", backendName=");
      var1.append(this.d);
      var1.append("}");
      return var1.toString();
   }
}
