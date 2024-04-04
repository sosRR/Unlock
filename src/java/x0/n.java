package x0;

import android.annotation.SuppressLint;

public interface n {
   @SuppressLint({"SyntheticAccessor"})
   c a = new c();
   @SuppressLint({"SyntheticAccessor"})
   b b = new b();

   public abstract static class b {
      b() {
      }
   }

   public static final class a extends b {
      private final Throwable a;

      public a(Throwable var1) {
         this.a = var1;
      }

      public Throwable a() {
         return this.a;
      }

      public String toString() {
         return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
      }
   }

   public static final class b extends b {
      private b() {
      }

      // $FF: synthetic method
      b(Object var1) {
         this();
      }

      public String toString() {
         return "IN_PROGRESS";
      }
   }

   public static final class c extends b {
      private c() {
      }

      // $FF: synthetic method
      c(Object var1) {
         this();
      }

      public String toString() {
         return "SUCCESS";
      }
   }
}
