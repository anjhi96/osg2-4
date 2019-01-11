package com.educa62.backgroundtask;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class MyJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        // lakukan background task atau memanggil service
        MyIntentService.startActionJobService(this, "hello", "world");
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }

}
