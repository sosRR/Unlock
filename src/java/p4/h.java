package p4;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class h {
   private final Map a;
   private final Map b;
   private final m4.c c;

   h(Map var1, Map var2, m4.c var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static <undefinedtype> a() {
      return new n4.b() {
         private static final m4.c d = new g();
         private final Map a = new HashMap();
         private final Map b = new HashMap();
         private m4.c c;

         public {
            this.c = d;
         }

         // $FF: synthetic method
         public static void b(Object var0, m4.d var1) {
            e(var0, var1);
         }

         // $FF: synthetic method
         private static void e(Object var0, m4.d var1) {
            StringBuilder var2 = new StringBuilder();
            var2.append("Couldn't find encoder for type ");
            var2.append(var0.getClass().getCanonicalName());
            throw new EncodingException(var2.toString());
         }

         public h c() {
            return new h(new HashMap(this.a), new HashMap(this.b), this.c);
         }

         public <undefinedtype> d(n4.a var1) {
            var1.a(this);
            return this;
         }

         public <undefinedtype> f(Class var1, m4.c var2) {
            this.a.put(var1, var2);
            this.b.remove(var1);
            return this;
         }
      };
   }

   public void b(Object var1, OutputStream var2) {
      (new f(var2, this.a, this.b, this.c)).s(var1);
   }

   public byte[] c(Object var1) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      try {
         this.b(var1, var2);
      } catch (IOException var3) {
      }

      return var2.toByteArray();
   }
}
