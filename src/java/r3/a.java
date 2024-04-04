package r3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import n.g;

public class a extends a0.a {
   public static final Parcelable.Creator CREATOR = new a$a();
   public final g o;

   private a(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      int var4 = var1.readInt();
      String[] var6 = new String[var4];
      var1.readStringArray(var6);
      Bundle[] var5 = new Bundle[var4];
      var1.readTypedArray(var5, Bundle.CREATOR);
      this.o = new g(var4);

      for(int var3 = 0; var3 < var4; ++var3) {
         this.o.put(var6[var3], var5[var3]);
      }

   }

   // $FF: synthetic method
   a(Parcel var1, ClassLoader var2, a$a var3) {
      this(var1, var2);
   }

   public a(Parcelable var1) {
      super(var1);
      this.o = new g();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ExtendableSavedState{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" states=");
      var1.append(this.o);
      var1.append("}");
      return var1.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      int var3 = this.o.size();
      var1.writeInt(var3);
      String[] var5 = new String[var3];
      Bundle[] var4 = new Bundle[var3];

      for(var2 = 0; var2 < var3; ++var2) {
         var5[var2] = (String)this.o.i(var2);
         var4[var2] = (Bundle)this.o.m(var2);
      }

      var1.writeStringArray(var5);
      var1.writeTypedArray(var4, 0);
   }
}
