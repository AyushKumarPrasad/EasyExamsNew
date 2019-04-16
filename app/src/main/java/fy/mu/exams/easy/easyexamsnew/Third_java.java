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
import android.widget.TextView;


public class Third_java extends AppCompatActivity
{
    ImageView m1, m2,m3, m4;
    Button b7 ,b8 ,b9, b10;
    ImageView back ;

    @Override
    protected void onCreate (Bundle ayush)
    {
        super.onCreate(ayush);
        setContentView(R.layout.third_screen);



        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Third_java.this, Eighth_java.class);
                startActivity(ayush);
            }
        });

        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Third_java.this, Ninth_java.class);
                startActivity(ayush);
            }
        });

        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Third_java.this, Tenth_java.class);
                startActivity(ayush);
            }
        });

        b10 = (Button) findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Third_java.this, Eleventh_java.class);
                startActivity(ayush);
            }
        });

        back = (ImageView) findViewById(R.id.back_sem2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Third_java.this,Home.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(Third_java.this,Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
