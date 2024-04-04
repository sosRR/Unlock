package k1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

abstract class j {
   static Executor a() {
      return new m(Executors.newSingleThreadExecutor());
   }
}
