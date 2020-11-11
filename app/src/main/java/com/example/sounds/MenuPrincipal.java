package com.example.sounds;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {
    ConstraintLayout boton1,boton2,boton3,boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        opciones_decorView();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    protected void onResume() {
        super.onResume();
        opciones_decorView();
    }

    private void opciones_decorView(){
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
    }
    public void personajes(View w){

    }
    public void sprites(View w){

    }
    public void opciones(View w){

    }
    public void sonidos(View w){
        Intent intent = new Intent(MenuPrincipal.this, MainActivity.class);
        startActivity(intent);
    }

}