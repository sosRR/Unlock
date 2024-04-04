package g1;

import androidx.work.WorkerParameters;

public class k implements Runnable {
   private y0.i m;
   private String n;
   private WorkerParameters.a o;

   public k(y0.i var1, String var2, WorkerParameters.a var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
   }

   public void run() {
      this.m.q().k(this.n, this.o);
   }
}
