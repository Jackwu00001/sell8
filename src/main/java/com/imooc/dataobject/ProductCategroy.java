package com.imooc.dataobject;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Date;

/**类目
 * Created by asus on 9/5/2017.
 */
//如果表名与数据库名字不一致，需要@Table（name='product_categroy'）

//@Table(name = "product_categroy")
@Entity
public class ProductCategroy {
    @Id
    @GeneratedValue
    //自增类型
//    @Column(name = "categroy_id")
    private Integer categroyId;//类目id  categroy_id
//    @Column(name = "categroy_name")
    private String categroyName;//categroy_name
//    @Column(name = "categroy_type")
    private Integer categroyType;//categroy_type


    public Integer getCategroyId() {
        return categroyId;
    }

    public void setCategroyId(Integer categroyId) {
        this.categroyId = categroyId;
    }

    public String getCategroyName() {
        return categroyName;
    }

    public void setCategroyName(String categroyName) {
        this.categroyName = categroyName;
    }

    public Integer getCategroyType() {
        return categroyType;
    }

    public void setCategroyType(Integer categroyType) {
        this.categroyType = categroyType;
    }


    @Override
    public String toString() {
        return "ProductCategroy{" +
                "categroyId=" + categroyId +
                ", categroyName='" + categroyName + '\'' +
                ", categroyType=" + categroyType +

                '}';
    }
}
