package com.hfad.joke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button serviceButton = (Button)findViewById(R.id.button);
        serviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,DelayedMessageService.class);
                i.putExtra(DelayedMessageService.EXTRA_MESSAGE,getResources().getText(R.string.button_response));
                startService(i);
            }
        });
    }
}
