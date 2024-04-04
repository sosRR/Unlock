package f1;

import android.os.Build.VERSION;

public class v {
   public static int a(x0.a var0) {
      int var1 = null.b[var0.ordinal()];
      if (var1 != 1) {
         if (var1 == 2) {
            return 1;
         } else {
            StringBuilder var2 = new StringBuilder();
            var2.append("Could not convert ");
            var2.append(var0);
            var2.append(" to int");
            throw new IllegalArgumentException(var2.toString());
         }
      } else {
         return 0;
      }
   }

   public static x0.c b(byte[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static byte[] c(x0.c param0) {
      // $FF: Couldn't be decompiled
   }

   public static x0.a d(int var0) {
      if (var0 != 0) {
         if (var0 == 1) {
            return x0.a.n;
         } else {
            StringBuilder var1 = new StringBuilder();
            var1.append("Could not convert ");
            var1.append(var0);
            var1.append(" to BackoffPolicy");
            throw new IllegalArgumentException(var1.toString());
         }
      } else {
         return x0.a.m;
      }
   }

   public static x0.l e(int var0) {
      if (var0 != 0) {
         if (var0 != 1) {
            if (var0 != 2) {
               if (var0 != 3) {
                  if (var0 != 4) {
                     if (VERSION.SDK_INT >= 30 && var0 == 5) {
                        return x0.l.r;
                     } else {
                        StringBuilder var1 = new StringBuilder();
                        var1.append("Could not convert ");
                        var1.append(var0);
                        var1.append(" to NetworkType");
                        throw new IllegalArgumentException(var1.toString());
                     }
                  } else {
                     return x0.l.q;
                  }
               } else {
                  return x0.l.p;
               }
            } else {
               return x0.l.o;
            }
         } else {
            return x0.l.n;
         }
      } else {
         return x0.l.m;
      }
   }

   public static x0.o f(int var0) {
      if (var0 != 0) {
         if (var0 == 1) {
            return x0.o.n;
         } else {
            StringBuilder var1 = new StringBuilder();
            var1.append("Could not convert ");
            var1.append(var0);
            var1.append(" to OutOfQuotaPolicy");
            throw new IllegalArgumentException(var1.toString());
         }
      } else {
         return x0.o.m;
      }
   }

   public static x0.u.a g(int var0) {
      if (var0 != 0) {
         if (var0 != 1) {
            if (var0 != 2) {
               if (var0 != 3) {
                  if (var0 != 4) {
                     if (var0 == 5) {
                        return x0.u.a.r;
                     } else {
                        StringBuilder var1 = new StringBuilder();
                        var1.append("Could not convert ");
                        var1.append(var0);
                        var1.append(" to State");
                        throw new IllegalArgumentException(var1.toString());
                     }
                  } else {
                     return x0.u.a.q;
                  }
               } else {
                  return x0.u.a.p;
               }
            } else {
               return x0.u.a.o;
            }
         } else {
            return x0.u.a.n;
         }
      } else {
         return x0.u.a.m;
      }
   }

   public static int h(x0.l var0) {
      int var1 = null.c[var0.ordinal()];
      if (var1 != 1) {
         if (var1 != 2) {
            if (var1 != 3) {
               if (var1 != 4) {
                  if (var1 != 5) {
                     if (VERSION.SDK_INT >= 30 && var0 == x0.l.r) {
                        return 5;
                     } else {
                        StringBuilder var2 = new StringBuilder();
                        var2.append("Could not convert ");
                        var2.append(var0);
                        var2.append(" to int");
                        throw new IllegalArgumentException(var2.toString());
                     }
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   public static int i(x0.o var0) {
      int var1 = null.d[var0.ordinal()];
      if (var1 != 1) {
         if (var1 == 2) {
            return 1;
         } else {
            StringBuilder var2 = new StringBuilder();
            var2.append("Could not convert ");
            var2.append(var0);
            var2.append(" to int");
            throw new IllegalArgumentException(var2.toString());
         }
      } else {
         return 0;
      }
   }

   public static int j(x0.u.a var0) {
      switch (null.a[var0.ordinal()]) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 3;
         case 5:
            return 4;
         case 6:
            return 5;
         default:
            StringBuilder var1 = new StringBuilder();
            var1.append("Could not convert ");
            var1.append(var0);
            var1.append(" to int");
            throw new IllegalArgumentException(var1.toString());
      }
   }
}
