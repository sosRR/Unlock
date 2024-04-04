package h1;

import android.os.Handler;
import android.os.Looper;
import g1.j;
import java.util.concurrent.Executor;

public class b implements a {
   private final j a;
   private final Handler b = new Handler(Looper.getMainLooper());
   private final Executor c = new b$a(this);

   public b(Executor var1) {
      this.a = new j(var1);
   }

   public Executor a() {
      return this.c;
   }

   public void b(Runnable var1) {
      this.a.execute(var1);
   }

   public j c() {
      return this.a;
   }

   public void d(Runnable var1) {
      this.b.post(var1);
   }
}
