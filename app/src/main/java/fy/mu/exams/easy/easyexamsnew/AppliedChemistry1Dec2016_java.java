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

//  import ayush.kumar.developer.R;

public class AppliedChemistry1Dec2016_java extends AppCompatActivity
{
    WebView web1 ;
    ImageView back ;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appliedchemistry1dec2016);

        web1 = (WebView) findViewById(R.id.web3);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.getSettings().setLoadWithOverviewMode(true);
        web1.getSettings().setUseWideViewPort(true);
        web1.getSettings().setAllowFileAccess(true);
        web1.getSettings().setBuiltInZoomControls(true);
        web1.loadUrl("file:///android_asset/AppliedChemistry1Dec2016.html");

        back = (ImageView) findViewById(R.id.back_chem1d);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AppliedChemistry1Dec2016_java.this , Fifth_java.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed()
    {
        Intent intent = new Intent(AppliedChemistry1Dec2016_java.this , Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
