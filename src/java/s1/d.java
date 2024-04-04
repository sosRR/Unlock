package s1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

public class d implements x {
   private final Context a;
   private final t1.d b;
   private final f c;

   public d(Context var1, t1.d var2, f var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   private boolean d(JobScheduler var1, int var2, int var3) {
      Iterator var8 = var1.getAllPendingJobs().iterator();

      boolean var5;
      while(true) {
         boolean var7 = var8.hasNext();
         boolean var6 = false;
         var5 = var6;
         if (!var7) {
            break;
         }

         JobInfo var9 = (JobInfo)var8.next();
         int var4 = var9.getExtras().getInt("attemptNumber");
         if (var9.getId() == var2) {
            var5 = var6;
            if (var4 >= var3) {
               var5 = true;
            }
            break;
         }
      }

      return var5;
   }

   public void a(k1.o var1, int var2) {
      this.b(var1, var2, false);
   }

   public void b(k1.o var1, int var2, boolean var3) {
      ComponentName var8 = new ComponentName(this.a, JobInfoSchedulerService.class);
      JobScheduler var7 = (JobScheduler)this.a.getSystemService("jobscheduler");
      int var4 = this.c(var1);
      if (!var3 && this.d(var7, var4, var2)) {
         p1.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", var1);
      } else {
         long var5 = this.b.H(var1);
         JobInfo.Builder var9 = this.c.c(new JobInfo.Builder(var4, var8), var1.d(), var5, var2);
         PersistableBundle var10 = new PersistableBundle();
         var10.putInt("attemptNumber", var2);
         var10.putString("backendName", var1.b());
         var10.putInt("priority", w1.a.a(var1.d()));
         if (var1.c() != null) {
            var10.putString("extras", Base64.encodeToString(var1.c(), 0));
         }

         var9.setExtras(var10);
         p1.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", var1, var4, this.c.g(var1.d(), var5, var2), var5, var2);
         var7.schedule(var9.build());
      }
   }

   int c(k1.o var1) {
      Adler32 var2 = new Adler32();
      var2.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
      var2.update(var1.b().getBytes(Charset.forName("UTF-8")));
      var2.update(ByteBuffer.allocate(4).putInt(w1.a.a(var1.d())).array());
      if (var1.c() != null) {
         var2.update(var1.c());
      }

      return (int)var2.getValue();
   }
}
