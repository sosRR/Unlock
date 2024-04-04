package j1;

import java.util.Arrays;

final class f extends l {
   private final long a;
   private final Integer b;
   private final long c;
   private final byte[] d;
   private final String e;
   private final long f;
   private final o g;

   private f(long var1, Integer var3, long var4, byte[] var6, String var7, long var8, o var10) {
      this.a = var1;
      this.b = var3;
      this.c = var4;
      this.d = var6;
      this.e = var7;
      this.f = var8;
      this.g = var10;
   }

   // $FF: synthetic method
   f(long var1, Integer var3, long var4, byte[] var6, String var7, long var8, o var10, f$a var11) {
      this(var1, var3, var4, var6, var7, var8, var10);
   }

   public Integer b() {
      return this.b;
   }

   public long c() {
      return this.a;
   }

   public long d() {
      return this.c;
   }

   public o e() {
      return this.g;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof l)) {
         return false;
      } else {
         l var3 = (l)var1;
         if (this.a == var3.c()) {
            label49: {
               Integer var5 = this.b;
               if (var5 == null) {
                  if (var3.b() != null) {
                     break label49;
                  }
               } else if (!var5.equals(var3.b())) {
                  break label49;
               }

               if (this.c == var3.d()) {
                  byte[] var4 = this.d;
                  byte[] var6;
                  if (var3 instanceof f) {
                     var6 = ((f)var3).d;
                  } else {
                     var6 = var3.f();
                  }

                  if (Arrays.equals(var4, var6)) {
                     label41: {
                        String var7 = this.e;
                        if (var7 == null) {
                           if (var3.g() != null) {
                              break label41;
                           }
                        } else if (!var7.equals(var3.g())) {
                           break label41;
                        }

                        if (this.f == var3.h()) {
                           o var8 = this.g;
                           if (var8 == null) {
                              if (var3.e() == null) {
                                 return var2;
                              }
                           } else if (var8.equals(var3.e())) {
                              return var2;
                           }
                        }
                     }
                  }
               }
            }
         }

         var2 = false;
         return var2;
      }
   }

   public byte[] f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public long h() {
      return this.f;
   }

   public int hashCode() {
      long var8 = this.a;
      int var4 = (int)(var8 ^ var8 >>> 32);
      Integer var10 = this.b;
      int var3 = 0;
      int var1;
      if (var10 == null) {
         var1 = 0;
      } else {
         var1 = var10.hashCode();
      }

      var8 = this.c;
      int var5 = (int)(var8 ^ var8 >>> 32);
      int var6 = Arrays.hashCode(this.d);
      String var11 = this.e;
      int var2;
      if (var11 == null) {
         var2 = 0;
      } else {
         var2 = var11.hashCode();
      }

      var8 = this.f;
      int var7 = (int)(var8 >>> 32 ^ var8);
      o var12 = this.g;
      if (var12 != null) {
         var3 = var12.hashCode();
      }

      return ((((((var4 ^ 1000003) * 1000003 ^ var1) * 1000003 ^ var5) * 1000003 ^ var6) * 1000003 ^ var2) * 1000003 ^ var7) * 1000003 ^ var3;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("LogEvent{eventTimeMs=");
      var1.append(this.a);
      var1.append(", eventCode=");
      var1.append(this.b);
      var1.append(", eventUptimeMs=");
      var1.append(this.c);
      var1.append(", sourceExtension=");
      var1.append(Arrays.toString(this.d));
      var1.append(", sourceExtensionJsonProto3=");
      var1.append(this.e);
      var1.append(", timezoneOffsetSeconds=");
      var1.append(this.f);
      var1.append(", networkConnectionInfo=");
      var1.append(this.g);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends l.a {
      private Long a;
      private Integer b;
      private Long c;
      private byte[] d;
      private String e;
      private Long f;
      private o g;

      public l a() {
         Long var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" eventTimeMs");
            var1 = var3.toString();
         }

         String var4 = var1;
         StringBuilder var5;
         if (this.c == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" eventUptimeMs");
            var4 = var5.toString();
         }

         var1 = var4;
         if (this.f == null) {
            var3 = new StringBuilder();
            var3.append(var4);
            var3.append(" timezoneOffsetSeconds");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (f$a)null);
         } else {
            var5 = new StringBuilder();
            var5.append("Missing required properties:");
            var5.append(var1);
            throw new IllegalStateException(var5.toString());
         }
      }

      public l.a b(Integer var1) {
         this.b = var1;
         return this;
      }

      public l.a c(long var1) {
         this.a = var1;
         return this;
      }

      public l.a d(long var1) {
         this.c = var1;
         return this;
      }

      public l.a e(o var1) {
         this.g = var1;
         return this;
      }

      l.a f(byte[] var1) {
         this.d = var1;
         return this;
      }

      l.a g(String var1) {
         this.e = var1;
         return this;
      }

      public l.a h(long var1) {
         this.f = var1;
         return this;
      }
   }
}
