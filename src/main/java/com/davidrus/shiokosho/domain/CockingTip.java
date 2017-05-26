package com.davidrus.shiokosho.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
@Entity
@NamedQueries({
        @NamedQuery(name = CockingTip.GET_COCKING_TIP_BY_ID, query = "SELECT c FROM CockingTip c WHERE c.id = :id")
})
public class CockingTip {

    public static final String GET_COCKING_TIP_BY_ID = "getCockingTipById";

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "cockingTip")
    private String cockingTip;

    @Override
    public String toString() {
        return "CockingTip{" +
                "id=" + id +
                ", cockingTip='" + cockingTip + '\'' +
                '}';
    }
}
