package fy.mu.exams.easy.easyexamsnew;

import android.app.Notification;
import android.app.NotificationManager;

import android.content.Context;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;



public class MessagingService extends FirebaseMessagingService
{
    Target target = new Target()
    {
        @Override
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            {
                showNotificationWithImageLevel26(bitmap);  
            }

            else
            {
                showNotificationWithImage(bitmap);
            }
        }

        @Override
        public void onBitmapFailed(Drawable errorDrawable) {

        }

        @Override
        public void onPrepareLoad(Drawable placeHolderDrawable) {

        }
    };

    private void showNotificationWithImageLevel26(Bitmap bitmap)
    {
        NotificationHelper helper = new NotificationHelper(getBaseContext());
        Notification.Builder builder = helper.getChannel(Config.title , Config.message , bitmap);
        helper.getManager().notify(0 , builder.build());
    }

    private void showNotificationWithImage(Bitmap bitmap)
    {
        NotificationCompat.BigPictureStyle style = new NotificationCompat.BigPictureStyle();
        style.setSummaryText(Config.message);
        style.bigPicture(bitmap);

        Uri defaultSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        NotificationCompat.Builder notificationBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                .setSmallIcon(R.mipmap.notification)
                .setContentTitle(Config.title)
                .setAutoCancel(true)
                .setSound(defaultSound)
                .setStyle(style);

        NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0 , notificationBuilder.build());
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage)
    {
        if (remoteMessage.getData() != null)
        getImage(remoteMessage);
    }

    public void getImage(final RemoteMessage remoteMessage)
    {
        Config.message = remoteMessage.getNotification().getBody();
        Config.title = remoteMessage.getNotification().getTitle();

        if (remoteMessage.getData() != null)
        {
            Handler uiHandler = new Handler(Looper.getMainLooper());
            uiHandler.post(new Runnable()
            {
                @Override
                public void run()
                {
                    Picasso.with(getApplicationContext()).load(remoteMessage.getData().get("image")).into(target);
                }
            });
        }
    }
}
