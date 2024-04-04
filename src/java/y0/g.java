package y0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x0.k;
import x0.n;
import x0.t;
import x0.w;

public class g extends t {
   private static final String j = k.f("WorkContinuationImpl");
   private final i a;
   private final String b;
   private final x0.e c;
   private final List d;
   private final List e;
   private final List f;
   private final List g;
   private boolean h;
   private n i;

   public g(i var1, String var2, x0.e var3, List var4) {
      this(var1, var2, var3, var4, (List)null);
   }

   public g(i var1, String var2, x0.e var3, List var4, List var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.g = var5;
      this.e = new ArrayList(var4.size());
      this.f = new ArrayList();
      if (var5 != null) {
         Iterator var7 = var5.iterator();

         while(var7.hasNext()) {
            g var9 = (g)var7.next();
            this.f.addAll(var9.f);
         }
      }

      for(int var6 = 0; var6 < var4.size(); ++var6) {
         String var8 = ((w)var4.get(var6)).b();
         this.e.add(var8);
         this.f.add(var8);
      }

   }

   public g(i var1, List var2) {
      this(var1, (String)null, x0.e.n, var2, (List)null);
   }

   private static boolean i(g var0, Set var1) {
      var1.addAll(var0.c());
      Set var3 = l(var0);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         if (var3.contains((String)var2.next())) {
            return true;
         }
      }

      List var4 = var0.e();
      if (var4 != null && !var4.isEmpty()) {
         var2 = var4.iterator();

         while(var2.hasNext()) {
            if (i((g)var2.next(), var1)) {
               return true;
            }
         }
      }

      var1.removeAll(var0.c());
      return false;
   }

   public static Set l(g var0) {
      HashSet var1 = new HashSet();
      List var2 = var0.e();
      if (var2 != null && !var2.isEmpty()) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            var1.addAll(((g)var3.next()).c());
         }
      }

      return var1;
   }

   public n a() {
      if (!this.h) {
         g1.b var1 = new g1.b(this);
         this.a.t().b(var1);
         this.i = var1.d();
      } else {
         k.c().h(j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.e)}));
      }

      return this.i;
   }

   public x0.e b() {
      return this.c;
   }

   public List c() {
      return this.e;
   }

   public String d() {
      return this.b;
   }

   public List e() {
      return this.g;
   }

   public List f() {
      return this.d;
   }

   public i g() {
      return this.a;
   }

   public boolean h() {
      return i(this, new HashSet());
   }

   public boolean j() {
      return this.h;
   }

   public void k() {
      this.h = true;
   }
}
