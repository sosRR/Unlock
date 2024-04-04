package x0;

import androidx.work.OverwritingInputMerger;

public final class m extends w {
   m(a var1) {
      super(var1.b, var1.c, var1.d);
   }

   public static m e(Class var0) {
      return (m)(new a(var0)).b();
   }

   public static final class a extends w.a {
      public a(Class var1) {
         super(var1);
         super.c.d = OverwritingInputMerger.class.getName();
      }

      m i() {
         if (super.a && super.c.j.h()) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
         } else {
            return new m(this);
         }
      }

      a j() {
         return this;
      }
   }
}
