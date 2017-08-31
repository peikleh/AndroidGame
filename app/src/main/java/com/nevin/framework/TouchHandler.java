package com.nevin.framework;

/**
 * Created by nevin on 8/31/2017.
 */

import java.util.List;

import android.view.View.OnTouchListener;

import com.nevin.framework.Input.TouchEvent;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}
