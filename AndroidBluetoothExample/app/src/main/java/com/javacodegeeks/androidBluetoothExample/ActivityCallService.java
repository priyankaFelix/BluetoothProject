package com.javacodegeeks.androidBluetoothExample;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.javacodegeeks.R;

public class ActivityCallService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_service);
        final EditText number = (EditText) findViewById(R.id.phoneNo);
        final Button call = (Button) findViewById(R.id.dialBtn);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getnumber = number.getText().toString();
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel: " + getnumber));
                try {
                    if (ActivityCompat.checkSelfPermission((Context) ActivityCallService.this.clone(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                startActivity(callintent);
            }



        });
    }

}
