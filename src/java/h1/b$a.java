package h1;

import java.util.concurrent.Executor;

class b$a implements Executor {
   final b m;

   b$a(b var1) {
      this.m = var1;
   }

   public void execute(Runnable var1) {
      this.m.d(var1);
   }
}
