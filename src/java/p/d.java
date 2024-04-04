package p;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class d {
   private a a;
   private String b;
   private int c = 0;
   private String d = null;
   public int e = 0;
   ArrayList f = new ArrayList();

   public float a(float var1) {
      return (float)this.a.a(var1);
   }

   public String toString() {
      String var1 = this.b;
      DecimalFormat var2 = new DecimalFormat("##.##");

      StringBuilder var5;
      for(Iterator var3 = this.f.iterator(); var3.hasNext(); var1 = var5.toString()) {
         b var4 = (b)var3.next();
         var5 = new StringBuilder();
         var5.append(var1);
         var5.append("[");
         var5.append(var4.a);
         var5.append(" , ");
         var5.append(var2.format((double)var4.b));
         var5.append("] ");
      }

      return var1;
   }

   static class a {
      public double a(float var1) {
         throw null;
      }
   }

   static class b {
      int a;
      float b;
   }
}
