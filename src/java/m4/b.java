package m4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b {
   private final String a;
   private final Map b;

   private b(String var1, Map var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   b(String var1, Map var2, Object var3) {
      this(var1, var2);
   }

   public static m4.b.b a(String var0) {
      return new m4.b.b(var0);
   }

   public static m4.b d(String var0) {
      return new m4.b(var0, Collections.emptyMap());
   }

   public String b() {
      return this.a;
   }

   public Annotation c(Class var1) {
      return (Annotation)this.b.get(var1);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof m4.b)) {
         return false;
      } else {
         m4.b var3 = (m4.b)var1;
         if (!this.a.equals(var3.a) || !this.b.equals(var3.b)) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FieldDescriptor{name=");
      var1.append(this.a);
      var1.append(", properties=");
      var1.append(this.b.values());
      var1.append("}");
      return var1.toString();
   }

   public static final class b {
      private final String a;
      private Map b = null;

      b(String var1) {
         this.a = var1;
      }

      public m4.b a() {
         String var2 = this.a;
         Map var1;
         if (this.b == null) {
            var1 = Collections.emptyMap();
         } else {
            var1 = Collections.unmodifiableMap(new HashMap(this.b));
         }

         return new m4.b(var2, var1);
      }

      public m4.b b(Annotation var1) {
         if (this.b == null) {
            this.b = new HashMap();
         }

         this.b.put(var1.annotationType(), var1);
         return this;
      }
   }
}
