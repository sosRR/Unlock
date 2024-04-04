package e6;

import java.util.concurrent.CancellationException;

public abstract class d0 extends kotlinx.coroutines.scheduling.h {
   public int o;

   public d0(int var1) {
      this.o = var1;
   }

   public void a(Object var1, Throwable var2) {
   }

   public abstract o5.d e();

   public Throwable f(Object var1) {
      boolean var2 = var1 instanceof n;
      Object var3 = null;
      n var4;
      if (var2) {
         var4 = (n)var1;
      } else {
         var4 = null;
      }

      Throwable var5;
      if (var4 == null) {
         var5 = (Throwable)var3;
      } else {
         var5 = var4.a;
      }

      return var5;
   }

   public Object g(Object var1) {
      return var1;
   }

   public final void h(Throwable var1, Throwable var2) {
      if (var1 != null || var2 != null) {
         if (var1 != null && var2 != null) {
            m5.a.a(var1, var2);
         }

         Throwable var3 = var1;
         if (var1 == null) {
            var3 = var2;
         }

         StringBuilder var4 = new StringBuilder();
         var4.append("Fatal exception in coroutines machinery for ");
         var4.append(this);
         var4.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
         String var5 = var4.toString();
         x5.g.b(var3);
         w var6 = new w(var5, var3);
         v.a(this.e().c(), var6);
      }
   }

   public abstract Object i();

   public final void run() {
      kotlinx.coroutines.scheduling.i var3 = super.n;

      Object var219;
      m5.j.a var224;
      label1885: {
         Throwable var10000;
         Throwable var225;
         label1876: {
            o5.f var4;
            Object var5;
            o5.d var6;
            boolean var10001;
            i1 var220;
            label1867: {
               try {
                  kotlinx.coroutines.internal.d var1 = (kotlinx.coroutines.internal.d)this.e();
                  var6 = var1.q;
                  var219 = var1.s;
                  var4 = var6.c();
                  var5 = kotlinx.coroutines.internal.a0.c(var4, var219);
                  if (var5 != kotlinx.coroutines.internal.a0.a) {
                     var220 = r.c(var6, var4, var5);
                     break label1867;
                  }
               } catch (Throwable var218) {
                  var10000 = var218;
                  var10001 = false;
                  break label1876;
               }

               var220 = null;
            }

            label1877: {
               label1878: {
                  o5.f var2;
                  Object var7;
                  Throwable var8;
                  try {
                     var2 = var6.c();
                     var7 = this.i();
                     var8 = this.f(var7);
                  } catch (Throwable var217) {
                     var10000 = var217;
                     var10001 = false;
                     break label1878;
                  }

                  t0 var221;
                  label1854: {
                     if (var8 == null) {
                        try {
                           if (e0.b(this.o)) {
                              var221 = (t0)var2.get(t0.k);
                              break label1854;
                           }
                        } catch (Throwable var216) {
                           var10000 = var216;
                           var10001 = false;
                           break label1878;
                        }
                     }

                     var221 = null;
                  }

                  label1880: {
                     if (var221 != null) {
                        try {
                           if (!var221.a()) {
                              CancellationException var223 = var221.z();
                              this.a(var7, var223);
                              m5.j.a var227 = m5.j.m;
                              var6.d(m5.j.a(m5.k.a(var223)));
                              break label1880;
                           }
                        } catch (Throwable var215) {
                           var10000 = var215;
                           var10001 = false;
                           break label1878;
                        }
                     }

                     if (var8 != null) {
                        try {
                           var224 = m5.j.m;
                           var6.d(m5.j.a(m5.k.a(var8)));
                        } catch (Throwable var214) {
                           var10000 = var214;
                           var10001 = false;
                           break label1878;
                        }
                     } else {
                        try {
                           var6.d(m5.j.a(this.g(var7)));
                        } catch (Throwable var213) {
                           var10000 = var213;
                           var10001 = false;
                           break label1878;
                        }
                     }
                  }

                  label1833:
                  try {
                     m5.o var226 = m5.o.a;
                     break label1877;
                  } catch (Throwable var212) {
                     var10000 = var212;
                     var10001 = false;
                     break label1833;
                  }
               }

               label1822: {
                  var225 = var10000;
                  if (var220 != null) {
                     try {
                        if (!var220.m0()) {
                           break label1822;
                        }
                     } catch (Throwable var209) {
                        var10000 = var209;
                        var10001 = false;
                        break label1876;
                     }
                  }

                  try {
                     kotlinx.coroutines.internal.a0.a(var4, var5);
                  } catch (Throwable var208) {
                     var10000 = var208;
                     var10001 = false;
                     break label1876;
                  }
               }

               try {
                  throw var225;
               } catch (Throwable var207) {
                  var10000 = var207;
                  var10001 = false;
                  break label1876;
               }
            }

            if (var220 != null) {
               try {
                  if (!var220.m0()) {
                     break label1885;
                  }
               } catch (Throwable var211) {
                  var10000 = var211;
                  var10001 = false;
                  break label1876;
               }
            }

            label1825:
            try {
               kotlinx.coroutines.internal.a0.a(var4, var5);
               break label1885;
            } catch (Throwable var210) {
               var10000 = var210;
               var10001 = false;
               break label1825;
            }
         }

         var225 = var10000;

         m5.j.a var222;
         label1805:
         try {
            var222 = m5.j.m;
            var3.a();
            var219 = m5.j.a(m5.o.a);
         } catch (Throwable var205) {
            var222 = m5.j.m;
            var219 = m5.j.a(m5.k.a(var205));
            break label1805;
         }

         this.h(var225, m5.j.b(var219));
         return;
      }

      label1809:
      try {
         var3.a();
         var219 = m5.j.a(m5.o.a);
      } catch (Throwable var206) {
         var224 = m5.j.m;
         var219 = m5.j.a(m5.k.a(var206));
         break label1809;
      }

      this.h((Throwable)null, m5.j.b(var219));
   }
}
