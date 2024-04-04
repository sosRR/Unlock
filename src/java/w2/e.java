package w2;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class e extends o2.b implements f {
   public e() {
      super("com.google.android.gms.signin.internal.ISignInCallbacks");
   }

   protected final boolean l0(int var1, Parcel var2, Parcel var3, int var4) {
      Status var8;
      switch (var1) {
         case 3:
            b2.b var10 = (b2.b)o2.c.a(var2, b2.b.CREATOR);
            b var9 = (b)o2.c.a(var2, b.CREATOR);
            break;
         case 4:
            var8 = (Status)o2.c.a(var2, Status.CREATOR);
            break;
         case 5:
         default:
            return false;
         case 6:
            var8 = (Status)o2.c.a(var2, Status.CREATOR);
            break;
         case 7:
            Status var5 = (Status)o2.c.a(var2, Status.CREATOR);
            GoogleSignInAccount var7 = (GoogleSignInAccount)o2.c.a(var2, GoogleSignInAccount.CREATOR);
            break;
         case 8:
            this.x((l)o2.c.a(var2, l.CREATOR));
            break;
         case 9:
            h var6 = (h)o2.c.a(var2, h.CREATOR);
      }

      var3.writeNoException();
      return true;
   }
}
