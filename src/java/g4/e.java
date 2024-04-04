package g4;

import b4.o;
import d4.a0;
import d4.b0;
import e4.g;
import i4.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
   private static final Charset d = Charset.forName("UTF-8");
   private static final int e = 15;
   private static final g f = new g();
   private static final Comparator g = new c();
   private static final FilenameFilter h = new d();
   private final AtomicInteger a = new AtomicInteger(0);
   private final f b;
   private final i c;

   public e(f var1, i var2) {
      this.b = var1;
      this.c = var2;
   }

   private static String A(File var0) {
      byte[] var3 = new byte[8192];
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      FileInputStream var24 = new FileInputStream(var0);

      String var26;
      label191: {
         Throwable var10000;
         while(true) {
            int var1;
            boolean var10001;
            try {
               var1 = var24.read(var3);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break;
            }

            if (var1 > 0) {
               try {
                  var2.write(var3, 0, var1);
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break;
               }
            } else {
               try {
                  var26 = new String(var2.toByteArray(), d);
                  break label191;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var25 = var10000;

         try {
            var24.close();
         } catch (Throwable var20) {
            var25.addSuppressed(var20);
            throw var25;
         }

         throw var25;
      }

      var24.close();
      return var26;
   }

   private void B(File var1, a0.d var2, String var3) {
      try {
         g var8 = f;
         a0 var7 = var8.D(A(var1)).m(var2);
         F(this.b.g(var3), var8.E(var7));
      } catch (IOException var5) {
         y3.f var4 = y3.f.f();
         StringBuilder var6 = new StringBuilder();
         var6.append("Could not synthesize final native report file for ");
         var6.append(var1);
         var4.l(var6.toString(), var5);
      }

   }

   private void C(String var1, long var2) {
      List var7 = this.b.p(var1, h);
      if (var7.isEmpty()) {
         y3.f var19 = y3.f.f();
         StringBuilder var15 = new StringBuilder();
         var15.append("Session ");
         var15.append(var1);
         var15.append(" has no events.");
         var19.i(var15.toString());
      } else {
         Collections.sort(var7);
         ArrayList var6 = new ArrayList();
         Iterator var9 = var7.iterator();

         label48:
         while(true) {
            boolean var4 = false;

            while(true) {
               while(true) {
                  if (!var9.hasNext()) {
                     if (var6.isEmpty()) {
                        y3.f var14 = y3.f.f();
                        StringBuilder var18 = new StringBuilder();
                        var18.append("Could not parse event files for session ");
                        var18.append(var1);
                        var14.k(var18.toString());
                        return;
                     } else {
                        String var17 = c4.g.d(var1, this.b);
                        this.D(this.b.o(var1, "report"), var6, var2, var4, var17);
                        return;
                     }
                  }

                  File var16 = (File)var9.next();

                  boolean var5;
                  label41: {
                     IOException var10000;
                     label53: {
                        boolean var10001;
                        try {
                           var6.add(f.g(A(var16)));
                        } catch (IOException var13) {
                           var10000 = var13;
                           var10001 = false;
                           break label53;
                        }

                        if (var4) {
                           break;
                        }

                        try {
                           var5 = s(var16.getName());
                           break label41;
                        } catch (IOException var12) {
                           var10000 = var12;
                           var10001 = false;
                        }
                     }

                     IOException var11 = var10000;
                     y3.f var8 = y3.f.f();
                     StringBuilder var10 = new StringBuilder();
                     var10.append("Could not add event to report for ");
                     var10.append(var16);
                     var8.l(var10.toString(), var11);
                     continue;
                  }

                  if (!var5) {
                     continue label48;
                  }
                  break;
               }

               var4 = true;
            }
         }
      }
   }

   private void D(File var1, List var2, long var3, boolean var5, String var6) {
      IOException var10000;
      label40: {
         g var7;
         a0.e var12;
         a0 var15;
         boolean var10001;
         try {
            var7 = f;
            var15 = var7.D(A(var1)).n(var3, var5, var6).l(b0.d(var2));
            var12 = var15.j();
         } catch (IOException var11) {
            var10000 = var11;
            var10001 = false;
            break label40;
         }

         if (var12 == null) {
            return;
         }

         File var13;
         if (var5) {
            try {
               var13 = this.b.j(var12.h());
            } catch (IOException var10) {
               var10000 = var10;
               var10001 = false;
               break label40;
            }
         } else {
            try {
               var13 = this.b.l(var12.h());
            } catch (IOException var9) {
               var10000 = var9;
               var10001 = false;
               break label40;
            }
         }

         try {
            F(var13, var7.E(var15));
            return;
         } catch (IOException var8) {
            var10000 = var8;
            var10001 = false;
         }
      }

      IOException var14 = var10000;
      y3.f var16 = y3.f.f();
      StringBuilder var17 = new StringBuilder();
      var17.append("Could not synthesize final report file for ");
      var17.append(var1);
      var16.l(var17.toString(), var14);
   }

   private int E(String var1, int var2) {
      List var3 = this.b.p(var1, new a());
      Collections.sort(var3, new b());
      return f(var3, var2);
   }

   private static void F(File var0, String var1) {
      OutputStreamWriter var2 = new OutputStreamWriter(new FileOutputStream(var0), d);

      try {
         var2.write(var1);
      } catch (Throwable var8) {
         try {
            var2.close();
         } catch (Throwable var7) {
            var8.addSuppressed(var7);
            throw var8;
         }

         throw var8;
      }

      var2.close();
   }

   private static void G(File var0, String var1, long var2) {
      OutputStreamWriter var4 = new OutputStreamWriter(new FileOutputStream(var0), d);

      try {
         var4.write(var1);
         var0.setLastModified(h(var2));
      } catch (Throwable var10) {
         try {
            var4.close();
         } catch (Throwable var9) {
            var10.addSuppressed(var9);
            throw var10;
         }

         throw var10;
      }

      var4.close();
   }

   // $FF: synthetic method
   public static int a(File var0, File var1) {
      return u(var0, var1);
   }

   // $FF: synthetic method
   public static boolean b(File var0, String var1) {
      return t(var0, var1);
   }

   // $FF: synthetic method
   public static int c(File var0, File var1) {
      return x(var0, var1);
   }

   // $FF: synthetic method
   public static boolean d(File var0, String var1) {
      return v(var0, var1);
   }

   private SortedSet e(String var1) {
      this.b.b();
      SortedSet var2 = this.p();
      if (var1 != null) {
         var2.remove(var1);
      }

      if (var2.size() <= 8) {
         return var2;
      } else {
         while(var2.size() > 8) {
            String var3 = (String)var2.last();
            y3.f var5 = y3.f.f();
            StringBuilder var4 = new StringBuilder();
            var4.append("Removing session over cap: ");
            var4.append(var3);
            var5.b(var4.toString());
            this.b.c(var3);
            var2.remove(var3);
         }

         return var2;
      }
   }

   private static int f(List var0, int var1) {
      int var2 = var0.size();

      for(Iterator var4 = var0.iterator(); var4.hasNext(); --var2) {
         File var3 = (File)var4.next();
         if (var2 <= var1) {
            return var2;
         }

         g4.f.s(var3);
      }

      return var2;
   }

   private void g() {
      int var1 = this.c.b().a.b;
      List var3 = this.n();
      int var2 = var3.size();
      if (var2 > var1) {
         Iterator var4 = var3.subList(var1, var2).iterator();

         while(var4.hasNext()) {
            ((File)var4.next()).delete();
         }

      }
   }

   private static long h(long var0) {
      return var0 * 1000L;
   }

   private void j(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         ((File)var2.next()).delete();
      }

   }

   private static String m(int var0, boolean var1) {
      String var3 = String.format(Locale.US, "%010d", new Object[]{var0});
      String var2;
      if (var1) {
         var2 = "_";
      } else {
         var2 = "";
      }

      StringBuilder var4 = new StringBuilder();
      var4.append("event");
      var4.append(var3);
      var4.append(var2);
      return var4.toString();
   }

   private List n() {
      ArrayList var3 = new ArrayList();
      var3.addAll(this.b.k());
      var3.addAll(this.b.h());
      Comparator var1 = g;
      Collections.sort(var3, var1);
      List var2 = this.b.m();
      Collections.sort(var2, var1);
      var3.addAll(var2);
      return var3;
   }

   private static String o(String var0) {
      return var0.substring(0, e);
   }

   private static boolean s(String var0) {
      boolean var1;
      if (var0.startsWith("event") && var0.endsWith("_")) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static boolean t(File var0, String var1) {
      boolean var2;
      if (var1.startsWith("event") && !var1.endsWith("_")) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   // $FF: synthetic method
   private static int u(File var0, File var1) {
      return var1.getName().compareTo(var0.getName());
   }

   // $FF: synthetic method
   private static boolean v(File var0, String var1) {
      return var1.startsWith("event");
   }

   private static int x(File var0, File var1) {
      return o(var0.getName()).compareTo(o(var1.getName()));
   }

   public void i() {
      this.j(this.b.m());
      this.j(this.b.k());
      this.j(this.b.h());
   }

   public void k(String var1, long var2) {
      Iterator var4 = this.e(var1).iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         y3.f var7 = y3.f.f();
         StringBuilder var6 = new StringBuilder();
         var6.append("Finalizing report for session ");
         var6.append(var5);
         var7.i(var6.toString());
         this.C(var5, var2);
         this.b.c(var5);
      }

      this.g();
   }

   public void l(String var1, a0.d var2) {
      File var5 = this.b.o(var1, "report");
      y3.f var3 = y3.f.f();
      StringBuilder var4 = new StringBuilder();
      var4.append("Writing native session report for ");
      var4.append(var1);
      var4.append(" to file: ");
      var4.append(var5);
      var3.b(var4.toString());
      this.B(var5, var2, var1);
   }

   public SortedSet p() {
      return (new TreeSet(this.b.d())).descendingSet();
   }

   public long q(String var1) {
      return this.b.o(var1, "start-time").lastModified();
   }

   public boolean r() {
      boolean var1;
      if (this.b.m().isEmpty() && this.b.k().isEmpty() && this.b.h().isEmpty()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public List w() {
      List var2 = this.n();
      ArrayList var1 = new ArrayList();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         File var4 = (File)var3.next();

         try {
            var1.add(o.a(f.D(A(var4)), var4.getName(), var4));
         } catch (IOException var7) {
            y3.f var6 = y3.f.f();
            StringBuilder var8 = new StringBuilder();
            var8.append("Could not load report file ");
            var8.append(var4);
            var8.append("; deleting");
            var6.l(var8.toString(), var7);
            var4.delete();
         }
      }

      return var1;
   }

   public void y(a0.e.d var1, String var2, boolean var3) {
      int var4 = this.c.b().a.a;
      String var5 = f.h(var1);
      String var9 = m(this.a.getAndIncrement(), var3);

      try {
         F(this.b.o(var2, var9), var5);
      } catch (IOException var7) {
         y3.f var8 = y3.f.f();
         StringBuilder var6 = new StringBuilder();
         var6.append("Could not persist event for session ");
         var6.append(var2);
         var8.l(var6.toString(), var7);
      }

      this.E(var2, var4);
   }

   public void z(a0 var1) {
      a0.e var3 = var1.j();
      if (var3 == null) {
         y3.f.f().b("Could not get session for report");
      } else {
         String var2 = var3.h();

         try {
            String var7 = f.E(var1);
            F(this.b.o(var2, "report"), var7);
            G(this.b.o(var2, "start-time"), "", var3.k());
         } catch (IOException var5) {
            y3.f var6 = y3.f.f();
            StringBuilder var8 = new StringBuilder();
            var8.append("Could not persist report for session ");
            var8.append(var2);
            var6.c(var8.toString(), var5);
         }

      }
   }
}
