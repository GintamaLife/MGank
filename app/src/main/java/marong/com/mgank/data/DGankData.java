package marong.com.mgank.data;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

import marong.com.mgank.data.entity.DGank;

/**
 * Created by marong on 2017/8/8.
 */

public class DGankData {
    @Expose
    public List<DGank> results = new ArrayList<DGank>();
}
