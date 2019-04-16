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


 //  import com.google.android.gms.analytics.Tracker;
  //import com.google.android.gms.analytics.HitBuilders;

public class First_java extends AppCompatActivity
{

    private static final String TAG = "First_java";
//    Tracker mTracker;
    ImageView m1, m2;
    Button b1, b2;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);

/*        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();


        Log.i(TAG, "first screen " + First_java.this);
        mTracker.setScreenName("first page " + First_java.this);
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());   */


        m1 = (ImageView) findViewById(R.id.first);

        m2 = (ImageView) findViewById(R.id.idea);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayush = new Intent(First_java.this, AyushIdeaButton.class);
                startActivity(ayush);
            }
        });


        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayush = new Intent(First_java.this,Second_java.class);
                startActivity(ayush);
            }
        });

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayush = new Intent(First_java.this, Third_java.class);
                startActivity(ayush);
            }
        });

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

                    case R.id.infobutton:
                        Intent ayush = new Intent(First_java.this,AyushInfoButton.class);
                        startActivity(ayush);
                        break;
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
                Intent ayush = new Intent(First_java.this , First_java.class);
                startActivity(ayush);
            }
        });

    }
}
