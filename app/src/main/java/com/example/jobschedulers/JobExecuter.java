package com.example.jobschedulers;

import android.os.AsyncTask;
import android.widget.Toast;

public class JobExecuter extends AsyncTask<Void,Void,String> {
    @Override
    protected String doInBackground(Void... voids) {
        System.out.println("----running-----");
        return "Background long running task finishes...";
    }
}
