package q0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

public interface c extends Closeable {
   q0.b I();

   void close();

   String getDatabaseName();

   void setWriteAheadLoggingEnabled(boolean var1);

   public abstract static class a {
      public final int a;

      public a(int var1) {
         this.a = var1;
      }

      private void a(String var1) {
         if (!var1.equalsIgnoreCase(":memory:") && var1.trim().length() != 0) {
            StringBuilder var2 = new StringBuilder();
            var2.append("deleting the database file: ");
            var2.append(var1);
            Log.w("SupportSQLite", var2.toString());

            try {
               File var4 = new File(var1);
               SQLiteDatabase.deleteDatabase(var4);
            } catch (Exception var3) {
               Log.w("SupportSQLite", "delete failed: ", var3);
            }
         }

      }

      public void b(q0.b var1) {
      }

      public void c(q0.b param1) {
         // $FF: Couldn't be decompiled
      }

      public abstract void d(q0.b var1);

      public abstract void e(q0.b var1, int var2, int var3);

      public void f(q0.b var1) {
      }

      public abstract void g(q0.b var1, int var2, int var3);
   }

   public static class b {
      public final Context a;
      public final String b;
      public final q0.c.a c;
      public final boolean d;

      b(Context var1, String var2, q0.c.a var3, boolean var4) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
      }

      public static q0.c.b.a a(Context var0) {
         return new q0.c.b.a(var0);
      }

      public static class a {
         Context a;
         String b;
         q0.c.a c;
         boolean d;

         a(Context var1) {
            this.a = var1;
         }

         public q0.c.b a() {
            if (this.c != null) {
               if (this.a != null) {
                  if (this.d && TextUtils.isEmpty(this.b)) {
                     throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                  } else {
                     return new q0.c.b(this.a, this.b, this.c, this.d);
                  }
               } else {
                  throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
               }
            } else {
               throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }
         }

         public q0.c.b.a b(q0.c.a var1) {
            this.c = var1;
            return this;
         }

         public q0.c.b.a c(String var1) {
            this.b = var1;
            return this;
         }

         public q0.c.b.a d(boolean var1) {
            this.d = var1;
            return this;
         }
      }
   }

   public interface c {
      q0.c a(q0.b var1);
   }
}
