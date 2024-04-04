package o0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class f {
   public final String a;
   public final Map b;
   public final Set c;
   public final Set d;

   public f(String var1, Map var2, Set var3, Set var4) {
      this.a = var1;
      this.b = Collections.unmodifiableMap(var2);
      this.c = Collections.unmodifiableSet(var3);
      Set var5;
      if (var4 == null) {
         var5 = null;
      } else {
         var5 = Collections.unmodifiableSet(var4);
      }

      this.d = var5;
   }

   public static f a(q0.b var0, String var1) {
      return new f(var1, b(var0, var1), d(var0, var1), f(var0, var1));
   }

   private static Map b(q0.b var0, String var1) {
      StringBuilder var9 = new StringBuilder();
      var9.append("PRAGMA table_info(`");
      var9.append(var1);
      var9.append("`)");
      Cursor var25 = var0.K(var9.toString());
      HashMap var28 = new HashMap();

      label164: {
         Throwable var10000;
         label163: {
            int var2;
            int var3;
            int var4;
            int var5;
            int var7;
            boolean var10001;
            try {
               if (var25.getColumnCount() <= 0) {
                  break label164;
               }

               var2 = var25.getColumnIndex("name");
               var3 = var25.getColumnIndex("type");
               var7 = var25.getColumnIndex("notnull");
               var4 = var25.getColumnIndex("pk");
               var5 = var25.getColumnIndex("dflt_value");
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label163;
            }

            while(true) {
               boolean var8;
               String var10;
               String var12;
               label158: {
                  label157: {
                     try {
                        if (!var25.moveToNext()) {
                           break label164;
                        }

                        var10 = var25.getString(var2);
                        var12 = var25.getString(var3);
                        if (var25.getInt(var7) != 0) {
                           break label157;
                        }
                     } catch (Throwable var23) {
                        var10000 = var23;
                        var10001 = false;
                        break;
                     }

                     var8 = false;
                     break label158;
                  }

                  var8 = true;
               }

               try {
                  int var6 = var25.getInt(var4);
                  String var11 = var25.getString(var5);
                  a var27 = new a(var10, var12, var8, var6, var11, 2);
                  var28.put(var10, var27);
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var26 = var10000;
         var25.close();
         throw var26;
      }

      var25.close();
      return var28;
   }

   private static List c(Cursor var0) {
      int var5 = var0.getColumnIndex("id");
      int var2 = var0.getColumnIndex("seq");
      int var4 = var0.getColumnIndex("from");
      int var3 = var0.getColumnIndex("to");
      int var6 = var0.getCount();
      ArrayList var7 = new ArrayList();

      for(int var1 = 0; var1 < var6; ++var1) {
         var0.moveToPosition(var1);
         var7.add(new c(var0.getInt(var5), var0.getInt(var2), var0.getString(var4), var0.getString(var3)));
      }

      Collections.sort(var7);
      return var7;
   }

   private static Set d(q0.b var0, String var1) {
      HashSet var10 = new HashSet();
      StringBuilder var11 = new StringBuilder();
      var11.append("PRAGMA foreign_key_list(`");
      var11.append(var1);
      var11.append("`)");
      Cursor var45 = var0.K(var11.toString());

      Throwable var10000;
      label341: {
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         boolean var10001;
         List var46;
         try {
            var7 = var45.getColumnIndex("id");
            var8 = var45.getColumnIndex("seq");
            var3 = var45.getColumnIndex("table");
            var4 = var45.getColumnIndex("on_delete");
            var6 = var45.getColumnIndex("on_update");
            var46 = c(var45);
            var5 = var45.getCount();
         } catch (Throwable var44) {
            var10000 = var44;
            var10001 = false;
            break label341;
         }

         int var2 = 0;

         label333:
         while(true) {
            if (var2 >= var5) {
               var45.close();
               return var10;
            }

            label343: {
               try {
                  var45.moveToPosition(var2);
                  if (var45.getInt(var8) != 0) {
                     break label343;
                  }
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break;
               }

               int var9;
               ArrayList var12;
               Iterator var14;
               ArrayList var48;
               try {
                  var9 = var45.getInt(var7);
                  var12 = new ArrayList();
                  var48 = new ArrayList();
                  var14 = var46.iterator();
               } catch (Throwable var41) {
                  var10000 = var41;
                  var10001 = false;
                  break;
               }

               label324:
               while(true) {
                  try {
                     c var13;
                     do {
                        if (!var14.hasNext()) {
                           break label324;
                        }

                        var13 = (c)var14.next();
                     } while(var13.m != var9);

                     var12.add(var13.o);
                     var48.add(var13.p);
                  } catch (Throwable var42) {
                     var10000 = var42;
                     var10001 = false;
                     break label333;
                  }
               }

               try {
                  b var49 = new b(var45.getString(var3), var45.getString(var4), var45.getString(var6), var12, var48);
                  var10.add(var49);
               } catch (Throwable var40) {
                  var10000 = var40;
                  var10001 = false;
                  break;
               }
            }

            ++var2;
         }
      }

      Throwable var47 = var10000;
      var45.close();
      throw var47;
   }

   private static d e(q0.b var0, String var1, boolean var2) {
      StringBuilder var6 = new StringBuilder();
      var6.append("PRAGMA index_xinfo(`");
      var6.append(var1);
      var6.append("`)");
      Cursor var38 = var0.K(var6.toString());

      Throwable var10000;
      label344: {
         int var3;
         int var4;
         int var5;
         boolean var10001;
         try {
            var4 = var38.getColumnIndex("seqno");
            var5 = var38.getColumnIndex("cid");
            var3 = var38.getColumnIndex("name");
         } catch (Throwable var37) {
            var10000 = var37;
            var10001 = false;
            break label344;
         }

         if (var4 == -1 || var5 == -1 || var3 == -1) {
            var38.close();
            return null;
         }

         TreeMap var7;
         try {
            var7 = new TreeMap();
         } catch (Throwable var35) {
            var10000 = var35;
            var10001 = false;
            break label344;
         }

         label328:
         while(true) {
            while(true) {
               try {
                  if (!var38.moveToNext()) {
                     break label328;
                  }

                  if (var38.getInt(var5) < 0) {
                     continue;
                  }
               } catch (Throwable var36) {
                  var10000 = var36;
                  var10001 = false;
                  break label344;
               }

               try {
                  var7.put(var38.getInt(var4), var38.getString(var3));
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label344;
               }
            }
         }

         d var40;
         try {
            ArrayList var41 = new ArrayList(var7.size());
            var41.addAll(var7.values());
            var40 = new d(var1, var2, var41);
         } catch (Throwable var33) {
            var10000 = var33;
            var10001 = false;
            break label344;
         }

         var38.close();
         return var40;
      }

      Throwable var39 = var10000;
      var38.close();
      throw var39;
   }

   private static Set f(q0.b var0, String var1) {
      StringBuilder var7 = new StringBuilder();
      var7.append("PRAGMA index_list(`");
      var7.append(var1);
      var7.append("`)");
      Cursor var52 = var0.K(var7.toString());

      Throwable var10000;
      label505: {
         int var3;
         int var4;
         int var5;
         boolean var10001;
         try {
            var3 = var52.getColumnIndex("name");
            var5 = var52.getColumnIndex("origin");
            var4 = var52.getColumnIndex("unique");
         } catch (Throwable var50) {
            var10000 = var50;
            var10001 = false;
            break label505;
         }

         if (var3 == -1 || var5 == -1 || var4 == -1) {
            var52.close();
            return null;
         }

         HashSet var53;
         try {
            var53 = new HashSet();
         } catch (Throwable var49) {
            var10000 = var49;
            var10001 = false;
            break label505;
         }

         label486:
         while(true) {
            while(true) {
               try {
                  if (!var52.moveToNext()) {
                     break label486;
                  }

                  if (!"c".equals(var52.getString(var5))) {
                     continue;
                  }
               } catch (Throwable var48) {
                  var10000 = var48;
                  var10001 = false;
                  break label505;
               }

               int var2;
               String var8;
               try {
                  var8 = var52.getString(var3);
                  var2 = var52.getInt(var4);
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label505;
               }

               boolean var6 = true;
               if (var2 != 1) {
                  var6 = false;
               }

               d var54;
               try {
                  var54 = e(var0, var8, var6);
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break label505;
               }

               if (var54 == null) {
                  var52.close();
                  return null;
               }

               try {
                  var53.add(var54);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label505;
               }
            }
         }

         var52.close();
         return var53;
      }

      Throwable var51 = var10000;
      var52.close();
      throw var51;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         f var3 = (f)var1;
         String var2 = this.a;
         if (var2 != null) {
            if (!var2.equals(var3.a)) {
               return false;
            }
         } else if (var3.a != null) {
            return false;
         }

         label46: {
            Map var5 = this.b;
            if (var5 != null) {
               if (var5.equals(var3.b)) {
                  break label46;
               }
            } else if (var3.b == null) {
               break label46;
            }

            return false;
         }

         Set var6;
         label39: {
            var6 = this.c;
            if (var6 != null) {
               if (var6.equals(var3.c)) {
                  break label39;
               }
            } else if (var3.c == null) {
               break label39;
            }

            return false;
         }

         var6 = this.d;
         if (var6 != null) {
            Set var4 = var3.d;
            if (var4 != null) {
               return var6.equals(var4);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      String var4 = this.a;
      int var3 = 0;
      int var1;
      if (var4 != null) {
         var1 = var4.hashCode();
      } else {
         var1 = 0;
      }

      Map var5 = this.b;
      int var2;
      if (var5 != null) {
         var2 = var5.hashCode();
      } else {
         var2 = 0;
      }

      Set var6 = this.c;
      if (var6 != null) {
         var3 = var6.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TableInfo{name='");
      var1.append(this.a);
      var1.append('\'');
      var1.append(", columns=");
      var1.append(this.b);
      var1.append(", foreignKeys=");
      var1.append(this.c);
      var1.append(", indices=");
      var1.append(this.d);
      var1.append('}');
      return var1.toString();
   }

   public static class a {
      public final String a;
      public final String b;
      public final int c;
      public final boolean d;
      public final int e;
      public final String f;
      private final int g;

      public a(String var1, String var2, boolean var3, int var4, String var5, int var6) {
         this.a = var1;
         this.b = var2;
         this.d = var3;
         this.e = var4;
         this.c = a(var2);
         this.f = var5;
         this.g = var6;
      }

      private static int a(String var0) {
         if (var0 == null) {
            return 5;
         } else {
            var0 = var0.toUpperCase(Locale.US);
            if (var0.contains("INT")) {
               return 3;
            } else if (!var0.contains("CHAR") && !var0.contains("CLOB") && !var0.contains("TEXT")) {
               if (var0.contains("BLOB")) {
                  return 5;
               } else {
                  return !var0.contains("REAL") && !var0.contains("FLOA") && !var0.contains("DOUB") ? 1 : 4;
               }
            } else {
               return 2;
            }
         }
      }

      public boolean equals(Object var1) {
         boolean var3 = true;
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            a var5 = (a)var1;
            if (this.e != var5.e) {
               return false;
            } else if (!this.a.equals(var5.a)) {
               return false;
            } else if (this.d != var5.d) {
               return false;
            } else {
               String var4;
               if (this.g == 1 && var5.g == 2) {
                  var4 = this.f;
                  if (var4 != null && !var4.equals(var5.f)) {
                     return false;
                  }
               }

               if (this.g == 2 && var5.g == 1) {
                  var4 = var5.f;
                  if (var4 != null && !var4.equals(this.f)) {
                     return false;
                  }
               }

               int var2 = this.g;
               if (var2 != 0 && var2 == var5.g) {
                  label76: {
                     var4 = this.f;
                     if (var4 != null) {
                        if (var4.equals(var5.f)) {
                           break label76;
                        }
                     } else if (var5.f == null) {
                        break label76;
                     }

                     return false;
                  }
               }

               if (this.c != var5.c) {
                  var3 = false;
               }

               return var3;
            }
         } else {
            return false;
         }
      }

      public int hashCode() {
         int var3 = this.a.hashCode();
         int var2 = this.c;
         short var1;
         if (this.d) {
            var1 = 1231;
         } else {
            var1 = 1237;
         }

         return ((var3 * 31 + var2) * 31 + var1) * 31 + this.e;
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append("Column{name='");
         var1.append(this.a);
         var1.append('\'');
         var1.append(", type='");
         var1.append(this.b);
         var1.append('\'');
         var1.append(", affinity='");
         var1.append(this.c);
         var1.append('\'');
         var1.append(", notNull=");
         var1.append(this.d);
         var1.append(", primaryKeyPosition=");
         var1.append(this.e);
         var1.append(", defaultValue='");
         var1.append(this.f);
         var1.append('\'');
         var1.append('}');
         return var1.toString();
      }
   }

   public static class b {
      public final String a;
      public final String b;
      public final String c;
      public final List d;
      public final List e;

      public b(String var1, String var2, String var3, List var4, List var5) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = Collections.unmodifiableList(var4);
         this.e = Collections.unmodifiableList(var5);
      }

      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            b var2 = (b)var1;
            if (!this.a.equals(var2.a)) {
               return false;
            } else if (!this.b.equals(var2.b)) {
               return false;
            } else if (!this.c.equals(var2.c)) {
               return false;
            } else {
               return !this.d.equals(var2.d) ? false : this.e.equals(var2.e);
            }
         } else {
            return false;
         }
      }

      public int hashCode() {
         return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append("ForeignKey{referenceTable='");
         var1.append(this.a);
         var1.append('\'');
         var1.append(", onDelete='");
         var1.append(this.b);
         var1.append('\'');
         var1.append(", onUpdate='");
         var1.append(this.c);
         var1.append('\'');
         var1.append(", columnNames=");
         var1.append(this.d);
         var1.append(", referenceColumnNames=");
         var1.append(this.e);
         var1.append('}');
         return var1.toString();
      }
   }

   static class c implements Comparable {
      final int m;
      final int n;
      final String o;
      final String p;

      c(int var1, int var2, String var3, String var4) {
         this.m = var1;
         this.n = var2;
         this.o = var3;
         this.p = var4;
      }

      public int d(c var1) {
         int var3 = this.m - var1.m;
         int var2 = var3;
         if (var3 == 0) {
            var2 = this.n - var1.n;
         }

         return var2;
      }
   }

   public static class d {
      public final String a;
      public final boolean b;
      public final List c;

      public d(String var1, boolean var2, List var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }

      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            d var2 = (d)var1;
            if (this.b != var2.b) {
               return false;
            } else if (!this.c.equals(var2.c)) {
               return false;
            } else {
               return this.a.startsWith("index_") ? var2.a.startsWith("index_") : this.a.equals(var2.a);
            }
         } else {
            return false;
         }
      }

      public int hashCode() {
         int var1;
         if (this.a.startsWith("index_")) {
            var1 = -1184239155;
         } else {
            var1 = this.a.hashCode();
         }

         return (var1 * 31 + this.b) * 31 + this.c.hashCode();
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append("Index{name='");
         var1.append(this.a);
         var1.append('\'');
         var1.append(", unique=");
         var1.append(this.b);
         var1.append(", columns=");
         var1.append(this.c);
         var1.append('}');
         return var1.toString();
      }
   }
}
