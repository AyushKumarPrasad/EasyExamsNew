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


public class Second_java extends AppCompatActivity
{
    ImageView m1, m2, m3, m4;
    Button b3, b4, b5, b6;
    ImageView back ;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);



        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Second_java.this, Fourth_java.class);
                startActivity(ayush);
            }
        });

        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Second_java.this, Fifth_java.class);
                startActivity(ayush);
            }
        });

        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Second_java.this, Sixth_java.class);
                startActivity(ayush);
            }
        });

        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Second_java.this, Seventh_java.class);
                startActivity(ayush);
            }
        });

        back = (ImageView) findViewById(R.id.back_sem1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Second_java.this,Home.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(Second_java.this,Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}