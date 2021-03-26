package com.arkers.playerdemusicas;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final String[] PERMISSOES = {
            Manifest.permission.READ_EXTERNAL_STORAGE
    };

    private static final int REQUERIR_PERMISSAO = 12345;

    private static final int CONT_PERMISSOES = 1;

    @SuppressLint("NewApi")
    private boolean arePermissionsDenied() {

        for (int i = 0 ; i  < CONT_PERMISSOES; i++){
            if( checkSelfPermission(PERMISSOES[i])!= PackageManager.PERMISSION_GRANTED){
                return true;
            }
        }
        return false;
    }

    @SuppressLint("NewApi")
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(arePermissionsDenied()){
            ((ActivityManager)(this.getSystemService(ACTIVITY_SERVICE))).clearApplicationUserData();
            recreate();
        }else{
            onResume();
        }
    }

    private boolean isMusicPlayerInit;

    @Override
    protected void onResume(){
        super.onResume();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && arePermissionsDenied()){
            requestPermissions(PERMISSOES,REQUERIR_PERMISSAO);
            return;
        }
        if(!isMusicPlayerInit){
            final ListView listView = findViewById(R.id.listView);

            isMusicPlayerInit = true;
        }

    }


}
