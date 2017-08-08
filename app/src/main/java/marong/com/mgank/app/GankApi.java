package marong.com.mgank.app;

import marong.com.mgank.data.GankData;
import marong.com.mgank.data.MeizhiData;
import marong.com.mgank.data.休息视频Data;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by marong on 2017/8/8.
 */

public interface GankApi {
    @GET("data/福利/" + DrakeetFactory.meizhiSize + "/{page}")
    Observable<MeizhiData> getMeizhiData(@Path("page") int page);

    @GET("day/{year}/{month}/{day}") Observable<GankData> getGankData(
            @Path("year") int year,
            @Path("month") int month,
            @Path("day") int day);

    @GET("data/休息视频/" + DrakeetFactory.meizhiSize + "/{page}")
    Observable<休息视频Data> get休息视频Data(@Path("page") int page);

}
