package marong.com.mgank.func;

import android.view.View;

import marong.com.mgank.data.entity.Meizhi;

/**
 * Created by marong on 2017/8/8.
 */

public interface OnMeizhiTouchListener {
    void onTouch(View v, View meizhiView, View card, Meizhi meizhi);
}
