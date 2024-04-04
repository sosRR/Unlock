package b2;

import android.os.RemoteException;
import android.util.Log;
import e2.o1;
import e2.p1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class t extends o1 {
   private final int a;

   protected t(byte[] var1) {
      boolean var2;
      if (var1.length == 25) {
         var2 = true;
      } else {
         var2 = false;
      }

      e2.n.a(var2);
      this.a = Arrays.hashCode(var1);
   }

   protected static byte[] m(String var0) {
      try {
         byte[] var2 = var0.getBytes("ISO-8859-1");
         return var2;
      } catch (UnsupportedEncodingException var1) {
         throw new AssertionError(var1);
      }
   }

   public final int c() {
      return this.a;
   }

   public final l2.a d() {
      return l2.b.l0(this.l0());
   }

   public final boolean equals(Object var1) {
      if (var1 != null && var1 instanceof p1) {
         RemoteException var10000;
         label45: {
            boolean var10001;
            p1 var6;
            try {
               var6 = (p1)var1;
               if (var6.c() != this.a) {
                  return false;
               }
            } catch (RemoteException var5) {
               var10000 = var5;
               var10001 = false;
               break label45;
            }

            l2.a var7;
            try {
               var7 = var6.d();
            } catch (RemoteException var4) {
               var10000 = var4;
               var10001 = false;
               break label45;
            }

            if (var7 == null) {
               return false;
            }

            try {
               byte[] var9 = (byte[])l2.b.m(var7);
               boolean var2 = Arrays.equals(this.l0(), var9);
               return var2;
            } catch (RemoteException var3) {
               var10000 = var3;
               var10001 = false;
            }
         }

         RemoteException var8 = var10000;
         Log.e("GoogleCertificates", "Failed to get Google certificates from remote", var8);
      }

      return false;
   }

   public final int hashCode() {
      return this.a;
   }

   abstract byte[] l0();
}
