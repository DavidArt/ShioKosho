package com.davidrus.shiokosho.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
public class CockingTip {

    private long id;

    private String cockingTip;

    @Override
    public String toString() {
        return "CockingTip{" +
                "id=" + id +
                ", cockingTip='" + cockingTip + '\'' +
                '}';
    }
}
