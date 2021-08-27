package com.buzz_ht.fragmentex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button f1,f2,f3,f4,f5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        f1= findViewById(R.id.f1);
        f2=findViewById(R.id.f2);
        f3=findViewById(R.id.f3);
        f4=findViewById(R.id.f4);
        f5=findViewById(R.id.f5);

        f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        f3.setOnClickListener(this);
        f4.setOnClickListener(this);
       // f5.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.f1:
                Fragment1 fragmentOne = new Fragment1();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.ll, fragmentOne, fragmentOne.getTag()).commit();
                break;

            case R.id.f2:
                Fragment2 fragmentTwo = new Fragment2();
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                fragmentManager1.beginTransaction().replace(R.id.ll, fragmentTwo, fragmentTwo.getTag()).commit();
                break;

            case R.id.f3:
                Fragment3 fragmentThree = new Fragment3();
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                fragmentManager2.beginTransaction().replace(R.id.ll, fragmentThree, fragmentThree.getTag()).commit();
                break;

            case R.id.f4:
                Fragement4 fragmentFour = new Fragement4();
                FragmentManager fragmentManager3 = getSupportFragmentManager();
                fragmentManager3.beginTransaction().replace(R.id.ll, fragmentFour, fragmentFour.getTag()).commit();
                break;

        }


    }
}