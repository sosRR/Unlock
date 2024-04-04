package p3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;

public class a {
   private static final int[] i = new int[3];
   private static final float[] j = new float[]{0.0F, 0.5F, 1.0F};
   private static final int[] k = new int[4];
   private static final float[] l = new float[]{0.0F, 0.0F, 0.5F, 1.0F};
   private final Paint a;
   private final Paint b;
   private final Paint c;
   private int d;
   private int e;
   private int f;
   private final Path g;
   private Paint h;

   public a() {
      this(-16777216);
   }

   public a(int var1) {
      this.g = new Path();
      this.h = new Paint();
      this.a = new Paint();
      this.d(var1);
      this.h.setColor(0);
      Paint var2 = new Paint(4);
      this.b = var2;
      var2.setStyle(Style.FILL);
      this.c = new Paint(var2);
   }

   public void a(Canvas var1, Matrix var2, RectF var3, int var4, float var5, float var6) {
      boolean var10;
      if (var6 < 0.0F) {
         var10 = true;
      } else {
         var10 = false;
      }

      Path var11 = this.g;
      float var7;
      int[] var12;
      if (var10) {
         var12 = k;
         var12[0] = 0;
         var12[1] = this.f;
         var12[2] = this.e;
         var12[3] = this.d;
      } else {
         var11.rewind();
         var11.moveTo(var3.centerX(), var3.centerY());
         var11.arcTo(var3, var5, var6);
         var11.close();
         var7 = (float)(-var4);
         var3.inset(var7, var7);
         var12 = k;
         var12[0] = 0;
         var12[1] = this.d;
         var12[2] = this.e;
         var12[3] = this.f;
      }

      var7 = var3.width() / 2.0F;
      if (!(var7 <= 0.0F)) {
         float var9 = 1.0F - (float)var4 / var7;
         float var8 = (1.0F - var9) / 2.0F;
         float[] var13 = l;
         var13[1] = var9;
         var13[2] = var8 + var9;
         RadialGradient var14 = new RadialGradient(var3.centerX(), var3.centerY(), var7, k, var13, TileMode.CLAMP);
         this.b.setShader(var14);
         var1.save();
         var1.concat(var2);
         var1.scale(1.0F, var3.height() / var3.width());
         if (!var10) {
            var1.clipPath(var11, Op.DIFFERENCE);
            var1.drawPath(var11, this.h);
         }

         var1.drawArc(var3, var5, var6, true, this.b);
         var1.restore();
      }
   }

   public void b(Canvas var1, Matrix var2, RectF var3, int var4) {
      var3.bottom += (float)var4;
      var3.offset(0.0F, (float)(-var4));
      int[] var7 = i;
      var7[0] = this.f;
      var7[1] = this.e;
      var7[2] = this.d;
      Paint var6 = this.c;
      float var5 = var3.left;
      var6.setShader(new LinearGradient(var5, var3.top, var5, var3.bottom, var7, j, TileMode.CLAMP));
      var1.save();
      var1.concat(var2);
      var1.drawRect(var3, this.c);
      var1.restore();
   }

   public Paint c() {
      return this.a;
   }

   public void d(int var1) {
      this.d = androidx.core.graphics.a.j(var1, 68);
      this.e = androidx.core.graphics.a.j(var1, 20);
      this.f = androidx.core.graphics.a.j(var1, 0);
      this.a.setColor(this.d);
   }
}
