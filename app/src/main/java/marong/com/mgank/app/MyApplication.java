package marong.com.mgank.app;

import android.app.Application;
import android.content.Context;

import com.litesuits.orm.LiteOrm;

import marong.com.mgank.BuildConfig;
import marong.com.mgank.utils.Toasts;

/**
 * Created by marong on 2017/8/8.
 */

public class MyApplication extends Application {
    private static  final  String DB_NAME ="gank.db";
    private static Context sContext;
    private static LiteOrm sDb;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;

        Toasts.register(this);

        sDb = LiteOrm.newSingleInstance(this,DB_NAME);
        if(BuildConfig.DEBUG) {
            sDb.setDebugged(true);

        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
