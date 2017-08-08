package marong.com.mgank.app;

import com.squareup.otto.Bus;

/**
 * Created by marong on 2017/8/8.
 */

public class LoveBus {
    private static  final Bus Bus = new Bus();
    public  static  Bus getLovelySeat(){
        return Bus;
    }
    private LoveBus(){

    }
}
