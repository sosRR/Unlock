package t;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a {
   private static int a(int var0) {
      var0 = (var0 & ~(var0 >> 31)) - 255;
      return (var0 & var0 >> 31) + 255;
   }

   public static void b(androidx.constraintlayout.widget.a var0, View var1, float[] var2) {
      Class var9 = var1.getClass();
      StringBuilder var8 = new StringBuilder();
      var8.append("set");
      var8.append(var0.b());
      String var45 = var8.toString();

      NoSuchMethodException var48;
      label147: {
         IllegalAccessException var47;
         label148: {
            InvocationTargetException var10000;
            label114: {
               int var3;
               boolean var10001;
               try {
                  var3 = null.a[var0.c().ordinal()];
               } catch (NoSuchMethodException var34) {
                  var48 = var34;
                  var10001 = false;
                  break label147;
               } catch (IllegalAccessException var35) {
                  var47 = var35;
                  var10001 = false;
                  break label148;
               } catch (InvocationTargetException var36) {
                  var10000 = var36;
                  var10001 = false;
                  break label114;
               }

               boolean var7 = true;
               int var4;
               int var5;
               Method var37;
               switch (var3) {
                  case 1:
                     try {
                        var9.getMethod(var45, new Class[]{Integer.TYPE}).invoke(var1, new Object[]{(int)var2[0]});
                        return;
                     } catch (NoSuchMethodException var31) {
                        var48 = var31;
                        var10001 = false;
                        break label147;
                     } catch (IllegalAccessException var32) {
                        var47 = var32;
                        var10001 = false;
                        break label148;
                     } catch (InvocationTargetException var33) {
                        var10000 = var33;
                        var10001 = false;
                        break;
                     }
                  case 2:
                     try {
                        var9.getMethod(var45, new Class[]{Float.TYPE}).invoke(var1, new Object[]{var2[0]});
                        return;
                     } catch (NoSuchMethodException var28) {
                        var48 = var28;
                        var10001 = false;
                        break label147;
                     } catch (IllegalAccessException var29) {
                        var47 = var29;
                        var10001 = false;
                        break label148;
                     } catch (InvocationTargetException var30) {
                        var10000 = var30;
                        var10001 = false;
                        break;
                     }
                  case 3:
                     try {
                        var37 = var9.getMethod(var45, new Class[]{Drawable.class});
                        int var6 = a((int)((float)Math.pow((double)var2[0], 0.45454545454545453) * 255.0F));
                        var3 = a((int)((float)Math.pow((double)var2[1], 0.45454545454545453) * 255.0F));
                        var4 = a((int)((float)Math.pow((double)var2[2], 0.45454545454545453) * 255.0F));
                        var5 = a((int)(var2[3] * 255.0F));
                        ColorDrawable var42 = new ColorDrawable();
                        var42.setColor(var6 << 16 | var5 << 24 | var3 << 8 | var4);
                        var37.invoke(var1, new Object[]{var42});
                        return;
                     } catch (NoSuchMethodException var25) {
                        var48 = var25;
                        var10001 = false;
                        break label147;
                     } catch (IllegalAccessException var26) {
                        var47 = var26;
                        var10001 = false;
                        break label148;
                     } catch (InvocationTargetException var27) {
                        var10000 = var27;
                        var10001 = false;
                        break;
                     }
                  case 4:
                     try {
                        var37 = var9.getMethod(var45, new Class[]{Integer.TYPE});
                        var3 = a((int)((float)Math.pow((double)var2[0], 0.45454545454545453) * 255.0F));
                        var4 = a((int)((float)Math.pow((double)var2[1], 0.45454545454545453) * 255.0F));
                        var5 = a((int)((float)Math.pow((double)var2[2], 0.45454545454545453) * 255.0F));
                        var37.invoke(var1, new Object[]{var3 << 16 | a((int)(var2[3] * 255.0F)) << 24 | var4 << 8 | var5});
                        return;
                     } catch (NoSuchMethodException var22) {
                        var48 = var22;
                        var10001 = false;
                        break label147;
                     } catch (IllegalAccessException var23) {
                        var47 = var23;
                        var10001 = false;
                        break label148;
                     } catch (InvocationTargetException var24) {
                        var10000 = var24;
                        var10001 = false;
                        break;
                     }
                  case 5:
                     try {
                        StringBuilder var46 = new StringBuilder();
                        var46.append("unable to interpolate strings ");
                        var46.append(var0.b());
                        RuntimeException var41 = new RuntimeException(var46.toString());
                        throw var41;
                     } catch (NoSuchMethodException var19) {
                        var48 = var19;
                        var10001 = false;
                        break label147;
                     } catch (IllegalAccessException var20) {
                        var47 = var20;
                        var10001 = false;
                        break label148;
                     } catch (InvocationTargetException var21) {
                        var10000 = var21;
                        var10001 = false;
                        break;
                     }
                  case 6:
                     try {
                        var37 = var9.getMethod(var45, new Class[]{Boolean.TYPE});
                     } catch (NoSuchMethodException var16) {
                        var48 = var16;
                        var10001 = false;
                        break label147;
                     } catch (IllegalAccessException var17) {
                        var47 = var17;
                        var10001 = false;
                        break label148;
                     } catch (InvocationTargetException var18) {
                        var10000 = var18;
                        var10001 = false;
                        break;
                     }

                     if (!(var2[0] > 0.5F)) {
                        var7 = false;
                     }

                     try {
                        var37.invoke(var1, new Object[]{var7});
                        return;
                     } catch (NoSuchMethodException var13) {
                        var48 = var13;
                        var10001 = false;
                        break label147;
                     } catch (IllegalAccessException var14) {
                        var47 = var14;
                        var10001 = false;
                        break label148;
                     } catch (InvocationTargetException var15) {
                        var10000 = var15;
                        var10001 = false;
                        break;
                     }
                  case 7:
                     try {
                        var9.getMethod(var45, new Class[]{Float.TYPE}).invoke(var1, new Object[]{var2[0]});
                        return;
                     } catch (NoSuchMethodException var10) {
                        var48 = var10;
                        var10001 = false;
                        break label147;
                     } catch (IllegalAccessException var11) {
                        var47 = var11;
                        var10001 = false;
                        break label148;
                     } catch (InvocationTargetException var12) {
                        var10000 = var12;
                        var10001 = false;
                        break;
                     }
                  default:
                     return;
               }
            }

            InvocationTargetException var38 = var10000;
            var38.printStackTrace();
            return;
         }

         IllegalAccessException var43 = var47;
         StringBuilder var39 = new StringBuilder();
         var39.append("cannot access method ");
         var39.append(var45);
         var39.append(" on View \"");
         var39.append(androidx.constraintlayout.motion.widget.a.b(var1));
         var39.append("\"");
         Log.e("CustomSupport", var39.toString());
         var43.printStackTrace();
         return;
      }

      NoSuchMethodException var40 = var48;
      StringBuilder var44 = new StringBuilder();
      var44.append("no method ");
      var44.append(var45);
      var44.append(" on View \"");
      var44.append(androidx.constraintlayout.motion.widget.a.b(var1));
      var44.append("\"");
      Log.e("CustomSupport", var44.toString());
      var40.printStackTrace();
   }
}
