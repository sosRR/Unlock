package m0;

import androidx.room.h;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.f;

public abstract class d {
   private final AtomicBoolean a = new AtomicBoolean(false);
   private final h b;
   private volatile f c;

   public d(h var1) {
      this.b = var1;
   }

   private f c() {
      String var1 = this.d();
      return this.b.d(var1);
   }

   private f e(boolean var1) {
      f var2;
      if (var1) {
         if (this.c == null) {
            this.c = this.c();
         }

         var2 = this.c;
      } else {
         var2 = this.c();
      }

      return var2;
   }

   public f a() {
      this.b();
      return this.e(this.a.compareAndSet(false, true));
   }

   protected void b() {
      this.b.a();
   }

   protected abstract String d();

   public void f(f var1) {
      if (var1 == this.c) {
         this.a.set(false);
      }

   }
}
