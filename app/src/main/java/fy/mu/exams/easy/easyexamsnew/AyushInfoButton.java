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


public class AyushInfoButton extends AppCompatActivity
{
    WebView web1 ;
    ImageView back ;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayushinfobutton);

  /*      web1 = (WebView) findViewById(R.id.webinfo);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.getSettings().setLoadWithOverviewMode(true);
        web1.getSettings().setUseWideViewPort(true);
        web1.getSettings().setAllowFileAccess(true);
        web1.getSettings().setBuiltInZoomControls(true);
        web1.loadUrl("file:///android_asset/AyushInfo.html");

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener( new Toolbar.OnMenuItemClickListener()
        {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.closebutton:
                        Intent startMain = new Intent(Intent.ACTION_MAIN);
                        startMain.addCategory(Intent.CATEGORY_HOME);
                        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(startMain);
                        break;
                    case R.id.facebook:
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/easyexamsmumbai/"));
                        startActivity(browserIntent);
                }
                return false;
            }
        });

        toolbar.setNavigationIcon(R.mipmap.logo);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(AyushInfoButton.this , First_java.class);
                startActivity(ayush);
            }
        });  */

        back = (ImageView) findViewById(R.id.back_info);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AyushInfoButton.this,Home.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(AyushInfoButton.this,Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
