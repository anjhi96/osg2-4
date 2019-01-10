package com.educa62.backgroundtask;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyBoundService extends Service {
    public MyBoundService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Service berjalan di main thread, jadi bisa memanggil Toast disini
        Toast.makeText(this, "Hello world from Service", Toast.LENGTH_SHORT).show();
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
