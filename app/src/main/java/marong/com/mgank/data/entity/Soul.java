package marong.com.mgank.data.entity;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Created by marong on 2017/8/8.
 */

public class Soul implements Serializable {

    @PrimaryKey(PrimaryKey.AssignType.AUTO_INCREMENT) @Column("_id") public long id;
}
