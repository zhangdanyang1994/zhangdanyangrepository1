package com.ximatingshu.mydemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import org.xutils.common.Callback;
import org.xutils.image.ImageOptions;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewInject(R.id.imageView)
    private ImageView imageView;
    ImageOptions imageOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        x.view().inject(this);

    }
    @Event(value = {R.id.bt_one,R.id.bt_two,R.id.bt_three})
    private void onClick(View view){
        switch (view.getId()){
            case R.id.bt_one:
                x.image().bind(imageView,APIUtils.getPic());
                break;
            case R.id.bt_two:
                x.image().bind(imageView,APIUtils.getPic(),MyApplication.getMyApplication().getImageOptions());

                break;
            case R.id.bt_three:
                x.image().bind(imageView, APIUtils.getPic(), new Callback.CommonCallback<Drawable>() {
                    @Override
                    public void onSuccess(Drawable result) {
                        if (result!=null){
                            imageView.setImageDrawable(result);
                        }
                    }

                    @Override
                    public void onError(Throwable ex, boolean isOnCallback) {


                    }

                    @Override
                    public void onCancelled(CancelledException cex) {

                    }

                    @Override
                    public void onFinished() {

                    }
                });
                break;
        }

    }
}
