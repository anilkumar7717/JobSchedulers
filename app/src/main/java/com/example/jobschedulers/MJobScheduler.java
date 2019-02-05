package com.example.jobschedulers;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;
import android.widget.Toast;

public class MJobScheduler extends JobService {
    private JobExecuter mJobExecuter;

    @SuppressLint("StaticFieldLeak")
    @Override
    public boolean onStartJob(final JobParameters jobParameters) {
        Log.d("-----jobstart----","started");
        mJobExecuter = new JobExecuter(){
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
                jobFinished(jobParameters,true);
            }
        };
        mJobExecuter.execute();
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        //mJobExecuter.cancel(true);
        return true;
    }
}
