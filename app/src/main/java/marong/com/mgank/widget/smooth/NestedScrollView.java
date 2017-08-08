package marong.com.mgank.widget.smooth;

import android.content.Context;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marong on 2017/8/8.
 */

public class NestedScrollView extends android.support.v4.widget.NestedScrollView{
    protected List<OnScrollListener> mOnScrollListeners;

    public NestedScrollView(Context context) {
        super(context);
    }

    public NestedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mOnScrollListeners != null) {
            int i = 0;
            for (int n = mOnScrollListeners.size(); i < n; i++) {
                mOnScrollListeners.get(i).onScrolled(this, l - oldl, t - oldt);
            }
        }
    }

    public void addOnScrollListener(OnScrollListener onScrollListener) {
        if (mOnScrollListeners == null) {
            mOnScrollListeners = new ArrayList<>();
        }
        mOnScrollListeners.add(onScrollListener);
    }

    public interface OnScrollListener {

        void onScrolled(android.support.v4.widget.NestedScrollView nestedScrollView, int dx, int dy);
    }

}
