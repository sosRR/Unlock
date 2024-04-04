package b4;

import java.io.File;

final class b extends o {
   private final d4.a0 a;
   private final String b;
   private final File c;

   b(d4.a0 var1, String var2, File var3) {
      if (var1 != null) {
         this.a = var1;
         if (var2 != null) {
            this.b = var2;
            if (var3 != null) {
               this.c = var3;
            } else {
               throw new NullPointerException("Null reportFile");
            }
         } else {
            throw new NullPointerException("Null sessionId");
         }
      } else {
         throw new NullPointerException("Null report");
      }
   }

   public d4.a0 b() {
      return this.a;
   }

   public File c() {
      return this.c;
   }

   public String d() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof o)) {
         return false;
      } else {
         o var3 = (o)var1;
         if (!this.a.equals(var3.b()) || !this.b.equals(var3.d()) || !this.c.equals(var3.c())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CrashlyticsReportWithSessionId{report=");
      var1.append(this.a);
      var1.append(", sessionId=");
      var1.append(this.b);
      var1.append(", reportFile=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }
}
