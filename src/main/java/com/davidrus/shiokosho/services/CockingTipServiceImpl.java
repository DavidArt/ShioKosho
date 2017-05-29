package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dao.CockingTipDao;
import com.davidrus.shiokosho.dto.CockingTip;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 29-May-17.
 */
@Service
@Slf4j
public class CockingTipServiceImpl implements CockingTipService {

    @Resource
    private Mapper mapper;

    @Resource
    private CockingTipDao cockingTipDao;

    @Override
    public boolean createCockingTip(CockingTip cockingTip) {
        com.davidrus.shiokosho.domain.CockingTip cockingTipDomain = mapper.map(cockingTip, com.davidrus.shiokosho.domain.CockingTip.class);
        return cockingTipDao.createCockingTip(cockingTipDomain);
    }

    @Override
    public CockingTip getCockingTipById(Long id) {
        com.davidrus.shiokosho.domain.CockingTip cockingTipDomain = cockingTipDao.getCockingTipById(id);
        CockingTip cockingTipDto = mapper.map(cockingTipDomain, CockingTip.class);
        return cockingTipDto;
    }

    @Override
    public boolean updateCockingTip(CockingTip cockingTip) {
        com.davidrus.shiokosho.domain.CockingTip cockingTipDomain = mapper.map(cockingTip, com.davidrus.shiokosho.domain.CockingTip.class);
        return cockingTipDao.updateCockingTip(cockingTipDomain);
    }

    @Override
    public boolean deleteCockingTip(Long id) {
        return cockingTipDao.deleteCockingTip(id);
    }
}
