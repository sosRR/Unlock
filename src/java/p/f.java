package p;

import java.text.DecimalFormat;

public abstract class f {
   protected a a;
   protected int b = 0;
   protected int[] c = new int[10];
   protected float[][] d = new float[10][3];
   protected int e;
   protected String f;
   protected float[] g = new float[3];
   protected boolean h = false;
   protected long i;
   protected float j = Float.NaN;

   public String toString() {
      String var2 = this.f;
      DecimalFormat var3 = new DecimalFormat("##.##");

      for(int var1 = 0; var1 < this.e; ++var1) {
         StringBuilder var4 = new StringBuilder();
         var4.append(var2);
         var4.append("[");
         var4.append(this.c[var1]);
         var4.append(" , ");
         var4.append(var3.format(this.d[var1]));
         var4.append("] ");
         var2 = var4.toString();
      }

      return var2;
   }
}
