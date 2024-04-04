package c4;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class f implements a {
   private static final Charset d = Charset.forName("UTF-8");
   private final File a;
   private final int b;
   private e c;

   f(File var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   private void f(long var1, String var3) {
      if (this.c != null) {
         String var5 = var3;
         if (var3 == null) {
            var5 = "null";
         }

         IOException var10000;
         label57: {
            int var4;
            boolean var10001;
            try {
               var4 = this.b / 4;
            } catch (IOException var9) {
               var10000 = var9;
               var10001 = false;
               break label57;
            }

            var3 = var5;

            try {
               if (var5.length() > var4) {
                  StringBuilder var10 = new StringBuilder();
                  var10.append("...");
                  var10.append(var5.substring(var5.length() - var4));
                  var3 = var10.toString();
               }
            } catch (IOException var8) {
               var10000 = var8;
               var10001 = false;
               break label57;
            }

            try {
               var3 = var3.replaceAll("\r", " ").replaceAll("\n", " ");
               byte[] var11 = String.format(Locale.US, "%d %s%n", new Object[]{var1, var3}).getBytes(d);
               this.c.l(var11);
            } catch (IOException var7) {
               var10000 = var7;
               var10001 = false;
               break label57;
            }

            while(true) {
               try {
                  if (this.c.N() || this.c.Y() <= this.b) {
                     return;
                  }

                  this.c.U();
               } catch (IOException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }
            }
         }

         IOException var12 = var10000;
         y3.f.f().e("There was a problem writing to the Crashlytics log.", var12);
      }
   }

   private b g() {
      if (!this.a.exists()) {
         return null;
      } else {
         this.h();
         e var2 = this.c;
         if (var2 == null) {
            return null;
         } else {
            int[] var1 = new int[]{0};
            byte[] var6 = new byte[var2.Y()];

            try {
               e var3 = this.c;
               e.d var4 = new e.d(this, var6, var1) {
                  final byte[] a;
                  final int[] b;
                  final f c;

                  {
                     this.c = var1;
                     this.a = var2;
                     this.b = var3;
                  }

                  public void a(InputStream var1, int var2) {
                     boolean var5 = false;

                     int[] var3;
                     try {
                        var5 = true;
                        var1.read(this.a, this.b[0], var2);
                        var3 = this.b;
                        var5 = false;
                     } finally {
                        if (var5) {
                           var1.close();
                        }
                     }

                     var3[0] += var2;
                     var1.close();
                  }
               };
               var3.E(var4);
            } catch (IOException var5) {
               y3.f.f().e("A problem occurred while reading the Crashlytics log file.", var5);
            }

            return new b(var6, var1[0]);
         }
      }
   }

   private void h() {
      if (this.c == null) {
         try {
            e var5 = new e(this.a);
            this.c = var5;
         } catch (IOException var4) {
            y3.f var1 = y3.f.f();
            StringBuilder var3 = new StringBuilder();
            var3.append("Could not open log file: ");
            var3.append(this.a);
            var1.e(var3.toString(), var4);
         }
      }

   }

   public void a() {
      b4.g.e(this.c, "There was a problem closing the Crashlytics log file.");
      this.c = null;
   }

   public String b() {
      byte[] var1 = this.c();
      String var2;
      if (var1 != null) {
         var2 = new String(var1, d);
      } else {
         var2 = null;
      }

      return var2;
   }

   public byte[] c() {
      b var3 = this.g();
      if (var3 == null) {
         return null;
      } else {
         int var1 = var3.b;
         byte[] var2 = new byte[var1];
         System.arraycopy(var3.a, 0, var2, 0, var1);
         return var2;
      }
   }

   public void d() {
      this.a();
      this.a.delete();
   }

   public void e(long var1, String var3) {
      this.h();
      this.f(var1, var3);
   }

   private static class b {
      public final byte[] a;
      public final int b;

      b(byte[] var1, int var2) {
         this.a = var1;
         this.b = var2;
      }
   }
}
