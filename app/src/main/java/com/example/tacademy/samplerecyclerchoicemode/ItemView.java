package com.example.tacademy.samplerecyclerchoicemode;

import android.content.Context;
import android.widget.Checkable;
import android.widget.FrameLayout;

/**
 * Created by Tacademy on 2016-01-19.
 */
public class ItemView extends FrameLayout implements Checkable {
    public ItemView(Context context) {
        super(context);
    }

    @Override
    public void setChecked(boolean checked) {

    }

    @Override
    public boolean isChecked() {
        return false;
    }

    @Override
    public void toggle() {

    }
}
