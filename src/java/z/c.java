package z;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {
   private int u;
   private int v;
   private LayoutInflater w;

   @Deprecated
   public c(Context var1, int var2, Cursor var3, boolean var4) {
      super(var1, var3, var4);
      this.v = var2;
      this.u = var2;
      this.w = (LayoutInflater)var1.getSystemService("layout_inflater");
   }

   public View f(Context var1, Cursor var2, ViewGroup var3) {
      return this.w.inflate(this.v, var3, false);
   }

   public View g(Context var1, Cursor var2, ViewGroup var3) {
      return this.w.inflate(this.u, var3, false);
   }
}
