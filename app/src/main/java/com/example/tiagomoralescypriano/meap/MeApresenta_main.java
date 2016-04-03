package com.example.tiagomoralescypriano.meap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MeApresenta_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_apresenta_main);
    }

    public void logar (View View){

        setContentView(R.layout.activity_meap_login);
    }
    public void cadastrar (View View){

        setContentView(R.layout.activity_meap_signin);
    }
    public void logado (View View){

        setContentView(R.layout.activity_meap_inside);
    }
    public void voltarlogin (View View){

        setContentView(R.layout.activity_meap_login);
    }
    public void voltarmain (View View){

        setContentView(R.layout.activity_me_apresenta_main);
    }
}
