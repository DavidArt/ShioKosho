package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dto.CockingTip;
import org.springframework.stereotype.Service;

/**
 * Created by david on 29-May-17.
 */
@Service
public interface CockingTipService {

    boolean createCockingTip(CockingTip cockingTip);

    CockingTip getCockingTipById(Long id);

    boolean updateCockingTip(CockingTip cockingTip);

    boolean deleteCockingTip(Long id);

}
