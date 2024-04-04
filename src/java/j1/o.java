package j1;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class o {
   public static a a() {
      return new i.b();
   }

   public abstract b b();

   public abstract c c();

   @Builder
   public abstract static class a {
      public abstract o a();

      public abstract a b(b var1);

      public abstract a c(c var1);
   }

   public static enum b {
      A,
      B,
      C,
      D,
      E,
      F,
      G,
      H;

      private static final SparseArray I;
      private static final b[] J;
      n,
      o,
      p,
      q,
      r,
      s,
      t,
      u,
      v,
      w,
      x,
      y,
      z;

      private final int m;

      static {
         b var6 = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
         n = var6;
         b var2 = new b("GPRS", 1, 1);
         o = var2;
         b var5 = new b("EDGE", 2, 2);
         p = var5;
         b var15 = new b("UMTS", 3, 3);
         q = var15;
         b var17 = new b("CDMA", 4, 4);
         r = var17;
         b var18 = new b("EVDO_0", 5, 5);
         s = var18;
         b var7 = new b("EVDO_A", 6, 6);
         t = var7;
         b var1 = new b("RTT", 7, 7);
         u = var1;
         b var4 = new b("HSDPA", 8, 8);
         v = var4;
         b var10 = new b("HSUPA", 9, 9);
         w = var10;
         b var8 = new b("HSPA", 10, 10);
         x = var8;
         b var12 = new b("IDEN", 11, 11);
         y = var12;
         b var0 = new b("EVDO_B", 12, 12);
         z = var0;
         b var3 = new b("LTE", 13, 13);
         A = var3;
         b var19 = new b("EHRPD", 14, 14);
         B = var19;
         b var13 = new b("HSPAP", 15, 15);
         C = var13;
         b var16 = new b("GSM", 16, 16);
         D = var16;
         b var11 = new b("TD_SCDMA", 17, 17);
         E = var11;
         b var14 = new b("IWLAN", 18, 18);
         F = var14;
         b var9 = new b("LTE_CA", 19, 19);
         G = var9;
         b var20 = new b("COMBINED", 20, 100);
         H = var20;
         J = new b[]{var6, var2, var5, var15, var17, var18, var7, var1, var4, var10, var8, var12, var0, var3, var19, var13, var16, var11, var14, var9, var20};
         SparseArray var21 = new SparseArray();
         I = var21;
         var21.put(0, var6);
         var21.put(1, var2);
         var21.put(2, var5);
         var21.put(3, var15);
         var21.put(4, var17);
         var21.put(5, var18);
         var21.put(6, var7);
         var21.put(7, var1);
         var21.put(8, var4);
         var21.put(9, var10);
         var21.put(10, var8);
         var21.put(11, var12);
         var21.put(12, var0);
         var21.put(13, var3);
         var21.put(14, var19);
         var21.put(15, var13);
         var21.put(16, var16);
         var21.put(17, var11);
         var21.put(18, var14);
         var21.put(19, var9);
      }

      private b(int var3) {
         this.m = var3;
      }

      public static b d(int var0) {
         return (b)I.get(var0);
      }

      public int e() {
         return this.m;
      }
   }

   public static enum c {
      A,
      B,
      C,
      D,
      E,
      F;

      private static final SparseArray G;
      private static final c[] H;
      n,
      o,
      p,
      q,
      r,
      s,
      t,
      u,
      v,
      w,
      x,
      y,
      z;

      private final int m;

      static {
         c var14 = new c("MOBILE", 0, 0);
         n = var14;
         c var10 = new c("WIFI", 1, 1);
         o = var10;
         c var2 = new c("MOBILE_MMS", 2, 2);
         p = var2;
         c var4 = new c("MOBILE_SUPL", 3, 3);
         q = var4;
         c var16 = new c("MOBILE_DUN", 4, 4);
         r = var16;
         c var8 = new c("MOBILE_HIPRI", 5, 5);
         s = var8;
         c var18 = new c("WIMAX", 6, 6);
         t = var18;
         c var6 = new c("BLUETOOTH", 7, 7);
         u = var6;
         c var12 = new c("DUMMY", 8, 8);
         v = var12;
         c var5 = new c("ETHERNET", 9, 9);
         w = var5;
         c var19 = new c("MOBILE_FOTA", 10, 10);
         x = var19;
         c var17 = new c("MOBILE_IMS", 11, 11);
         y = var17;
         c var1 = new c("MOBILE_CBS", 12, 12);
         z = var1;
         c var13 = new c("WIFI_P2P", 13, 13);
         A = var13;
         c var9 = new c("MOBILE_IA", 14, 14);
         B = var9;
         c var3 = new c("MOBILE_EMERGENCY", 15, 15);
         C = var3;
         c var11 = new c("PROXY", 16, 16);
         D = var11;
         c var15 = new c("VPN", 17, 17);
         E = var15;
         c var0 = new c("NONE", 18, -1);
         F = var0;
         H = new c[]{var14, var10, var2, var4, var16, var8, var18, var6, var12, var5, var19, var17, var1, var13, var9, var3, var11, var15, var0};
         SparseArray var7 = new SparseArray();
         G = var7;
         var7.put(0, var14);
         var7.put(1, var10);
         var7.put(2, var2);
         var7.put(3, var4);
         var7.put(4, var16);
         var7.put(5, var8);
         var7.put(6, var18);
         var7.put(7, var6);
         var7.put(8, var12);
         var7.put(9, var5);
         var7.put(10, var19);
         var7.put(11, var17);
         var7.put(12, var1);
         var7.put(13, var13);
         var7.put(14, var9);
         var7.put(15, var3);
         var7.put(16, var11);
         var7.put(17, var15);
         var7.put(-1, var0);
      }

      private c(int var3) {
         this.m = var3;
      }

      public static c d(int var0) {
         return (c)G.get(var0);
      }

      public int e() {
         return this.m;
      }
   }
}
