package com.example.vlwk.invent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btn = (Button) findViewById(R.id.buttonnigga);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goB(v);
            }
        });
    }



    public void goB(View view) {
        Intent intent = new Intent(this, bActivity.class);
        startActivity(intent);
    }
}
