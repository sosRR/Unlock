package i1;

final class a extends c {
   private final Integer a;
   private final Object b;
   private final d c;

   a(Integer var1, Object var2, d var3) {
      this.a = var1;
      if (var2 != null) {
         this.b = var2;
         if (var3 != null) {
            this.c = var3;
         } else {
            throw new NullPointerException("Null priority");
         }
      } else {
         throw new NullPointerException("Null payload");
      }
   }

   public Integer a() {
      return this.a;
   }

   public Object b() {
      return this.b;
   }

   public d c() {
      return this.c;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof c)) {
         return false;
      } else {
         label25: {
            c var4 = (c)var1;
            Integer var3 = this.a;
            if (var3 == null) {
               if (var4.a() != null) {
                  break label25;
               }
            } else if (!var3.equals(var4.a())) {
               break label25;
            }

            if (this.b.equals(var4.b()) && this.c.equals(var4.c())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int hashCode() {
      Integer var2 = this.a;
      int var1;
      if (var2 == null) {
         var1 = 0;
      } else {
         var1 = var2.hashCode();
      }

      return ((var1 ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Event{code=");
      var1.append(this.a);
      var1.append(", payload=");
      var1.append(this.b);
      var1.append(", priority=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }
}
