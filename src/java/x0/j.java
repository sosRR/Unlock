package x0;

public abstract class j {
   public static j c() {
      return new j$a();
   }

   public abstract i a(String var1);

   public final i b(String var1) {
      i var3 = this.a(var1);
      i var2 = var3;
      if (var3 == null) {
         var2 = i.a(var1);
      }

      return var2;
   }
}
