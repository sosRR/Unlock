package b4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class u implements y {
   private final File a;
   private final String b;
   private final String c;

   u(String var1, String var2, File var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   private byte[] d() {
      byte[] var5 = new byte[8192];

      InputStream var2;
      boolean var10001;
      try {
         var2 = this.a();
      } catch (IOException var362) {
         var10001 = false;
         return null;
      }

      Throwable var10000;
      Throwable var364;
      label2369: {
         ByteArrayOutputStream var3;
         try {
            var3 = new ByteArrayOutputStream();
         } catch (Throwable var361) {
            var10000 = var361;
            var10001 = false;
            break label2369;
         }

         Throwable var365;
         label2370: {
            GZIPOutputStream var4;
            try {
               var4 = new GZIPOutputStream(var3);
            } catch (Throwable var360) {
               var10000 = var360;
               var10001 = false;
               break label2370;
            }

            if (var2 == null) {
               label2371: {
                  try {
                     var4.close();
                  } catch (Throwable var355) {
                     var10000 = var355;
                     var10001 = false;
                     break label2371;
                  }

                  try {
                     var3.close();
                  } catch (Throwable var351) {
                     var10000 = var351;
                     var10001 = false;
                     break label2369;
                  }

                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (IOException var347) {
                        var10001 = false;
                        return null;
                     }
                  }

                  return null;
               }
            } else {
               label2373: {
                  label2372: {
                     while(true) {
                        int var1;
                        try {
                           var1 = var2.read(var5);
                        } catch (Throwable var359) {
                           var10000 = var359;
                           var10001 = false;
                           break;
                        }

                        if (var1 > 0) {
                           try {
                              var4.write(var5, 0, var1);
                           } catch (Throwable var357) {
                              var10000 = var357;
                              var10001 = false;
                              break;
                           }
                        } else {
                           try {
                              var4.finish();
                              var5 = var3.toByteArray();
                              break label2372;
                           } catch (Throwable var358) {
                              var10000 = var358;
                              var10001 = false;
                              break;
                           }
                        }
                     }

                     Throwable var366 = var10000;

                     try {
                        var4.close();
                     } catch (Throwable var354) {
                        var365 = var354;

                        label2326:
                        try {
                           var366.addSuppressed(var365);
                           break label2326;
                        } catch (Throwable var353) {
                           var10000 = var353;
                           var10001 = false;
                           break label2373;
                        }
                     }

                     try {
                        throw var366;
                     } catch (Throwable var346) {
                        var10000 = var346;
                        var10001 = false;
                        break label2373;
                     }
                  }

                  try {
                     var4.close();
                  } catch (Throwable var356) {
                     var10000 = var356;
                     var10001 = false;
                     break label2373;
                  }

                  try {
                     var3.close();
                  } catch (Throwable var352) {
                     var10000 = var352;
                     var10001 = false;
                     break label2369;
                  }

                  try {
                     var2.close();
                     return var5;
                  } catch (IOException var348) {
                     var10001 = false;
                     return null;
                  }
               }
            }
         }

         var365 = var10000;

         try {
            var3.close();
         } catch (Throwable var350) {
            var364 = var350;

            label2312:
            try {
               var365.addSuppressed(var364);
               break label2312;
            } catch (Throwable var349) {
               var10000 = var349;
               var10001 = false;
               break label2369;
            }
         }

         label2301:
         try {
            throw var365;
         } catch (Throwable var345) {
            var10000 = var345;
            var10001 = false;
            break label2301;
         }
      }

      var364 = var10000;
      if (var2 != null) {
         try {
            var2.close();
         } catch (Throwable var344) {
            Throwable var363 = var344;

            label2294:
            try {
               var364.addSuppressed(var363);
               break label2294;
            } catch (IOException var343) {
               var10001 = false;
               return null;
            }
         }
      }

      try {
         throw var364;
      } catch (IOException var342) {
         var10001 = false;
         return null;
      }
   }

   public InputStream a() {
      if (this.a.exists() && this.a.isFile()) {
         try {
            FileInputStream var1 = new FileInputStream(this.a);
            return var1;
         } catch (FileNotFoundException var2) {
         }
      }

      return null;
   }

   public String b() {
      return this.c;
   }

   public d4.a0.d.b c() {
      byte[] var1 = this.d();
      d4.a0.d.b var2;
      if (var1 != null) {
         var2 = d4.a0.d.b.a().b(var1).c(this.b).a();
      } else {
         var2 = null;
      }

      return var2;
   }
}
