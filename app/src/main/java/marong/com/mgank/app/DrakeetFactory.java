package marong.com.mgank.app;

/**
 * Created by marong on 2017/8/8.
 */

public class DrakeetFactory {
    protected static final Object monitor = new Object();
    static GankApi sGankIOSingleton = null;
    static DrakeetApi sDrakeetSingleton = null;
    public static final int meizhiSize = 10;
    public static final int gankSize = 5;

    public static boolean isDebug = true;


    public static GankApi getGankIOSingleton() {
        synchronized (monitor) {
            if (sGankIOSingleton == null) {
                sGankIOSingleton = new DrakeetRetrofit().getGankService();
            }
            return sGankIOSingleton;
        }
    }


    public static DrakeetApi getDrakeetSingleton() {
        synchronized (monitor) {
            if (sDrakeetSingleton == null) {
                sDrakeetSingleton = new DrakeetRetrofit().getDrakeetService();
            }
            return sDrakeetSingleton;
        }
    }
}
