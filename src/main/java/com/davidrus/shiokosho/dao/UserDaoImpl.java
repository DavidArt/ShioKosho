package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.User;
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
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    public EntityManager em;

    @Override
    @Transactional
    public boolean createUser(User user) {
        em.persist(user);

        return true;
    }

    @Override
    public User getUserById(Long id) {
        TypedQuery<User> query = em.createNamedQuery(User.GET_USER_BY_ID, User.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    public User getUserByName(String userName) {
        TypedQuery<User> query = em.createNamedQuery(User.GET_USER_BY_NAME, User.class);
        query.setParameter("name", userName);

        return query.getSingleResult();
    }

    @Override
    @Transactional
    public boolean updateUser(User user) {
        em.merge(user);

        return true;
    }

    @Override
    @Transactional
    public boolean deleteUser(Long id) {
        TypedQuery<User> query = em.createNamedQuery(User.GET_USER_BY_ID, User.class);
        query.setParameter("id", id);
        User user = query.getSingleResult();
        em.remove(user);

        return true;
    }
}
