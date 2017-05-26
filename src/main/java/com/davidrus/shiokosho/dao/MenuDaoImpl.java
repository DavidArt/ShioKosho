package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Menu;
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
public class MenuDaoImpl implements MenuDao {

    @PersistenceContext
    public EntityManager em;

    @Override
    @Transactional
    public boolean createMenu(Menu menu) {
        em.persist(menu);

        return true;
    }

    @Override
    public Menu getMenuById(Long id) {
        TypedQuery<Menu> query = em.createNamedQuery(Menu.GET_MENU_BY_ID, Menu.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    @Transactional
    public boolean updateMenu(Menu menu) {
        em.merge(menu);

        return true;
    }

    @Override
    @Transactional
    public boolean deleteMenu(Long id) {
        TypedQuery<Menu> query = em.createNamedQuery(Menu.GET_MENU_BY_ID, Menu.class);
        query.setParameter("id", id);
        Menu menu = query.getSingleResult();
        em.remove(menu);

        return true;
    }
}
