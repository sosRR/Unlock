package k1;

import java.util.Map;

final class b extends i {
   private final String a;
   private final Integer b;
   private final h c;
   private final long d;
   private final long e;
   private final Map f;

   private b(String var1, Integer var2, h var3, long var4, long var6, Map var8) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var6;
      this.f = var8;
   }

   // $FF: synthetic method
   b(String var1, Integer var2, h var3, long var4, long var6, Map var8, b$a var9) {
      this(var1, var2, var3, var4, var6, var8);
   }

   protected Map c() {
      return this.f;
   }

   public Integer d() {
      return this.b;
   }

   public h e() {
      return this.c;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof i)) {
         return false;
      } else {
         i var4 = (i)var1;
         if (this.a.equals(var4.j())) {
            label30: {
               Integer var3 = this.b;
               if (var3 == null) {
                  if (var4.d() != null) {
                     break label30;
                  }
               } else if (!var3.equals(var4.d())) {
                  break label30;
               }

               if (this.c.equals(var4.e()) && this.d == var4.f() && this.e == var4.k() && this.f.equals(var4.c())) {
                  return var2;
               }
            }
         }

         var2 = false;
         return var2;
      }
   }

   public long f() {
      return this.d;
   }

   public int hashCode() {
      int var2 = this.a.hashCode();
      Integer var7 = this.b;
      int var1;
      if (var7 == null) {
         var1 = 0;
      } else {
         var1 = var7.hashCode();
      }

      int var3 = this.c.hashCode();
      long var5 = this.d;
      int var4 = (int)(var5 ^ var5 >>> 32);
      var5 = this.e;
      return (((((var2 ^ 1000003) * 1000003 ^ var1) * 1000003 ^ var3) * 1000003 ^ var4) * 1000003 ^ (int)(var5 ^ var5 >>> 32)) * 1000003 ^ this.f.hashCode();
   }

   public String j() {
      return this.a;
   }

   public long k() {
      return this.e;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("EventInternal{transportName=");
      var1.append(this.a);
      var1.append(", code=");
      var1.append(this.b);
      var1.append(", encodedPayload=");
      var1.append(this.c);
      var1.append(", eventMillis=");
      var1.append(this.d);
      var1.append(", uptimeMillis=");
      var1.append(this.e);
      var1.append(", autoMetadata=");
      var1.append(this.f);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends i.a {
      private String a;
      private Integer b;
      private h c;
      private Long d;
      private Long e;
      private Map f;

      public i d() {
         String var1 = this.a;
         String var2 = "";
         StringBuilder var3;
         if (var1 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" transportName");
            var2 = var3.toString();
         }

         var1 = var2;
         if (this.c == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" encodedPayload");
            var1 = var3.toString();
         }

         var2 = var1;
         StringBuilder var4;
         if (this.d == null) {
            var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" eventMillis");
            var2 = var4.toString();
         }

         var1 = var2;
         if (this.e == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" uptimeMillis");
            var1 = var3.toString();
         }

         var2 = var1;
         if (this.f == null) {
            var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" autoMetadata");
            var2 = var4.toString();
         }

         if (var2.isEmpty()) {
            return new k1.b(this.a, this.b, this.c, this.d, this.e, this.f, (b$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      protected Map e() {
         Map var1 = this.f;
         if (var1 != null) {
            return var1;
         } else {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
         }
      }

      protected i.a f(Map var1) {
         if (var1 != null) {
            this.f = var1;
            return this;
         } else {
            throw new NullPointerException("Null autoMetadata");
         }
      }

      public i.a g(Integer var1) {
         this.b = var1;
         return this;
      }

      public i.a h(h var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null encodedPayload");
         }
      }

      public i.a i(long var1) {
         this.d = var1;
         return this;
      }

      public i.a j(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null transportName");
         }
      }

      public i.a k(long var1) {
         this.e = var1;
         return this;
      }
   }
}
