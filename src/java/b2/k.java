package b2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class k extends androidx.fragment.app.d {
   private Dialog D0;
   private DialogInterface.OnCancelListener E0;
   private Dialog F0;

   public static k f2(Dialog var0, DialogInterface.OnCancelListener var1) {
      k var2 = new k();
      var0 = (Dialog)e2.n.j(var0, "Cannot display null dialog");
      var0.setOnCancelListener((DialogInterface.OnCancelListener)null);
      var0.setOnDismissListener((DialogInterface.OnDismissListener)null);
      var2.D0 = var0;
      if (var1 != null) {
         var2.E0 = var1;
      }

      return var2;
   }

   public Dialog X1(Bundle var1) {
      Dialog var2 = this.D0;
      Dialog var3 = var2;
      if (var2 == null) {
         this.c2(false);
         if (this.F0 == null) {
            this.F0 = (new AlertDialog.Builder((Context)e2.n.i(this.y()))).create();
         }

         var3 = this.F0;
      }

      return var3;
   }

   public void e2(androidx.fragment.app.m var1, String var2) {
      super.e2(var1, var2);
   }

   public void onCancel(DialogInterface var1) {
      DialogInterface.OnCancelListener var2 = this.E0;
      if (var2 != null) {
         var2.onCancel(var1);
      }

   }
}
