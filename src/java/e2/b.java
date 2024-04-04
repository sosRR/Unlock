package e2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

public class b {
   public static ApiException a(Status var0) {
      return (ApiException)(var0.x() ? new ResolvableApiException(var0) : new ApiException(var0));
   }
}
