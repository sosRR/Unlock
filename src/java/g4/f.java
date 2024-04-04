package g4;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class f {
   private final File a;
   private final File b;
   private final File c;
   private final File d;
   private final File e;
   private final File f;

   public f(Context var1) {
      File var2 = var1.getFilesDir();
      this.a = var2;
      String var4;
      if (v()) {
         StringBuilder var3 = new StringBuilder();
         var3.append(".com.google.firebase.crashlytics.files.v2");
         var3.append(File.pathSeparator);
         var3.append(u(Application.getProcessName()));
         var4 = var3.toString();
      } else {
         var4 = ".com.google.firebase.crashlytics.files.v1";
      }

      File var5 = q(new File(var2, var4));
      this.b = var5;
      this.c = q(new File(var5, "open-sessions"));
      this.d = q(new File(var5, "reports"));
      this.e = q(new File(var5, "priority-reports"));
      this.f = q(new File(var5, "native-reports"));
   }

   private void a(File var1) {
      if (var1.exists() && s(var1)) {
         y3.f var3 = y3.f.f();
         StringBuilder var2 = new StringBuilder();
         var2.append("Deleted previous Crashlytics file system: ");
         var2.append(var1.getPath());
         var3.b(var2.toString());
      }

   }

   private File n(String var1) {
      return r(new File(this.c, var1));
   }

   private static File q(File var0) {
      Class var4 = f.class;
      synchronized(f.class){}

      Throwable var10000;
      label163: {
         boolean var10001;
         y3.f var2;
         StringBuilder var3;
         label164: {
            boolean var1;
            try {
               if (!var0.exists()) {
                  break label164;
               }

               var1 = var0.isDirectory();
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label163;
            }

            if (var1) {
               return var0;
            }

            try {
               var2 = y3.f.f();
               var3 = new StringBuilder();
               var3.append("Unexpected non-directory file: ");
               var3.append(var0);
               var3.append("; deleting file and creating new directory.");
               var2.b(var3.toString());
               var0.delete();
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label163;
            }
         }

         try {
            if (!var0.mkdirs()) {
               var2 = y3.f.f();
               var3 = new StringBuilder();
               var3.append("Could not create Crashlytics-specific directory: ");
               var3.append(var0);
               var2.d(var3.toString());
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label163;
         }

         return var0;
      }

      Throwable var17 = var10000;
      throw var17;
   }

   private static File r(File var0) {
      var0.mkdirs();
      return var0;
   }

   static boolean s(File var0) {
      File[] var3 = var0.listFiles();
      if (var3 != null) {
         int var2 = var3.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            s(var3[var1]);
         }
      }

      return var0.delete();
   }

   private static List t(Object[] var0) {
      List var1;
      if (var0 == null) {
         var1 = Collections.emptyList();
      } else {
         var1 = Arrays.asList(var0);
      }

      return var1;
   }

   static String u(String var0) {
      return var0.replaceAll("[^a-zA-Z0-9.]", "_");
   }

   @SuppressLint({"AnnotateVersionCheck"})
   private static boolean v() {
      return true;
   }

   public void b() {
      this.a(new File(this.a, ".com.google.firebase.crashlytics"));
      this.a(new File(this.a, ".com.google.firebase.crashlytics-ndk"));
      if (v()) {
         this.a(new File(this.a, ".com.google.firebase.crashlytics.files.v1"));
      }

   }

   public boolean c(String var1) {
      return s(new File(this.c, var1));
   }

   public List d() {
      return t(this.c.list());
   }

   public File e(String var1) {
      return new File(this.b, var1);
   }

   public List f(FilenameFilter var1) {
      return t(this.b.listFiles(var1));
   }

   public File g(String var1) {
      return new File(this.f, var1);
   }

   public List h() {
      return t(this.f.listFiles());
   }

   public File i(String var1) {
      return r(new File(this.n(var1), "native"));
   }

   public File j(String var1) {
      return new File(this.e, var1);
   }

   public List k() {
      return t(this.e.listFiles());
   }

   public File l(String var1) {
      return new File(this.d, var1);
   }

   public List m() {
      return t(this.d.listFiles());
   }

   public File o(String var1, String var2) {
      return new File(this.n(var1), var2);
   }

   public List p(String var1, FilenameFilter var2) {
      return t(this.n(var1).listFiles(var2));
   }
}
