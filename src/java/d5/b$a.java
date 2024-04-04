package d5;

import android.net.Uri;

class b$a implements y2.c {
   final String a;
   final Uri.Builder b;
   final b c;

   b$a(b var1, String var2, Uri.Builder var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void a(y2.g var1) {
      if (!var1.o()) {
         h6.a.b(d5.b.a()).k("Failed to retrieve Firebase instance ID");
      } else {
         h6.a.b var3 = h6.a.b(d5.b.a());
         StringBuilder var2 = new StringBuilder();
         var2.append("Firebase Instance ID: ");
         var2.append((String)var1.k());
         var3.a(var2.toString());
         h6.a.b var4 = h6.a.b(d5.b.a());
         StringBuilder var5 = new StringBuilder();
         var5.append("Firebase token: ");
         var5.append(this.a);
         var4.a(var5.toString());
         this.b.appendQueryParameter("token", this.a);
         this.b.appendQueryParameter("instance_id", (String)var1.k());
         d5.b.c(this.c).g("com.tmobile.rsuapp.UPDATE_TOKEN", this.b.build(), d5.b.b(this.c));
      }

   }
}
