package b4;

import java.io.File;
import java.io.IOException;

class m {
   private final String a;
   private final g4.f b;

   public m(String var1, g4.f var2) {
      this.a = var1;
      this.b = var2;
   }

   private File b() {
      return this.b.e(this.a);
   }

   public boolean a() {
      boolean var1;
      try {
         var1 = this.b().createNewFile();
      } catch (IOException var5) {
         y3.f var4 = y3.f.f();
         StringBuilder var3 = new StringBuilder();
         var3.append("Error creating marker: ");
         var3.append(this.a);
         var4.e(var3.toString(), var5);
         var1 = false;
      }

      return var1;
   }

   public boolean c() {
      return this.b().exists();
   }

   public boolean d() {
      return this.b().delete();
   }
}
