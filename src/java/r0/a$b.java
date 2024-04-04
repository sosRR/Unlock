package r0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

class a$b implements SQLiteDatabase.CursorFactory {
   final q0.e a;
   final a b;

   a$b(a var1, q0.e var2) {
      this.b = var1;
      this.a = var2;
   }

   public Cursor newCursor(SQLiteDatabase var1, SQLiteCursorDriver var2, String var3, SQLiteQuery var4) {
      this.a.f(new d(var4));
      return new SQLiteCursor(var2, var3, var4);
   }
}
