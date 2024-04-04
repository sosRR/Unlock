package j;

import java.util.concurrent.Executor;

public class a extends c {
   private static volatile a c;
   private static final Executor d = new a$a();
   private static final Executor e = new a$b();
   private c a;
   private c b;

   private a() {
      b var1 = new b();
      this.b = var1;
      this.a = var1;
   }

   public static Executor e() {
      return e;
   }

   public static a f() {
      if (c != null) {
         return c;
      } else {
         Class var1 = a.class;
         synchronized(a.class){}

         Throwable var10000;
         boolean var10001;
         label145: {
            try {
               if (c == null) {
                  a var0 = new a();
                  c = var0;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label145;
            }

            label142:
            try {
               return c;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label142;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public void a(Runnable var1) {
      this.a.a(var1);
   }

   public boolean c() {
      return this.a.c();
   }

   public void d(Runnable var1) {
      this.a.d(var1);
   }
}
