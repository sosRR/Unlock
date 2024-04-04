package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b implements Collection, Set {
   private static final int[] q = new int[0];
   private static final Object[] r = new Object[0];
   private static Object[] s;
   private static int t;
   private static Object[] u;
   private static int v;
   private int[] m;
   Object[] n;
   int o;
   private f p;

   public b() {
      this(0);
   }

   public b(int var1) {
      if (var1 == 0) {
         this.m = q;
         this.n = r;
      } else {
         this.d(var1);
      }

      this.o = 0;
   }

   private void d(int var1) {
      Throwable var10000;
      boolean var10001;
      Throwable var114;
      label938: {
         label934: {
            Object[] var2;
            Class var3;
            if (var1 == 8) {
               var3 = b.class;
               synchronized(b.class){}

               try {
                  var2 = u;
               } catch (Throwable var113) {
                  var10000 = var113;
                  var10001 = false;
                  break label934;
               }

               if (var2 != null) {
                  try {
                     this.n = var2;
                     u = (Object[])var2[0];
                     this.m = (int[])var2[1];
                  } catch (Throwable var107) {
                     var10000 = var107;
                     var10001 = false;
                     break label934;
                  }

                  var2[1] = null;
                  var2[0] = null;

                  try {
                     --v;
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
               var3 = b.class;
               synchronized(b.class){}

               try {
                  var2 = s;
               } catch (Throwable var111) {
                  var10000 = var111;
                  var10001 = false;
                  break label938;
               }

               if (var2 != null) {
                  try {
                     this.n = var2;
                     s = (Object[])var2[0];
                     this.m = (int[])var2[1];
                  } catch (Throwable var109) {
                     var10000 = var109;
                     var10001 = false;
                     break label938;
                  }

                  var2[1] = null;
                  var2[0] = null;

                  try {
                     --t;
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
            this.n = new Object[var1];
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

   private static void h(int[] var0, Object[] var1, int var2) {
      Class var3;
      Throwable var76;
      Throwable var10000;
      boolean var10001;
      if (var0.length == 8) {
         var3 = b.class;
         synchronized(b.class){}

         label811: {
            label838: {
               try {
                  if (v >= 10) {
                     break label838;
                  }

                  var1[0] = u;
               } catch (Throwable var72) {
                  var10000 = var72;
                  var10001 = false;
                  break label811;
               }

               var1[1] = var0;
               --var2;

               while(true) {
                  if (var2 < 2) {
                     try {
                        u = var1;
                        ++v;
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
            } catch (Throwable var69) {
               var10000 = var69;
               var10001 = false;
               continue;
            }
         }
      } else if (var0.length == 4) {
         var3 = b.class;
         synchronized(b.class){}

         label829: {
            label839: {
               try {
                  if (t >= 10) {
                     break label839;
                  }

                  var1[0] = s;
               } catch (Throwable var75) {
                  var10000 = var75;
                  var10001 = false;
                  break label829;
               }

               var1[1] = var0;
               --var2;

               while(true) {
                  if (var2 < 2) {
                     try {
                        s = var1;
                        ++t;
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
            } catch (Throwable var68) {
               var10000 = var68;
               var10001 = false;
               continue;
            }
         }
      }
   }

   private f i() {
      if (this.p == null) {
         this.p = new b$a(this);
      }

      return this.p;
   }

   private int k(Object var1, int var2) {
      int var4 = this.o;
      if (var4 == 0) {
         return -1;
      } else {
         int var5 = c.a(this.m, var4, var2);
         if (var5 < 0) {
            return var5;
         } else if (var1.equals(this.n[var5])) {
            return var5;
         } else {
            int var3;
            for(var3 = var5 + 1; var3 < var4 && this.m[var3] == var2; ++var3) {
               if (var1.equals(this.n[var3])) {
                  return var3;
               }
            }

            for(var4 = var5 - 1; var4 >= 0 && this.m[var4] == var2; --var4) {
               if (var1.equals(this.n[var4])) {
                  return var4;
               }
            }

            return ~var3;
         }
      }
   }

   private int m() {
      int var2 = this.o;
      if (var2 == 0) {
         return -1;
      } else {
         int var3 = c.a(this.m, var2, 0);
         if (var3 < 0) {
            return var3;
         } else if (this.n[var3] == null) {
            return var3;
         } else {
            int var1;
            for(var1 = var3 + 1; var1 < var2 && this.m[var1] == 0; ++var1) {
               if (this.n[var1] == null) {
                  return var1;
               }
            }

            for(var2 = var3 - 1; var2 >= 0 && this.m[var2] == 0; --var2) {
               if (this.n[var2] == null) {
                  return var2;
               }
            }

            return ~var1;
         }
      }
   }

   public boolean add(Object var1) {
      int var2;
      int var3;
      if (var1 == null) {
         var2 = this.m();
         var3 = 0;
      } else {
         var3 = var1.hashCode();
         var2 = this.k(var1, var3);
      }

      if (var2 >= 0) {
         return false;
      } else {
         int var4 = ~var2;
         int var5 = this.o;
         int[] var6 = this.m;
         if (var5 >= var6.length) {
            var2 = 8;
            if (var5 >= 8) {
               var2 = (var5 >> 1) + var5;
            } else if (var5 < 4) {
               var2 = 4;
            }

            Object[] var8 = this.n;
            this.d(var2);
            int[] var7 = this.m;
            if (var7.length > 0) {
               System.arraycopy(var6, 0, var7, 0, var6.length);
               System.arraycopy(var8, 0, this.n, 0, var8.length);
            }

            h(var6, var8, this.o);
         }

         var2 = this.o;
         if (var4 < var2) {
            var6 = this.m;
            var5 = var4 + 1;
            System.arraycopy(var6, var4, var6, var5, var2 - var4);
            Object[] var9 = this.n;
            System.arraycopy(var9, var4, var9, var5, this.o - var4);
         }

         this.m[var4] = var3;
         this.n[var4] = var1;
         ++this.o;
         return true;
      }
   }

   public boolean addAll(Collection var1) {
      this.g(this.o + var1.size());
      Iterator var3 = var1.iterator();

      boolean var2;
      for(var2 = false; var3.hasNext(); var2 |= this.add(var3.next())) {
      }

      return var2;
   }

   public void clear() {
      int var1 = this.o;
      if (var1 != 0) {
         h(this.m, this.n, var1);
         this.m = q;
         this.n = r;
         this.o = 0;
      }

   }

   public boolean contains(Object var1) {
      boolean var2;
      if (this.indexOf(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean containsAll(Collection var1) {
      Iterator var2 = var1.iterator();

      do {
         if (!var2.hasNext()) {
            return true;
         }
      } while(this.contains(var2.next()));

      return false;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof Set) {
            Set var5 = (Set)var1;
            if (this.size() != var5.size()) {
               return false;
            }

            int var2 = 0;

            while(true) {
               boolean var3;
               try {
                  if (var2 >= this.o) {
                     return true;
                  }

                  var3 = var5.contains(this.p(var2));
               } catch (ClassCastException | NullPointerException var4) {
                  break;
               }

               if (!var3) {
                  return false;
               }

               ++var2;
            }
         }

         return false;
      }
   }

   public void g(int var1) {
      int[] var3 = this.m;
      if (var3.length < var1) {
         Object[] var2 = this.n;
         this.d(var1);
         var1 = this.o;
         if (var1 > 0) {
            System.arraycopy(var3, 0, this.m, 0, var1);
            System.arraycopy(var2, 0, this.n, 0, this.o);
         }

         h(var3, var2, this.o);
      }

   }

   public int hashCode() {
      int[] var4 = this.m;
      int var3 = this.o;
      int var2 = 0;

      int var1;
      for(var1 = 0; var2 < var3; ++var2) {
         var1 += var4[var2];
      }

      return var1;
   }

   public int indexOf(Object var1) {
      int var2;
      if (var1 == null) {
         var2 = this.m();
      } else {
         var2 = this.k(var1, var1.hashCode());
      }

      return var2;
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

   public Iterator iterator() {
      return this.i().m().iterator();
   }

   public Object n(int var1) {
      Object[] var6 = this.n;
      Object var5 = var6[var1];
      int var3 = this.o;
      if (var3 <= 1) {
         h(this.m, var6, var3);
         this.m = q;
         this.n = r;
         this.o = 0;
      } else {
         int[] var7 = this.m;
         int var4 = var7.length;
         int var2 = 8;
         if (var4 > 8 && var3 < var7.length / 3) {
            if (var3 > 8) {
               var2 = var3 + (var3 >> 1);
            }

            this.d(var2);
            --this.o;
            if (var1 > 0) {
               System.arraycopy(var7, 0, this.m, 0, var1);
               System.arraycopy(var6, 0, this.n, 0, var1);
            }

            var2 = this.o;
            if (var1 < var2) {
               var3 = var1 + 1;
               System.arraycopy(var7, var3, this.m, var1, var2 - var1);
               System.arraycopy(var6, var3, this.n, var1, this.o - var1);
            }
         } else {
            var2 = var3 - 1;
            this.o = var2;
            if (var1 < var2) {
               var3 = var1 + 1;
               System.arraycopy(var7, var3, var7, var1, var2 - var1);
               var6 = this.n;
               System.arraycopy(var6, var3, var6, var1, this.o - var1);
            }

            this.n[this.o] = null;
         }
      }

      return var5;
   }

   public Object p(int var1) {
      return this.n[var1];
   }

   public boolean remove(Object var1) {
      int var2 = this.indexOf(var1);
      if (var2 >= 0) {
         this.n(var2);
         return true;
      } else {
         return false;
      }
   }

   public boolean removeAll(Collection var1) {
      Iterator var3 = var1.iterator();

      boolean var2;
      for(var2 = false; var3.hasNext(); var2 |= this.remove(var3.next())) {
      }

      return var2;
   }

   public boolean retainAll(Collection var1) {
      int var2 = this.o - 1;

      boolean var3;
      for(var3 = false; var2 >= 0; --var2) {
         if (!var1.contains(this.n[var2])) {
            this.n(var2);
            var3 = true;
         }
      }

      return var3;
   }

   public int size() {
      return this.o;
   }

   public Object[] toArray() {
      int var1 = this.o;
      Object[] var2 = new Object[var1];
      System.arraycopy(this.n, 0, var2, 0, var1);
      return var2;
   }

   public Object[] toArray(Object[] var1) {
      Object[] var4 = var1;
      if (var1.length < this.o) {
         var4 = (Object[])Array.newInstance(var1.getClass().getComponentType(), this.o);
      }

      System.arraycopy(this.n, 0, var4, 0, this.o);
      int var2 = var4.length;
      int var3 = this.o;
      if (var2 > var3) {
         var4[var3] = null;
      }

      return var4;
   }

   public String toString() {
      if (this.isEmpty()) {
         return "{}";
      } else {
         StringBuilder var2 = new StringBuilder(this.o * 14);
         var2.append('{');

         for(int var1 = 0; var1 < this.o; ++var1) {
            if (var1 > 0) {
               var2.append(", ");
            }

            Object var3 = this.p(var1);
            if (var3 != this) {
               var2.append(var3);
            } else {
               var2.append("(this Set)");
            }
         }

         var2.append('}');
         return var2.toString();
      }
   }
}
