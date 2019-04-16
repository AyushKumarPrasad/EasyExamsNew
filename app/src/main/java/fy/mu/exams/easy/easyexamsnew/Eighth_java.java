package fy.mu.exams.easy.easyexamsnew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

;

public class Eighth_java extends AppCompatActivity {
    Button b19, b20, facebook;
    ImageView back ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighth_screen);

        b19 = (Button) findViewById(R.id.button19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayush = new Intent(Eighth_java.this,AppliedPhysics2Dec2016.class);
                startActivity(ayush);
            }
        });

        b20 = (Button) findViewById(R.id.button20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayush = new Intent(Eighth_java.this,AppliedPhysics2May2016.class);
                startActivity(ayush);
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////
        back = (ImageView) findViewById(R.id.back_eighth);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Eighth_java.this,Home.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(Eighth_java.this,Third_java.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
