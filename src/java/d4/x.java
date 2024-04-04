package d4;

final class x extends c0.a {
   private final String a;
   private final String b;
   private final String c;
   private final String d;
   private final int e;
   private final y3.e f;

   x(String var1, String var2, String var3, String var4, int var5, y3.e var6) {
      if (var1 != null) {
         this.a = var1;
         if (var2 != null) {
            this.b = var2;
            if (var3 != null) {
               this.c = var3;
               if (var4 != null) {
                  this.d = var4;
                  this.e = var5;
                  if (var6 != null) {
                     this.f = var6;
                  } else {
                     throw new NullPointerException("Null developmentPlatformProvider");
                  }
               } else {
                  throw new NullPointerException("Null installUuid");
               }
            } else {
               throw new NullPointerException("Null versionName");
            }
         } else {
            throw new NullPointerException("Null versionCode");
         }
      } else {
         throw new NullPointerException("Null appIdentifier");
      }
   }

   public String a() {
      return this.a;
   }

   public int c() {
      return this.e;
   }

   public y3.e d() {
      return this.f;
   }

   public String e() {
      return this.d;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof c0.a)) {
         return false;
      } else {
         c0.a var3 = (c0.a)var1;
         if (!this.a.equals(var3.a()) || !this.b.equals(var3.f()) || !this.c.equals(var3.g()) || !this.d.equals(var3.e()) || this.e != var3.c() || !this.f.equals(var3.d())) {
            var2 = false;
         }

         return var2;
      }
   }

   public String f() {
      return this.b;
   }

   public String g() {
      return this.c;
   }

   public int hashCode() {
      return (((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AppData{appIdentifier=");
      var1.append(this.a);
      var1.append(", versionCode=");
      var1.append(this.b);
      var1.append(", versionName=");
      var1.append(this.c);
      var1.append(", installUuid=");
      var1.append(this.d);
      var1.append(", deliveryMechanism=");
      var1.append(this.e);
      var1.append(", developmentPlatformProvider=");
      var1.append(this.f);
      var1.append("}");
      return var1.toString();
   }
}
