package e0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f {
   private final b a;

   public f(TextView var1, boolean var2) {
      androidx.core.util.h.g(var1, "textView cannot be null");
      if (!var2) {
         this.a = new b(var1) {
            private final a a;

            {
               this.a = new a(var1);
            }

            private boolean f() {
               return androidx.emoji2.text.e.h() ^ true;
            }

            InputFilter[] a(InputFilter[] var1) {
               return this.f() ? var1 : this.a.a(var1);
            }

            public boolean b() {
               return this.a.b();
            }

            void c(boolean var1) {
               if (!this.f()) {
                  this.a.c(var1);
               }
            }

            void d(boolean var1) {
               if (this.f()) {
                  this.a.i(var1);
               } else {
                  this.a.d(var1);
               }

            }

            TransformationMethod e(TransformationMethod var1) {
               return this.f() ? var1 : this.a.e(var1);
            }
         };
      } else {
         this.a = new a(var1);
      }

   }

   public InputFilter[] a(InputFilter[] var1) {
      return this.a.a(var1);
   }

   public boolean b() {
      return this.a.b();
   }

   public void c(boolean var1) {
      this.a.c(var1);
   }

   public void d(boolean var1) {
      this.a.d(var1);
   }

   public TransformationMethod e(TransformationMethod var1) {
      return this.a.e(var1);
   }

   private static class a extends b {
      private final TextView a;
      private final d b;
      private boolean c;

      a(TextView var1) {
         this.a = var1;
         this.c = true;
         this.b = new d(var1);
      }

      private InputFilter[] f(InputFilter[] var1) {
         int var3 = var1.length;

         for(int var2 = 0; var2 < var3; ++var2) {
            if (var1[var2] == this.b) {
               return var1;
            }
         }

         InputFilter[] var4 = new InputFilter[var1.length + 1];
         System.arraycopy(var1, 0, var4, 0, var3);
         var4[var3] = this.b;
         return var4;
      }

      private SparseArray g(InputFilter[] var1) {
         SparseArray var4 = new SparseArray(1);

         for(int var2 = 0; var2 < var1.length; ++var2) {
            InputFilter var3 = var1[var2];
            if (var3 instanceof d) {
               var4.put(var2, var3);
            }
         }

         return var4;
      }

      private InputFilter[] h(InputFilter[] var1) {
         SparseArray var6 = this.g(var1);
         if (var6.size() == 0) {
            return var1;
         } else {
            int var5 = var1.length;
            InputFilter[] var7 = new InputFilter[var1.length - var6.size()];
            int var4 = 0;

            int var2;
            for(int var3 = 0; var4 < var5; var3 = var2) {
               var2 = var3;
               if (var6.indexOfKey(var4) < 0) {
                  var7[var3] = var1[var4];
                  var2 = var3 + 1;
               }

               ++var4;
            }

            return var7;
         }
      }

      private TransformationMethod j(TransformationMethod var1) {
         TransformationMethod var2 = var1;
         if (var1 instanceof h) {
            var2 = ((h)var1).a();
         }

         return var2;
      }

      private void k() {
         InputFilter[] var1 = this.a.getFilters();
         this.a.setFilters(this.a(var1));
      }

      private TransformationMethod m(TransformationMethod var1) {
         if (var1 instanceof h) {
            return var1;
         } else {
            return (TransformationMethod)(var1 instanceof PasswordTransformationMethod ? var1 : new h(var1));
         }
      }

      InputFilter[] a(InputFilter[] var1) {
         return !this.c ? this.h(var1) : this.f(var1);
      }

      public boolean b() {
         return this.c;
      }

      void c(boolean var1) {
         if (var1) {
            this.l();
         }

      }

      void d(boolean var1) {
         this.c = var1;
         this.l();
         this.k();
      }

      TransformationMethod e(TransformationMethod var1) {
         return this.c ? this.m(var1) : this.j(var1);
      }

      void i(boolean var1) {
         this.c = var1;
      }

      void l() {
         TransformationMethod var1 = this.e(this.a.getTransformationMethod());
         this.a.setTransformationMethod(var1);
      }
   }

   static class b {
      InputFilter[] a(InputFilter[] var1) {
         throw null;
      }

      public boolean b() {
         throw null;
      }

      void c(boolean var1) {
         throw null;
      }

      void d(boolean var1) {
         throw null;
      }

      TransformationMethod e(TransformationMethod var1) {
         throw null;
      }
   }
}
