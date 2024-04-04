package x0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

public abstract class x {
   private static final String a = k.f("WorkerFactory");

   public static x c() {
      return new x$a();
   }

   public abstract ListenableWorker a(Context var1, String var2, WorkerParameters var3);

   public final ListenableWorker b(Context var1, String var2, WorkerParameters var3) {
      ListenableWorker var6 = this.a(var1, var2, var3);
      ListenableWorker var5 = var6;
      if (var6 == null) {
         Class var16;
         String var17;
         label77:
         try {
            var16 = Class.forName(var2).asSubclass(ListenableWorker.class);
         } catch (Throwable var14) {
            k var4 = k.c();
            var17 = a;
            StringBuilder var8 = new StringBuilder();
            var8.append("Invalid class: ");
            var8.append(var2);
            var4.b(var17, var8.toString(), var14);
            var16 = null;
            break label77;
         }

         var5 = var6;
         if (var16 != null) {
            label74:
            try {
               var5 = (ListenableWorker)var16.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{var1, var3});
            } catch (Throwable var13) {
               k var15 = k.c();
               var17 = a;
               StringBuilder var18 = new StringBuilder();
               var18.append("Could not instantiate ");
               var18.append(var2);
               var15.b(var17, var18.toString(), var13);
               var5 = var6;
               break label74;
            }
         }
      }

      if (var5 != null && var5.k()) {
         throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{this.getClass().getName(), var2}));
      } else {
         return var5;
      }
   }
}
