package a5;

import com.google.firebase.messaging.h0;
import p4.d;

public final class b {
   private static final b b = (new a()).a();
   private final a5.a a;

   b(a5.a var1) {
      this.a = var1;
   }

   public static a b() {
      return new a();
   }

   @d(
      tag = 1
   )
   public a5.a a() {
      return this.a;
   }

   public byte[] c() {
      return h0.a(this);
   }

   public static final class a {
      private a5.a a = null;

      a() {
      }

      public b a() {
         return new b(this.a);
      }

      public a b(a5.a var1) {
         this.a = var1;
         return this;
      }
   }
}
