package fy.mu.exams.easy.easyexamsnew;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

public class NotificationHelper extends ContextWrapper
{
    private static final String EDMT_CHANNEL_ID = "fy.mu.exams.easy.easyexamsnew.Ayush" ;
    private static final String EDMT_CHANNEL_NAME = "Easy Exams" ;

    private NotificationManager manager ;

    public NotificationHelper(Context base) {
        super(base);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            createChannel() ;
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createChannel()
    {
        NotificationChannel edmtChannel = new NotificationChannel(EDMT_CHANNEL_ID , EDMT_CHANNEL_NAME
                , NotificationManager.IMPORTANCE_DEFAULT) ;

        edmtChannel.enableLights(true);
        edmtChannel.enableVibration(true);
        edmtChannel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getManager().createNotificationChannel(edmtChannel);
    }

    public NotificationManager getManager()
    {
        if (manager == null)
            manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE) ;

        return  manager ;
    }

    @TargetApi(Build.VERSION_CODES.O)
    public Notification.Builder getChannel(String title , String body  , Bitmap bitmap)
    {
        Notification.Style style = new Notification.BigPictureStyle().bigPicture(bitmap);

        Uri defaultSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        return new Notification.Builder(getApplicationContext() , EDMT_CHANNEL_ID)
                .setSmallIcon(R.mipmap.notification)
                .setContentTitle(Config.title)
                .setAutoCancel(true)
                .setSound(defaultSound)
                .setStyle(style);
    }
}
