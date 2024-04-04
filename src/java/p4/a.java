package p4;

public final class a {
   private int a;
   private d.a b;

   public a() {
      this.b = d.a.m;
   }

   public static a b() {
      return new a();
   }

   public d a() {
      return new d(this.a, this.b) {
         private final int a;
         private final d.a b;

         {
            this.a = var1;
            this.b = var2;
         }

         public Class annotationType() {
            return d.class;
         }

         public boolean equals(Object var1) {
            boolean var2 = true;
            if (this == var1) {
               return true;
            } else if (!(var1 instanceof d)) {
               return false;
            } else {
               d var3 = (d)var1;
               if (this.a != var3.tag() || !this.b.equals(var3.intEncoding())) {
                  var2 = false;
               }

               return var2;
            }
         }

         public int hashCode() {
            return (14552422 ^ this.a) + (this.b.hashCode() ^ 2041407134);
         }

         public d.a intEncoding() {
            return this.b;
         }

         public int tag() {
            return this.a;
         }

         public String toString() {
            StringBuilder var1 = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
            var1.append('(');
            var1.append("tag=");
            var1.append(this.a);
            var1.append("intEncoding=");
            var1.append(this.b);
            var1.append(')');
            return var1.toString();
         }
      };
   }

   public a c(int var1) {
      this.a = var1;
      return this;
   }
}
