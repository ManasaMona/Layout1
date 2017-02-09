package com.example.manasaa.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG= MainActivity.class.getSimpleName();
    private Button button1,button2,button3;
    TextView txtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"*ON-CREATE*");
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        txtMessage =(TextView)findViewById(R.id.textView);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (R.id.button1 == v.getId()) {
            txtMessage.setText(R.string.msgForbutton1 );
            txtMessage.setVisibility(View.VISIBLE);
            button1.setEnabled(false);
            button2.setEnabled(true);
            button3.setEnabled(true);
        } else if (R.id.button2 == v.getId()) {
            txtMessage.setText(R.string.msfForButton2);
            txtMessage.setVisibility(View.VISIBLE);
            button1.setEnabled(true);
            button2.setEnabled(false);
            button3.setEnabled(true);
        } else {
            txtMessage.setText(R.string.msgForButton3);
            txtMessage.setVisibility(View.VISIBLE);
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(false);

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"*ONSTART*");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"*ONPAUSE*");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"*ONRESUME*");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"*ONSTOP*");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"*ONRESTART*");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"*ONDESTROY*");

    }


}
