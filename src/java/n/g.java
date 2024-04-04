package n;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g {
   static Object[] p;
   static int q;
   static Object[] r;
   static int s;
   int[] m;
   Object[] n;
   int o;

   public g() {
      this.m = c.a;
      this.n = c.c;
      this.o = 0;
   }

   public g(int var1) {
      if (var1 == 0) {
         this.m = c.a;
         this.n = c.c;
      } else {
         this.a(var1);
      }

      this.o = 0;
   }

   public g(g var1) {
      this();
      if (var1 != null) {
         this.j(var1);
      }

   }

   private void a(int var1) {
      Throwable var10000;
      boolean var10001;
      Throwable var114;
      label938: {
         label934: {
            Object[] var2;
            Class var3;
            if (var1 == 8) {
               var3 = g.class;
               synchronized(g.class){}

               try {
                  var2 = r;
               } catch (Throwable var113) {
                  var10000 = var113;
                  var10001 = false;
                  break label934;
               }

               if (var2 != null) {
                  try {
                     this.n = var2;
                     r = (Object[])var2[0];
                     this.m = (int[])var2[1];
                  } catch (Throwable var107) {
                     var10000 = var107;
                     var10001 = false;
                     break label934;
                  }

                  var2[1] = null;
                  var2[0] = null;

                  try {
                     --s;
                     return;
                  } catch (Throwable var106) {
                     var10000 = var106;
                     var10001 = false;
                     break label934;
                  }
               }

               try {
                  ;
               } catch (Throwable var112) {
                  var10000 = var112;
                  var10001 = false;
                  break label934;
               }
            } else if (var1 == 4) {
               var3 = g.class;
               synchronized(g.class){}

               try {
                  var2 = p;
               } catch (Throwable var111) {
                  var10000 = var111;
                  var10001 = false;
                  break label938;
               }

               if (var2 != null) {
                  try {
                     this.n = var2;
                     p = (Object[])var2[0];
                     this.m = (int[])var2[1];
                  } catch (Throwable var109) {
                     var10000 = var109;
                     var10001 = false;
                     break label938;
                  }

                  var2[1] = null;
                  var2[0] = null;

                  try {
                     --q;
                     return;
                  } catch (Throwable var108) {
                     var10000 = var108;
                     var10001 = false;
                     break label938;
                  }
               }

               try {
                  ;
               } catch (Throwable var110) {
                  var10000 = var110;
                  var10001 = false;
                  break label938;
               }
            }

            this.m = new int[var1];
            this.n = new Object[var1 << 1];
            return;
         }

         while(true) {
            var114 = var10000;

            try {
               throw var114;
            } catch (Throwable var105) {
               var10000 = var105;
               var10001 = false;
               continue;
            }
         }
      }

      while(true) {
         var114 = var10000;

         try {
            throw var114;
         } catch (Throwable var104) {
            var10000 = var104;
            var10001 = false;
            continue;
         }
      }
   }

   private static int b(int[] var0, int var1, int var2) {
      try {
         var1 = c.a(var0, var1, var2);
         return var1;
      } catch (ArrayIndexOutOfBoundsException var3) {
         throw new ConcurrentModificationException();
      }
   }

   private static void d(int[] var0, Object[] var1, int var2) {
      Class var3;
      Throwable var76;
      Throwable var10000;
      boolean var10001;
      if (var0.length == 8) {
         var3 = g.class;
         synchronized(g.class){}

         label811: {
            label838: {
               try {
                  if (s >= 10) {
                     break label838;
                  }

                  var1[0] = r;
               } catch (Throwable var72) {
                  var10000 = var72;
                  var10001 = false;
                  break label811;
               }

               var1[1] = var0;
               var2 = (var2 << 1) - 1;

               while(true) {
                  if (var2 < 2) {
                     try {
                        r = var1;
                        ++s;
                        break;
                     } catch (Throwable var71) {
                        var10000 = var71;
                        var10001 = false;
                        break label811;
                     }
                  }

                  var1[var2] = null;
                  --var2;
               }
            }

            label798:
            try {
               return;
            } catch (Throwable var70) {
               var10000 = var70;
               var10001 = false;
               break label798;
            }
         }

         while(true) {
            var76 = var10000;

            try {
               throw var76;
            } catch (Throwable var68) {
               var10000 = var68;
               var10001 = false;
               continue;
            }
         }
      } else if (var0.length == 4) {
         var3 = g.class;
         synchronized(g.class){}

         label829: {
            label839: {
               try {
                  if (q >= 10) {
                     break label839;
                  }

                  var1[0] = p;
               } catch (Throwable var75) {
                  var10000 = var75;
                  var10001 = false;
                  break label829;
               }

               var1[1] = var0;
               var2 = (var2 << 1) - 1;

               while(true) {
                  if (var2 < 2) {
                     try {
                        p = var1;
                        ++q;
                        break;
                     } catch (Throwable var74) {
                        var10000 = var74;
                        var10001 = false;
                        break label829;
                     }
                  }

                  var1[var2] = null;
                  --var2;
               }
            }

            label816:
            try {
               return;
            } catch (Throwable var73) {
               var10000 = var73;
               var10001 = false;
               break label816;
            }
         }

         while(true) {
            var76 = var10000;

            try {
               throw var76;
            } catch (Throwable var69) {
               var10000 = var69;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public void c(int var1) {
      int var2 = this.o;
      int[] var4 = this.m;
      if (var4.length < var1) {
         Object[] var3 = this.n;
         this.a(var1);
         if (this.o > 0) {
            System.arraycopy(var4, 0, this.m, 0, var2);
            System.arraycopy(var3, 0, this.n, 0, var2 << 1);
         }

         d(var4, var3, var2);
      }

      if (this.o != var2) {
         throw new ConcurrentModificationException();
      }
   }

   public void clear() {
      int var1 = this.o;
      if (var1 > 0) {
         int[] var2 = this.m;
         Object[] var3 = this.n;
         this.m = c.a;
         this.n = c.c;
         this.o = 0;
         d(var2, var3, var1);
      }

      if (this.o > 0) {
         throw new ConcurrentModificationException();
      }
   }

   public boolean containsKey(Object var1) {
      boolean var2;
      if (this.f(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean containsValue(Object var1) {
      boolean var2;
      if (this.h(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   int e(Object var1, int var2) {
      int var4 = this.o;
      if (var4 == 0) {
         return -1;
      } else {
         int var5 = b(this.m, var4, var2);
         if (var5 < 0) {
            return var5;
         } else if (var1.equals(this.n[var5 << 1])) {
            return var5;
         } else {
            int var3;
            for(var3 = var5 + 1; var3 < var4 && this.m[var3] == var2; ++var3) {
               if (var1.equals(this.n[var3 << 1])) {
                  return var3;
               }
            }

            for(var4 = var5 - 1; var4 >= 0 && this.m[var4] == var2; --var4) {
               if (var1.equals(this.n[var4 << 1])) {
                  return var4;
               }
            }

            return ~var3;
         }
      }
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         boolean var10001;
         int var2;
         boolean var3;
         Object var5;
         Object var6;
         if (var1 instanceof g) {
            g var14 = (g)var1;
            if (this.size() != var14.size()) {
               return false;
            } else {
               var2 = 0;

               while(true) {
                  try {
                     if (var2 >= this.o) {
                        return true;
                     }

                     var6 = this.i(var2);
                     var1 = this.m(var2);
                     var5 = var14.get(var6);
                  } catch (ClassCastException | NullPointerException var9) {
                     var10001 = false;
                     break;
                  }

                  if (var1 == null) {
                     label67: {
                        if (var5 == null) {
                           try {
                              if (var14.containsKey(var6)) {
                                 break label67;
                              }
                           } catch (ClassCastException | NullPointerException var8) {
                              var10001 = false;
                              break;
                           }
                        }

                        return false;
                     }
                  } else {
                     try {
                        var3 = var1.equals(var5);
                     } catch (ClassCastException | NullPointerException var7) {
                        var10001 = false;
                        break;
                     }

                     if (!var3) {
                        return false;
                     }
                  }

                  ++var2;
               }

               return false;
            }
         } else {
            if (var1 instanceof Map) {
               Map var13 = (Map)var1;
               if (this.size() != var13.size()) {
                  return false;
               }

               var2 = 0;

               while(true) {
                  Object var4;
                  try {
                     if (var2 >= this.o) {
                        return true;
                     }

                     var4 = this.i(var2);
                     var6 = this.m(var2);
                     var5 = var13.get(var4);
                  } catch (ClassCastException | NullPointerException var12) {
                     var10001 = false;
                     break;
                  }

                  if (var6 == null) {
                     label91: {
                        if (var5 == null) {
                           try {
                              if (var13.containsKey(var4)) {
                                 break label91;
                              }
                           } catch (ClassCastException | NullPointerException var11) {
                              var10001 = false;
                              break;
                           }
                        }

                        return false;
                     }
                  } else {
                     try {
                        var3 = var6.equals(var5);
                     } catch (ClassCastException | NullPointerException var10) {
                        var10001 = false;
                        break;
                     }

                     if (!var3) {
                        return false;
                     }
                  }

                  ++var2;
               }
            }

            return false;
         }
      }
   }

   public int f(Object var1) {
      int var2;
      if (var1 == null) {
         var2 = this.g();
      } else {
         var2 = this.e(var1, var1.hashCode());
      }

      return var2;
   }

   int g() {
      int var2 = this.o;
      if (var2 == 0) {
         return -1;
      } else {
         int var3 = b(this.m, var2, 0);
         if (var3 < 0) {
            return var3;
         } else if (this.n[var3 << 1] == null) {
            return var3;
         } else {
            int var1;
            for(var1 = var3 + 1; var1 < var2 && this.m[var1] == 0; ++var1) {
               if (this.n[var1 << 1] == null) {
                  return var1;
               }
            }

            for(var2 = var3 - 1; var2 >= 0 && this.m[var2] == 0; --var2) {
               if (this.n[var2 << 1] == null) {
                  return var2;
               }
            }

            return ~var1;
         }
      }
   }

   public Object get(Object var1) {
      return this.getOrDefault(var1, (Object)null);
   }

   public Object getOrDefault(Object var1, Object var2) {
      int var3 = this.f(var1);
      if (var3 >= 0) {
         var2 = this.n[(var3 << 1) + 1];
      }

      return var2;
   }

   int h(Object var1) {
      int var3 = this.o * 2;
      Object[] var4 = this.n;
      int var2;
      if (var1 == null) {
         for(var2 = 1; var2 < var3; var2 += 2) {
            if (var4[var2] == null) {
               return var2 >> 1;
            }
         }
      } else {
         for(var2 = 1; var2 < var3; var2 += 2) {
            if (var1.equals(var4[var2])) {
               return var2 >> 1;
            }
         }
      }

      return -1;
   }

   public int hashCode() {
      int[] var7 = this.m;
      Object[] var8 = this.n;
      int var5 = this.o;
      int var3 = 1;
      int var2 = 0;

      int var1;
      for(var1 = 0; var2 < var5; var3 += 2) {
         Object var9 = var8[var3];
         int var6 = var7[var2];
         int var4;
         if (var9 == null) {
            var4 = 0;
         } else {
            var4 = var9.hashCode();
         }

         var1 += var4 ^ var6;
         ++var2;
      }

      return var1;
   }

   public Object i(int var1) {
      return this.n[var1 << 1];
   }

   public boolean isEmpty() {
      boolean var1;
      if (this.o <= 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void j(g var1) {
      int var3 = var1.o;
      this.c(this.o + var3);
      int var4 = this.o;
      int var2 = 0;
      if (var4 == 0) {
         if (var3 > 0) {
            System.arraycopy(var1.m, 0, this.m, 0, var3);
            System.arraycopy(var1.n, 0, this.n, 0, var3 << 1);
            this.o = var3;
         }
      } else {
         while(var2 < var3) {
            this.put(var1.i(var2), var1.m(var2));
            ++var2;
         }
      }

   }

   public Object k(int var1) {
      Object[] var10 = this.n;
      int var5 = var1 << 1;
      Object var7 = var10[var5 + 1];
      int var4 = this.o;
      int var2 = 0;
      if (var4 <= 1) {
         d(this.m, var10, var4);
         this.m = c.a;
         this.n = c.c;
         var1 = var2;
      } else {
         int var3 = var4 - 1;
         int[] var8 = this.m;
         int var6 = var8.length;
         var2 = 8;
         if (var6 > 8 && var4 < var8.length / 3) {
            if (var4 > 8) {
               var2 = var4 + (var4 >> 1);
            }

            this.a(var2);
            if (var4 != this.o) {
               throw new ConcurrentModificationException();
            }

            if (var1 > 0) {
               System.arraycopy(var8, 0, this.m, 0, var1);
               System.arraycopy(var10, 0, this.n, 0, var5);
            }

            if (var1 < var3) {
               var6 = var1 + 1;
               int[] var9 = this.m;
               var2 = var3 - var1;
               System.arraycopy(var8, var6, var9, var1, var2);
               System.arraycopy(var10, var6 << 1, this.n, var5, var2 << 1);
            }
         } else {
            Object[] var11;
            if (var1 < var3) {
               var2 = var1 + 1;
               var6 = var3 - var1;
               System.arraycopy(var8, var2, var8, var1, var6);
               var11 = this.n;
               System.arraycopy(var11, var2 << 1, var11, var5, var6 << 1);
            }

            var11 = this.n;
            var1 = var3 << 1;
            var11[var1] = null;
            var11[var1 + 1] = null;
         }

         var1 = var3;
      }

      if (var4 == this.o) {
         this.o = var1;
         return var7;
      } else {
         throw new ConcurrentModificationException();
      }
   }

   public Object l(int var1, Object var2) {
      var1 = (var1 << 1) + 1;
      Object[] var3 = this.n;
      Object var4 = var3[var1];
      var3[var1] = var2;
      return var4;
   }

   public Object m(int var1) {
      return this.n[(var1 << 1) + 1];
   }

   public Object put(Object var1, Object var2) {
      int var5 = this.o;
      int var3;
      int var4;
      if (var1 == null) {
         var3 = this.g();
         var4 = 0;
      } else {
         var4 = var1.hashCode();
         var3 = this.e(var1, var4);
      }

      Object[] var10;
      if (var3 >= 0) {
         var3 = (var3 << 1) + 1;
         var10 = this.n;
         var1 = var10[var3];
         var10[var3] = var2;
         return var1;
      } else {
         int var6 = ~var3;
         int[] var7 = this.m;
         if (var5 >= var7.length) {
            var3 = 8;
            if (var5 >= 8) {
               var3 = (var5 >> 1) + var5;
            } else if (var5 < 4) {
               var3 = 4;
            }

            Object[] var9 = this.n;
            this.a(var3);
            if (var5 != this.o) {
               throw new ConcurrentModificationException();
            }

            int[] var8 = this.m;
            if (var8.length > 0) {
               System.arraycopy(var7, 0, var8, 0, var7.length);
               System.arraycopy(var9, 0, this.n, 0, var9.length);
            }

            d(var7, var9, var5);
         }

         if (var6 < var5) {
            var7 = this.m;
            var3 = var6 + 1;
            System.arraycopy(var7, var6, var7, var3, var5 - var6);
            var10 = this.n;
            System.arraycopy(var10, var6 << 1, var10, var3 << 1, this.o - var6 << 1);
         }

         var3 = this.o;
         if (var5 == var3) {
            var7 = this.m;
            if (var6 < var7.length) {
               var7[var6] = var4;
               var10 = this.n;
               var4 = var6 << 1;
               var10[var4] = var1;
               var10[var4 + 1] = var2;
               this.o = var3 + 1;
               return null;
            }
         }

         throw new ConcurrentModificationException();
      }
   }

   public Object putIfAbsent(Object var1, Object var2) {
      Object var4 = this.get(var1);
      Object var3 = var4;
      if (var4 == null) {
         var3 = this.put(var1, var2);
      }

      return var3;
   }

   public Object remove(Object var1) {
      int var2 = this.f(var1);
      return var2 >= 0 ? this.k(var2) : null;
   }

   public boolean remove(Object var1, Object var2) {
      int var3 = this.f(var1);
      if (var3 >= 0) {
         var1 = this.m(var3);
         if (var2 == var1 || var2 != null && var2.equals(var1)) {
            this.k(var3);
            return true;
         }
      }

      return false;
   }

   public Object replace(Object var1, Object var2) {
      int var3 = this.f(var1);
      return var3 >= 0 ? this.l(var3, var2) : null;
   }

   public boolean replace(Object var1, Object var2, Object var3) {
      int var4 = this.f(var1);
      if (var4 >= 0) {
         var1 = this.m(var4);
         if (var1 == var2 || var2 != null && var2.equals(var1)) {
            this.l(var4, var3);
            return true;
         }
      }

      return false;
   }

   public int size() {
      return this.o;
   }

   public String toString() {
      if (this.isEmpty()) {
         return "{}";
      } else {
         StringBuilder var2 = new StringBuilder(this.o * 28);
         var2.append('{');

         for(int var1 = 0; var1 < this.o; ++var1) {
            if (var1 > 0) {
               var2.append(", ");
            }

            Object var3 = this.i(var1);
            if (var3 != this) {
               var2.append(var3);
            } else {
               var2.append("(this Map)");
            }

            var2.append('=');
            var3 = this.m(var1);
            if (var3 != this) {
               var2.append(var3);
            } else {
               var2.append("(this Map)");
            }
         }

         var2.append('}');
         return var2.toString();
      }
   }
}
