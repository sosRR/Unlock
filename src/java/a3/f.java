package a3;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class f extends Property {
   private final Matrix a = new Matrix();

   public f() {
      super(Matrix.class, "imageMatrixProperty");
   }

   public Matrix a(ImageView var1) {
      this.a.set(var1.getImageMatrix());
      return this.a;
   }

   public void b(ImageView var1, Matrix var2) {
      var1.setImageMatrix(var2);
   }
}
