package b2;

import java.lang.ref.WeakReference;

abstract class v extends t {
   private static final WeakReference c = new WeakReference((Object)null);
   private WeakReference b;

   v(byte[] var1) {
      super(var1);
      this.b = c;
   }

   final byte[] l0() {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label176: {
         byte[] var2;
         try {
            var2 = (byte[])this.b.get();
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label176;
         }

         byte[] var1 = var2;
         if (var2 == null) {
            try {
               var1 = this.m0();
               WeakReference var25 = new WeakReference(var1);
               this.b = var25;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label176;
            }
         }

         label165:
         try {
            return var1;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label165;
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

   protected abstract byte[] m0();
}
