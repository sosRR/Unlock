package y0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f1.p;
import f1.q;
import f1.t;
import g1.n;
import g1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import x0.k;
import x0.u;

public class j implements Runnable {
   static final String F = k.f("WorkerWrapper");
   private List A;
   private String B;
   androidx.work.impl.utils.futures.d C = androidx.work.impl.utils.futures.d.t();
   u3.a D = null;
   private volatile boolean E;
   Context m;
   private String n;
   private List o;
   private WorkerParameters.a p;
   p q;
   ListenableWorker r;
   h1.a s;
   ListenableWorker.a t = androidx.work.ListenableWorker.a.a();
   private androidx.work.a u;
   private e1.a v;
   private WorkDatabase w;
   private q x;
   private f1.b y;
   private t z;

   j(c var1) {
      this.m = var1.a;
      this.s = var1.d;
      this.v = var1.c;
      this.n = var1.g;
      this.o = var1.h;
      this.p = var1.i;
      this.r = var1.b;
      this.u = var1.e;
      WorkDatabase var2 = var1.f;
      this.w = var2;
      this.x = var2.D();
      this.y = this.w.v();
      this.z = this.w.E();
   }

   private String a(List var1) {
      StringBuilder var3 = new StringBuilder("Work [ id=");
      var3.append(this.n);
      var3.append(", tags={ ");
      Iterator var5 = var1.iterator();

      String var4;
      for(boolean var2 = true; var5.hasNext(); var3.append(var4)) {
         var4 = (String)var5.next();
         if (var2) {
            var2 = false;
         } else {
            var3.append(", ");
         }
      }

      var3.append(" } ]");
      return var3.toString();
   }

   private void c(ListenableWorker.a var1) {
      if (var1 instanceof ListenableWorker.a.c) {
         k.c().d(F, String.format("Worker result SUCCESS for %s", new Object[]{this.B}));
         if (this.q.d()) {
            this.h();
         } else {
            this.m();
         }
      } else if (var1 instanceof ListenableWorker.a.b) {
         k.c().d(F, String.format("Worker result RETRY for %s", new Object[]{this.B}));
         this.g();
      } else {
         k.c().d(F, String.format("Worker result FAILURE for %s", new Object[]{this.B}));
         if (this.q.d()) {
            this.h();
         } else {
            this.l();
         }
      }

   }

   private void e(String var1) {
      LinkedList var2 = new LinkedList();
      var2.add(var1);

      for(; !var2.isEmpty(); var2.addAll(this.y.d(var1))) {
         var1 = (String)var2.remove();
         if (this.x.j(var1) != u.a.r) {
            this.x.h(u.a.p, var1);
         }
      }

   }

   private void g() {
      this.w.c();

      try {
         this.x.h(u.a.m, this.n);
         this.x.r(this.n, System.currentTimeMillis());
         this.x.e(this.n, -1L);
         this.w.t();
      } finally {
         this.w.g();
         this.i(true);
      }

   }

   private void h() {
      this.w.c();

      try {
         this.x.r(this.n, System.currentTimeMillis());
         this.x.h(u.a.m, this.n);
         this.x.m(this.n);
         this.x.e(this.n, -1L);
         this.w.t();
      } finally {
         this.w.g();
         this.i(false);
      }

   }

   private void i(boolean var1) {
      this.w.c();

      label284: {
         Throwable var10000;
         label288: {
            boolean var10001;
            try {
               if (!this.w.D().d()) {
                  g1.g.a(this.m, RescheduleReceiver.class, false);
               }
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label288;
            }

            if (var1) {
               try {
                  this.x.h(u.a.m, this.n);
                  this.x.e(this.n, -1L);
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label288;
               }
            }

            label275: {
               ListenableWorker var2;
               try {
                  if (this.q == null) {
                     break label275;
                  }

                  var2 = this.r;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label288;
               }

               if (var2 != null) {
                  try {
                     if (var2.i()) {
                        this.v.b(this.n);
                     }
                  } catch (Throwable var29) {
                     var10000 = var29;
                     var10001 = false;
                     break label288;
                  }
               }
            }

            label267:
            try {
               this.w.t();
               break label284;
            } catch (Throwable var28) {
               var10000 = var28;
               var10001 = false;
               break label267;
            }
         }

         Throwable var33 = var10000;
         this.w.g();
         throw var33;
      }

      this.w.g();
      this.C.p(var1);
   }

   private void j() {
      u.a var1 = this.x.j(this.n);
      if (var1 == u.a.n) {
         k.c().a(F, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.n}));
         this.i(true);
      } else {
         k.c().a(F, String.format("Status for %s is %s; not doing any work", new Object[]{this.n, var1}));
         this.i(false);
      }

   }

   private void k() {
      if (!this.n()) {
         this.w.c();

         label850: {
            label849: {
               Throwable var10000;
               label856: {
                  p var4;
                  boolean var10001;
                  try {
                     var4 = this.x.l(this.n);
                     this.q = var4;
                  } catch (Throwable var59) {
                     var10000 = var59;
                     var10001 = false;
                     break label856;
                  }

                  if (var4 == null) {
                     label817: {
                        try {
                           k.c().b(F, String.format("Didn't find WorkSpec for id %s", new Object[]{this.n}));
                           this.i(false);
                           this.w.t();
                        } catch (Throwable var55) {
                           var10000 = var55;
                           var10001 = false;
                           break label817;
                        }

                        this.w.g();
                        return;
                     }
                  } else {
                     label859: {
                        try {
                           if (var4.b != u.a.m) {
                              this.j();
                              this.w.t();
                              k.c().a(F, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.q.c}));
                              break label849;
                           }
                        } catch (Throwable var58) {
                           var10000 = var58;
                           var10001 = false;
                           break label859;
                        }

                        label857: {
                           try {
                              if (!var4.d() && !this.q.c()) {
                                 break label857;
                              }
                           } catch (Throwable var61) {
                              var10000 = var61;
                              var10001 = false;
                              break label859;
                           }

                           boolean var1;
                           long var2;
                           label835: {
                              label834: {
                                 try {
                                    var2 = System.currentTimeMillis();
                                    var4 = this.q;
                                    if (var4.n == 0L) {
                                       break label834;
                                    }
                                 } catch (Throwable var60) {
                                    var10000 = var60;
                                    var10001 = false;
                                    break label859;
                                 }

                                 var1 = false;
                                 break label835;
                              }

                              var1 = true;
                           }

                           if (!var1) {
                              try {
                                 if (var2 < var4.a()) {
                                    k.c().a(F, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.q.c}));
                                    this.i(true);
                                    this.w.t();
                                    break label850;
                                 }
                              } catch (Throwable var57) {
                                 var10000 = var57;
                                 var10001 = false;
                                 break label859;
                              }
                           }
                        }

                        try {
                           this.w.t();
                        } catch (Throwable var56) {
                           var10000 = var56;
                           var10001 = false;
                           break label859;
                        }

                        this.w.g();
                        androidx.work.b var62;
                        if (this.q.d()) {
                           var62 = this.q.e;
                        } else {
                           x0.i var5 = this.u.f().b(this.q.d);
                           if (var5 == null) {
                              k.c().b(F, String.format("Could not create Input Merger %s", new Object[]{this.q.d}));
                              this.l();
                              return;
                           }

                           ArrayList var63 = new ArrayList();
                           var63.add(this.q.e);
                           var63.addAll(this.x.p(this.n));
                           var62 = var5.b(var63);
                        }

                        WorkerParameters var64 = new WorkerParameters(UUID.fromString(this.n), var62, this.A, this.p, this.q.k, this.u.e(), this.s, this.u.m(), new g1.p(this.w, this.s), new o(this.w, this.v, this.s));
                        if (this.r == null) {
                           this.r = this.u.m().b(this.m, this.q.c, var64);
                        }

                        ListenableWorker var66 = this.r;
                        if (var66 == null) {
                           k.c().b(F, String.format("Could not create Worker %s", new Object[]{this.q.c}));
                           this.l();
                           return;
                        }

                        if (var66.k()) {
                           k.c().b(F, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.q.c}));
                           this.l();
                           return;
                        }

                        this.r.n();
                        if (this.o()) {
                           if (this.n()) {
                              return;
                           }

                           androidx.work.impl.utils.futures.d var68 = androidx.work.impl.utils.futures.d.t();
                           n var65 = new n(this.m, this.q, this.r, var64.b(), this.s);
                           this.s.a().execute(var65);
                           u3.a var67 = var65.a();
                           var67.d(new Runnable(this, var67, var68) {
                              final u3.a m;
                              final androidx.work.impl.utils.futures.d n;
                              final j o;

                              {
                                 this.o = var1;
                                 this.m = var2;
                                 this.n = var3;
                              }

                              public void run() {
                                 try {
                                    this.m.get();
                                    k.c().a(j.F, String.format("Starting work for %s", new Object[]{this.o.q.c}));
                                    j var1 = this.o;
                                    var1.D = var1.r.o();
                                    this.n.r(this.o.D);
                                 } catch (Throwable var3) {
                                    this.n.q(var3);
                                    return;
                                 }

                              }
                           }, this.s.a());
                           var68.d(new Runnable(this, var68, this.B) {
                              final androidx.work.impl.utils.futures.d m;
                              final String n;
                              final j o;

                              {
                                 this.o = var1;
                                 this.m = var2;
                                 this.n = var3;
                              }

                              @SuppressLint({"SyntheticAccessor"})
                              public void run() {
                                 // $FF: Couldn't be decompiled
                              }
                           }, this.s.c());
                        } else {
                           this.j();
                        }

                        return;
                     }
                  }
               }

               Throwable var69 = var10000;
               this.w.g();
               throw var69;
            }

            this.w.g();
            return;
         }

         this.w.g();
      }
   }

   private void m() {
      this.w.c();

      label161: {
         Throwable var10000;
         label165: {
            long var1;
            boolean var10001;
            Iterator var4;
            try {
               this.x.h(u.a.o, this.n);
               androidx.work.b var3 = ((ListenableWorker.a.c)this.t).e();
               this.x.u(this.n, var3);
               var1 = System.currentTimeMillis();
               var4 = this.y.d(this.n).iterator();
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label165;
            }

            while(true) {
               try {
                  if (!var4.hasNext()) {
                     break;
                  }

                  String var17 = (String)var4.next();
                  if (this.x.j(var17) == u.a.q && this.y.a(var17)) {
                     k.c().d(F, String.format("Setting status to enqueued for %s", new Object[]{var17}));
                     this.x.h(u.a.m, var17);
                     this.x.r(var17, var1);
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label165;
               }
            }

            label145:
            try {
               this.w.t();
               break label161;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label145;
            }
         }

         Throwable var18 = var10000;
         this.w.g();
         this.i(false);
         throw var18;
      }

      this.w.g();
      this.i(false);
   }

   private boolean n() {
      if (this.E) {
         k.c().a(F, String.format("Work interrupted for %s", new Object[]{this.B}));
         u.a var1 = this.x.j(this.n);
         if (var1 == null) {
            this.i(false);
         } else {
            this.i(var1.d() ^ true);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean o() {
      this.w.c();

      boolean var1;
      label120: {
         Throwable var10000;
         label124: {
            boolean var10001;
            u.a var2;
            u.a var3;
            try {
               var2 = this.x.j(this.n);
               var3 = u.a.m;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label124;
            }

            var1 = false;
            if (var2 == var3) {
               try {
                  this.x.h(u.a.n, this.n);
                  this.x.q(this.n);
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label124;
               }

               var1 = true;
            }

            label111:
            try {
               this.w.t();
               break label120;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label111;
            }
         }

         Throwable var16 = var10000;
         this.w.g();
         throw var16;
      }

      this.w.g();
      return var1;
   }

   public u3.a b() {
      return this.C;
   }

   public void d() {
      this.E = true;
      this.n();
      u3.a var2 = this.D;
      boolean var1;
      if (var2 != null) {
         var1 = var2.isDone();
         this.D.cancel(true);
      } else {
         var1 = false;
      }

      ListenableWorker var3 = this.r;
      if (var3 != null && !var1) {
         var3.p();
      } else {
         String var4 = String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.q});
         k.c().a(F, var4);
      }

   }

   void f() {
      if (!this.n()) {
         this.w.c();

         label409: {
            Throwable var10000;
            label415: {
               u.a var1;
               boolean var10001;
               try {
                  var1 = this.x.j(this.n);
                  this.w.C().a(this.n);
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label415;
               }

               if (var1 == null) {
                  try {
                     this.i(false);
                  } catch (Throwable var29) {
                     var10000 = var29;
                     var10001 = false;
                     break label415;
                  }
               } else {
                  label402: {
                     try {
                        if (var1 == u.a.n) {
                           this.c(this.t);
                           break label402;
                        }
                     } catch (Throwable var30) {
                        var10000 = var30;
                        var10001 = false;
                        break label415;
                     }

                     try {
                        if (!var1.d()) {
                           this.g();
                        }
                     } catch (Throwable var28) {
                        var10000 = var28;
                        var10001 = false;
                        break label415;
                     }
                  }
               }

               label391:
               try {
                  this.w.t();
                  break label409;
               } catch (Throwable var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label391;
               }
            }

            Throwable var32 = var10000;
            this.w.g();
            throw var32;
         }

         this.w.g();
      }

      List var33 = this.o;
      if (var33 != null) {
         Iterator var34 = var33.iterator();

         while(var34.hasNext()) {
            ((e)var34.next()).b(this.n);
         }

         f.b(this.u, this.w, this.o);
      }

   }

   void l() {
      this.w.c();

      try {
         this.e(this.n);
         androidx.work.b var1 = ((ListenableWorker.a.a)this.t).e();
         this.x.u(this.n, var1);
         this.w.t();
      } finally {
         this.w.g();
         this.i(false);
      }

   }

   public void run() {
      List var1 = this.z.b(this.n);
      this.A = var1;
      this.B = this.a(var1);
      this.k();
   }

   public static class c {
      Context a;
      ListenableWorker b;
      e1.a c;
      h1.a d;
      androidx.work.a e;
      WorkDatabase f;
      String g;
      List h;
      WorkerParameters.a i = new WorkerParameters.a();

      public c(Context var1, androidx.work.a var2, h1.a var3, e1.a var4, WorkDatabase var5, String var6) {
         this.a = var1.getApplicationContext();
         this.d = var3;
         this.c = var4;
         this.e = var2;
         this.f = var5;
         this.g = var6;
      }

      public j a() {
         return new j(this);
      }

      public c b(WorkerParameters.a var1) {
         if (var1 != null) {
            this.i = var1;
         }

         return this;
      }

      public c c(List var1) {
         this.h = var1;
         return this;
      }
   }
}
