package f1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class r$a implements Callable {
   final m0.c a;
   final r b;

   r$a(r var1, m0.c var2) {
      this.b = var1;
      this.a = var2;
   }

   public List a() {
      r.y(this.b).c();

      ArrayList var11;
      label1723: {
         Throwable var196;
         Throwable var10000;
         label1727: {
            Cursor var8;
            boolean var10001;
            try {
               var8 = o0.c.b(r.y(this.b), this.a, true, (CancellationSignal)null);
            } catch (Throwable var193) {
               var10000 = var193;
               var10001 = false;
               break label1727;
            }

            label1728: {
               label1729: {
                  int var1;
                  int var2;
                  int var3;
                  int var4;
                  n.a var9;
                  n.a var10;
                  try {
                     var3 = o0.b.c(var8, "id");
                     var4 = o0.b.c(var8, "state");
                     var1 = o0.b.c(var8, "output");
                     var2 = o0.b.c(var8, "run_attempt_count");
                     var9 = new n.a();
                     var10 = new n.a();
                  } catch (Throwable var190) {
                     var10000 = var190;
                     var10001 = false;
                     break label1729;
                  }

                  ArrayList var5;
                  while(true) {
                     String var6;
                     try {
                        if (!var8.moveToNext()) {
                           break;
                        }

                        if (!var8.isNull(var3)) {
                           var6 = var8.getString(var3);
                           if ((ArrayList)var9.get(var6) == null) {
                              var5 = new ArrayList();
                              var9.put(var6, var5);
                           }
                        }
                     } catch (Throwable var192) {
                        var10000 = var192;
                        var10001 = false;
                        break label1729;
                     }

                     try {
                        if (!var8.isNull(var3)) {
                           var6 = var8.getString(var3);
                           if ((ArrayList)var10.get(var6) == null) {
                              var5 = new ArrayList();
                              var10.put(var6, var5);
                           }
                        }
                     } catch (Throwable var191) {
                        var10000 = var191;
                        var10001 = false;
                        break label1729;
                     }
                  }

                  try {
                     var8.moveToPosition(-1);
                     r.z(this.b, var9);
                     r.A(this.b, var10);
                     var11 = new ArrayList(var8.getCount());
                  } catch (Throwable var187) {
                     var10000 = var187;
                     var10001 = false;
                     break label1729;
                  }

                  while(true) {
                     label1696: {
                        try {
                           if (!var8.moveToNext()) {
                              break;
                           }

                           if (!var8.isNull(var3)) {
                              var5 = (ArrayList)var9.get(var8.getString(var3));
                              break label1696;
                           }
                        } catch (Throwable var189) {
                           var10000 = var189;
                           var10001 = false;
                           break label1729;
                        }

                        var5 = null;
                     }

                     ArrayList var194 = var5;
                     if (var5 == null) {
                        try {
                           var194 = new ArrayList();
                        } catch (Throwable var186) {
                           var10000 = var186;
                           var10001 = false;
                           break label1729;
                        }
                     }

                     label1687: {
                        try {
                           if (!var8.isNull(var3)) {
                              var5 = (ArrayList)var10.get(var8.getString(var3));
                              break label1687;
                           }
                        } catch (Throwable var188) {
                           var10000 = var188;
                           var10001 = false;
                           break label1729;
                        }

                        var5 = null;
                     }

                     ArrayList var7 = var5;
                     if (var5 == null) {
                        try {
                           var7 = new ArrayList();
                        } catch (Throwable var185) {
                           var10000 = var185;
                           var10001 = false;
                           break label1729;
                        }
                     }

                     try {
                        p.c var195 = new p.c();
                        var195.a = var8.getString(var3);
                        var195.b = v.g(var8.getInt(var4));
                        var195.c = androidx.work.b.g(var8.getBlob(var1));
                        var195.d = var8.getInt(var2);
                        var195.e = var194;
                        var195.f = var7;
                        var11.add(var195);
                     } catch (Throwable var184) {
                        var10000 = var184;
                        var10001 = false;
                        break label1729;
                     }
                  }

                  label1670:
                  try {
                     r.y(this.b).t();
                     break label1728;
                  } catch (Throwable var183) {
                     var10000 = var183;
                     var10001 = false;
                     break label1670;
                  }
               }

               var196 = var10000;

               try {
                  var8.close();
                  throw var196;
               } catch (Throwable var181) {
                  var10000 = var181;
                  var10001 = false;
                  break label1727;
               }
            }

            label1666:
            try {
               var8.close();
               break label1723;
            } catch (Throwable var182) {
               var10000 = var182;
               var10001 = false;
               break label1666;
            }
         }

         var196 = var10000;
         r.y(this.b).g();
         throw var196;
      }

      r.y(this.b).g();
      return var11;
   }

   protected void finalize() {
      this.a.x();
   }
}
