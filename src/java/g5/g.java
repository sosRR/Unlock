package g5;

import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class g {
   private final String a = g.class.getSimpleName();

   public g(Context var1, int var2, List var3, int var4) {
      DialogInterface.OnClickListener var5 = new DialogInterface.OnClickListener(this) {
         final g m;

         {
            this.m = var1;
         }

         public void onClick(DialogInterface var1, int var2) {
            var1.dismiss();
         }
      };
      c var6 = new c(var3);
      View var10 = LayoutInflater.from(var1).inflate(2131492998, (ViewGroup)null);
      RecyclerView var7 = (RecyclerView)var10.findViewById(2131296642);
      var7.setAdapter(var6);
      var7.setLayoutManager(new LinearLayoutManager(var1));
      var7.setFocusable(false);
      TextView var11 = (TextView)var10.findViewById(2131296764);
      TextView var12 = (TextView)var10.findViewById(2131296356);
      var11.setText(var2);
      var11.setFocusable(true);
      var11.setFocusableInTouchMode(true);
      var12.setText(var4);
      var12.setMovementMethod(LinkMovementMethod.getInstance());
      var12.setFocusable(true);
      var12.setFocusableInTouchMode(true);
      androidx.appcompat.app.b.a var8 = new androidx.appcompat.app.b.a(var1);
      var8.h("Close", var5);
      androidx.appcompat.app.b var9 = var8.a();
      var9.setOnShowListener(new DialogInterface.OnShowListener(this, var9) {
         final androidx.appcompat.app.b a;
         final g b;

         {
            this.b = var1;
            this.a = var2;
         }

         public void onShow(DialogInterface var1) {
            Button var2 = this.a.n(-2);
            var2.setFocusable(true);
            var2.setFocusableInTouchMode(true);
            var2.requestFocus();
         }
      });
      var9.q(var10, 20, 20, 20, 20);
      var9.show();
   }

   private static class c extends RecyclerView.g {
      final String c = c.class.getSimpleName();
      List d;

      public c(List var1) {
         this.d = var1;
      }

      public int f() {
         List var1 = this.d;
         return var1 == null ? 0 : var1.size();
      }

      public void y(a var1, int var2) {
         var1.M().setText((CharSequence)this.d.get(var2));
      }

      public a z(ViewGroup var1, int var2) {
         return new a(LayoutInflater.from(var1.getContext()).inflate(2131492917, var1, false));
      }

      public static class a extends RecyclerView.d0 {
         private final TextView t;

         public a(View var1) {
            super(var1);
            this.t = (TextView)var1.findViewById(2131296641);
         }

         public TextView M() {
            return this.t;
         }
      }
   }
}
