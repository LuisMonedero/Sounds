package com.example.sounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MenuPrincipal extends AppCompatActivity {
    ConstraintLayout boton1,boton2,boton3,boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);


        opciones_decorView();
        boton1=findViewById(R.id.opcion1);
        boton2=findViewById(R.id.opcion2);
        boton3=findViewById(R.id.opcion3);
        boton4=findViewById(R.id.opcion4);
        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Version.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_to_center,R.anim.center_to_left);
                finish();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, MainActivity.class);
                startActivity(intent);

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });

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
}