package com.example.michaelpenberthy.camera_preview_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, CameraPreviewFragment.newInstance())
                    .commit();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        getFragmentManager().beginTransaction()
                .replace(R.id.container, CameraPreviewFragment.newInstance())
                .commit();
    }
}
