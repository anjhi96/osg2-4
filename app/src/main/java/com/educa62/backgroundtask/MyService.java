package com.educa62.backgroundtask;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.AsyncTask;
import android.os.Build;
import android.widget.Toast;

import com.firebase.jobdispatcher.Job;

public class MyService extends com.firebase.jobdispatcher.JobService {

    BackgroundTask backgroundTask;

    @Override
    public boolean onStartJob(final com.firebase.jobdispatcher.JobParameters job) {
        backgroundTask = new BackgroundTask(){
            @Override
            protected void onPostExecute(String s){
                Toast.makeText(getApplicationContext(),"Message from BackgroundTask :"+s,Toast.LENGTH_SHORT).show();
                jobFinished(job,false);
            }
        };

        backgroundTask.execute();
        return true;
    }

    @Override
    public boolean onStopJob(com.firebase.jobdispatcher.JobParameters job) {
        return true;
    }

    public static class BackgroundTask extends AsyncTask<Void,Void,String> {

        @Override
        protected String doInBackground(Void... voids) {
                return "Hello from background job";
            }
    }










//    @Override
////    public boolean onStartJob(com.firebase.jobdispatcher.JobParameters job) {
////        // lakukan background task atau memanggil service
////        MyIntentService.startActionJobService(this, "World", "Hello");
//////        Toast.makeText(this, "World Hello", Toast.LENGTH_SHORT).show();
////        return true;
////    }
////
////    @Override
////    public boolean onStopJob(com.firebase.jobdispatcher.JobParameters job) {
////        return true;
////    }




}
