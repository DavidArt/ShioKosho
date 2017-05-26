package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.CockingTip;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 26-May-17.
 */
@Repository
public interface CockingTipDao {

    boolean createCockingTip(CockingTip cockingTip);

    CockingTip getCockingTipById(Long id);

    boolean updateCockingTip(CockingTip cockingTip);

    boolean deleteCockingTip(Long id);

}
