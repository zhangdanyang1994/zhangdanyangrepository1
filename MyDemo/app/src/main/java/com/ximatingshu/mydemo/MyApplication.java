package com.ximatingshu.mydemo;

import android.app.Application;
import android.graphics.Bitmap;
import android.widget.ImageView;

import org.xutils.image.ImageOptions;
import org.xutils.x;

/**
 * Created by zhang on 2016/9/30.
 */
public class MyApplication extends Application {
    private ImageOptions imageOptions;
    public static MyApplication myApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        myApplication=this;
        initConfig();

    }

    private void initConfig() {

        imageOptions=new ImageOptions.Builder().setFailureDrawableId(R.mipmap.ic_launcher)
                .setLoadingDrawableId(R.mipmap.ic_launcher)
                .setCircular(true)
               .setRadius(100)
                .setConfig(Bitmap.Config.RGB_565)
                .setCrop(true)
                //.setAnimation()
                .setImageScaleType(ImageView.ScaleType.FIT_CENTER)
                //.setSquare(true)
               // .setSize(300,300)
                .setFadeIn(true)
                .setUseMemCache(true)
                .build();

    }
    public static MyApplication getMyApplication(){
        return myApplication;
    }
    public ImageOptions getImageOptions(){
        return imageOptions;
    }

}
