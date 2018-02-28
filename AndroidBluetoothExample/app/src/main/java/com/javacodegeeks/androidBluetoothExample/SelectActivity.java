package com.javacodegeeks.androidBluetoothExample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.javacodegeeks.R;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        }
    protected void onStart() {
        super.onStart();
        Button chat=(Button) findViewById(R.id.btnchat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BluetoothChat.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"click successfully",Toast.LENGTH_LONG).show();
            }
        });

        Button call =(Button) findViewById(R.id.btncall);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ActivityCallService.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"click successfully",Toast.LENGTH_LONG).show();
            }
        });
    }


   /* private void onShare(){
        Button share=(Button) findViewById(R.id.btnshare);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Share.class);
                startActivity(intent);
                // intent.putExtra("abc",)

            }
        });*/

    }


