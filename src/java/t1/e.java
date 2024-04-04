package t1;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
abstract class e {
   static final e a = a().f(10485760L).d(200).b(10000).c(604800000L).e(81920).a();

   static a a() {
      return new t1.a.b();
   }

   abstract int b();

   abstract long c();

   abstract int d();

   abstract int e();

   abstract long f();

   @Builder
   abstract static class a {
      abstract e a();

      abstract a b(int var1);

      abstract a c(long var1);

      abstract a d(int var1);

      abstract a e(int var1);

      abstract a f(long var1);
   }
}
