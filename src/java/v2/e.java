package v2;

import com.google.android.gms.common.api.Scope;

public final class e {
   public static final com.google.android.gms.common.api.a.g a;
   public static final com.google.android.gms.common.api.a.g b;
   public static final com.google.android.gms.common.api.a.a c;
   static final com.google.android.gms.common.api.a.a d;
   public static final Scope e;
   public static final Scope f;
   public static final com.google.android.gms.common.api.a g;
   public static final com.google.android.gms.common.api.a h;

   static {
      com.google.android.gms.common.api.a.g var0 = new com.google.android.gms.common.api.a.g();
      a = var0;
      com.google.android.gms.common.api.a.g var2 = new com.google.android.gms.common.api.a.g();
      b = var2;
      b var1 = new b();
      c = var1;
      c var3 = new c();
      d = var3;
      e = new Scope("profile");
      f = new Scope("email");
      g = new com.google.android.gms.common.api.a("SignIn.API", var1, var0);
      h = new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", var3, var2);
   }
}
