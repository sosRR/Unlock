package p4;

import com.google.firebase.encoders.EncodingException;

class i implements m4.f {
   private boolean a = false;
   private boolean b = false;
   private m4.b c;
   private final f d;

   i(f var1) {
      this.d = var1;
   }

   private void a() {
      if (!this.a) {
         this.a = true;
      } else {
         throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
      }
   }

   void b(m4.b var1, boolean var2) {
      this.a = false;
      this.c = var1;
      this.b = var2;
   }

   public m4.f c(String var1) {
      this.a();
      this.d.h(this.c, var1, this.b);
      return this;
   }

   public m4.f d(boolean var1) {
      this.a();
      this.d.n(this.c, var1, this.b);
      return this;
   }
}
