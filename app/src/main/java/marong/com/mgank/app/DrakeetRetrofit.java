package marong.com.mgank.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.schedulers.Schedulers;

/**
 * Created by marong on 2017/8/8.
 */

public class DrakeetRetrofit {
    final GankApi gankService;
    final DrakeetApi drakeetService;

    // @formatter:off
    final static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .serializeNulls()
            .create();
    // @formatter:on


    DrakeetRetrofit() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        if (DrakeetFactory.isDebug) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            httpClient.addInterceptor(logging);
        }
        httpClient.connectTimeout(12, TimeUnit.SECONDS);
        OkHttpClient client = httpClient.build();

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("http://gank.io/api/")
                .client(client)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
                .addConverterFactory(GsonConverterFactory.create(gson));
        Retrofit gankRest = builder.build();
        builder.baseUrl("https://leancloud.cn:443/1.1/classes/");
        Retrofit drakeetRest = builder.build();
        gankService = gankRest.create(GankApi.class);
        drakeetService = drakeetRest.create(DrakeetApi.class);
    }


    public GankApi getGankService() {
        return gankService;
    }


    public DrakeetApi getDrakeetService() {
        return drakeetService;
    }
}
