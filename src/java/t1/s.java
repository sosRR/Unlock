package t1;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;

// $FF: synthetic class
public final class s implements m0.b {
   public final m0 a;
   public final String b;
   public final Map c;
   public final o1.a.a d;

   // $FF: synthetic method
   public s(m0 var1, String var2, Map var3, o1.a.a var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final Object apply(Object var1) {
      return m0.U(this.a, this.b, this.c, this.d, (SQLiteDatabase)var1);
   }
}
