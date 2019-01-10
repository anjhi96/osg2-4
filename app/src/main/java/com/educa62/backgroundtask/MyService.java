package com.educa62.backgroundtask;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;

public class MyService extends com.firebase.jobdispatcher.JobService {
    @Override
    public boolean onStartJob(com.firebase.jobdispatcher.JobParameters job) {
        // lakukan background task atau memanggil service
        MyIntentService.startActionJobService(this, "World", "Hello");
        return true;
    }

    @Override
    public boolean onStopJob(com.firebase.jobdispatcher.JobParameters job) {
        return true;
    }
}
