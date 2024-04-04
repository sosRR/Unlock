package z5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import x5.g;

public final class a extends y5.a {
   public Random c() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      g.d(var1, "current()");
      return var1;
   }
}
