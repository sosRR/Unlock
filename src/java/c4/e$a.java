package c4;

import java.io.InputStream;

class e$a implements e.d {
   boolean a;
   final StringBuilder b;
   final e c;

   e$a(e var1, StringBuilder var2) {
      this.c = var1;
      this.b = var2;
      this.a = true;
   }

   public void a(InputStream var1, int var2) {
      if (this.a) {
         this.a = false;
      } else {
         this.b.append(", ");
      }

      this.b.append(var2);
   }
}
