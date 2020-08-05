package com.example.demo.dao;


import com.example.demo.beans.User;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SQLDao    {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> selectUserByName(String username) {

          //非注入
//        Query query = (Query) this.entityManager
//                .createQuery("from User u where u.userName like :userName ",User.class);
//        query.setParameter("userName","%"+username+"%");

        Query query = (Query) this.entityManager
                .createQuery("from User u where u.userName = :userName order by :orderBy",User.class);
        query.setParameter("userName",username);
        query.setParameter("orderBy","(select user())");

          //注入 hql
//          Query query = (Query) this.entityManager
//                  .createQuery("from User u where u.userName like '%"+username+"%' ORDER BY user()",User.class);

          // 注入sql
//          Query query = (Query) this.entityManager.createNativeQuery("select username" +
//                  " as userName, password from user_tbl u" +
//                  " where u.username like '%"+username+"%'");

          return query.getResultList();
    }
}






