package w3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class g {
   private final Object a;
   private final c b;

   g(Object var1, c var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public static i a(String var0) {
      return e(var0);
   }

   public static g c(Context var0, Class var1) {
      return new g(var0, new b(var1));
   }

   private static i d(String var0) {
      try {
         Class var1 = Class.forName(var0);
         if (i.class.isAssignableFrom(var1)) {
            return (i)var1.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
         } else {
            InvalidRegistrarException var7 = new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{var0, "com.google.firebase.components.ComponentRegistrar"}));
            throw var7;
         }
      } catch (ClassNotFoundException var2) {
         Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{var0}));
         return null;
      } catch (IllegalAccessException var3) {
         throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{var0}), var3);
      } catch (InstantiationException var4) {
         throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{var0}), var4);
      } catch (NoSuchMethodException var5) {
         throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{var0}), var5);
      } catch (InvocationTargetException var6) {
         throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{var0}), var6);
      }
   }

   // $FF: synthetic method
   private static i e(String var0) {
      return d(var0);
   }

   public List b() {
      ArrayList var2 = new ArrayList();
      Iterator var1 = this.b.a(this.a).iterator();

      while(var1.hasNext()) {
         var2.add(new f((String)var1.next()));
      }

      return var2;
   }

   private static class b implements c {
      private final Class a;

      private b(Class var1) {
         this.a = var1;
      }

      // $FF: synthetic method
      b(Class var1, Object var2) {
         this(var1);
      }

      private Bundle b(Context var1) {
         label39: {
            boolean var10001;
            PackageManager var3;
            try {
               var3 = var1.getPackageManager();
            } catch (PackageManager.NameNotFoundException var8) {
               var10001 = false;
               break label39;
            }

            if (var3 == null) {
               try {
                  Log.w("ComponentDiscovery", "Context has no PackageManager.");
                  return null;
               } catch (PackageManager.NameNotFoundException var4) {
                  var10001 = false;
               }
            } else {
               label35: {
                  ServiceInfo var9;
                  try {
                     ComponentName var2 = new ComponentName(var1, this.a);
                     var9 = var3.getServiceInfo(var2, 128);
                  } catch (PackageManager.NameNotFoundException var7) {
                     var10001 = false;
                     break label35;
                  }

                  if (var9 == null) {
                     try {
                        StringBuilder var10 = new StringBuilder();
                        var10.append(this.a);
                        var10.append(" has no service info.");
                        Log.w("ComponentDiscovery", var10.toString());
                        return null;
                     } catch (PackageManager.NameNotFoundException var5) {
                        var10001 = false;
                     }
                  } else {
                     try {
                        Bundle var11 = var9.metaData;
                        return var11;
                     } catch (PackageManager.NameNotFoundException var6) {
                        var10001 = false;
                     }
                  }
               }
            }
         }

         Log.w("ComponentDiscovery", "Application info not found.");
         return null;
      }

      public List c(Context var1) {
         Bundle var5 = this.b(var1);
         if (var5 == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            return Collections.emptyList();
         } else {
            ArrayList var4 = new ArrayList();
            Iterator var3 = var5.keySet().iterator();

            while(var3.hasNext()) {
               String var2 = (String)var3.next();
               if ("com.google.firebase.components.ComponentRegistrar".equals(var5.get(var2)) && var2.startsWith("com.google.firebase.components:")) {
                  var4.add(var2.substring(31));
               }
            }

            return var4;
         }
      }
   }

   interface c {
      List a(Object var1);
   }
}
