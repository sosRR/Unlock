package y5;

import java.io.Serializable;
import x5.e;

public abstract class c {
   public static final a m = new a((e)null);
   private static final c n;

   static {
      n = r5.b.a.b();
   }

   public abstract int b();

   public static final class a extends c implements Serializable {
      private a() {
      }

      // $FF: synthetic method
      public a(e var1) {
         this();
      }

      public int b() {
         return c.n.b();
      }
   }
}
