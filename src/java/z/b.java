package z;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {
   a a;

   b(a var1) {
      this.a = var1;
   }

   public CharSequence convertResultToString(Object var1) {
      return this.a.convertToString((Cursor)var1);
   }

   protected Filter.FilterResults performFiltering(CharSequence var1) {
      Cursor var3 = this.a.c(var1);
      Filter.FilterResults var2 = new Filter.FilterResults();
      if (var3 != null) {
         var2.count = var3.getCount();
         var2.values = var3;
      } else {
         var2.count = 0;
         var2.values = null;
      }

      return var2;
   }

   protected void publishResults(CharSequence var1, Filter.FilterResults var2) {
      Cursor var3 = this.a.b();
      Object var4 = var2.values;
      if (var4 != null && var4 != var3) {
         this.a.a((Cursor)var4);
      }

   }

   interface a {
      void a(Cursor var1);

      Cursor b();

      Cursor c(CharSequence var1);

      CharSequence convertToString(Cursor var1);
   }
}
