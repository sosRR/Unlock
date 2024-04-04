package u2;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

public final class b {
   public static final b b = new b((Boolean)null, (Boolean)null);
   private final EnumMap a;

   public b(Boolean var1, Boolean var2) {
      EnumMap var3 = new EnumMap(a.class);
      this.a = var3;
      var3.put(u2.a.n, var1);
      var3.put(u2.a.o, var2);
   }

   public b(EnumMap var1) {
      EnumMap var2 = new EnumMap(a.class);
      this.a = var2;
      var2.putAll(var1);
   }

   public static b a(Bundle var0) {
      if (var0 == null) {
         return b;
      } else {
         EnumMap var5 = new EnumMap(a.class);
         a[] var3 = u2.a.values();
         int var2 = var3.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            a var4 = var3[var1];
            var5.put(var4, n(var0.getString(var4.m)));
         }

         return new b(var5);
      }
   }

   public static b b(String var0) {
      EnumMap var5 = new EnumMap(a.class);
      if (var0 != null) {
         int var1 = 0;

         while(true) {
            a[] var3 = u2.a.p;
            int var2 = var3.length;
            if (var1 >= 2) {
               break;
            }

            a var6 = var3[var1];
            var2 = var1 + 2;
            if (var2 < var0.length()) {
               char var7 = var0.charAt(var2);
               Object var4 = null;
               Boolean var8 = (Boolean)var4;
               if (var7 != '-') {
                  if (var7 != '0') {
                     if (var7 != '1') {
                        var8 = (Boolean)var4;
                     } else {
                        var8 = Boolean.TRUE;
                     }
                  } else {
                     var8 = Boolean.FALSE;
                  }
               }

               var5.put(var6, var8);
            }

            ++var1;
         }
      }

      return new b(var5);
   }

   public static String g(Bundle var0) {
      a[] var3 = u2.a.values();
      int var2 = var3.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         a var4 = var3[var1];
         if (var0.containsKey(var4.m)) {
            String var5 = var0.getString(var4.m);
            if (var5 != null && n(var5) == null) {
               return var5;
            }
         }
      }

      return null;
   }

   public static boolean j(int var0, int var1) {
      return var0 <= var1;
   }

   static final int m(Boolean var0) {
      if (var0 == null) {
         return 0;
      } else {
         return var0 ? 1 : 2;
      }
   }

   private static Boolean n(String var0) {
      if (var0 == null) {
         return null;
      } else if (var0.equals("granted")) {
         return Boolean.TRUE;
      } else {
         return var0.equals("denied") ? Boolean.FALSE : null;
      }
   }

   public final b c(b var1) {
      EnumMap var10 = new EnumMap(a.class);
      a[] var8 = u2.a.values();
      int var3 = var8.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         a var9 = var8[var2];
         Boolean var6 = (Boolean)this.a.get(var9);
         Boolean var7 = (Boolean)var1.a.get(var9);
         Boolean var5;
         if (var6 == null) {
            var5 = var7;
         } else {
            var5 = var6;
            if (var7 != null) {
               boolean var4;
               if (var6 && var7) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               var5 = var4;
            }
         }

         var10.put(var9, var5);
      }

      return new b(var10);
   }

   public final b d(b var1) {
      EnumMap var7 = new EnumMap(a.class);
      a[] var8 = u2.a.values();
      int var3 = var8.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         a var6 = var8[var2];
         Boolean var5 = (Boolean)this.a.get(var6);
         Boolean var4 = var5;
         if (var5 == null) {
            var4 = (Boolean)var1.a.get(var6);
         }

         var7.put(var6, var4);
      }

      return new b(var7);
   }

   public final Boolean e() {
      return (Boolean)this.a.get(u2.a.n);
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof b)) {
         return false;
      } else {
         b var4 = (b)var1;
         a[] var5 = u2.a.values();
         int var3 = var5.length;

         for(int var2 = 0; var2 < var3; ++var2) {
            a var6 = var5[var2];
            if (m((Boolean)this.a.get(var6)) != m((Boolean)var4.a.get(var6))) {
               return false;
            }
         }

         return true;
      }
   }

   public final Boolean f() {
      return (Boolean)this.a.get(u2.a.o);
   }

   public final String h() {
      StringBuilder var3 = new StringBuilder("G1");
      a[] var4 = u2.a.p;
      int var2 = var4.length;

      for(var2 = 0; var2 < 2; ++var2) {
         a var5 = var4[var2];
         Boolean var6 = (Boolean)this.a.get(var5);
         char var1;
         if (var6 == null) {
            var1 = '-';
         } else if (var6) {
            var1 = '1';
         } else {
            var1 = '0';
         }

         var3.append(var1);
      }

      return var3.toString();
   }

   public final int hashCode() {
      Iterator var2 = this.a.values().iterator();

      int var1;
      for(var1 = 17; var2.hasNext(); var1 = var1 * 31 + m((Boolean)var2.next())) {
      }

      return var1;
   }

   public final boolean i(a var1) {
      Boolean var2 = (Boolean)this.a.get(var1);
      return var2 == null || var2;
   }

   public final boolean k(b var1) {
      return this.l(var1, (a[])this.a.keySet().toArray(new a[0]));
   }

   public final boolean l(b var1, a... var2) {
      int var4 = var2.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         a var6 = var2[var3];
         Boolean var5 = (Boolean)this.a.get(var6);
         Boolean var8 = (Boolean)var1.a.get(var6);
         Boolean var7 = Boolean.FALSE;
         if (var5 == var7 && var8 != var7) {
            return true;
         }
      }

      return false;
   }

   public final String toString() {
      StringBuilder var4 = new StringBuilder("settings: ");
      a[] var5 = u2.a.values();
      int var2 = var5.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         a var3 = var5[var1];
         if (var1 != 0) {
            var4.append(", ");
         }

         var4.append(var3.name());
         var4.append("=");
         Boolean var6 = (Boolean)this.a.get(var3);
         if (var6 == null) {
            var4.append("uninitialized");
         } else {
            String var7;
            if (!var6) {
               var7 = "denied";
            } else {
               var7 = "granted";
            }

            var4.append(var7);
         }
      }

      return var4.toString();
   }
}
