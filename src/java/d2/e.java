package d2;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface e {
   void b(String var1, LifecycleCallback var2);

   LifecycleCallback j(String var1, Class var2);

   Activity l();

   void startActivityForResult(Intent var1, int var2);
}
