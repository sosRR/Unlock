package b2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a implements ServiceConnection {
   boolean a = false;
   private final BlockingQueue b = new LinkedBlockingQueue();

   public IBinder a(long var1, TimeUnit var3) {
      e2.n.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
      if (!this.a) {
         this.a = true;
         IBinder var4 = (IBinder)this.b.poll(var1, var3);
         if (var4 != null) {
            return var4;
         } else {
            throw new TimeoutException("Timed out waiting for the service connection");
         }
      } else {
         throw new IllegalStateException("Cannot call get on this connection more than once");
      }
   }

   public final void onServiceConnected(ComponentName var1, IBinder var2) {
      this.b.add(var2);
   }

   public final void onServiceDisconnected(ComponentName var1) {
   }
}
