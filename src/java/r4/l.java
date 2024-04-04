package r4;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class l {
   private final SharedPreferences a;

   public l(Context var1, String var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("FirebaseHeartBeat");
      var3.append(var2);
      this.a = var1.getSharedPreferences(var3.toString(), 0);
   }

   private void a() {
      synchronized(this){}

      Throwable var10000;
      label604: {
         long var1;
         boolean var10001;
         try {
            var1 = this.a.getLong("fire-count", 0L);
         } catch (Throwable var66) {
            var10000 = var66;
            var10001 = false;
            break label604;
         }

         String var4 = "";

         Iterator var7;
         try {
            var7 = this.a.getAll().entrySet().iterator();
         } catch (Throwable var65) {
            var10000 = var65;
            var10001 = false;
            break label604;
         }

         String var3 = null;

         label590:
         while(true) {
            Iterator var8;
            Map.Entry var9;
            try {
               if (!var7.hasNext()) {
                  break;
               }

               var9 = (Map.Entry)var7.next();
               if (!(var9.getValue() instanceof Set)) {
                  continue;
               }

               var8 = ((Set)var9.getValue()).iterator();
            } catch (Throwable var63) {
               var10000 = var63;
               var10001 = false;
               break label604;
            }

            String var6 = var3;
            String var5 = var4;

            while(true) {
               while(true) {
                  var4 = var5;
                  var3 = var6;

                  try {
                     if (!var8.hasNext()) {
                        continue label590;
                     }

                     var3 = (String)var8.next();
                  } catch (Throwable var62) {
                     var10000 = var62;
                     var10001 = false;
                     break label604;
                  }

                  if (var6 == null) {
                     break;
                  }

                  try {
                     if (var6.compareTo(var3) > 0) {
                        break;
                     }
                  } catch (Throwable var64) {
                     var10000 = var64;
                     var10001 = false;
                     break label604;
                  }
               }

               try {
                  var5 = (String)var9.getKey();
               } catch (Throwable var61) {
                  var10000 = var61;
                  var10001 = false;
                  break label604;
               }

               var6 = var3;
            }
         }

         label565:
         try {
            SharedPreferences var69 = this.a;
            HashSet var68 = new HashSet();
            HashSet var70 = new HashSet(var69.getStringSet(var4, var68));
            var70.remove(var3);
            this.a.edit().putStringSet(var4, var70).putLong("fire-count", var1 - 1L).commit();
            return;
         } catch (Throwable var60) {
            var10000 = var60;
            var10001 = false;
            break label565;
         }
      }

      Throwable var67 = var10000;
      throw var67;
   }

   private String d(long var1) {
      synchronized(this){}

      String var7;
      try {
         Date var3 = new Date(var1);
         var7 = var3.toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
      } finally {
         ;
      }

      return var7;
   }

   private String e(String var1) {
      synchronized(this){}

      try {
         Iterator var3 = this.a.getAll().entrySet().iterator();

         while(var3.hasNext()) {
            Map.Entry var4 = (Map.Entry)var3.next();
            if (var4.getValue() instanceof Set) {
               Iterator var2 = ((Set)var4.getValue()).iterator();

               while(var2.hasNext()) {
                  if (var1.equals((String)var2.next())) {
                     var1 = (String)var4.getKey();
                     return var1;
                  }
               }
            }
         }
      } finally {
         ;
      }

      return null;
   }

   private void h(String var1) {
      synchronized(this){}

      Throwable var10000;
      label141: {
         boolean var10001;
         String var5;
         try {
            var5 = this.e(var1);
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label141;
         }

         if (var5 == null) {
            return;
         }

         HashSet var2;
         try {
            SharedPreferences var3 = this.a;
            HashSet var4 = new HashSet();
            var2 = new HashSet(var3.getStringSet(var5, var4));
            var2.remove(var1);
            if (var2.isEmpty()) {
               this.a.edit().remove(var5).commit();
               return;
            }
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label141;
         }

         label126:
         try {
            this.a.edit().putStringSet(var5, var2).commit();
            return;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label126;
         }
      }

      Throwable var19 = var10000;
      throw var19;
   }

   void b() {
      synchronized(this){}

      Throwable var10000;
      label150: {
         SharedPreferences.Editor var1;
         boolean var10001;
         Iterator var3;
         try {
            var1 = this.a.edit();
            var3 = this.a.getAll().entrySet().iterator();
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label150;
         }

         while(true) {
            try {
               while(var3.hasNext()) {
                  Map.Entry var2 = (Map.Entry)var3.next();
                  if (var2.getValue() instanceof Set) {
                     var1.remove((String)var2.getKey());
                  }
               }
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break;
            }

            try {
               var1.remove("fire-count");
               var1.commit();
               return;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break;
            }
         }
      }

      Throwable var17 = var10000;
      throw var17;
   }

   List c() {
      synchronized(this){}

      Throwable var10000;
      label150: {
         Iterator var1;
         boolean var10001;
         ArrayList var2;
         try {
            var2 = new ArrayList();
            var1 = this.a.getAll().entrySet().iterator();
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label150;
         }

         while(true) {
            try {
               while(var1.hasNext()) {
                  Map.Entry var4 = (Map.Entry)var1.next();
                  if (var4.getValue() instanceof Set) {
                     String var5 = (String)var4.getKey();
                     ArrayList var3 = new ArrayList((Set)var4.getValue());
                     var2.add(m.a(var5, var3));
                  }
               }
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break;
            }

            try {
               this.l(System.currentTimeMillis());
               return var2;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break;
            }
         }
      }

      Throwable var19 = var10000;
      throw var19;
   }

   boolean f(long var1, long var3) {
      synchronized(this){}

      boolean var5;
      try {
         var5 = this.d(var1).equals(this.d(var3));
      } finally {
         ;
      }

      return var5;
   }

   void g() {
      synchronized(this){}

      try {
         String var1 = this.d(System.currentTimeMillis());
         this.a.edit().putString("last-used-date", var1).commit();
         this.h(var1);
      } finally {
         ;
      }

   }

   boolean i(long var1) {
      synchronized(this){}

      boolean var3;
      try {
         var3 = this.j("fire-global", var1);
      } finally {
         ;
      }

      return var3;
   }

   boolean j(String var1, long var2) {
      synchronized(this){}

      try {
         if (this.a.contains(var1)) {
            if (this.f(this.a.getLong(var1, -1L), var2)) {
               return false;
            }

            this.a.edit().putLong(var1, var2).commit();
            return true;
         }

         this.a.edit().putLong(var1, var2).commit();
      } finally {
         ;
      }

      return true;
   }

   void k(long var1, String var3) {
      synchronized(this){}

      Throwable var10000;
      label190: {
         boolean var6;
         String var10;
         boolean var10001;
         try {
            var10 = this.d(var1);
            var6 = this.a.getString("last-used-date", "").equals(var10);
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label190;
         }

         if (var6) {
            return;
         }

         long var4;
         try {
            var4 = this.a.getLong("fire-count", 0L);
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            break label190;
         }

         var1 = var4;
         if (var4 + 1L == 30L) {
            try {
               this.a();
               var1 = this.a.getLong("fire-count", 0L);
            } catch (Throwable var29) {
               var10000 = var29;
               var10001 = false;
               break label190;
            }
         }

         try {
            SharedPreferences var7 = this.a;
            HashSet var8 = new HashSet();
            HashSet var9 = new HashSet(var7.getStringSet(var3, var8));
            var9.add(var10);
            this.a.edit().putStringSet(var3, var9).putLong("fire-count", var1 + 1L).putString("last-used-date", var10).commit();
         } catch (Throwable var28) {
            var10000 = var28;
            var10001 = false;
            break label190;
         }

         return;
      }

      Throwable var32 = var10000;
      throw var32;
   }

   void l(long var1) {
      synchronized(this){}

      try {
         this.a.edit().putLong("fire-global", var1).commit();
      } finally {
         ;
      }

   }
}
