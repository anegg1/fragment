package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fragment1, fragment2, fragment3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = findViewById(R.id.button);
        fragment2 = findViewById(R.id.button2);
        fragment3 = findViewById(R.id.button3);

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                replaceFragmen(new BlankFragment1());
            }
        });

        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragmen(new BlankFragment2());
            }
        });

        fragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragmen(new BlankFragment3());
            }
        });


    }

    private void replaceFragmen(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentLay,fragment);

        fragmentTransaction.commit();


    }

}
