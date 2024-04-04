package o4;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import m4.f;

final class e implements m4.d, f {
   private e a = null;
   private boolean b = true;
   private final JsonWriter c;
   private final Map d;
   private final Map e;
   private final m4.c f;
   private final boolean g;

   e(Writer var1, Map var2, Map var3, m4.c var4, boolean var5) {
      this.c = new JsonWriter(var1);
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.g = var5;
   }

   private boolean q(Object var1) {
      boolean var2;
      if (var1 != null && !var1.getClass().isArray() && !(var1 instanceof Collection) && !(var1 instanceof Date) && !(var1 instanceof Enum) && !(var1 instanceof Number)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   private e t(String var1, Object var2) {
      this.v();
      this.c.name(var1);
      if (var2 == null) {
         this.c.nullValue();
         return this;
      } else {
         return this.i(var2, false);
      }
   }

   private e u(String var1, Object var2) {
      if (var2 == null) {
         return this;
      } else {
         this.v();
         this.c.name(var1);
         return this.i(var2, false);
      }
   }

   private void v() {
      if (this.b) {
         e var1 = this.a;
         if (var1 != null) {
            var1.v();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
         }

      } else {
         throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
      }
   }

   public m4.d a(m4.b var1, int var2) {
      return this.k(var1.b(), var2);
   }

   public m4.d b(m4.b var1, Object var2) {
      return this.m(var1.b(), var2);
   }

   public m4.d e(m4.b var1, long var2) {
      return this.l(var1.b(), var2);
   }

   public m4.d f(m4.b var1, boolean var2) {
      return this.n(var1.b(), var2);
   }

   public e g(int var1) {
      this.v();
      this.c.value((long)var1);
      return this;
   }

   public e h(long var1) {
      this.v();
      this.c.value(var1);
      return this;
   }

   e i(Object var1, boolean var2) {
      int var6 = 0;
      int var5 = 0;
      byte var8 = 0;
      int var7 = 0;
      if (var2 && this.q(var1)) {
         Class var21;
         if (var1 == null) {
            var21 = null;
         } else {
            var21 = var1.getClass();
         }

         throw new EncodingException(String.format("%s cannot be encoded inline", new Object[]{var21}));
      } else if (var1 == null) {
         this.c.nullValue();
         return this;
      } else if (var1 instanceof Number) {
         this.c.value((Number)var1);
         return this;
      } else if (var1.getClass().isArray()) {
         if (var1 instanceof byte[]) {
            return this.p((byte[])var1);
         } else {
            this.c.beginArray();
            if (var1 instanceof int[]) {
               int[] var15 = (int[])var1;
               var6 = var15.length;

               for(var5 = var7; var5 < var6; ++var5) {
                  var7 = var15[var5];
                  this.c.value((long)var7);
               }
            } else if (var1 instanceof long[]) {
               long[] var16 = (long[])var1;
               var7 = var16.length;

               for(var5 = var6; var5 < var7; ++var5) {
                  this.h(var16[var5]);
               }
            } else if (var1 instanceof double[]) {
               double[] var17 = (double[])var1;

               for(var6 = var17.length; var5 < var6; ++var5) {
                  double var3 = var17[var5];
                  this.c.value(var3);
               }
            } else if (var1 instanceof boolean[]) {
               boolean[] var18 = (boolean[])var1;
               var6 = var18.length;

               for(var5 = var8; var5 < var6; ++var5) {
                  var2 = var18[var5];
                  this.c.value(var2);
               }
            } else if (var1 instanceof Number[]) {
               Number[] var19 = (Number[])var1;
               var6 = var19.length;

               for(var5 = 0; var5 < var6; ++var5) {
                  this.i(var19[var5], false);
               }
            } else {
               Object[] var20 = (Object[])var1;
               var6 = var20.length;

               for(var5 = 0; var5 < var6; ++var5) {
                  this.i(var20[var5], false);
               }
            }

            this.c.endArray();
            return this;
         }
      } else if (var1 instanceof Collection) {
         Collection var13 = (Collection)var1;
         this.c.beginArray();
         Iterator var14 = var13.iterator();

         while(var14.hasNext()) {
            this.i(var14.next(), false);
         }

         this.c.endArray();
         return this;
      } else if (!(var1 instanceof Map)) {
         m4.c var22 = (m4.c)this.d.get(var1.getClass());
         if (var22 != null) {
            return this.s(var22, var1, var2);
         } else {
            m4.e var23 = (m4.e)this.e.get(var1.getClass());
            if (var23 != null) {
               var23.a(var1, this);
               return this;
            } else if (var1 instanceof Enum) {
               this.j(((Enum)var1).name());
               return this;
            } else {
               return this.s(this.f, var1, var2);
            }
         }
      } else {
         Map var12 = (Map)var1;
         this.c.beginObject();
         Iterator var10 = var12.entrySet().iterator();

         while(var10.hasNext()) {
            Map.Entry var9 = (Map.Entry)var10.next();
            var1 = var9.getKey();

            try {
               this.m((String)var1, var9.getValue());
            } catch (ClassCastException var11) {
               throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{var1, var1.getClass()}), var11);
            }
         }

         this.c.endObject();
         return this;
      }
   }

   public e j(String var1) {
      this.v();
      this.c.value(var1);
      return this;
   }

   public e k(String var1, int var2) {
      this.v();
      this.c.name(var1);
      return this.g(var2);
   }

   public e l(String var1, long var2) {
      this.v();
      this.c.name(var1);
      return this.h(var2);
   }

   public e m(String var1, Object var2) {
      return this.g ? this.u(var1, var2) : this.t(var1, var2);
   }

   public e n(String var1, boolean var2) {
      this.v();
      this.c.name(var1);
      return this.o(var2);
   }

   public e o(boolean var1) {
      this.v();
      this.c.value(var1);
      return this;
   }

   public e p(byte[] var1) {
      this.v();
      if (var1 == null) {
         this.c.nullValue();
      } else {
         this.c.value(Base64.encodeToString(var1, 2));
      }

      return this;
   }

   void r() {
      this.v();
      this.c.flush();
   }

   e s(m4.c var1, Object var2, boolean var3) {
      if (!var3) {
         this.c.beginObject();
      }

      var1.a(var2, this);
      if (!var3) {
         this.c.endObject();
      }

      return this;
   }
}
