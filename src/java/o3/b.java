package o3;

import android.content.res.ColorStateList;

public class b {
   public static final boolean a = true;
   private static final int[] b = new int[]{16842919};
   private static final int[] c = new int[]{16843623, 16842908};
   private static final int[] d = new int[]{16842908};
   private static final int[] e = new int[]{16843623};
   private static final int[] f = new int[]{16842913, 16842919};
   private static final int[] g = new int[]{16842913, 16843623, 16842908};
   private static final int[] h = new int[]{16842913, 16842908};
   private static final int[] i = new int[]{16842913, 16843623};
   private static final int[] j = new int[]{16842913};
   private static final int[] k = new int[]{16842910, 16842919};
   static final String l = b.class.getSimpleName();

   private b() {
   }

   public static ColorStateList a(ColorStateList var0) {
      return var0 != null ? var0 : ColorStateList.valueOf(0);
   }

   public static boolean b(int[] var0) {
      int var5 = var0.length;
      boolean var8 = false;
      int var2 = 0;
      boolean var3 = false;

      boolean var1;
      boolean var4;
      for(var1 = var3; var2 < var5; var3 = var4) {
         int var6 = var0[var2];
         if (var6 == 16842910) {
            var4 = true;
         } else {
            label36: {
               if (var6 != 16842908 && var6 != 16842919) {
                  var4 = var3;
                  if (var6 != 16843623) {
                     break label36;
                  }
               }

               var1 = true;
               var4 = var3;
            }
         }

         ++var2;
      }

      boolean var7 = var8;
      if (var3) {
         var7 = var8;
         if (var1) {
            var7 = true;
         }
      }

      return var7;
   }
}
