package s1;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

// $FF: synthetic class
public final class e implements Runnable {
   public final JobInfoSchedulerService m;
   public final JobParameters n;

   // $FF: synthetic method
   public e(JobInfoSchedulerService var1, JobParameters var2) {
      this.m = var1;
      this.n = var2;
   }

   public final void run() {
      JobInfoSchedulerService.a(this.m, this.n);
   }
}
