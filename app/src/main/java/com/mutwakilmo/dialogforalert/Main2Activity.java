package com.mutwakilmo.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(Main2Activity.this);
        //Set the dialog title and message
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Click Ok to continue or Cancel to stop.");
        //Add dialog buttons
        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //User clicked ok button
                Toast.makeText(getApplicationContext(),"Pressed Ok", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton("cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //user cancelled the dialoge
                Toast.makeText(getApplicationContext(), "pressed cancel", Toast.LENGTH_SHORT).show();
            }
        });
        //show the alertDialog
        myAlertBuilder.show();
    }
}
