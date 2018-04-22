package com.example.bohda.myapplication2204;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by bohda on 22.04.2018.
 */

public class MyActivity extends Activity {
    private TextView wroteName;
    private EditText name;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        wroteName = (TextView)findViewById(R.id.wrotename);
        name = (EditText)findViewById(R.id.name);
    }
}
