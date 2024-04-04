package y;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class e {
   private final b a;

   private e(b var1) {
      this.a = var1;
   }

   public static e f(Object var0) {
      return var0 == null ? null : new e(new b(var0) {
         final InputContentInfo a;

         {
            this.a = (InputContentInfo)var1;
         }

         public ClipDescription a() {
            return this.a.getDescription();
         }

         public Object b() {
            return this.a;
         }

         public Uri c() {
            return this.a.getContentUri();
         }

         public void d() {
            this.a.requestPermission();
         }

         public Uri e() {
            return this.a.getLinkUri();
         }
      });
   }

   public Uri a() {
      return this.a.c();
   }

   public ClipDescription b() {
      return this.a.a();
   }

   public Uri c() {
      return this.a.e();
   }

   public void d() {
      this.a.d();
   }

   public Object e() {
      return this.a.b();
   }

   private interface b {
      ClipDescription a();

      Object b();

      Uri c();

      void d();

      Uri e();
   }
}
