package g5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.tmobile.rsuapp.services.SimLockService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class c extends h6.a.b {
   private static final String d = "c";
   private final Context b;
   private final File c;

   @SuppressLint({"LogNotTimber"})
   public c(Context var1) {
      this.b = var1;
      StringBuilder var2 = new StringBuilder();
      var2.append(System.currentTimeMillis());
      var2.append("-log.txt");
      String var5 = var2.toString();
      File var4 = new File(var1.getFilesDir(), "logs");
      if (!var4.isDirectory()) {
         var4.mkdir();
      }

      var4 = new File(var4, var5);
      this.c = var4;

      try {
         var4.createNewFile();
      } catch (IOException var3) {
      }

      this.q();
   }

   // $FF: synthetic method
   public static void n(Context var0, int var1, androidx.work.b var2) {
      p(var0, var1, var2);
   }

   public static ArrayList o(Context var0) {
      File[] var1 = (new File(var0.getFilesDir(), "logs")).listFiles(new c$a());
      Objects.requireNonNull(var1);
      return new ArrayList(Arrays.asList((File[])var1));
   }

   // $FF: synthetic method
   private static void p(Context var0, int var1, androidx.work.b var2) {
      if (var1 == 0) {
         s(var0, var2.j("key-result-string"));
      } else {
         h6.a.b(d).a("Could not retrieve IMEI to send report, using 0000 instead");
         s(var0, "0000");
      }

   }

   private void q() {
      ArrayList var3 = o(this.b);
      String var1 = d;
      h6.a.b var2 = h6.a.b(var1);
      StringBuilder var4 = new StringBuilder();
      var4.append("Got ");
      var4.append(var3.size());
      var4.append(" files");
      var2.a(var4.toString());
      Collections.sort(var3);
      List var5 = var3.subList(0, Math.max(var3.size() - 2, 0));
      h6.a.b(var1).a("Removing files: %s", var5.toString());
      var5.forEach(new b());
   }

   public static void r(Context var0) {
      SimLockService.B(var0, "com.tmobile.rsuapp.GET_IMEI", (Uri)null, (androidx.work.b)null, new a(var0));
   }

   private static void s(Context var0, String var1) {
      Intent var2 = new Intent("android.intent.action.SEND_MULTIPLE");
      ArrayList var3 = new ArrayList();
      Iterator var4 = o(var0).iterator();

      while(var4.hasNext()) {
         var3.add(androidx.core.content.b.f(var0, "com.tmobile.rsuapp.FileProvider", (File)var4.next()));
      }

      StringBuilder var5 = new StringBuilder();
      var5.append(f.a(8));
      var5.append("-");
      var5.append(var1.substring(Math.max(0, var1.length() - 4)));
      var1 = var5.toString();
      var2.setType("*/*");
      var2.putExtra("android.intent.extra.EMAIL", new String[]{"TMODeviceUnlock@t-mobile.com"});
      var2.putExtra("android.intent.extra.SUBJECT", var1);
      var2.putExtra("android.intent.extra.STREAM", var3);
      var2.addFlags(3);
      if (var2.resolveActivity(var0.getPackageManager()) != null) {
         var0.startActivity(var2);
      } else {
         h6.a.b(d).b("No activity resolver found");
      }

   }

   @SuppressLint({"LogNotTimber"})
   private void t(String var1) {
      try {
         FileWriter var2 = new FileWriter(this.c, true);
         var2.write(var1);
         var2.close();
      } catch (FileNotFoundException var3) {
         Log.e(d, "Failed to open file", var3);
      } catch (IOException var4) {
         Log.e(d, "File write failed: ", var4);
      }

   }

   protected void i(int var1, String var2, String var3, Throwable var4) {
      String var5 = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);
      if (var4 != null) {
         StringBuilder var6 = new StringBuilder();
         var6.append(var5);
         var6.append(" ");
         var6.append(var2);
         var6.append(" ");
         var6.append(var3);
         var6.append(" ");
         var6.append(var4.getMessage());
         var6.append("\n");
         var6.append(Arrays.toString(var4.getStackTrace()));
         this.t(var6.toString());
      } else {
         StringBuilder var7 = new StringBuilder();
         var7.append(var5);
         var7.append(" ");
         var7.append(var2);
         var7.append(" ");
         var7.append(var3);
         var7.append("\n");
         this.t(var7.toString());
      }

   }
}
