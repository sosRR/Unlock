package f5;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class i extends androidx.fragment.app.d {
   private String D0 = null;
   private a E0 = null;

   public Dialog X1(Bundle var1) {
      a var2 = new a(this, this.r());
      this.E0 = var2;
      return var2;
   }

   public void g2(String var1) {
      a var2 = this.E0;
      if (var2 != null) {
         TextView var3 = (TextView)var2.findViewById(2131296635);
         if (var3 != null) {
            var3.setText(var1);
         }
      }

      this.D0 = var1;
   }

   private class a extends Dialog {
      final i m;

      public a(i var1, Context var2) {
         super(var2, 2131886420);
         this.m = var1;
      }

      protected void onCreate(Bundle var1) {
         super.onCreate(var1);
         this.setContentView(2131492997);
         this.setCancelable(false);
         if (this.m.D0 != null) {
            i var2 = this.m;
            var2.g2(var2.D0);
         }

      }
   }
}
