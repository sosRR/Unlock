package o1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d {
   private static final d c = (new a()).a();
   private final String a;
   private final List b;

   d(String var1, List var2) {
      this.a = var1;
      this.b = var2;
   }

   public static a c() {
      return new a();
   }

   @p4.d(
      tag = 2
   )
   public List a() {
      return this.b;
   }

   @p4.d(
      tag = 1
   )
   public String b() {
      return this.a;
   }

   public static final class a {
      private String a = "";
      private List b = new ArrayList();

      a() {
      }

      public d a() {
         return new d(this.a, Collections.unmodifiableList(this.b));
      }

      public a b(List var1) {
         this.b = var1;
         return this;
      }

      public a c(String var1) {
         this.a = var1;
         return this;
      }
   }
}
