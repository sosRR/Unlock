package l1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class k implements e {
   private final <undefinedtype> a;
   private final i b;
   private final Map c;

   k(Context var1, i var2) {
      this((<undefinedtype>)(new Object(var1) {
         private final Context a;
         private Map b = null;

         {
            this.a = var1;
         }

         private Map a(Context var1) {
            Bundle var4 = d(var1);
            if (var4 == null) {
               Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
               return Collections.emptyMap();
            } else {
               HashMap var9 = new HashMap();
               Iterator var5 = var4.keySet().iterator();

               while(true) {
                  String var6;
                  Object var7;
                  do {
                     do {
                        if (!var5.hasNext()) {
                           return var9;
                        }

                        var6 = (String)var5.next();
                        var7 = var4.get(var6);
                     } while(!(var7 instanceof String));
                  } while(!var6.startsWith("backend:"));

                  String[] var10 = ((String)var7).split(",", -1);
                  int var3 = var10.length;

                  for(int var2 = 0; var2 < var3; ++var2) {
                     String var8 = var10[var2].trim();
                     if (!var8.isEmpty()) {
                        var9.put(var8, var6.substring(8));
                     }
                  }
               }
            }
         }

         private Map c() {
            if (this.b == null) {
               this.b = this.a(this.a);
            }

            return this.b;
         }

         private static Bundle d(Context var0) {
            label39: {
               PackageManager var1;
               boolean var10001;
               try {
                  var1 = var0.getPackageManager();
               } catch (PackageManager.NameNotFoundException var7) {
                  var10001 = false;
                  break label39;
               }

               if (var1 == null) {
                  try {
                     Log.w("BackendRegistry", "Context has no PackageManager.");
                     return null;
                  } catch (PackageManager.NameNotFoundException var3) {
                     var10001 = false;
                  }
               } else {
                  label35: {
                     ServiceInfo var8;
                     try {
                        ComponentName var2 = new ComponentName(var0, TransportBackendDiscovery.class);
                        var8 = var1.getServiceInfo(var2, 128);
                     } catch (PackageManager.NameNotFoundException var6) {
                        var10001 = false;
                        break label35;
                     }

                     if (var8 == null) {
                        try {
                           Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                           return null;
                        } catch (PackageManager.NameNotFoundException var4) {
                           var10001 = false;
                        }
                     } else {
                        try {
                           Bundle var9 = var8.metaData;
                           return var9;
                        } catch (PackageManager.NameNotFoundException var5) {
                           var10001 = false;
                        }
                     }
                  }
               }
            }

            Log.w("BackendRegistry", "Application info not found.");
            return null;
         }

         d b(String var1) {
            var1 = (String)this.c().get(var1);
            if (var1 == null) {
               return null;
            } else {
               try {
                  d var2 = (d)Class.forName(var1).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                  return var2;
               } catch (ClassNotFoundException var3) {
                  Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{var1}), var3);
               } catch (IllegalAccessException var4) {
                  Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{var1}), var4);
               } catch (InstantiationException var5) {
                  Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{var1}), var5);
               } catch (NoSuchMethodException var6) {
                  Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{var1}), var6);
               } catch (InvocationTargetException var7) {
                  Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{var1}), var7);
               }

               return null;
            }
         }
      }), var2);
   }

   k(Object var1, i var2) {
      this.c = new HashMap();
      this.a = var1;
      this.b = var2;
   }

   public m a(String var1) {
      synchronized(this){}

      Throwable var10000;
      label152: {
         boolean var10001;
         try {
            if (this.c.containsKey(var1)) {
               m var17 = (m)this.c.get(var1);
               return var17;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label152;
         }

         d var2;
         try {
            var2 = this.a.b(var1);
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label152;
         }

         if (var2 == null) {
            return null;
         }

         m var18;
         try {
            var18 = var2.create(this.b.a(var1));
            this.c.put(var1, var18);
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label152;
         }

         return var18;
      }

      Throwable var16 = var10000;
      throw var16;
   }
}
