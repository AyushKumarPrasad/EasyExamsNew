package fy.mu.exams.easy.easyexamsnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Credits extends AppCompatActivity
{
    ImageView back ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        back = (ImageView) findViewById(R.id.back_credits);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Credits.this,Home.class);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed()
    {
        Intent intent = new Intent(Credits.this , Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
