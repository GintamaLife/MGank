package marong.com.mgank.widget.smooth;

import android.view.View;

/**
 * Created by marong on 2017/8/8.
 */

public interface PagerAdapter {
    View getScrollView(int position);

    int onViewPagerSelected(int position, int offset);
}
