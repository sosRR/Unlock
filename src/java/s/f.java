package s;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f implements d {
   public d a = null;
   public boolean b = false;
   public boolean c = false;
   p d;
   <undefinedtype> e;
   int f;
   public int g;
   int h;
   g i;
   public boolean j;
   List k;
   List l;

   public f(p var1) {
      this.e = null.m;
      this.h = 1;
      this.i = null;
      this.j = false;
      this.k = new ArrayList();
      this.l = new ArrayList();
      this.d = var1;
   }

   public void a(d var1) {
      Iterator var5 = this.l.iterator();

      do {
         if (!var5.hasNext()) {
            this.c = true;
            var1 = this.a;
            if (var1 != null) {
               var1.a(this);
            }

            if (this.b) {
               this.d.a(this);
               return;
            }

            Iterator var4 = this.l.iterator();
            f var6 = null;
            int var2 = 0;

            while(var4.hasNext()) {
               f var3 = (f)var4.next();
               if (!(var3 instanceof g)) {
                  ++var2;
                  var6 = var3;
               }
            }

            if (var6 != null && var2 == 1 && var6.j) {
               g var7 = this.i;
               if (var7 != null) {
                  if (!var7.j) {
                     return;
                  }

                  this.f = this.h * var7.g;
               }

               this.d(var6.g + this.f);
            }

            var1 = this.a;
            if (var1 != null) {
               var1.a(this);
            }

            return;
         }
      } while(((f)var5.next()).j);

   }

   public void b(d var1) {
      this.k.add(var1);
      if (this.j) {
         var1.a(var1);
      }

   }

   public void c() {
      this.l.clear();
      this.k.clear();
      this.j = false;
      this.g = 0;
      this.c = false;
      this.b = false;
   }

   public void d(int var1) {
      if (!this.j) {
         this.j = true;
         this.g = var1;
         Iterator var3 = this.k.iterator();

         while(var3.hasNext()) {
            d var2 = (d)var3.next();
            var2.a(var2);
         }

      }
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append(this.d.b.r());
      var2.append(":");
      var2.append(this.e);
      var2.append("(");
      Object var1;
      if (this.j) {
         var1 = this.g;
      } else {
         var1 = "unresolved";
      }

      var2.append(var1);
      var2.append(") <t=");
      var2.append(this.l.size());
      var2.append(":d=");
      var2.append(this.k.size());
      var2.append(">");
      return var2.toString();
   }
}
