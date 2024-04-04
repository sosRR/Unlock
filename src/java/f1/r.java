package f1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class r implements q {
   private final androidx.room.h a;
   private final m0.a b;
   private final m0.d c;
   private final m0.d d;
   private final m0.d e;
   private final m0.d f;
   private final m0.d g;
   private final m0.d h;
   private final m0.d i;
   private final m0.d j;

   public r(androidx.room.h var1) {
      this.a = var1;
      this.b = new r$b(this, var1);
      this.c = new m0.d(this, var1) {
         final r d;

         {
            this.d = var1;
         }

         public String d() {
            return "DELETE FROM workspec WHERE id=?";
         }
      };
      this.d = new m0.d(this, var1) {
         final r d;

         {
            this.d = var1;
         }

         public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
         }
      };
      this.e = new m0.d(this, var1) {
         final r d;

         {
            this.d = var1;
         }

         public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
         }
      };
      this.f = new m0.d(this, var1) {
         final r d;

         {
            this.d = var1;
         }

         public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
         }
      };
      this.g = new m0.d(this, var1) {
         final r d;

         {
            this.d = var1;
         }

         public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
         }
      };
      this.h = new m0.d(this, var1) {
         final r d;

         {
            this.d = var1;
         }

         public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
         }
      };
      this.i = new m0.d(this, var1) {
         final r d;

         {
            this.d = var1;
         }

         public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
         }
      };
      this.j = new m0.d(this, var1) {
         final r d;

         {
            this.d = var1;
         }

         public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
         }
      };
   }

   // $FF: synthetic method
   static void A(r var0, n.a var1) {
      var0.w(var1);
   }

   private void w(n.a var1) {
      Set var8 = var1.keySet();
      if (!var8.isEmpty()) {
         int var2;
         if (var1.size() > 999) {
            n.a var25 = new n.a(999);
            int var6 = var1.size();
            int var3 = 0;
            var2 = 0;

            while(var3 < var6) {
               var25.put((String)var1.i(var3), (ArrayList)var1.m(var3));
               int var4 = var3 + 1;
               int var5 = var2 + 1;
               var3 = var4;
               var2 = var5;
               if (var5 == 999) {
                  this.w(var25);
                  var25 = new n.a(999);
                  var2 = 0;
                  var3 = var4;
               }
            }

            if (var2 > 0) {
               this.w(var25);
            }

         } else {
            StringBuilder var7 = o0.e.b();
            var7.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            var2 = var8.size();
            o0.e.a(var7, var2);
            var7.append(")");
            m0.c var23 = m0.c.g(var7.toString(), var2 + 0);
            Iterator var26 = var8.iterator();

            for(var2 = 1; var26.hasNext(); ++var2) {
               String var9 = (String)var26.next();
               if (var9 == null) {
                  var23.q(var2);
               } else {
                  var23.j(var2, var9);
               }
            }

            Cursor var24 = o0.c.b(this.a, var23, false, (CancellationSignal)null);

            label312: {
               Throwable var10000;
               label323: {
                  boolean var10001;
                  try {
                     var2 = o0.b.b(var24, "work_spec_id");
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label323;
                  }

                  if (var2 == -1) {
                     var24.close();
                     return;
                  }

                  while(true) {
                     ArrayList var27;
                     try {
                        do {
                           if (!var24.moveToNext()) {
                              break label312;
                           }
                        } while(var24.isNull(var2));

                        var27 = (ArrayList)var1.get(var24.getString(var2));
                     } catch (Throwable var20) {
                        var10000 = var20;
                        var10001 = false;
                        break;
                     }

                     if (var27 != null) {
                        try {
                           var27.add(androidx.work.b.g(var24.getBlob(0)));
                        } catch (Throwable var19) {
                           var10000 = var19;
                           var10001 = false;
                           break;
                        }
                     }
                  }
               }

               Throwable var22 = var10000;
               var24.close();
               throw var22;
            }

            var24.close();
         }
      }
   }

   private void x(n.a var1) {
      Set var8 = var1.keySet();
      if (!var8.isEmpty()) {
         int var2;
         if (var1.size() > 999) {
            n.a var25 = new n.a(999);
            int var6 = var1.size();
            int var3 = 0;
            var2 = 0;

            while(var3 < var6) {
               var25.put((String)var1.i(var3), (ArrayList)var1.m(var3));
               int var4 = var3 + 1;
               int var5 = var2 + 1;
               var3 = var4;
               var2 = var5;
               if (var5 == 999) {
                  this.x(var25);
                  var25 = new n.a(999);
                  var2 = 0;
                  var3 = var4;
               }
            }

            if (var2 > 0) {
               this.x(var25);
            }

         } else {
            StringBuilder var7 = o0.e.b();
            var7.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            var2 = var8.size();
            o0.e.a(var7, var2);
            var7.append(")");
            m0.c var23 = m0.c.g(var7.toString(), var2 + 0);
            Iterator var26 = var8.iterator();

            for(var2 = 1; var26.hasNext(); ++var2) {
               String var9 = (String)var26.next();
               if (var9 == null) {
                  var23.q(var2);
               } else {
                  var23.j(var2, var9);
               }
            }

            Cursor var24 = o0.c.b(this.a, var23, false, (CancellationSignal)null);

            label312: {
               Throwable var10000;
               label323: {
                  boolean var10001;
                  try {
                     var2 = o0.b.b(var24, "work_spec_id");
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label323;
                  }

                  if (var2 == -1) {
                     var24.close();
                     return;
                  }

                  while(true) {
                     ArrayList var27;
                     try {
                        do {
                           if (!var24.moveToNext()) {
                              break label312;
                           }
                        } while(var24.isNull(var2));

                        var27 = (ArrayList)var1.get(var24.getString(var2));
                     } catch (Throwable var20) {
                        var10000 = var20;
                        var10001 = false;
                        break;
                     }

                     if (var27 != null) {
                        try {
                           var27.add(var24.getString(0));
                        } catch (Throwable var19) {
                           var10000 = var19;
                           var10001 = false;
                           break;
                        }
                     }
                  }
               }

               Throwable var22 = var10000;
               var24.close();
               throw var22;
            }

            var24.close();
         }
      }
   }

   // $FF: synthetic method
   static androidx.room.h y(r var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static void z(r var0, n.a var1) {
      var0.x(var1);
   }

   public void a(String var1) {
      this.a.b();
      q0.f var2 = this.c.a();
      if (var1 == null) {
         var2.q(1);
      } else {
         var2.j(1, var1);
      }

      this.a.c();

      try {
         var2.n();
         this.a.t();
      } finally {
         this.a.g();
         this.c.f(var2);
      }

   }

   public List b() {
      // $FF: Couldn't be decompiled
   }

   public List c() {
      m0.c var2 = m0.c.g("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
      this.a.b();
      Cursor var1 = o0.c.b(this.a, var2, false, (CancellationSignal)null);

      ArrayList var3;
      label78: {
         Throwable var10000;
         label77: {
            boolean var10001;
            try {
               var3 = new ArrayList(var1.getCount());
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label77;
            }

            while(true) {
               try {
                  if (!var1.moveToNext()) {
                     break label78;
                  }

                  var3.add(var1.getString(0));
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var10 = var10000;
         var1.close();
         var2.x();
         throw var10;
      }

      var1.close();
      var2.x();
      return var3;
   }

   public boolean d() {
      boolean var3 = false;
      m0.c var5 = m0.c.g("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
      this.a.b();
      Cursor var6 = o0.c.b(this.a, var5, false, (CancellationSignal)null);
      boolean var2 = var3;
      boolean var8 = false;

      label39: {
         int var1;
         try {
            var8 = true;
            if (!var6.moveToFirst()) {
               var8 = false;
               break label39;
            }

            var1 = var6.getInt(0);
            var8 = false;
         } finally {
            if (var8) {
               var6.close();
               var5.x();
            }
         }

         var2 = var3;
         if (var1 != 0) {
            var2 = true;
         }
      }

      var6.close();
      var5.x();
      return var2;
   }

   public int e(String var1, long var2) {
      this.a.b();
      q0.f var5 = this.h.a();
      var5.B(1, var2);
      if (var1 == null) {
         var5.q(2);
      } else {
         var5.j(2, var1);
      }

      this.a.c();

      int var4;
      try {
         var4 = var5.n();
         this.a.t();
      } finally {
         this.a.g();
         this.h.f(var5);
      }

      return var4;
   }

   public List f(String var1) {
      m0.c var2 = m0.c.g("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
      if (var1 == null) {
         var2.q(1);
      } else {
         var2.j(1, var1);
      }

      this.a.b();
      Cursor var10 = o0.c.b(this.a, var2, false, (CancellationSignal)null);

      ArrayList var3;
      label93: {
         Throwable var10000;
         label92: {
            boolean var10001;
            try {
               var3 = new ArrayList(var10.getCount());
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label92;
            }

            while(true) {
               try {
                  if (!var10.moveToNext()) {
                     break label93;
                  }

                  var3.add(var10.getString(0));
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var11 = var10000;
         var10.close();
         var2.x();
         throw var11;
      }

      var10.close();
      var2.x();
      return var3;
   }

   public List g(String var1) {
      m0.c var4 = m0.c.g("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
      if (var1 == null) {
         var4.q(1);
      } else {
         var4.j(1, var1);
      }

      this.a.b();
      Cursor var13 = o0.c.b(this.a, var4, false, (CancellationSignal)null);

      ArrayList var6;
      label93: {
         Throwable var10000;
         label92: {
            int var2;
            int var3;
            boolean var10001;
            try {
               var3 = o0.b.c(var13, "id");
               var2 = o0.b.c(var13, "state");
               var6 = new ArrayList(var13.getCount());
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label92;
            }

            while(true) {
               try {
                  if (!var13.moveToNext()) {
                     break label93;
                  }

                  p.b var14 = new p.b();
                  var14.a = var13.getString(var3);
                  var14.b = v.g(var13.getInt(var2));
                  var6.add(var14);
               } catch (Throwable var11) {
                  var10000 = var11;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var5 = var10000;
         var13.close();
         var4.x();
         throw var5;
      }

      var13.close();
      var4.x();
      return var6;
   }

   public int h(x0.u.a var1, String... var2) {
      this.a.b();
      StringBuilder var6 = o0.e.b();
      var6.append("UPDATE workspec SET state=");
      var6.append("?");
      var6.append(" WHERE id IN (");
      o0.e.a(var6, var2.length);
      var6.append(")");
      String var10 = var6.toString();
      q0.f var11 = this.a.d(var10);
      var11.B(1, (long)v.j(var1));
      int var5 = var2.length;
      int var4 = 2;

      int var3;
      for(var3 = 0; var3 < var5; ++var3) {
         String var9 = var2[var3];
         if (var9 == null) {
            var11.q(var4);
         } else {
            var11.j(var4, var9);
         }

         ++var4;
      }

      this.a.c();

      try {
         var3 = var11.n();
         this.a.t();
      } finally {
         this.a.g();
      }

      return var3;
   }

   public List i(long param1) {
      // $FF: Couldn't be decompiled
   }

   public x0.u.a j(String var1) {
      m0.c var2 = m0.c.g("SELECT state FROM workspec WHERE id=?", 1);
      if (var1 == null) {
         var2.q(1);
      } else {
         var2.j(1, var1);
      }

      this.a.b();
      androidx.room.h var3 = this.a;
      x0.u.a var6 = null;
      Cursor var7 = o0.c.b(var3, var2, false, (CancellationSignal)null);

      try {
         if (var7.moveToFirst()) {
            var6 = v.g(var7.getInt(0));
         }
      } finally {
         var7.close();
         var2.x();
      }

      return var6;
   }

   public List k(int param1) {
      // $FF: Couldn't be decompiled
   }

   public p l(String param1) {
      // $FF: Couldn't be decompiled
   }

   public int m(String var1) {
      this.a.b();
      q0.f var3 = this.g.a();
      if (var1 == null) {
         var3.q(1);
      } else {
         var3.j(1, var1);
      }

      this.a.c();

      int var2;
      try {
         var2 = var3.n();
         this.a.t();
      } finally {
         this.a.g();
         this.g.f(var3);
      }

      return var2;
   }

   public void n(p var1) {
      this.a.b();
      this.a.c();

      try {
         this.b.h(var1);
         this.a.t();
      } finally {
         this.a.g();
      }

   }

   public LiveData o(List var1) {
      StringBuilder var3 = o0.e.b();
      var3.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
      int var2 = var1.size();
      o0.e.a(var3, var2);
      var3.append(")");
      m0.c var7 = m0.c.g(var3.toString(), var2 + 0);
      Iterator var4 = var1.iterator();

      for(var2 = 1; var4.hasNext(); ++var2) {
         String var5 = (String)var4.next();
         if (var5 == null) {
            var7.q(var2);
         } else {
            var7.j(var2, var5);
         }
      }

      androidx.room.e var6 = this.a.i();
      r$a var8 = new r$a(this, var7);
      return var6.d(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, var8);
   }

   public List p(String var1) {
      m0.c var2 = m0.c.g("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
      if (var1 == null) {
         var2.q(1);
      } else {
         var2.j(1, var1);
      }

      this.a.b();
      Cursor var10 = o0.c.b(this.a, var2, false, (CancellationSignal)null);

      ArrayList var3;
      label93: {
         Throwable var10000;
         label92: {
            boolean var10001;
            try {
               var3 = new ArrayList(var10.getCount());
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label92;
            }

            while(true) {
               try {
                  if (!var10.moveToNext()) {
                     break label93;
                  }

                  var3.add(androidx.work.b.g(var10.getBlob(0)));
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var11 = var10000;
         var10.close();
         var2.x();
         throw var11;
      }

      var10.close();
      var2.x();
      return var3;
   }

   public int q(String var1) {
      this.a.b();
      q0.f var3 = this.f.a();
      if (var1 == null) {
         var3.q(1);
      } else {
         var3.j(1, var1);
      }

      this.a.c();

      int var2;
      try {
         var2 = var3.n();
         this.a.t();
      } finally {
         this.a.g();
         this.f.f(var3);
      }

      return var2;
   }

   public void r(String var1, long var2) {
      this.a.b();
      q0.f var4 = this.e.a();
      var4.B(1, var2);
      if (var1 == null) {
         var4.q(2);
      } else {
         var4.j(2, var1);
      }

      this.a.c();

      try {
         var4.n();
         this.a.t();
      } finally {
         this.a.g();
         this.e.f(var4);
      }

   }

   public List s() {
      // $FF: Couldn't be decompiled
   }

   public List t(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void u(String var1, androidx.work.b var2) {
      this.a.b();
      q0.f var3 = this.d.a();
      byte[] var6 = androidx.work.b.m(var2);
      if (var6 == null) {
         var3.q(1);
      } else {
         var3.F(1, var6);
      }

      if (var1 == null) {
         var3.q(2);
      } else {
         var3.j(2, var1);
      }

      this.a.c();

      try {
         var3.n();
         this.a.t();
      } finally {
         this.a.g();
         this.d.f(var3);
      }

   }

   public int v() {
      this.a.b();
      q0.f var3 = this.i.a();
      this.a.c();

      int var1;
      try {
         var1 = var3.n();
         this.a.t();
      } finally {
         this.a.g();
         this.i.f(var3);
      }

      return var1;
   }
}
