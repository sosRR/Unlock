package b0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class b {
   private static boolean a(int var0, Rect var1, Rect var2, Rect var3) {
      boolean var5 = b(var0, var1, var2);
      boolean var6 = b(var0, var1, var3);
      boolean var4 = false;
      if (!var6 && var5) {
         if (!j(var0, var1, var3)) {
            return true;
         } else if (var0 != 17 && var0 != 66) {
            if (k(var0, var1, var2) < m(var0, var1, var3)) {
               var4 = true;
            }

            return var4;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(int var0, Rect var1, Rect var2) {
      boolean var3;
      boolean var4;
      label41: {
         var3 = true;
         var4 = true;
         if (var0 != 17) {
            if (var0 == 33) {
               break label41;
            }

            if (var0 != 66) {
               if (var0 != 130) {
                  throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
               }
               break label41;
            }
         }

         if (var2.bottom < var1.top || var2.top > var1.bottom) {
            var3 = false;
         }

         return var3;
      }

      if (var2.right >= var1.left && var2.left <= var1.right) {
         var3 = var4;
      } else {
         var3 = false;
      }

      return var3;
   }

   public static Object c(Object var0, b0.b.b var1, b0.b.a var2, Object var3, Rect var4, int var5) {
      Rect var11 = new Rect(var4);
      int var6 = 0;
      if (var5 != 17) {
         if (var5 != 33) {
            if (var5 != 66) {
               if (var5 != 130) {
                  throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
               }

               var11.offset(0, -(var4.height() + 1));
            } else {
               var11.offset(-(var4.width() + 1), 0);
            }
         } else {
            var11.offset(0, var4.height() + 1);
         }
      } else {
         var11.offset(var4.width() + 1, 0);
      }

      int var7 = var1.b(var0);
      Rect var10 = new Rect();

      Object var8;
      for(var8 = null; var6 < var7; ++var6) {
         Object var9 = var1.a(var0, var6);
         if (var9 != var3) {
            var2.a(var9, var10);
            if (h(var5, var4, var10, var11)) {
               var11.set(var10);
               var8 = var9;
            }
         }
      }

      return var8;
   }

   public static Object d(Object var0, b0.b.b var1, b0.b.a var2, Object var3, int var4, boolean var5, boolean var6) {
      int var8 = var1.b(var0);
      ArrayList var9 = new ArrayList(var8);

      for(int var7 = 0; var7 < var8; ++var7) {
         var9.add(var1.a(var0, var7));
      }

      Collections.sort(var9, new b0.b.c(var5, var2));
      if (var4 != 1) {
         if (var4 == 2) {
            return e(var3, var9, var6);
         } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
         }
      } else {
         return f(var3, var9, var6);
      }
   }

   private static Object e(Object var0, ArrayList var1, boolean var2) {
      int var4 = var1.size();
      int var3;
      if (var0 == null) {
         var3 = -1;
      } else {
         var3 = var1.lastIndexOf(var0);
      }

      ++var3;
      if (var3 < var4) {
         return var1.get(var3);
      } else {
         return var2 && var4 > 0 ? var1.get(0) : null;
      }
   }

   private static Object f(Object var0, ArrayList var1, boolean var2) {
      int var4 = var1.size();
      int var3;
      if (var0 == null) {
         var3 = var4;
      } else {
         var3 = var1.indexOf(var0);
      }

      --var3;
      if (var3 >= 0) {
         return var1.get(var3);
      } else {
         return var2 && var4 > 0 ? var1.get(var4 - 1) : null;
      }
   }

   private static int g(int var0, int var1) {
      return var0 * 13 * var0 + var1 * var1;
   }

   private static boolean h(int var0, Rect var1, Rect var2, Rect var3) {
      boolean var5 = i(var1, var2, var0);
      boolean var4 = false;
      if (!var5) {
         return false;
      } else if (!i(var1, var3, var0)) {
         return true;
      } else if (a(var0, var1, var2, var3)) {
         return true;
      } else if (a(var0, var1, var3, var2)) {
         return false;
      } else {
         if (g(k(var0, var1, var2), o(var0, var1, var2)) < g(k(var0, var1, var3), o(var0, var1, var3))) {
            var4 = true;
         }

         return var4;
      }
   }

   private static boolean i(Rect var0, Rect var1, int var2) {
      boolean var5 = true;
      boolean var7 = true;
      boolean var6 = true;
      boolean var4 = true;
      int var3;
      if (var2 != 17) {
         if (var2 != 33) {
            if (var2 != 66) {
               if (var2 != 130) {
                  throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
               } else {
                  var3 = var0.top;
                  var2 = var1.top;
                  if (var3 >= var2 && var0.bottom > var2 || var0.bottom >= var1.bottom) {
                     var4 = false;
                  }

                  return var4;
               }
            } else {
               var3 = var0.left;
               var2 = var1.left;
               if ((var3 < var2 || var0.right <= var2) && var0.right < var1.right) {
                  var4 = var5;
               } else {
                  var4 = false;
               }

               return var4;
            }
         } else {
            var2 = var0.bottom;
            var3 = var1.bottom;
            if ((var2 > var3 || var0.top >= var3) && var0.top > var1.top) {
               var4 = var7;
            } else {
               var4 = false;
            }

            return var4;
         }
      } else {
         var2 = var0.right;
         var3 = var1.right;
         if ((var2 > var3 || var0.left >= var3) && var0.left > var1.left) {
            var4 = var6;
         } else {
            var4 = false;
         }

         return var4;
      }
   }

   private static boolean j(int var0, Rect var1, Rect var2) {
      boolean var4 = true;
      boolean var6 = true;
      boolean var5 = true;
      boolean var3 = true;
      if (var0 != 17) {
         if (var0 != 33) {
            if (var0 != 66) {
               if (var0 == 130) {
                  if (var1.bottom > var2.top) {
                     var3 = false;
                  }

                  return var3;
               } else {
                  throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
               }
            } else {
               if (var1.right <= var2.left) {
                  var3 = var4;
               } else {
                  var3 = false;
               }

               return var3;
            }
         } else {
            if (var1.top >= var2.bottom) {
               var3 = var6;
            } else {
               var3 = false;
            }

            return var3;
         }
      } else {
         if (var1.left >= var2.right) {
            var3 = var5;
         } else {
            var3 = false;
         }

         return var3;
      }
   }

   private static int k(int var0, Rect var1, Rect var2) {
      return Math.max(0, l(var0, var1, var2));
   }

   private static int l(int var0, Rect var1, Rect var2) {
      int var3;
      if (var0 != 17) {
         if (var0 != 33) {
            if (var0 != 66) {
               if (var0 != 130) {
                  throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
               }

               var0 = var2.top;
               var3 = var1.bottom;
            } else {
               var0 = var2.left;
               var3 = var1.right;
            }
         } else {
            var0 = var1.top;
            var3 = var2.bottom;
         }
      } else {
         var0 = var1.left;
         var3 = var2.right;
      }

      return var0 - var3;
   }

   private static int m(int var0, Rect var1, Rect var2) {
      return Math.max(1, n(var0, var1, var2));
   }

   private static int n(int var0, Rect var1, Rect var2) {
      int var3;
      if (var0 != 17) {
         if (var0 != 33) {
            if (var0 != 66) {
               if (var0 != 130) {
                  throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
               }

               var0 = var2.bottom;
               var3 = var1.bottom;
            } else {
               var0 = var2.right;
               var3 = var1.right;
            }
         } else {
            var0 = var1.top;
            var3 = var2.top;
         }
      } else {
         var0 = var1.left;
         var3 = var2.left;
      }

      return var0 - var3;
   }

   private static int o(int var0, Rect var1, Rect var2) {
      if (var0 != 17) {
         if (var0 == 33) {
            return Math.abs(var1.left + var1.width() / 2 - (var2.left + var2.width() / 2));
         }

         if (var0 != 66) {
            if (var0 != 130) {
               throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }

            return Math.abs(var1.left + var1.width() / 2 - (var2.left + var2.width() / 2));
         }
      }

      return Math.abs(var1.top + var1.height() / 2 - (var2.top + var2.height() / 2));
   }

   public interface a {
      void a(Object var1, Rect var2);
   }

   public interface b {
      Object a(Object var1, int var2);

      int b(Object var1);
   }

   private static class c implements Comparator {
      private final Rect a = new Rect();
      private final Rect b = new Rect();
      private final boolean c;
      private final b0.b.a d;

      c(boolean var1, b0.b.a var2) {
         this.c = var1;
         this.d = var2;
      }

      public int compare(Object var1, Object var2) {
         Rect var6 = this.a;
         Rect var7 = this.b;
         this.d.a(var1, var6);
         this.d.a(var2, var7);
         int var4 = var6.top;
         int var5 = var7.top;
         byte var3 = -1;
         if (var4 < var5) {
            return -1;
         } else if (var4 > var5) {
            return 1;
         } else {
            var5 = var6.left;
            var4 = var7.left;
            if (var5 < var4) {
               if (this.c) {
                  var3 = 1;
               }

               return var3;
            } else if (var5 > var4) {
               if (!this.c) {
                  var3 = 1;
               }

               return var3;
            } else {
               var5 = var6.bottom;
               var4 = var7.bottom;
               if (var5 < var4) {
                  return -1;
               } else if (var5 > var4) {
                  return 1;
               } else {
                  var5 = var6.right;
                  var4 = var7.right;
                  if (var5 < var4) {
                     if (this.c) {
                        var3 = 1;
                     }

                     return var3;
                  } else if (var5 > var4) {
                     if (!this.c) {
                        var3 = 1;
                     }

                     return var3;
                  } else {
                     return 0;
                  }
               }
            }
         }
      }
   }
}
