package k1;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class o {
   public static a a() {
      return (new d.b()).d(i1.d.m);
   }

   public abstract String b();

   public abstract byte[] c();

   public abstract i1.d d();

   public boolean e() {
      boolean var1;
      if (this.c() != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public o f(i1.d var1) {
      return a().b(this.b()).d(var1).c(this.c()).a();
   }

   public final String toString() {
      String var2 = this.b();
      i1.d var3 = this.d();
      String var1;
      if (this.c() == null) {
         var1 = "";
      } else {
         var1 = Base64.encodeToString(this.c(), 2);
      }

      return String.format("TransportContext(%s, %s, %s)", new Object[]{var2, var3, var1});
   }

   @Builder
   public abstract static class a {
      public abstract o a();

      public abstract a b(String var1);

      public abstract a c(byte[] var1);

      public abstract a d(i1.d var1);
   }
}
