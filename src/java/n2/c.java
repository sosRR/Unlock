package n2;

import android.os.Parcel;

public final class c {
   private static final ClassLoader a = c.class.getClassLoader();

   private c() {
   }

   public static void a(Parcel var0, boolean var1) {
      var0.writeInt(1);
   }

   public static boolean b(Parcel var0) {
      return var0.readInt() != 0;
   }
}
