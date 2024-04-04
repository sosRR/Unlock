package s;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class o {
   static int g;
   ArrayList a = new ArrayList();
   int b;
   boolean c = false;
   int d;
   ArrayList e = null;
   private int f = -1;

   public o(int var1) {
      int var2 = g++;
      this.b = var2;
      this.d = var1;
   }

   private String e() {
      int var1 = this.d;
      if (var1 == 0) {
         return "Horizontal";
      } else if (var1 == 1) {
         return "Vertical";
      } else {
         return var1 == 2 ? "Both" : "Unknown";
      }
   }

   private int j(d var1, ArrayList var2, int var3) {
      byte var5 = 0;
      r.f var6 = (r.f)((r.e)var2.get(0)).I();
      var1.D();
      var6.g(var1, false);

      int var4;
      for(var4 = 0; var4 < var2.size(); ++var4) {
         ((r.e)var2.get(var4)).g(var1, false);
      }

      if (var3 == 0 && var6.W0 > 0) {
         r.b.b(var6, var1, var2, 0);
      }

      if (var3 == 1 && var6.X0 > 0) {
         r.b.b(var6, var1, var2, 1);
      }

      try {
         var1.z();
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      this.e = new ArrayList();

      for(var4 = var5; var4 < var2.size(); ++var4) {
         a var7 = new a(this, (r.e)var2.get(var4), var1, var3);
         this.e.add(var7);
      }

      if (var3 == 0) {
         var4 = var1.x(var6.O);
         var3 = var1.x(var6.Q);
         var1.D();
      } else {
         var4 = var1.x(var6.P);
         var3 = var1.x(var6.R);
         var1.D();
      }

      return var3 - var4;
   }

   public boolean a(r.e var1) {
      if (this.a.contains(var1)) {
         return false;
      } else {
         this.a.add(var1);
         return true;
      }
   }

   public void b(ArrayList var1) {
      int var3 = this.a.size();
      if (this.f != -1 && var3 > 0) {
         for(int var2 = 0; var2 < var1.size(); ++var2) {
            o var4 = (o)var1.get(var2);
            if (this.f == var4.b) {
               this.g(this.d, var4);
            }
         }
      }

      if (var3 == 0) {
         var1.remove(this);
      }

   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public int f(d var1, int var2) {
      return this.a.size() == 0 ? 0 : this.j(var1, this.a, var2);
   }

   public void g(int var1, o var2) {
      Iterator var4 = this.a.iterator();

      while(var4.hasNext()) {
         r.e var3 = (r.e)var4.next();
         var2.a(var3);
         if (var1 == 0) {
            var3.I0 = var2.c();
         } else {
            var3.J0 = var2.c();
         }
      }

      this.f = var2.b;
   }

   public void h(boolean var1) {
      this.c = var1;
   }

   public void i(int var1) {
      this.d = var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.e());
      var1.append(" [");
      var1.append(this.b);
      var1.append("] <");
      String var5 = var1.toString();

      StringBuilder var3;
      for(Iterator var2 = this.a.iterator(); var2.hasNext(); var5 = var3.toString()) {
         r.e var4 = (r.e)var2.next();
         var3 = new StringBuilder();
         var3.append(var5);
         var3.append(" ");
         var3.append(var4.r());
      }

      StringBuilder var6 = new StringBuilder();
      var6.append(var5);
      var6.append(" >");
      return var6.toString();
   }

   class a {
      WeakReference a;
      int b;
      int c;
      int d;
      int e;
      int f;
      int g;
      final o h;

      public a(o var1, r.e var2, d var3, int var4) {
         this.h = var1;
         this.a = new WeakReference(var2);
         this.b = var3.x(var2.O);
         this.c = var3.x(var2.P);
         this.d = var3.x(var2.Q);
         this.e = var3.x(var2.R);
         this.f = var3.x(var2.S);
         this.g = var4;
      }
   }
}
