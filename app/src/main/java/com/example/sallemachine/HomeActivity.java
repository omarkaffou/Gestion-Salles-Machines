package com.example.sallemachine;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.sallemachine.R;

public class HomeActivity extends AppCompatActivity {

    private Button bnSalle;
    private Button bnMachine;
    private Button bnMachineSalle;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.menu.activity_main_drawer);

        /*bnSalle = (Button) findViewById(R.id.gestionSalles);
        bnMachine = (Button) findViewById(R.id.getsionMachines);
        bnMachineSalle = (Button) findViewById(R.id.listeMS);*/

        bnSalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.sallemachine.Main.class);
                startActivity(intent);
            }
        });

        bnMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainMachine.class);
                startActivity(intent);
            }
        });

        bnMachineSalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MachineBySalle.class);
                startActivity(intent);
            }
        });

    }
}
