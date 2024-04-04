package o1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k1.l;

public final class a {
   private static final o1.a e = (new o1.a.a()).b();
   private final f a;
   private final List b;
   private final b c;
   private final String d;

   a(f var1, List var2, b var3, String var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public static o1.a.a e() {
      return new o1.a.a();
   }

   @p4.d(
      tag = 4
   )
   public String a() {
      return this.d;
   }

   @p4.d(
      tag = 3
   )
   public b b() {
      return this.c;
   }

   @p4.d(
      tag = 2
   )
   public List c() {
      return this.b;
   }

   @p4.d(
      tag = 1
   )
   public f d() {
      return this.a;
   }

   public byte[] f() {
      return l.a(this);
   }

   public static final class a {
      private f a = null;
      private List b = new ArrayList();
      private b c = null;
      private String d = "";

      a() {
      }

      public o1.a a(d var1) {
         this.b.add(var1);
         return this;
      }

      public o1.a b() {
         return new o1.a(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
      }

      public o1.a c(String var1) {
         this.d = var1;
         return this;
      }

      public o1.a d(b var1) {
         this.c = var1;
         return this;
      }

      public o1.a e(f var1) {
         this.a = var1;
         return this;
      }
   }
}
