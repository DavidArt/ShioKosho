package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.CockingTip;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 * Created by david on 26-May-17.
 */
@Repository
@Slf4j
public class CockingTipDaoImpl implements CockingTipDao {

    @PersistenceContext
    public EntityManager em;

    @Override
    @Transactional
    public boolean createCockingTip(CockingTip cockingTip) {
        em.persist(cockingTip);

        return true;
    }

    @Override
    public CockingTip getCockingTipById(Long id) {
        TypedQuery<CockingTip> query = em.createNamedQuery(CockingTip.GET_COCKING_TIP_BY_ID, CockingTip.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    @Transactional
    public boolean updateCockingTip(CockingTip cockingTip) {
        em.merge(cockingTip);

        return true;
    }

    @Override
    @Transactional
    public boolean deleteCockingTip(Long id) {
        TypedQuery<CockingTip> query = em.createNamedQuery(CockingTip.GET_COCKING_TIP_BY_ID, CockingTip.class);
        query.setParameter("id", id);
        CockingTip cockingTip = query.getSingleResult();
        em.remove(cockingTip);

        return true;
    }
}
