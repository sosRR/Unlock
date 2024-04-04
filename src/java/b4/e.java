package b4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class e implements y {
   private final byte[] a;
   private final String b;
   private final String c;

   e(String var1, String var2, byte[] var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   private byte[] d() {
      if (this.e()) {
         return null;
      } else {
         ByteArrayOutputStream var1;
         boolean var10001;
         try {
            var1 = new ByteArrayOutputStream();
         } catch (IOException var91) {
            var10001 = false;
            return null;
         }

         byte[] var94;
         label597: {
            Throwable var10000;
            Throwable var93;
            label598: {
               GZIPOutputStream var2;
               try {
                  var2 = new GZIPOutputStream(var1);
               } catch (Throwable var90) {
                  var10000 = var90;
                  var10001 = false;
                  break label598;
               }

               try {
                  var2.write(this.a);
                  var2.finish();
                  var94 = var1.toByteArray();
               } catch (Throwable var89) {
                  Throwable var3 = var89;

                  try {
                     var2.close();
                  } catch (Throwable var87) {
                     var93 = var87;

                     label572:
                     try {
                        var3.addSuppressed(var93);
                        break label572;
                     } catch (Throwable var86) {
                        var10000 = var86;
                        var10001 = false;
                        break label598;
                     }
                  }

                  try {
                     throw var3;
                  } catch (Throwable var84) {
                     var10000 = var84;
                     var10001 = false;
                     break label598;
                  }
               }

               label580:
               try {
                  var2.close();
                  break label597;
               } catch (Throwable var88) {
                  var10000 = var88;
                  var10001 = false;
                  break label580;
               }
            }

            var93 = var10000;

            try {
               var1.close();
            } catch (Throwable var83) {
               Throwable var92 = var83;

               label560:
               try {
                  var93.addSuppressed(var92);
                  break label560;
               } catch (IOException var82) {
                  var10001 = false;
                  return null;
               }
            }

            try {
               throw var93;
            } catch (IOException var81) {
               var10001 = false;
               return null;
            }
         }

         try {
            var1.close();
            return var94;
         } catch (IOException var85) {
            var10001 = false;
            return null;
         }
      }
   }

   private boolean e() {
      byte[] var2 = this.a;
      boolean var1;
      if (var2 != null && var2.length != 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public InputStream a() {
      ByteArrayInputStream var1;
      if (this.e()) {
         var1 = null;
      } else {
         var1 = new ByteArrayInputStream(this.a);
      }

      return var1;
   }

   public String b() {
      return this.c;
   }

   public d4.a0.d.b c() {
      byte[] var1 = this.d();
      d4.a0.d.b var2;
      if (var1 == null) {
         var2 = null;
      } else {
         var2 = d4.a0.d.b.a().b(var1).c(this.b).a();
      }

      return var2;
   }
}
