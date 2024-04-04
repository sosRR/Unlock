package e6;

final class b0 extends RuntimeException {
   private final o5.f m;

   public b0(o5.f var1) {
      this.m = var1;
   }

   public Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }

   public String getLocalizedMessage() {
      return this.m.toString();
   }
}
