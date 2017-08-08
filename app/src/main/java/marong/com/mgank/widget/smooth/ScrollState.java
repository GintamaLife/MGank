package marong.com.mgank.widget.smooth;

/**
 * Created by marong on 2017/8/8.
 */

public class ScrollState {
    private int mIdealOffset;

    private int mOffset = 0;

    private State mState = State.DEFAULT;

    public ScrollState() {
    }

    public int getOffset() {
        if (mState == State.DEFAULT) {
            return mIdealOffset;
        }
        return Math.max(mOffset, mIdealOffset);
    }

    public void setOffset(int offset, int idealOffset) {
        mOffset = mState == State.SCROLLED ? Math.max(mOffset, offset) : offset;
        mIdealOffset = idealOffset;
    }

    public void setState(State state) {
        mState = state;
        if (mState == State.DEFAULT) {
            mOffset = 0;
        }
    }

    public enum State {
        DEFAULT, SCROLLED
    }
}
