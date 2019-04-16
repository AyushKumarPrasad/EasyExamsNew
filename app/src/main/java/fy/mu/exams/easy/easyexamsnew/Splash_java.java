package fy.mu.exams.easy.easyexamsnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


public class Splash_java extends AppCompatActivity
{
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash_screen);

            img1 = (ImageView) findViewById(R.id.splash);

            Thread t1 = new Thread()
            {
                public void run()
                {
                    try
                    {
                        sleep(2700);

                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    finally
                    {
                        Intent Shiva = new Intent(Splash_java.this, Home.class);
                        startActivity(Shiva);
                    }
                }
            };
            t1.start();
        }
    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}



