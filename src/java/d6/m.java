package d6;

import n5.v;

class m extends l {
   public static final int f(CharSequence var0) {
      x5.g.e(var0, "<this>");
      return var0.length() - 1;
   }

   public static final int g(CharSequence var0, char var1, int var2, boolean var3) {
      x5.g.e(var0, "<this>");
      if (!var3 && var0 instanceof String) {
         var2 = ((String)var0).indexOf(var1, var2);
      } else {
         var2 = m(var0, new char[]{var1}, var2, var3);
      }

      return var2;
   }

   public static final int h(CharSequence var0, String var1, int var2, boolean var3) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "string");
      if (!var3 && var0 instanceof String) {
         var2 = ((String)var0).indexOf(var1, var2);
      } else {
         var2 = j(var0, var1, var2, var0.length(), var3, false, 16, (Object)null);
      }

      return var2;
   }

   private static final int i(CharSequence var0, CharSequence var1, int var2, int var3, boolean var4, boolean var5) {
      Object var8;
      if (!var5) {
         var8 = new a6.c(a6.d.a(var2, 0), a6.d.c(var3, var0.length()));
      } else {
         var8 = a6.d.e(a6.d.c(var2, f(var0)), a6.d.a(var3, 0));
      }

      int var6;
      int var7;
      if (var0 instanceof String && var1 instanceof String) {
         label67: {
            var3 = ((a6.a)var8).d();
            var7 = ((a6.a)var8).g();
            var6 = ((a6.a)var8).h();
            if (var6 > 0) {
               var2 = var3;
               if (var3 <= var7) {
                  break label67;
               }
            }

            if (var6 >= 0 || var7 > var3) {
               return -1;
            }

            var2 = var3;
         }

         while(true) {
            if (l.c((String)var1, 0, (String)var0, var2, var1.length(), var4)) {
               return var2;
            }

            if (var2 == var7) {
               break;
            }

            var2 += var6;
         }
      } else {
         label69: {
            var3 = ((a6.a)var8).d();
            var7 = ((a6.a)var8).g();
            var6 = ((a6.a)var8).h();
            if (var6 > 0) {
               var2 = var3;
               if (var3 <= var7) {
                  break label69;
               }
            }

            if (var6 >= 0 || var7 > var3) {
               return -1;
            }

            var2 = var3;
         }

         while(true) {
            if (q(var1, 0, var0, var2, var1.length(), var4)) {
               return var2;
            }

            if (var2 == var7) {
               break;
            }

            var2 += var6;
         }
      }

      return -1;
   }

   // $FF: synthetic method
   static int j(CharSequence var0, CharSequence var1, int var2, int var3, boolean var4, boolean var5, int var6, Object var7) {
      if ((var6 & 16) != 0) {
         var5 = false;
      }

      return i(var0, var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public static int k(CharSequence var0, char var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return g(var0, var1, var2, var3);
   }

   // $FF: synthetic method
   public static int l(CharSequence var0, String var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 0;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return h(var0, var1, var2, var3);
   }

   public static final int m(CharSequence var0, char[] var1, int var2, boolean var3) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "chars");
      if (!var3 && var1.length == 1 && var0 instanceof String) {
         char var9 = n5.a.f(var1);
         return ((String)var0).indexOf(var9, var2);
      } else {
         v var7 = (new a6.c(a6.d.a(var2, 0), f(var0))).i();

         int var5;
         boolean var8;
         label34:
         do {
            if (!var7.hasNext()) {
               return -1;
            }

            var5 = var7.nextInt();
            char var4 = var0.charAt(var5);
            int var6 = var1.length;

            for(var2 = 0; var2 < var6; ++var2) {
               if (b.d(var1[var2], var4, var3)) {
                  var8 = true;
                  continue label34;
               }
            }

            var8 = false;
         } while(!var8);

         return var5;
      }
   }

   public static final int n(CharSequence var0, char var1, int var2, boolean var3) {
      x5.g.e(var0, "<this>");
      if (!var3 && var0 instanceof String) {
         var2 = ((String)var0).lastIndexOf(var1, var2);
      } else {
         var2 = p(var0, new char[]{var1}, var2, var3);
      }

      return var2;
   }

   // $FF: synthetic method
   public static int o(CharSequence var0, char var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = f(var0);
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return n(var0, var1, var2, var3);
   }

   public static final int p(CharSequence var0, char[] var1, int var2, boolean var3) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "chars");
      if (!var3 && var1.length == 1 && var0 instanceof String) {
         char var9 = n5.a.f(var1);
         return ((String)var0).lastIndexOf(var9, var2);
      } else {
         for(var2 = a6.d.c(var2, f(var0)); -1 < var2; --var2) {
            char var4 = var0.charAt(var2);
            int var8 = var1.length;
            boolean var7 = false;
            int var5 = 0;

            boolean var6;
            while(true) {
               var6 = var7;
               if (var5 >= var8) {
                  break;
               }

               if (b.d(var1[var5], var4, var3)) {
                  var6 = true;
                  break;
               }

               ++var5;
            }

            if (var6) {
               return var2;
            }
         }

         return -1;
      }
   }

   public static final boolean q(CharSequence var0, int var1, CharSequence var2, int var3, int var4, boolean var5) {
      x5.g.e(var0, "<this>");
      x5.g.e(var2, "other");
      if (var3 >= 0 && var1 >= 0 && var1 <= var0.length() - var4 && var3 <= var2.length() - var4) {
         for(int var6 = 0; var6 < var4; ++var6) {
            if (!b.d(var0.charAt(var1 + var6), var2.charAt(var3 + var6), var5)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static final String r(String var0, String var1, String var2) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "delimiter");
      x5.g.e(var2, "missingDelimiterValue");
      int var3 = l(var0, var1, 0, false, 6, (Object)null);
      if (var3 != -1) {
         var2 = var0.substring(var3 + var1.length(), var0.length());
         x5.g.d(var2, "this as java.lang.String…ing(startIndex, endIndex)");
      }

      return var2;
   }

   // $FF: synthetic method
   public static String s(String var0, String var1, String var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = var0;
      }

      return r(var0, var1, var2);
   }

   public static final String t(String var0, char var1, String var2) {
      x5.g.e(var0, "<this>");
      x5.g.e(var2, "missingDelimiterValue");
      int var3 = o(var0, var1, 0, false, 6, (Object)null);
      if (var3 != -1) {
         var2 = var0.substring(var3 + 1, var0.length());
         x5.g.d(var2, "this as java.lang.String…ing(startIndex, endIndex)");
      }

      return var2;
   }

   // $FF: synthetic method
   public static String u(String var0, char var1, String var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = var0;
      }

      return t(var0, var1, var2);
   }

   public static final String v(String var0, char var1, String var2) {
      x5.g.e(var0, "<this>");
      x5.g.e(var2, "missingDelimiterValue");
      int var3 = c.k(var0, var1, 0, false, 6, (Object)null);
      if (var3 != -1) {
         var2 = var0.substring(0, var3);
         x5.g.d(var2, "this as java.lang.String…ing(startIndex, endIndex)");
      }

      return var2;
   }

   public static final String w(String var0, String var1, String var2) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "delimiter");
      x5.g.e(var2, "missingDelimiterValue");
      int var3 = l(var0, var1, 0, false, 6, (Object)null);
      if (var3 != -1) {
         var2 = var0.substring(0, var3);
         x5.g.d(var2, "this as java.lang.String…ing(startIndex, endIndex)");
      }

      return var2;
   }

   // $FF: synthetic method
   public static String x(String var0, char var1, String var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = var0;
      }

      return v(var0, var1, var2);
   }

   // $FF: synthetic method
   public static String y(String var0, String var1, String var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = var0;
      }

      return w(var0, var1, var2);
   }

   public static CharSequence z(CharSequence var0) {
      x5.g.e(var0, "<this>");
      int var2 = var0.length() - 1;
      int var1 = 0;
      boolean var3 = false;

      while(var1 <= var2) {
         int var4;
         if (!var3) {
            var4 = var1;
         } else {
            var4 = var2;
         }

         boolean var5 = a.c(var0.charAt(var4));
         if (!var3) {
            if (!var5) {
               var3 = true;
            } else {
               ++var1;
            }
         } else {
            if (!var5) {
               break;
            }

            --var2;
         }
      }

      return var0.subSequence(var1, var2 + 1);
   }
}
