package x0;

import android.app.Notification;

public final class f {
   private final int a;
   private final int b;
   private final Notification c;

   public f(int var1, Notification var2, int var3) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
   }

   public int a() {
      return this.b;
   }

   public Notification b() {
      return this.c;
   }

   public int c() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && f.class == var1.getClass()) {
         f var2 = (f)var1;
         if (this.a != var2.a) {
            return false;
         } else {
            return this.b != var2.b ? false : this.c.equals(var2.c);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return (this.a * 31 + this.b) * 31 + this.c.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder("ForegroundInfo{");
      var1.append("mNotificationId=");
      var1.append(this.a);
      var1.append(", mForegroundServiceType=");
      var1.append(this.b);
      var1.append(", mNotification=");
      var1.append(this.c);
      var1.append('}');
      return var1.toString();
   }
}
