package a2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class h implements Parcelable {
   public static final Parcelable.Creator CREATOR = new f();
   Messenger m;

   public h(IBinder var1) {
      this.m = new Messenger(var1);
   }

   public final IBinder a() {
      Messenger var1 = this.m;
      var1.getClass();
      return var1.getBinder();
   }

   public final void b(Message var1) {
      Messenger var2 = this.m;
      var2.getClass();
      var2.send(var1);
   }

   public final int describeContents() {
      return 0;
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else {
         try {
            boolean var2 = this.a().equals(((h)var1).a());
            return var2;
         } catch (ClassCastException var3) {
            return false;
         }
      }
   }

   public final int hashCode() {
      return this.a().hashCode();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      Messenger var3 = this.m;
      var3.getClass();
      var1.writeStrongBinder(var3.getBinder());
   }
}
