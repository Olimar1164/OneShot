package com.example.oneshot;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.oneshot.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.relativeLayout)
    ConstraintLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        ButterKnife.bind(this);
    }
}
