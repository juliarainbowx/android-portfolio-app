package com.portfolio.rainbowx.Graduation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.portfolio.rainbowx.R;

public class Home extends AppCompatActivity {
ImageView home,school,hobby,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");//toolbar name
    }  public void onHome(View v){

        startActivity(new Intent(Home.this,Home.class));
    }
    public void onSchool(View v){

        startActivity(new Intent(Home.this,Graduation.class));
    }
    public void onHobby(View v){

        startActivity(new Intent(Home.this,Hobby.class));
    }
    public void onContact(View v){

        startActivity(new Intent(Home.this,Contact.class));
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}




