package n3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

class d$b extends f {
   final Context a;
   final TextPaint b;
   final f c;
   final d d;

   d$b(d var1, Context var2, TextPaint var3, f var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void a(int var1) {
      this.c.a(var1);
   }

   public void b(Typeface var1, boolean var2) {
      this.d.p(this.a, this.b, var1);
      this.c.b(var1, var2);
   }
}
