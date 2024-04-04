package o0;

import android.database.Cursor;
import android.database.MatrixCursor;

public class b {
   public static Cursor a(Cursor var0) {
      Throwable var10000;
      label722: {
         MatrixCursor var3;
         boolean var10001;
         try {
            var3 = new MatrixCursor(var0.getColumnNames(), var0.getCount());
         } catch (Throwable var92) {
            var10000 = var92;
            var10001 = false;
            break label722;
         }

         while(true) {
            Object[] var4;
            try {
               if (!var0.moveToNext()) {
                  break;
               }

               var4 = new Object[var0.getColumnCount()];
            } catch (Throwable var93) {
               var10000 = var93;
               var10001 = false;
               break label722;
            }

            int var1 = 0;

            while(true) {
               int var2;
               try {
                  if (var1 >= var0.getColumnCount()) {
                     break;
                  }

                  var2 = var0.getType(var1);
               } catch (Throwable var94) {
                  var10000 = var94;
                  var10001 = false;
                  break label722;
               }

               if (var2 != 0) {
                  if (var2 != 1) {
                     if (var2 != 2) {
                        if (var2 != 3) {
                           if (var2 != 4) {
                              try {
                                 IllegalStateException var95 = new IllegalStateException();
                                 throw var95;
                              } catch (Throwable var86) {
                                 var10000 = var86;
                                 var10001 = false;
                                 break label722;
                              }
                           }

                           try {
                              var4[var1] = var0.getBlob(var1);
                           } catch (Throwable var91) {
                              var10000 = var91;
                              var10001 = false;
                              break label722;
                           }
                        } else {
                           try {
                              var4[var1] = var0.getString(var1);
                           } catch (Throwable var90) {
                              var10000 = var90;
                              var10001 = false;
                              break label722;
                           }
                        }
                     } else {
                        try {
                           var4[var1] = var0.getDouble(var1);
                        } catch (Throwable var89) {
                           var10000 = var89;
                           var10001 = false;
                           break label722;
                        }
                     }
                  } else {
                     try {
                        var4[var1] = var0.getLong(var1);
                     } catch (Throwable var88) {
                        var10000 = var88;
                        var10001 = false;
                        break label722;
                     }
                  }
               } else {
                  var4[var1] = null;
               }

               ++var1;
            }

            try {
               var3.addRow(var4);
            } catch (Throwable var87) {
               var10000 = var87;
               var10001 = false;
               break label722;
            }
         }

         var0.close();
         return var3;
      }

      Throwable var96 = var10000;
      var0.close();
      throw var96;
   }

   public static int b(Cursor var0, String var1) {
      int var2 = var0.getColumnIndex(var1);
      if (var2 >= 0) {
         return var2;
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("`");
         var3.append(var1);
         var3.append("`");
         return var0.getColumnIndex(var3.toString());
      }
   }

   public static int c(Cursor var0, String var1) {
      int var2 = var0.getColumnIndex(var1);
      if (var2 >= 0) {
         return var2;
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("`");
         var3.append(var1);
         var3.append("`");
         return var0.getColumnIndexOrThrow(var3.toString());
      }
   }
}
