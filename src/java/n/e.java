package n;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class e {
   private final LinkedHashMap a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public e(int var1) {
      if (var1 > 0) {
         this.c = var1;
         this.a = new LinkedHashMap(0, 0.75F, true);
      } else {
         throw new IllegalArgumentException("maxSize <= 0");
      }
   }

   private int f(Object var1, Object var2) {
      int var3 = this.g(var1, var2);
      if (var3 >= 0) {
         return var3;
      } else {
         StringBuilder var4 = new StringBuilder();
         var4.append("Negative size: ");
         var4.append(var1);
         var4.append("=");
         var4.append(var2);
         throw new IllegalStateException(var4.toString());
      }
   }

   protected Object a(Object var1) {
      return null;
   }

   protected void b(boolean var1, Object var2, Object var3, Object var4) {
   }

   public final Object c(Object var1) {
      if (var1 != null) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         Throwable var95;
         label843: {
            Object var2;
            try {
               var2 = this.a.get(var1);
            } catch (Throwable var94) {
               var10000 = var94;
               var10001 = false;
               break label843;
            }

            if (var2 != null) {
               label836:
               try {
                  ++this.g;
                  return var2;
               } catch (Throwable var92) {
                  var10000 = var92;
                  var10001 = false;
                  break label836;
               }
            } else {
               label849: {
                  try {
                     ++this.h;
                  } catch (Throwable var93) {
                     var10000 = var93;
                     var10001 = false;
                     break label849;
                  }

                  Object var3 = this.a(var1);
                  if (var3 == null) {
                     return null;
                  }

                  synchronized(this){}

                  label850: {
                     label851: {
                        try {
                           ++this.e;
                           var2 = this.a.put(var1, var3);
                        } catch (Throwable var91) {
                           var10000 = var91;
                           var10001 = false;
                           break label851;
                        }

                        if (var2 != null) {
                           try {
                              this.a.put(var1, var2);
                           } catch (Throwable var90) {
                              var10000 = var90;
                              var10001 = false;
                              break label851;
                           }
                        } else {
                           try {
                              this.b += this.f(var1, var3);
                           } catch (Throwable var89) {
                              var10000 = var89;
                              var10001 = false;
                              break label851;
                           }
                        }

                        label819:
                        try {
                           break label850;
                        } catch (Throwable var88) {
                           var10000 = var88;
                           var10001 = false;
                           break label819;
                        }
                     }

                     while(true) {
                        var95 = var10000;

                        try {
                           throw var95;
                        } catch (Throwable var86) {
                           var10000 = var86;
                           var10001 = false;
                           continue;
                        }
                     }
                  }

                  if (var2 != null) {
                     this.b(false, var1, var3, var2);
                     return var2;
                  }

                  this.i(this.c);
                  return var3;
               }
            }
         }

         while(true) {
            var95 = var10000;

            try {
               throw var95;
            } catch (Throwable var87) {
               var10000 = var87;
               var10001 = false;
               continue;
            }
         }
      } else {
         throw new NullPointerException("key == null");
      }
   }

   public final Object d(Object var1, Object var2) {
      if (var1 != null && var2 != null) {
         synchronized(this){}

         Object var3;
         label239: {
            Throwable var10000;
            boolean var10001;
            label240: {
               try {
                  ++this.d;
                  this.b += this.f(var1, var2);
                  var3 = this.a.put(var1, var2);
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label240;
               }

               if (var3 != null) {
                  try {
                     this.b -= this.f(var1, var3);
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label240;
                  }
               }

               label224:
               try {
                  break label239;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label224;
               }
            }

            while(true) {
               Throwable var25 = var10000;

               try {
                  throw var25;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  continue;
               }
            }
         }

         if (var3 != null) {
            this.b(false, var1, var3, var2);
         }

         this.i(this.c);
         return var3;
      } else {
         throw new NullPointerException("key == null || value == null");
      }
   }

   public final Object e(Object var1) {
      if (var1 != null) {
         synchronized(this){}

         Object var2;
         label229: {
            Throwable var10000;
            boolean var10001;
            label230: {
               try {
                  var2 = this.a.remove(var1);
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label230;
               }

               if (var2 != null) {
                  try {
                     this.b -= this.f(var1, var2);
                  } catch (Throwable var22) {
                     var10000 = var22;
                     var10001 = false;
                     break label230;
                  }
               }

               label215:
               try {
                  break label229;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label215;
               }
            }

            while(true) {
               Throwable var24 = var10000;

               try {
                  throw var24;
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  continue;
               }
            }
         }

         if (var2 != null) {
            this.b(false, var1, var2, (Object)null);
         }

         return var2;
      } else {
         throw new NullPointerException("key == null");
      }
   }

   protected int g(Object var1, Object var2) {
      return 1;
   }

   public final Map h() {
      synchronized(this){}

      LinkedHashMap var1;
      try {
         var1 = new LinkedHashMap(this.a);
      } finally {
         ;
      }

      return var1;
   }

   public void i(int var1) {
      while(true) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label443: {
            label448: {
               try {
                  if (this.b < 0 || this.a.isEmpty() && this.b != 0) {
                     break label448;
                  }
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break label443;
               }

               label450: {
                  try {
                     if (this.b > var1 && !this.a.isEmpty()) {
                        break label450;
                     }
                  } catch (Throwable var44) {
                     var10000 = var44;
                     var10001 = false;
                     break label443;
                  }

                  try {
                     return;
                  } catch (Throwable var43) {
                     var10000 = var43;
                     var10001 = false;
                     break label443;
                  }
               }

               Object var2;
               Object var49;
               try {
                  Map.Entry var3 = (Map.Entry)this.a.entrySet().iterator().next();
                  var2 = var3.getKey();
                  var49 = var3.getValue();
                  this.a.remove(var2);
                  this.b -= this.f(var2, var49);
                  ++this.f;
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label443;
               }

               this.b(true, var2, var49, (Object)null);
               continue;
            }

            label432:
            try {
               StringBuilder var50 = new StringBuilder();
               var50.append(this.getClass().getName());
               var50.append(".sizeOf() is reporting inconsistent results!");
               IllegalStateException var48 = new IllegalStateException(var50.toString());
               throw var48;
            } catch (Throwable var45) {
               var10000 = var45;
               var10001 = false;
               break label432;
            }
         }

         while(true) {
            Throwable var47 = var10000;

            try {
               throw var47;
            } catch (Throwable var41) {
               var10000 = var41;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public final String toString() {
      synchronized(this){}

      Throwable var10000;
      label128: {
         int var1;
         boolean var10001;
         int var2;
         try {
            var2 = this.g;
            var1 = this.h + var2;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label128;
         }

         if (var1 != 0) {
            try {
               var1 = var2 * 100 / var1;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label128;
            }
         } else {
            var1 = 0;
         }

         label115:
         try {
            String var17 = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{this.c, this.g, this.h, var1});
            return var17;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label115;
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }
}
