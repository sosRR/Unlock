package p;

import java.text.DecimalFormat;

public abstract class e {
   protected a a;
   protected int[] b = new int[10];
   protected float[] c = new float[10];
   private int d;
   private String e;

   public float a(float var1) {
      return (float)this.a.a((double)var1, 0);
   }

   public String toString() {
      String var2 = this.e;
      DecimalFormat var3 = new DecimalFormat("##.##");

      for(int var1 = 0; var1 < this.d; ++var1) {
         StringBuilder var4 = new StringBuilder();
         var4.append(var2);
         var4.append("[");
         var4.append(this.b[var1]);
         var4.append(" , ");
         var4.append(var3.format((double)this.c[var1]));
         var4.append("] ");
         var2 = var4.toString();
      }

      return var2;
   }
}
