package p4;

import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class f implements m4.d {
   private static final Charset f = Charset.forName("UTF-8");
   private static final m4.b g = m4.b.a("key").b(p4.a.b().c(1).a()).a();
   private static final m4.b h = m4.b.a("value").b(p4.a.b().c(2).a()).a();
   private static final m4.c i = new e();
   private OutputStream a;
   private final Map b;
   private final Map c;
   private final m4.c d;
   private final i e = new i(this);

   f(OutputStream var1, Map var2, Map var3, m4.c var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   // $FF: synthetic method
   public static void c(Map.Entry var0, m4.d var1) {
      v(var0, var1);
   }

   private static ByteBuffer o(int var0) {
      return ByteBuffer.allocate(var0).order(ByteOrder.LITTLE_ENDIAN);
   }

   private long p(m4.c var1, Object var2) {
      b var5 = new b();

      label229: {
         Throwable var10000;
         label224: {
            boolean var10001;
            OutputStream var6;
            try {
               var6 = this.a;
               this.a = var5;
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label224;
            }

            try {
               var1.a(var2, this);
               break label229;
            } finally {
               label218:
               try {
                  this.a = var6;
               } catch (Throwable var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label218;
               }
            }
         }

         Throwable var35 = var10000;

         try {
            var5.close();
         } catch (Throwable var31) {
            var35.addSuppressed(var31);
            throw var35;
         }

         throw var35;
      }

      long var3 = var5.a();
      var5.close();
      return var3;
   }

   private f q(m4.c var1, m4.b var2, Object var3, boolean var4) {
      long var5 = this.p(var1, var3);
      if (var4 && var5 == 0L) {
         return this;
      } else {
         this.w(u(var2) << 3 | 2);
         this.x(var5);
         var1.a(var3, this);
         return this;
      }
   }

   private f r(m4.e var1, m4.b var2, Object var3, boolean var4) {
      this.e.b(var2, var4);
      var1.a(var3, this.e);
      return this;
   }

   private static d t(m4.b var0) {
      d var1 = (d)var0.c(d.class);
      if (var1 != null) {
         return var1;
      } else {
         throw new EncodingException("Field has no @Protobuf config");
      }
   }

   private static int u(m4.b var0) {
      d var1 = (d)var0.c(d.class);
      if (var1 != null) {
         return var1.tag();
      } else {
         throw new EncodingException("Field has no @Protobuf config");
      }
   }

   // $FF: synthetic method
   private static void v(Map.Entry var0, m4.d var1) {
      var1.b(g, var0.getKey());
      var1.b(h, var0.getValue());
   }

   private void w(int var1) {
      while((long)(var1 & -128) != 0L) {
         this.a.write(var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.a.write(var1 & 127);
   }

   private void x(long var1) {
      while((-128L & var1) != 0L) {
         this.a.write((int)var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.a.write((int)var1 & 127);
   }

   public m4.d b(m4.b var1, Object var2) {
      return this.h(var1, var2, true);
   }

   m4.d d(m4.b var1, double var2, boolean var4) {
      if (var4 && var2 == 0.0) {
         return this;
      } else {
         this.w(u(var1) << 3 | 1);
         this.a.write(o(8).putDouble(var2).array());
         return this;
      }
   }

   m4.d g(m4.b var1, float var2, boolean var3) {
      if (var3 && var2 == 0.0F) {
         return this;
      } else {
         this.w(u(var1) << 3 | 5);
         this.a.write(o(4).putFloat(var2).array());
         return this;
      }
   }

   m4.d h(m4.b var1, Object var2, boolean var3) {
      if (var2 == null) {
         return this;
      } else if (var2 instanceof CharSequence) {
         CharSequence var8 = (CharSequence)var2;
         if (var3 && var8.length() == 0) {
            return this;
         } else {
            this.w(u(var1) << 3 | 2);
            byte[] var5 = var8.toString().getBytes(f);
            this.w(var5.length);
            this.a.write(var5);
            return this;
         }
      } else {
         Iterator var6;
         if (var2 instanceof Collection) {
            var6 = ((Collection)var2).iterator();

            while(var6.hasNext()) {
               this.h(var1, var6.next(), false);
            }

            return this;
         } else if (!(var2 instanceof Map)) {
            if (var2 instanceof Double) {
               return this.d(var1, (Double)var2, var3);
            } else if (var2 instanceof Float) {
               return this.g(var1, (Float)var2, var3);
            } else if (var2 instanceof Number) {
               return this.l(var1, ((Number)var2).longValue(), var3);
            } else if (var2 instanceof Boolean) {
               return this.n(var1, (Boolean)var2, var3);
            } else if (var2 instanceof byte[]) {
               byte[] var7 = (byte[])var2;
               if (var3 && var7.length == 0) {
                  return this;
               } else {
                  this.w(u(var1) << 3 | 2);
                  this.w(var7.length);
                  this.a.write(var7);
                  return this;
               }
            } else {
               m4.c var9 = (m4.c)this.b.get(var2.getClass());
               if (var9 != null) {
                  return this.q(var9, var1, var2, var3);
               } else {
                  m4.e var10 = (m4.e)this.c.get(var2.getClass());
                  if (var10 != null) {
                     return this.r(var10, var1, var2, var3);
                  } else if (var2 instanceof c) {
                     return this.i(var1, ((c)var2).d());
                  } else {
                     return var2 instanceof Enum ? this.i(var1, ((Enum)var2).ordinal()) : this.q(this.d, var1, var2, var3);
                  }
               }
            }
         } else {
            var6 = ((Map)var2).entrySet().iterator();

            while(var6.hasNext()) {
               Map.Entry var4 = (Map.Entry)var6.next();
               this.q(i, var1, var4, false);
            }

            return this;
         }
      }
   }

   public f i(m4.b var1, int var2) {
      return this.j(var1, var2, true);
   }

   f j(m4.b var1, int var2, boolean var3) {
      if (var3 && var2 == 0) {
         return this;
      } else {
         d var5 = t(var1);
         int var4 = f$a.a[var5.intEncoding().ordinal()];
         if (var4 != 1) {
            if (var4 != 2) {
               if (var4 == 3) {
                  this.w(var5.tag() << 3 | 5);
                  this.a.write(o(4).putInt(var2).array());
               }
            } else {
               this.w(var5.tag() << 3);
               this.w(var2 << 1 ^ var2 >> 31);
            }
         } else {
            this.w(var5.tag() << 3);
            this.w(var2);
         }

         return this;
      }
   }

   public f k(m4.b var1, long var2) {
      return this.l(var1, var2, true);
   }

   f l(m4.b var1, long var2, boolean var4) {
      if (var4 && var2 == 0L) {
         return this;
      } else {
         d var6 = t(var1);
         int var5 = f$a.a[var6.intEncoding().ordinal()];
         if (var5 != 1) {
            if (var5 != 2) {
               if (var5 == 3) {
                  this.w(var6.tag() << 3 | 1);
                  this.a.write(o(8).putLong(var2).array());
               }
            } else {
               this.w(var6.tag() << 3);
               this.x(var2 >> 63 ^ var2 << 1);
            }
         } else {
            this.w(var6.tag() << 3);
            this.x(var2);
         }

         return this;
      }
   }

   public f m(m4.b var1, boolean var2) {
      return this.n(var1, var2, true);
   }

   f n(m4.b var1, boolean var2, boolean var3) {
      return this.j(var1, var2, var3);
   }

   f s(Object var1) {
      if (var1 == null) {
         return this;
      } else {
         m4.c var2 = (m4.c)this.b.get(var1.getClass());
         if (var2 != null) {
            var2.a(var1, this);
            return this;
         } else {
            StringBuilder var3 = new StringBuilder();
            var3.append("No encoder for ");
            var3.append(var1.getClass());
            throw new EncodingException(var3.toString());
         }
      }
   }
}
