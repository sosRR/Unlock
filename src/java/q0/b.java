package q0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

public interface b extends Closeable {
   void C();

   void D(String var1, Object[] var2);

   Cursor K(String var1);

   void b();

   void c();

   List h();

   void i(String var1);

   boolean isOpen();

   Cursor m(e var1, CancellationSignal var2);

   f o(String var1);

   Cursor t(e var1);

   String u();

   boolean v();
}
