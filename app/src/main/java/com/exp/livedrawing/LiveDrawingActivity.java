package com.exp.livedrawing;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.Window;
import android.os.Bundle;

public class LiveDrawingActivity extends Activity {

    private LiveDrawingView mLiveDrawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        Display display = getWindowManager().getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);

        mLiveDrawingView = new LiveDrawingView(this, size.x, size.y);

        setContentView(mLiveDrawingView);
    }

    @Override
    public void onResume() {
        super.onResume();

        mLiveDrawingView.resume();
    }

    @Override
    public void onPause() {
        super.onPause();

        mLiveDrawingView.pause();
    }
}