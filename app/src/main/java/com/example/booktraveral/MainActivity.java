package com.example.booktraveral;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View login_view = inflater.inflate(R.layout.login_layout, null, false);
        setContentView(login_view);
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.login_animator);
        animator.setTarget(login_view.findViewById(R.id.profile));
        animator.start();
    }
}
