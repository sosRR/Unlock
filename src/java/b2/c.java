package b2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class c extends DialogFragment {
   private Dialog m;
   private DialogInterface.OnCancelListener n;
   private Dialog o;

   public static c a(Dialog var0, DialogInterface.OnCancelListener var1) {
      c var2 = new c();
      var0 = (Dialog)e2.n.j(var0, "Cannot display null dialog");
      var0.setOnCancelListener((DialogInterface.OnCancelListener)null);
      var0.setOnDismissListener((DialogInterface.OnDismissListener)null);
      var2.m = var0;
      if (var1 != null) {
         var2.n = var1;
      }

      return var2;
   }

   public void onCancel(DialogInterface var1) {
      DialogInterface.OnCancelListener var2 = this.n;
      if (var2 != null) {
         var2.onCancel(var1);
      }

   }

   public Dialog onCreateDialog(Bundle var1) {
      Dialog var2 = this.m;
      Dialog var3 = var2;
      if (var2 == null) {
         this.setShowsDialog(false);
         if (this.o == null) {
            this.o = (new AlertDialog.Builder((Context)e2.n.i(this.getActivity()))).create();
         }

         var3 = this.o;
      }

      return var3;
   }

   public void show(FragmentManager var1, String var2) {
      super.show(var1, var2);
   }
}
