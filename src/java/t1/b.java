package t1;

final class b extends k {
   private final long a;
   private final k1.o b;
   private final k1.i c;

   b(long var1, k1.o var3, k1.i var4) {
      this.a = var1;
      if (var3 != null) {
         this.b = var3;
         if (var4 != null) {
            this.c = var4;
         } else {
            throw new NullPointerException("Null event");
         }
      } else {
         throw new NullPointerException("Null transportContext");
      }
   }

   public k1.i b() {
      return this.c;
   }

   public long c() {
      return this.a;
   }

   public k1.o d() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof k)) {
         return false;
      } else {
         k var3 = (k)var1;
         if (this.a != var3.c() || !this.b.equals(var3.d()) || !this.c.equals(var3.b())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      long var1 = this.a;
      return (((int)(var1 ^ var1 >>> 32) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PersistedEvent{id=");
      var1.append(this.a);
      var1.append(", transportContext=");
      var1.append(this.b);
      var1.append(", event=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }
}
