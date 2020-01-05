package com.example.pressotimer;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent(AlarmClock.ACTION_SET_TIMER);
        i.putExtra(AlarmClock.EXTRA_LENGTH, 240);
        i.putExtra(AlarmClock.EXTRA_VIBRATE, true);
        startActivity(i);
        finish();
    }
}
