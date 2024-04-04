package c4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

class e implements Closeable {
   private static final Logger s = Logger.getLogger(e.class.getName());
   private final RandomAccessFile m;
   int n;
   private int o;
   private b p;
   private b q;
   private final byte[] r = new byte[16];

   public e(File var1) {
      if (!var1.exists()) {
         L(var1);
      }

      this.m = P(var1);
      this.R();
   }

   private static void L(File var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append(var0.getPath());
      var1.append(".tmp");
      File var2 = new File(var1.toString());
      RandomAccessFile var6 = P(var2);

      try {
         var6.setLength(4096L);
         var6.seek(0L);
         byte[] var3 = new byte[16];
         c0(var3, 4096, 0, 0, 0);
         var6.write(var3);
      } finally {
         var6.close();
      }

      if (!var2.renameTo(var0)) {
         throw new IOException("Rename failed!");
      }
   }

   private static Object O(Object var0, String var1) {
      if (var0 != null) {
         return var0;
      } else {
         throw new NullPointerException(var1);
      }
   }

   private static RandomAccessFile P(File var0) {
      return new RandomAccessFile(var0, "rwd");
   }

   private b Q(int var1) {
      if (var1 == 0) {
         return e.b.c;
      } else {
         this.m.seek((long)var1);
         return new b(var1, this.m.readInt());
      }
   }

   private void R() {
      this.m.seek(0L);
      this.m.readFully(this.r);
      int var1 = S(this.r, 0);
      this.n = var1;
      if ((long)var1 <= this.m.length()) {
         this.o = S(this.r, 4);
         int var2 = S(this.r, 8);
         var1 = S(this.r, 12);
         this.p = this.Q(var2);
         this.q = this.Q(var1);
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("File is truncated. Expected length: ");
         var3.append(this.n);
         var3.append(", Actual length: ");
         var3.append(this.m.length());
         throw new IOException(var3.toString());
      }
   }

   private static int S(byte[] var0, int var1) {
      return ((var0[var1] & 255) << 24) + ((var0[var1 + 1] & 255) << 16) + ((var0[var1 + 2] & 255) << 8) + (var0[var1 + 3] & 255);
   }

   private int T() {
      return this.n - this.Y();
   }

   private void V(int var1, byte[] var2, int var3, int var4) {
      var1 = this.Z(var1);
      int var5 = this.n;
      if (var1 + var4 <= var5) {
         this.m.seek((long)var1);
         this.m.readFully(var2, var3, var4);
      } else {
         var5 -= var1;
         this.m.seek((long)var1);
         this.m.readFully(var2, var3, var5);
         this.m.seek(16L);
         this.m.readFully(var2, var3 + var5, var4 - var5);
      }

   }

   private void W(int var1, byte[] var2, int var3, int var4) {
      var1 = this.Z(var1);
      int var5 = this.n;
      if (var1 + var4 <= var5) {
         this.m.seek((long)var1);
         this.m.write(var2, var3, var4);
      } else {
         var5 -= var1;
         this.m.seek((long)var1);
         this.m.write(var2, var3, var5);
         this.m.seek(16L);
         this.m.write(var2, var3 + var5, var4 - var5);
      }

   }

   private void X(int var1) {
      this.m.setLength((long)var1);
      this.m.getChannel().force(true);
   }

   private int Z(int var1) {
      int var2 = this.n;
      if (var1 >= var2) {
         var1 = var1 + 16 - var2;
      }

      return var1;
   }

   private void a0(int var1, int var2, int var3, int var4) {
      c0(this.r, var1, var2, var3, var4);
      this.m.seek(0L);
      this.m.write(this.r);
   }

   private static void b0(byte[] var0, int var1, int var2) {
      var0[var1] = (byte)(var2 >> 24);
      var0[var1 + 1] = (byte)(var2 >> 16);
      var0[var1 + 2] = (byte)(var2 >> 8);
      var0[var1 + 3] = (byte)var2;
   }

   private static void c0(byte[] var0, int... var1) {
      int var4 = var1.length;
      int var3 = 0;

      for(int var2 = 0; var3 < var4; ++var3) {
         b0(var0, var2, var1[var3]);
         var2 += 4;
      }

   }

   private void z(int var1) {
      int var5 = var1 + 4;
      int var2 = this.T();
      if (var2 < var5) {
         var1 = this.n;

         int var3;
         int var4;
         do {
            var4 = var2 + var1;
            var3 = var1 << 1;
            var2 = var4;
            var1 = var3;
         } while(var4 < var5);

         this.X(var3);
         b var8 = this.q;
         var1 = this.Z(var8.a + 4 + var8.b);
         if (var1 < this.p.a) {
            FileChannel var9 = this.m.getChannel();
            var9.position((long)this.n);
            long var6 = (long)(var1 - 4);
            if (var9.transferTo(16L, var6, var9) != var6) {
               throw new AssertionError("Copied insufficient number of bytes!");
            }
         }

         var2 = this.q.a;
         var1 = this.p.a;
         if (var2 < var1) {
            var2 = this.n + var2 - 16;
            this.a0(var3, this.o, var1, var2);
            this.q = new b(var2, this.q.b);
         } else {
            this.a0(var3, this.o, var1, var2);
         }

         this.n = var3;
      }
   }

   public void E(d var1) {
      synchronized(this){}

      Throwable var10000;
      label90: {
         boolean var10001;
         int var3;
         try {
            var3 = this.p.a;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            break label90;
         }

         int var2 = 0;

         while(true) {
            try {
               if (var2 >= this.o) {
                  return;
               }

               b var4 = this.Q(var3);
               c var5 = new c(this, var4, (e$a)null);
               var1.a(var5, var4.b);
               var3 = this.Z(var4.a + 4 + var4.b);
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break;
            }

            ++var2;
         }
      }

      Throwable var13 = var10000;
      throw var13;
   }

   public boolean N() {
      synchronized(this){}
      boolean var6 = false;

      int var1;
      try {
         var6 = true;
         var1 = this.o;
         var6 = false;
      } finally {
         if (var6) {
            ;
         }
      }

      boolean var2;
      if (var1 == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void U() {
      synchronized(this){}

      try {
         if (this.N()) {
            NoSuchElementException var7 = new NoSuchElementException();
            throw var7;
         }

         if (this.o == 1) {
            this.y();
         } else {
            b var3 = this.p;
            int var1 = this.Z(var3.a + 4 + var3.b);
            this.V(var1, this.r, 0, 4);
            int var2 = S(this.r, 0);
            this.a0(this.n, this.o - 1, var1, this.q.a);
            --this.o;
            var3 = new b(var1, var2);
            this.p = var3;
         }
      } finally {
         ;
      }

   }

   public int Y() {
      if (this.o == 0) {
         return 16;
      } else {
         b var3 = this.q;
         int var1 = var3.a;
         int var2 = this.p.a;
         return var1 >= var2 ? var1 - var2 + 4 + var3.b + 16 : var1 + 4 + var3.b + this.n - var2;
      }
   }

   public void close() {
      synchronized(this){}

      try {
         this.m.close();
      } finally {
         ;
      }

   }

   public void l(byte[] var1) {
      this.x(var1, 0, var1.length);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.getClass().getSimpleName());
      var1.append('[');
      var1.append("fileLength=");
      var1.append(this.n);
      var1.append(", size=");
      var1.append(this.o);
      var1.append(", first=");
      var1.append(this.p);
      var1.append(", last=");
      var1.append(this.q);
      var1.append(", element lengths=[");

      try {
         e$a var2 = new e$a(this, var1);
         this.E(var2);
      } catch (IOException var3) {
         s.log(Level.WARNING, "read error", var3);
      }

      var1.append("]]");
      return var1.toString();
   }

   public void x(byte[] var1, int var2, int var3) {
      synchronized(this){}

      Throwable var10000;
      label693: {
         boolean var10001;
         try {
            O(var1, "buffer");
         } catch (Throwable var97) {
            var10000 = var97;
            var10001 = false;
            break label693;
         }

         boolean var5;
         label685: {
            if ((var2 | var3) >= 0) {
               try {
                  if (var3 <= var1.length - var2) {
                     this.z(var3);
                     var5 = this.N();
                     break label685;
                  }
               } catch (Throwable var96) {
                  var10000 = var96;
                  var10001 = false;
                  break label693;
               }
            }

            try {
               IndexOutOfBoundsException var98 = new IndexOutOfBoundsException();
               throw var98;
            } catch (Throwable var95) {
               var10000 = var95;
               var10001 = false;
               break label693;
            }
         }

         int var4;
         b var6;
         if (var5) {
            var4 = 16;
         } else {
            try {
               var6 = this.q;
               var4 = this.Z(var6.a + 4 + var6.b);
            } catch (Throwable var94) {
               var10000 = var94;
               var10001 = false;
               break label693;
            }
         }

         try {
            var6 = new b(var4, var3);
            b0(this.r, 0, var3);
            this.W(var6.a, this.r, 0, 4);
            this.W(var6.a + 4, var1, var2, var3);
         } catch (Throwable var93) {
            var10000 = var93;
            var10001 = false;
            break label693;
         }

         if (var5) {
            try {
               var2 = var6.a;
            } catch (Throwable var92) {
               var10000 = var92;
               var10001 = false;
               break label693;
            }
         } else {
            try {
               var2 = this.p.a;
            } catch (Throwable var91) {
               var10000 = var91;
               var10001 = false;
               break label693;
            }
         }

         try {
            this.a0(this.n, this.o + 1, var2, var6.a);
            this.q = var6;
            ++this.o;
         } catch (Throwable var90) {
            var10000 = var90;
            var10001 = false;
            break label693;
         }

         if (var5) {
            try {
               this.p = var6;
            } catch (Throwable var89) {
               var10000 = var89;
               var10001 = false;
               break label693;
            }
         }

         return;
      }

      Throwable var99 = var10000;
      throw var99;
   }

   public void y() {
      synchronized(this){}

      try {
         this.a0(4096, 0, 0, 0);
         this.o = 0;
         b var1 = e.b.c;
         this.p = var1;
         this.q = var1;
         if (this.n > 4096) {
            this.X(4096);
         }

         this.n = 4096;
      } finally {
         ;
      }

   }

   static class b {
      static final b c = new b(0, 0);
      final int a;
      final int b;

      b(int var1, int var2) {
         this.a = var1;
         this.b = var2;
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append(this.getClass().getSimpleName());
         var1.append("[position = ");
         var1.append(this.a);
         var1.append(", length = ");
         var1.append(this.b);
         var1.append("]");
         return var1.toString();
      }
   }

   private final class c extends InputStream {
      private int m;
      private int n;
      final e o;

      private c(e var1, b var2) {
         this.o = var1;
         this.m = var1.Z(var2.a + 4);
         this.n = var2.b;
      }

      // $FF: synthetic method
      c(e var1, b var2, e$a var3) {
         this(var1, var2);
      }

      public int read() {
         if (this.n == 0) {
            return -1;
         } else {
            this.o.m.seek((long)this.m);
            int var1 = this.o.m.read();
            this.m = this.o.Z(this.m + 1);
            --this.n;
            return var1;
         }
      }

      public int read(byte[] var1, int var2, int var3) {
         e.O(var1, "buffer");
         if ((var2 | var3) >= 0 && var3 <= var1.length - var2) {
            int var5 = this.n;
            if (var5 > 0) {
               int var4 = var3;
               if (var3 > var5) {
                  var4 = var5;
               }

               this.o.V(this.m, var1, var2, var4);
               this.m = this.o.Z(this.m + var4);
               this.n -= var4;
               return var4;
            } else {
               return -1;
            }
         } else {
            throw new ArrayIndexOutOfBoundsException();
         }
      }
   }

   public interface d {
      void a(InputStream var1, int var2);
   }
}
