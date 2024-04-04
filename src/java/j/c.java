package j;

public abstract class c {
   public abstract void a(Runnable var1);

   public void b(Runnable var1) {
      if (this.c()) {
         var1.run();
      } else {
         this.d(var1);
      }

   }

   public abstract boolean c();

   public abstract void d(Runnable var1);
}
