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


public class Tenth_java extends AppCompatActivity
{
    Button b23, b24, facebook;
    ImageView back ;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tenth_screen);

        b23 = (Button) findViewById(R.id.button23);
        b23.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Tenth_java.this, AppliedMathematics2May2016.class);
                startActivity(ayush);
            }
        });

        b24 = (Button) findViewById(R.id.button24);
        b24.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Tenth_java.this, AppliedMathematics2Dec2015.class);
                startActivity(ayush);
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        back = (ImageView) findViewById(R.id.back_tenth);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Tenth_java.this , Home.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(Tenth_java.this , Third_java.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
