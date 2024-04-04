package d4;

final class y extends c0.b {
   private final int a;
   private final String b;
   private final int c;
   private final long d;
   private final long e;
   private final boolean f;
   private final int g;
   private final String h;
   private final String i;

   y(int var1, String var2, int var3, long var4, long var6, boolean var8, int var9, String var10, String var11) {
      this.a = var1;
      if (var2 != null) {
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var6;
         this.f = var8;
         this.g = var9;
         if (var10 != null) {
            this.h = var10;
            if (var11 != null) {
               this.i = var11;
            } else {
               throw new NullPointerException("Null modelClass");
            }
         } else {
            throw new NullPointerException("Null manufacturer");
         }
      } else {
         throw new NullPointerException("Null model");
      }
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.c;
   }

   public long d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof c0.b)) {
         return false;
      } else {
         c0.b var3 = (c0.b)var1;
         if (this.a != var3.a() || !this.b.equals(var3.g()) || this.c != var3.b() || this.d != var3.j() || this.e != var3.d() || this.f != var3.e() || this.g != var3.i() || !this.h.equals(var3.f()) || !this.i.equals(var3.h())) {
            var2 = false;
         }

         return var2;
      }
   }

   public String f() {
      return this.h;
   }

   public String g() {
      return this.b;
   }

   public String h() {
      return this.i;
   }

   public int hashCode() {
      int var2 = this.a;
      int var3 = this.b.hashCode();
      int var4 = this.c;
      long var7 = this.d;
      int var5 = (int)(var7 ^ var7 >>> 32);
      var7 = this.e;
      int var6 = (int)(var7 ^ var7 >>> 32);
      short var1;
      if (this.f) {
         var1 = 1231;
      } else {
         var1 = 1237;
      }

      return ((((((((var2 ^ 1000003) * 1000003 ^ var3) * 1000003 ^ var4) * 1000003 ^ var5) * 1000003 ^ var6) * 1000003 ^ var1) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
   }

   public int i() {
      return this.g;
   }

   public long j() {
      return this.d;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DeviceData{arch=");
      var1.append(this.a);
      var1.append(", model=");
      var1.append(this.b);
      var1.append(", availableProcessors=");
      var1.append(this.c);
      var1.append(", totalRam=");
      var1.append(this.d);
      var1.append(", diskSpace=");
      var1.append(this.e);
      var1.append(", isEmulator=");
      var1.append(this.f);
      var1.append(", state=");
      var1.append(this.g);
      var1.append(", manufacturer=");
      var1.append(this.h);
      var1.append(", modelClass=");
      var1.append(this.i);
      var1.append("}");
      return var1.toString();
   }
}
