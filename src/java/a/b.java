package a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
   public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
      public b a(Parcel var1) {
         return new b(var1);
      }

      public b[] b(int var1) {
         return new b[var1];
      }
   };
   final boolean m = false;
   final Handler n = null;
   a o;

   b(Parcel var1) {
      this.o = null.f(var1.readStrongBinder());
   }

   protected void a(int var1, Bundle var2) {
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (this.o == null) {
               <undefinedtype> var3 = new <undefinedtype>(this) {
                  final b a;

                  {
                     this.a = var1;
                  }

                  public void h0(int var1, Bundle var2) {
                     b var4 = this.a;
                     Handler var3 = var4.n;
                     if (var3 != null) {
                        var3.post(var4.new c(var4, var1, var2));
                     } else {
                        var4.a(var1, var2);
                     }

                  }
               };
               this.o = var3;
            }
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            var1.writeStrongBinder(this.o.asBinder());
            return;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var17 = var10000;

         try {
            throw var17;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            continue;
         }
      }
   }

   class c implements Runnable {
      final int m;
      final Bundle n;
      final b o;

      c(b var1, int var2, Bundle var3) {
         this.o = var1;
         this.m = var2;
         this.n = var3;
      }

      public void run() {
         this.o.a(this.m, this.n);
      }
   }
}
