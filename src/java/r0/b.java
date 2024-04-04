package r0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

class b implements q0.c {
   private final Context m;
   private final String n;
   private final q0.c.a o;
   private final boolean p;
   private final Object q;
   private r0.b.a r;
   private boolean s;

   b(Context var1, String var2, q0.c.a var3, boolean var4) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
      this.q = new Object();
   }

   private r0.b.a a() {
      Object var1 = this.q;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label297: {
         label302: {
            label294: {
               r0.a[] var2;
               r0.b.a var3;
               try {
                  if (this.r != null) {
                     break label302;
                  }

                  var2 = new r0.a[1];
                  if (this.n != null && this.p) {
                     File var4 = new File(this.m.getNoBackupFilesDir(), this.n);
                     var3 = new r0.b.a(this.m, var4.getAbsolutePath(), var2, this.o);
                     this.r = var3;
                     break label294;
                  }
               } catch (Throwable var35) {
                  var10000 = var35;
                  var10001 = false;
                  break label297;
               }

               try {
                  var3 = new r0.b.a(this.m, this.n, var2, this.o);
                  this.r = var3;
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label297;
               }
            }

            try {
               this.r.setWriteAheadLoggingEnabled(this.s);
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label297;
            }
         }

         label280:
         try {
            r0.b.a var37 = this.r;
            return var37;
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label280;
         }
      }

      while(true) {
         Throwable var36 = var10000;

         try {
            throw var36;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            continue;
         }
      }
   }

   public q0.b I() {
      return this.a().g();
   }

   public void close() {
      this.a().close();
   }

   public String getDatabaseName() {
      return this.n;
   }

   public void setWriteAheadLoggingEnabled(boolean var1) {
      Object var2 = this.q;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label176: {
         r0.b.a var3;
         try {
            var3 = this.r;
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label176;
         }

         if (var3 != null) {
            try {
               var3.setWriteAheadLoggingEnabled(var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label176;
            }
         }

         label165:
         try {
            this.s = var1;
            return;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label165;
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   static class a extends SQLiteOpenHelper {
      final r0.a[] m;
      final q0.c.a n;
      private boolean o;

      a(Context var1, String var2, r0.a[] var3, q0.c.a var4) {
         super(var1, var2, (SQLiteDatabase.CursorFactory)null, var4.a, new DatabaseErrorHandler(var4, var3) {
            final q0.c.a a;
            final r0.a[] b;

            {
               this.a = var1;
               this.b = var2;
            }

            public void onCorruption(SQLiteDatabase var1) {
               this.a.c(r0.b.a.f(this.b, var1));
            }
         });
         this.n = var4;
         this.m = var3;
      }

      static r0.a f(r0.a[] var0, SQLiteDatabase var1) {
         r0.a var2 = var0[0];
         if (var2 == null || !var2.a(var1)) {
            var0[0] = new r0.a(var1);
         }

         return var0[0];
      }

      r0.a a(SQLiteDatabase var1) {
         return f(this.m, var1);
      }

      public void close() {
         synchronized(this){}

         try {
            super.close();
            this.m[0] = null;
         } finally {
            ;
         }

      }

      q0.b g() {
         synchronized(this){}

         r0.a var5;
         try {
            this.o = false;
            SQLiteDatabase var1 = super.getWritableDatabase();
            if (this.o) {
               this.close();
               q0.b var6 = this.g();
               return var6;
            }

            var5 = this.a(var1);
         } finally {
            ;
         }

         return var5;
      }

      public void onConfigure(SQLiteDatabase var1) {
         this.n.b(this.a(var1));
      }

      public void onCreate(SQLiteDatabase var1) {
         this.n.d(this.a(var1));
      }

      public void onDowngrade(SQLiteDatabase var1, int var2, int var3) {
         this.o = true;
         this.n.e(this.a(var1), var2, var3);
      }

      public void onOpen(SQLiteDatabase var1) {
         if (!this.o) {
            this.n.f(this.a(var1));
         }

      }

      public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
         this.o = true;
         this.n.g(this.a(var1), var2, var3);
      }
   }
}
