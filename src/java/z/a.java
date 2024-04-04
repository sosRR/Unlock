package z;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {
   protected boolean m;
   protected boolean n;
   protected Cursor o;
   protected Context p;
   protected int q;
   protected <undefinedtype> r;
   protected DataSetObserver s;
   protected b t;

   public a(Context var1, Cursor var2, boolean var3) {
      byte var4;
      if (var3) {
         var4 = 1;
      } else {
         var4 = 2;
      }

      this.e(var1, var2, var4);
   }

   public void a(Cursor var1) {
      var1 = this.i(var1);
      if (var1 != null) {
         var1.close();
      }

   }

   public Cursor b() {
      return this.o;
   }

   public abstract CharSequence convertToString(Cursor var1);

   public abstract void d(View var1, Context var2, Cursor var3);

   void e(Context var1, Cursor var2, int var3) {
      boolean var5 = false;
      if ((var3 & 1) == 1) {
         var3 |= 2;
         this.n = true;
      } else {
         this.n = false;
      }

      if (var2 != null) {
         var5 = true;
      }

      this.o = var2;
      this.m = var5;
      this.p = var1;
      int var4;
      if (var5) {
         var4 = var2.getColumnIndexOrThrow("_id");
      } else {
         var4 = -1;
      }

      this.q = var4;
      if ((var3 & 2) == 2) {
         this.r = new ContentObserver(this) {
            final a a;

            {
               this.a = var1;
            }

            public boolean deliverSelfNotifications() {
               return true;
            }

            public void onChange(boolean var1) {
               this.a.h();
            }
         };
         this.s = new DataSetObserver(this) {
            final a a;

            {
               this.a = var1;
            }

            public void onChanged() {
               a var1 = this.a;
               var1.m = true;
               var1.notifyDataSetChanged();
            }

            public void onInvalidated() {
               a var1 = this.a;
               var1.m = false;
               var1.notifyDataSetInvalidated();
            }
         };
      } else {
         this.r = null;
         this.s = null;
      }

      if (var5) {
         <undefinedtype> var6 = this.r;
         if (var6 != null) {
            var2.registerContentObserver(var6);
         }

         DataSetObserver var7 = this.s;
         if (var7 != null) {
            var2.registerDataSetObserver(var7);
         }
      }

   }

   public abstract View f(Context var1, Cursor var2, ViewGroup var3);

   public abstract View g(Context var1, Cursor var2, ViewGroup var3);

   public int getCount() {
      if (this.m) {
         Cursor var1 = this.o;
         if (var1 != null) {
            return var1.getCount();
         }
      }

      return 0;
   }

   public View getDropDownView(int var1, View var2, ViewGroup var3) {
      if (this.m) {
         this.o.moveToPosition(var1);
         View var4 = var2;
         if (var2 == null) {
            var4 = this.f(this.p, this.o, var3);
         }

         this.d(var4, this.p, this.o);
         return var4;
      } else {
         return null;
      }
   }

   public Filter getFilter() {
      if (this.t == null) {
         this.t = new b(this);
      }

      return this.t;
   }

   public Object getItem(int var1) {
      if (this.m) {
         Cursor var2 = this.o;
         if (var2 != null) {
            var2.moveToPosition(var1);
            return this.o;
         }
      }

      return null;
   }

   public long getItemId(int var1) {
      if (this.m) {
         Cursor var2 = this.o;
         if (var2 != null && var2.moveToPosition(var1)) {
            return this.o.getLong(this.q);
         }
      }

      return 0L;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      if (this.m) {
         if (this.o.moveToPosition(var1)) {
            View var4 = var2;
            if (var2 == null) {
               var4 = this.g(this.p, this.o, var3);
            }

            this.d(var4, this.p, this.o);
            return var4;
         } else {
            StringBuilder var5 = new StringBuilder();
            var5.append("couldn't move cursor to position ");
            var5.append(var1);
            throw new IllegalStateException(var5.toString());
         }
      } else {
         throw new IllegalStateException("this should only be called when the cursor is valid");
      }
   }

   protected void h() {
      if (this.n) {
         Cursor var1 = this.o;
         if (var1 != null && !var1.isClosed()) {
            this.m = this.o.requery();
         }
      }

   }

   public Cursor i(Cursor var1) {
      Cursor var2 = this.o;
      if (var1 == var2) {
         return null;
      } else {
         <undefinedtype> var3;
         DataSetObserver var4;
         if (var2 != null) {
            var3 = this.r;
            if (var3 != null) {
               var2.unregisterContentObserver(var3);
            }

            var4 = this.s;
            if (var4 != null) {
               var2.unregisterDataSetObserver(var4);
            }
         }

         this.o = var1;
         if (var1 != null) {
            var3 = this.r;
            if (var3 != null) {
               var1.registerContentObserver(var3);
            }

            var4 = this.s;
            if (var4 != null) {
               var1.registerDataSetObserver(var4);
            }

            this.q = var1.getColumnIndexOrThrow("_id");
            this.m = true;
            this.notifyDataSetChanged();
         } else {
            this.q = -1;
            this.m = false;
            this.notifyDataSetInvalidated();
         }

         return var2;
      }
   }
}
