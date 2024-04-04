package e2;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public final class d {
   @Nullable
   private final Account a;
   private final Set b;
   private final Set c;
   private final Map d;
   private final int e;
   @Nullable
   private final View f;
   private final String g;
   private final String h;
   private final v2.a i;
   private Integer j;

   public d(@Nullable Account var1, Set var2, Map var3, int var4, @Nullable View var5, String var6, String var7, @Nullable v2.a var8, boolean var9) {
      this.a = var1;
      Set var10;
      if (var2 == null) {
         var10 = Collections.emptySet();
      } else {
         var10 = Collections.unmodifiableSet(var2);
      }

      this.b = var10;
      Map var11 = var3;
      if (var3 == null) {
         var11 = Collections.emptyMap();
      }

      this.d = var11;
      this.f = var5;
      this.e = var4;
      this.g = var6;
      this.h = var7;
      v2.a var13 = var8;
      if (var8 == null) {
         var13 = v2.a.j;
      }

      this.i = var13;
      HashSet var12 = new HashSet(var10);
      Iterator var14 = var11.values().iterator();

      while(var14.hasNext()) {
         var12.addAll(((y)var14.next()).a);
      }

      this.c = Collections.unmodifiableSet(var12);
   }

   public Account a() {
      return this.a;
   }

   public Account b() {
      Account var1 = this.a;
      return var1 != null ? var1 : new Account("<<default account>>", "com.google");
   }

   public Set c() {
      return this.c;
   }

   public String d() {
      return this.g;
   }

   public Set e() {
      return this.b;
   }

   public final v2.a f() {
      return this.i;
   }

   public final Integer g() {
      return this.j;
   }

   public final String h() {
      return this.h;
   }

   public final void i(Integer var1) {
      this.j = var1;
   }

   public static final class a {
      @Nullable
      private Account a;
      private n.b b;
      private String c;
      private String d;
      private v2.a e;

      public a() {
         this.e = v2.a.j;
      }

      public d a() {
         return new d(this.a, this.b, (Map)null, 0, (View)null, this.c, this.d, this.e, false);
      }

      public a b(String var1) {
         this.c = var1;
         return this;
      }

      public final a c(Collection var1) {
         if (this.b == null) {
            this.b = new n.b();
         }

         this.b.addAll(var1);
         return this;
      }

      public final a d(@Nullable Account var1) {
         this.a = var1;
         return this;
      }

      public final a e(String var1) {
         this.d = var1;
         return this;
      }
   }
}
