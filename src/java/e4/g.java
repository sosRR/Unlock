package e4;

import android.util.Base64;
import android.util.JsonReader;
import d4.a0;
import d4.b0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class g {
   private static final m4.a a;

   static {
      a = (new o4.d()).j(d4.a.a).k(true).i();
   }

   private static a0 A(JsonReader var0) {
      a0.b var3 = a0.b();
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         var4.hashCode();
         int var2 = var4.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -2118372775:
               if (var4.equals("ndkPayload")) {
                  var1 = 0;
               }
               break;
            case -1962630338:
               if (var4.equals("sdkVersion")) {
                  var1 = 1;
               }
               break;
            case -911706486:
               if (var4.equals("buildVersion")) {
                  var1 = 2;
               }
               break;
            case 344431858:
               if (var4.equals("gmpAppId")) {
                  var1 = 3;
               }
               break;
            case 719853845:
               if (var4.equals("installationUuid")) {
                  var1 = 4;
               }
               break;
            case 1874684019:
               if (var4.equals("platform")) {
                  var1 = 5;
               }
               break;
            case 1975623094:
               if (var4.equals("displayVersion")) {
                  var1 = 6;
               }
               break;
            case 1984987798:
               if (var4.equals("session")) {
                  var1 = 7;
               }
         }

         switch (var1) {
            case 0:
               var3.f(y(var0));
               break;
            case 1:
               var3.h(var0.nextString());
               break;
            case 2:
               var3.b(var0.nextString());
               break;
            case 3:
               var3.d(var0.nextString());
               break;
            case 4:
               var3.e(var0.nextString());
               break;
            case 5:
               var3.g(var0.nextInt());
               break;
            case 6:
               var3.c(var0.nextString());
               break;
            case 7:
               var3.i(B(var0));
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var3.a();
   }

   private static a0.e B(JsonReader var0) {
      a0.e.b var4 = a0.e.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var3 = var0.nextName();
         var3.hashCode();
         int var2 = var3.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -2128794476:
               if (var3.equals("startedAt")) {
                  var1 = 0;
               }
               break;
            case -1618432855:
               if (var3.equals("identifier")) {
                  var1 = 1;
               }
               break;
            case -1606742899:
               if (var3.equals("endedAt")) {
                  var1 = 2;
               }
               break;
            case -1335157162:
               if (var3.equals("device")) {
                  var1 = 3;
               }
               break;
            case -1291329255:
               if (var3.equals("events")) {
                  var1 = 4;
               }
               break;
            case 3556:
               if (var3.equals("os")) {
                  var1 = 5;
               }
               break;
            case 96801:
               if (var3.equals("app")) {
                  var1 = 6;
               }
               break;
            case 3599307:
               if (var3.equals("user")) {
                  var1 = 7;
               }
               break;
            case 286956243:
               if (var3.equals("generator")) {
                  var1 = 8;
               }
               break;
            case 1025385094:
               if (var3.equals("crashed")) {
                  var1 = 9;
               }
               break;
            case 2047016109:
               if (var3.equals("generatorType")) {
                  var1 = 10;
               }
         }

         switch (var1) {
            case 0:
               var4.l(var0.nextLong());
               break;
            case 1:
               var4.j(Base64.decode(var0.nextString(), 2));
               break;
            case 2:
               var4.e(var0.nextLong());
               break;
            case 3:
               var4.d(m(var0));
               break;
            case 4:
               var4.f(k(var0, new e4.a()));
               break;
            case 5:
               var4.k(z(var0));
               break;
            case 6:
               var4.b(i(var0));
               break;
            case 7:
               var4.m(C(var0));
               break;
            case 8:
               var4.g(var0.nextString());
               break;
            case 9:
               var4.c(var0.nextBoolean());
               break;
            case 10:
               var4.h(var0.nextInt());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var4.a();
   }

   private static a0.e.f C(JsonReader var0) {
      a0.e.f.a var2 = a0.e.f.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var1 = var0.nextName();
         var1.hashCode();
         if (!var1.equals("identifier")) {
            var0.skipValue();
         } else {
            var2.b(var0.nextString());
         }
      }

      var0.endObject();
      return var2.a();
   }

   // $FF: synthetic method
   public static a0.e.d a(JsonReader var0) {
      return n(var0);
   }

   // $FF: synthetic method
   public static a0.e.d.a.b.e.b b(JsonReader var0) {
      return t(var0);
   }

   // $FF: synthetic method
   public static a0.e.d.a.b.e c(JsonReader var0) {
      return w(var0);
   }

   // $FF: synthetic method
   public static a0.d.b d(JsonReader var0) {
      return x(var0);
   }

   // $FF: synthetic method
   public static a0.e.d.a.b.a e(JsonReader var0) {
      return p(var0);
   }

   // $FF: synthetic method
   public static a0.c f(JsonReader var0) {
      return l(var0);
   }

   private static a0.e.a i(JsonReader var0) {
      a0.e.a.a var3 = a0.e.a.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         var4.hashCode();
         int var2 = var4.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1618432855:
               if (var4.equals("identifier")) {
                  var1 = 0;
               }
               break;
            case -519438642:
               if (var4.equals("developmentPlatform")) {
                  var1 = 1;
               }
               break;
            case 213652010:
               if (var4.equals("developmentPlatformVersion")) {
                  var1 = 2;
               }
               break;
            case 351608024:
               if (var4.equals("version")) {
                  var1 = 3;
               }
               break;
            case 719853845:
               if (var4.equals("installationUuid")) {
                  var1 = 4;
               }
               break;
            case 1975623094:
               if (var4.equals("displayVersion")) {
                  var1 = 5;
               }
         }

         switch (var1) {
            case 0:
               var3.e(var0.nextString());
               break;
            case 1:
               var3.b(var0.nextString());
               break;
            case 2:
               var3.c(var0.nextString());
               break;
            case 3:
               var3.g(var0.nextString());
               break;
            case 4:
               var3.f(var0.nextString());
               break;
            case 5:
               var3.d(var0.nextString());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var3.a();
   }

   private static a0.a j(JsonReader var0) {
      a0.a.a var3 = a0.a.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         var4.hashCode();
         int var2 = var4.hashCode();
         byte var1 = -1;
         switch (var2) {
            case 110987:
               if (var4.equals("pid")) {
                  var1 = 0;
               }
               break;
            case 111312:
               if (var4.equals("pss")) {
                  var1 = 1;
               }
               break;
            case 113234:
               if (var4.equals("rss")) {
                  var1 = 2;
               }
               break;
            case 55126294:
               if (var4.equals("timestamp")) {
                  var1 = 3;
               }
               break;
            case 202325402:
               if (var4.equals("processName")) {
                  var1 = 4;
               }
               break;
            case 722137681:
               if (var4.equals("reasonCode")) {
                  var1 = 5;
               }
               break;
            case 723857505:
               if (var4.equals("traceFile")) {
                  var1 = 6;
               }
               break;
            case 2125650548:
               if (var4.equals("importance")) {
                  var1 = 7;
               }
         }

         switch (var1) {
            case 0:
               var3.c(var0.nextInt());
               break;
            case 1:
               var3.e(var0.nextLong());
               break;
            case 2:
               var3.g(var0.nextLong());
               break;
            case 3:
               var3.h(var0.nextLong());
               break;
            case 4:
               var3.d(var0.nextString());
               break;
            case 5:
               var3.f(var0.nextInt());
               break;
            case 6:
               var3.i(var0.nextString());
               break;
            case 7:
               var3.b(var0.nextInt());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var3.a();
   }

   private static b0 k(JsonReader var0, a var1) {
      ArrayList var2 = new ArrayList();
      var0.beginArray();

      while(var0.hasNext()) {
         var2.add(var1.a(var0));
      }

      var0.endArray();
      return b0.d(var2);
   }

   private static a0.c l(JsonReader var0) {
      a0.c.a var2 = a0.c.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var1 = var0.nextName();
         var1.hashCode();
         if (!var1.equals("key")) {
            if (!var1.equals("value")) {
               var0.skipValue();
            } else {
               var2.c(var0.nextString());
            }
         } else {
            var2.b(var0.nextString());
         }
      }

      var0.endObject();
      return var2.a();
   }

   private static a0.e.c m(JsonReader var0) {
      a0.e.c.a var3 = a0.e.c.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         var4.hashCode();
         int var2 = var4.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1981332476:
               if (var4.equals("simulator")) {
                  var1 = 0;
               }
               break;
            case -1969347631:
               if (var4.equals("manufacturer")) {
                  var1 = 1;
               }
               break;
            case 112670:
               if (var4.equals("ram")) {
                  var1 = 2;
               }
               break;
            case 3002454:
               if (var4.equals("arch")) {
                  var1 = 3;
               }
               break;
            case 81784169:
               if (var4.equals("diskSpace")) {
                  var1 = 4;
               }
               break;
            case 94848180:
               if (var4.equals("cores")) {
                  var1 = 5;
               }
               break;
            case 104069929:
               if (var4.equals("model")) {
                  var1 = 6;
               }
               break;
            case 109757585:
               if (var4.equals("state")) {
                  var1 = 7;
               }
               break;
            case 2078953423:
               if (var4.equals("modelClass")) {
                  var1 = 8;
               }
         }

         switch (var1) {
            case 0:
               var3.i(var0.nextBoolean());
               break;
            case 1:
               var3.e(var0.nextString());
               break;
            case 2:
               var3.h(var0.nextLong());
               break;
            case 3:
               var3.b(var0.nextInt());
               break;
            case 4:
               var3.d(var0.nextLong());
               break;
            case 5:
               var3.c(var0.nextInt());
               break;
            case 6:
               var3.f(var0.nextString());
               break;
            case 7:
               var3.j(var0.nextInt());
               break;
            case 8:
               var3.g(var0.nextString());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var3.a();
   }

   private static a0.e.d n(JsonReader var0) {
      a0.e.d.b var4 = a0.e.d.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var3 = var0.nextName();
         var3.hashCode();
         int var2 = var3.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1335157162:
               if (var3.equals("device")) {
                  var1 = 0;
               }
               break;
            case 96801:
               if (var3.equals("app")) {
                  var1 = 1;
               }
               break;
            case 107332:
               if (var3.equals("log")) {
                  var1 = 2;
               }
               break;
            case 3575610:
               if (var3.equals("type")) {
                  var1 = 3;
               }
               break;
            case 55126294:
               if (var3.equals("timestamp")) {
                  var1 = 4;
               }
         }

         switch (var1) {
            case 0:
               var4.c(q(var0));
               break;
            case 1:
               var4.b(o(var0));
               break;
            case 2:
               var4.d(u(var0));
               break;
            case 3:
               var4.f(var0.nextString());
               break;
            case 4:
               var4.e(var0.nextLong());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var4.a();
   }

   private static a0.e.d.a o(JsonReader var0) {
      a0.e.d.a.a var4 = a0.e.d.a.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var3 = var0.nextName();
         var3.hashCode();
         int var2 = var3.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1332194002:
               if (var3.equals("background")) {
                  var1 = 0;
               }
               break;
            case -1090974952:
               if (var3.equals("execution")) {
                  var1 = 1;
               }
               break;
            case -80231855:
               if (var3.equals("internalKeys")) {
                  var1 = 2;
               }
               break;
            case 555169704:
               if (var3.equals("customAttributes")) {
                  var1 = 3;
               }
               break;
            case 928737948:
               if (var3.equals("uiOrientation")) {
                  var1 = 4;
               }
         }

         switch (var1) {
            case 0:
               var4.b(var0.nextBoolean());
               break;
            case 1:
               var4.d(r(var0));
               break;
            case 2:
               var4.e(k(var0, new c()));
               break;
            case 3:
               var4.c(k(var0, new c()));
               break;
            case 4:
               var4.f(var0.nextInt());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var4.a();
   }

   private static a0.e.d.a.b.a p(JsonReader var0) {
      a0.e.d.a.b.a.a var3 = a0.e.d.a.b.a.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         var4.hashCode();
         int var2 = var4.hashCode();
         byte var1 = -1;
         switch (var2) {
            case 3373707:
               if (var4.equals("name")) {
                  var1 = 0;
               }
               break;
            case 3530753:
               if (var4.equals("size")) {
                  var1 = 1;
               }
               break;
            case 3601339:
               if (var4.equals("uuid")) {
                  var1 = 2;
               }
               break;
            case 1153765347:
               if (var4.equals("baseAddress")) {
                  var1 = 3;
               }
         }

         switch (var1) {
            case 0:
               var3.c(var0.nextString());
               break;
            case 1:
               var3.d(var0.nextLong());
               break;
            case 2:
               var3.f(Base64.decode(var0.nextString(), 2));
               break;
            case 3:
               var3.b(var0.nextLong());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var3.a();
   }

   private static a0.e.d.c q(JsonReader var0) {
      a0.e.d.c.a var3 = a0.e.d.c.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         var4.hashCode();
         int var2 = var4.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1708606089:
               if (var4.equals("batteryLevel")) {
                  var1 = 0;
               }
               break;
            case -1455558134:
               if (var4.equals("batteryVelocity")) {
                  var1 = 1;
               }
               break;
            case -1439500848:
               if (var4.equals("orientation")) {
                  var1 = 2;
               }
               break;
            case 279795450:
               if (var4.equals("diskUsed")) {
                  var1 = 3;
               }
               break;
            case 976541947:
               if (var4.equals("ramUsed")) {
                  var1 = 4;
               }
               break;
            case 1516795582:
               if (var4.equals("proximityOn")) {
                  var1 = 5;
               }
         }

         switch (var1) {
            case 0:
               var3.b(var0.nextDouble());
               break;
            case 1:
               var3.c(var0.nextInt());
               break;
            case 2:
               var3.e(var0.nextInt());
               break;
            case 3:
               var3.d(var0.nextLong());
               break;
            case 4:
               var3.g(var0.nextLong());
               break;
            case 5:
               var3.f(var0.nextBoolean());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var3.a();
   }

   private static a0.e.d.a.b r(JsonReader var0) {
      a0.e.d.a.b.b var4 = a0.e.d.a.b.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var3 = var0.nextName();
         var3.hashCode();
         int var2 = var3.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1375141843:
               if (var3.equals("appExitInfo")) {
                  var1 = 0;
               }
               break;
            case -1337936983:
               if (var3.equals("threads")) {
                  var1 = 1;
               }
               break;
            case -902467928:
               if (var3.equals("signal")) {
                  var1 = 2;
               }
               break;
            case 937615455:
               if (var3.equals("binaries")) {
                  var1 = 3;
               }
               break;
            case 1481625679:
               if (var3.equals("exception")) {
                  var1 = 4;
               }
         }

         switch (var1) {
            case 0:
               var4.b(j(var0));
               break;
            case 1:
               var4.f(k(var0, new d()));
               break;
            case 2:
               var4.e(v(var0));
               break;
            case 3:
               var4.c(k(var0, new e()));
               break;
            case 4:
               var4.d(s(var0));
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var4.a();
   }

   private static a0.e.d.a.b.c s(JsonReader var0) {
      a0.e.d.a.b.c.a var4 = a0.e.d.a.b.c.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var3 = var0.nextName();
         var3.hashCode();
         int var2 = var3.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1266514778:
               if (var3.equals("frames")) {
                  var1 = 0;
               }
               break;
            case -934964668:
               if (var3.equals("reason")) {
                  var1 = 1;
               }
               break;
            case 3575610:
               if (var3.equals("type")) {
                  var1 = 2;
               }
               break;
            case 91997906:
               if (var3.equals("causedBy")) {
                  var1 = 3;
               }
               break;
            case 581754413:
               if (var3.equals("overflowCount")) {
                  var1 = 4;
               }
         }

         switch (var1) {
            case 0:
               var4.c(k(var0, new f()));
               break;
            case 1:
               var4.e(var0.nextString());
               break;
            case 2:
               var4.f(var0.nextString());
               break;
            case 3:
               var4.b(s(var0));
               break;
            case 4:
               var4.d(var0.nextInt());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var4.a();
   }

   private static a0.e.d.a.b.e.b t(JsonReader var0) {
      a0.e.d.a.b.e.b.a var4 = a0.e.d.a.b.e.b.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var3 = var0.nextName();
         var3.hashCode();
         int var2 = var3.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1019779949:
               if (var3.equals("offset")) {
                  var1 = 0;
               }
               break;
            case -887523944:
               if (var3.equals("symbol")) {
                  var1 = 1;
               }
               break;
            case 3571:
               if (var3.equals("pc")) {
                  var1 = 2;
               }
               break;
            case 3143036:
               if (var3.equals("file")) {
                  var1 = 3;
               }
               break;
            case 2125650548:
               if (var3.equals("importance")) {
                  var1 = 4;
               }
         }

         switch (var1) {
            case 0:
               var4.d(var0.nextLong());
               break;
            case 1:
               var4.f(var0.nextString());
               break;
            case 2:
               var4.e(var0.nextLong());
               break;
            case 3:
               var4.b(var0.nextString());
               break;
            case 4:
               var4.c(var0.nextInt());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var4.a();
   }

   private static a0.e.d.d u(JsonReader var0) {
      a0.e.d.d.a var2 = a0.e.d.d.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var1 = var0.nextName();
         var1.hashCode();
         if (!var1.equals("content")) {
            var0.skipValue();
         } else {
            var2.b(var0.nextString());
         }
      }

      var0.endObject();
      return var2.a();
   }

   private static a0.e.d.a.b.d v(JsonReader var0) {
      a0.e.d.a.b.d.a var3 = a0.e.d.a.b.d.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         var4.hashCode();
         int var2 = var4.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1147692044:
               if (var4.equals("address")) {
                  var1 = 0;
               }
               break;
            case 3059181:
               if (var4.equals("code")) {
                  var1 = 1;
               }
               break;
            case 3373707:
               if (var4.equals("name")) {
                  var1 = 2;
               }
         }

         switch (var1) {
            case 0:
               var3.b(var0.nextLong());
               break;
            case 1:
               var3.c(var0.nextString());
               break;
            case 2:
               var3.d(var0.nextString());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var3.a();
   }

   private static a0.e.d.a.b.e w(JsonReader var0) {
      a0.e.d.a.b.e.a var3 = a0.e.d.a.b.e.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         var4.hashCode();
         int var2 = var4.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -1266514778:
               if (var4.equals("frames")) {
                  var1 = 0;
               }
               break;
            case 3373707:
               if (var4.equals("name")) {
                  var1 = 1;
               }
               break;
            case 2125650548:
               if (var4.equals("importance")) {
                  var1 = 2;
               }
         }

         switch (var1) {
            case 0:
               var3.b(k(var0, new f()));
               break;
            case 1:
               var3.d(var0.nextString());
               break;
            case 2:
               var3.c(var0.nextInt());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var3.a();
   }

   private static a0.d.b x(JsonReader var0) {
      a0.d.b.a var2 = a0.d.b.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var1 = var0.nextName();
         var1.hashCode();
         if (!var1.equals("filename")) {
            if (!var1.equals("contents")) {
               var0.skipValue();
            } else {
               var2.b(Base64.decode(var0.nextString(), 2));
            }
         } else {
            var2.c(var0.nextString());
         }
      }

      var0.endObject();
      return var2.a();
   }

   private static a0.d y(JsonReader var0) {
      a0.d.a var1 = a0.d.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var2 = var0.nextName();
         var2.hashCode();
         if (!var2.equals("files")) {
            if (!var2.equals("orgId")) {
               var0.skipValue();
            } else {
               var1.c(var0.nextString());
            }
         } else {
            var1.b(k(var0, new b()));
         }
      }

      var0.endObject();
      return var1.a();
   }

   private static a0.e.e z(JsonReader var0) {
      a0.e.e.a var4 = a0.e.e.a();
      var0.beginObject();

      while(var0.hasNext()) {
         String var3 = var0.nextName();
         var3.hashCode();
         int var2 = var3.hashCode();
         byte var1 = -1;
         switch (var2) {
            case -911706486:
               if (var3.equals("buildVersion")) {
                  var1 = 0;
               }
               break;
            case -293026577:
               if (var3.equals("jailbroken")) {
                  var1 = 1;
               }
               break;
            case 351608024:
               if (var3.equals("version")) {
                  var1 = 2;
               }
               break;
            case 1874684019:
               if (var3.equals("platform")) {
                  var1 = 3;
               }
         }

         switch (var1) {
            case 0:
               var4.b(var0.nextString());
               break;
            case 1:
               var4.c(var0.nextBoolean());
               break;
            case 2:
               var4.e(var0.nextString());
               break;
            case 3:
               var4.d(var0.nextInt());
               break;
            default:
               var0.skipValue();
         }
      }

      var0.endObject();
      return var4.a();
   }

   public a0 D(String var1) {
      IllegalStateException var10000;
      label116: {
         JsonReader var2;
         boolean var10001;
         try {
            StringReader var3 = new StringReader(var1);
            var2 = new JsonReader(var3);
         } catch (IllegalStateException var21) {
            var10000 = var21;
            var10001 = false;
            break label116;
         }

         a0 var23;
         try {
            var23 = A(var2);
         } catch (Throwable var20) {
            Throwable var22 = var20;

            try {
               var2.close();
            } catch (Throwable var18) {
               Throwable var25 = var18;

               label101:
               try {
                  var22.addSuppressed(var25);
                  break label101;
               } catch (IllegalStateException var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label116;
               }
            }

            try {
               throw var22;
            } catch (IllegalStateException var16) {
               var10000 = var16;
               var10001 = false;
               break label116;
            }
         }

         try {
            var2.close();
            return var23;
         } catch (IllegalStateException var19) {
            var10000 = var19;
            var10001 = false;
         }
      }

      IllegalStateException var24 = var10000;
      throw new IOException(var24);
   }

   public String E(a0 var1) {
      return a.a(var1);
   }

   public a0.e.d g(String var1) {
      IllegalStateException var10000;
      label116: {
         JsonReader var2;
         boolean var10001;
         try {
            StringReader var3 = new StringReader(var1);
            var2 = new JsonReader(var3);
         } catch (IllegalStateException var21) {
            var10000 = var21;
            var10001 = false;
            break label116;
         }

         a0.e.d var23;
         try {
            var23 = n(var2);
         } catch (Throwable var20) {
            Throwable var22 = var20;

            try {
               var2.close();
            } catch (Throwable var18) {
               Throwable var25 = var18;

               label101:
               try {
                  var22.addSuppressed(var25);
                  break label101;
               } catch (IllegalStateException var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label116;
               }
            }

            try {
               throw var22;
            } catch (IllegalStateException var16) {
               var10000 = var16;
               var10001 = false;
               break label116;
            }
         }

         try {
            var2.close();
            return var23;
         } catch (IllegalStateException var19) {
            var10000 = var19;
            var10001 = false;
         }
      }

      IllegalStateException var24 = var10000;
      throw new IOException(var24);
   }

   public String h(a0.e.d var1) {
      return a.a(var1);
   }

   private interface a {
      Object a(JsonReader var1);
   }
}
