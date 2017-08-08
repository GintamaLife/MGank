package marong.com.mgank.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import marong.com.mgank.data.entity.Gank;

/**
 * Created by marong on 2017/8/8.
 */

public class GankData extends  BaseData{

    public Result results;
    public List<String> category;

    public class Result {
        @SerializedName("Android") public List<Gank> androidList;
        @SerializedName("休息视频") public List<Gank> 休息视频List;
        @SerializedName("iOS") public List<Gank> iOSList;
        @SerializedName("福利") public List<Gank> 妹纸List;
        @SerializedName("拓展资源") public List<Gank> 拓展资源List;
        @SerializedName("瞎推荐") public List<Gank> 瞎推荐List;
        @SerializedName("App") public List<Gank> appList;
    }
}
