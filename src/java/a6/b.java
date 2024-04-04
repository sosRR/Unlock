package a6;

import java.util.NoSuchElementException;
import n5.v;

public final class b extends v {
   private final int m;
   private final int n;
   private boolean o;
   private int p;

   public b(int var1, int var2, int var3) {
      boolean var4;
      label20: {
         super();
         this.m = var3;
         this.n = var2;
         var4 = true;
         if (var3 > 0) {
            if (var1 <= var2) {
               break label20;
            }
         } else if (var1 >= var2) {
            break label20;
         }

         var4 = false;
      }

      this.o = var4;
      if (!var4) {
         var1 = var2;
      }

      this.p = var1;
   }

   public boolean hasNext() {
      return this.o;
   }

   public int nextInt() {
      int var1 = this.p;
      if (var1 == this.n) {
         if (!this.o) {
            throw new NoSuchElementException();
         }

         this.o = false;
      } else {
         this.p = this.m + var1;
      }

      return var1;
   }
}
