package com.example.appnumber29;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtPolymorphism = (TextView)findViewById(R.id.txtPolymorphism);

        LifeInsurance[] mylife = new LifeInsurance[3];
        mylife[0] = new Student("John" , "AD" , 1000);
        mylife[1] = new Boxing("Boxing" , "Fighting by hands only" , "BU" , 1000 , 800 , 2000 , 5000 , 6000);
        mylife[2] = new KickBoxing("Kick boxing" , "Both kick and Hands" , "KBU" , 2000 , 3000 , 4000 , 7000 , 3000 , 5000 , 2000);

        String oldtxtpolymorphismValue;
        //Abhi tou yeh samjh aya hai kay zindagi ko mylife kay barber kardia hai or wo her array ki value ko la kar loop main ek ek kar kay print karwayegi. Iss ko main ne screenshot le kar save karliya hai ek example ko google se utha kar.
        for (LifeInsurance zindagi : mylife)
        {
            oldtxtpolymorphismValue = txtPolymorphism.getText() + "";

            txtPolymorphism.setText(String.format(oldtxtpolymorphismValue + "%s%n%s: %f%n%n%n" , zindagi.toString() ,
                    "Life Insurance Cost" , zindagi.evaluteCostOfinsurance() ));
        }

    }


}
