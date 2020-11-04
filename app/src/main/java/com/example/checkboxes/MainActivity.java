package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.media.audiofx.DynamicsProcessing;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCheckBoxClicked(View view){
        boolean checked =((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.chkOp1:
                if(checked){
                    Toast toast = Toast.makeText(this,"Se ha marcado la opción 1",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(this,"Se ha desmarcado la opción 1",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();
                }
                break;
            case R.id.chkOp2:
                if(checked){
                    Toast toast = Toast.makeText(this,"Se ha marcado la opción 2",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(this,"Se ha desmarcado la opción 2",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();
                }
                break;
            case R.id.chkOp3:
                if(checked){
                    Toast toast = Toast.makeText(this,"Se ha marcado la opción 3",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(this,"Se ha desmarcado la opción 3",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();
                }
                break;
        }
    }
}