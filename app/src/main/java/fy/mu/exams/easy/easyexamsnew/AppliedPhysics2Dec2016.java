package fy.mu.exams.easy.easyexamsnew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class AppliedPhysics2Dec2016 extends AppCompatActivity
{
    WebView web1 ;
    ImageView back ;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appliedphysics2dec2016);

        web1 = (WebView) findViewById(R.id.web9);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.getSettings().setLoadWithOverviewMode(true);
        web1.getSettings().setUseWideViewPort(true);
        web1.getSettings().setAllowFileAccess(true);
        web1.getSettings().setBuiltInZoomControls(true);
        web1.loadUrl("file:///android_asset/AppliedPhysics2Dec2016.html");

        back = (ImageView) findViewById(R.id.back_phy2d);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AppliedPhysics2Dec2016.this , Home.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(AppliedPhysics2Dec2016.this , Eighth_java.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
