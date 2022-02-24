package com.revature.repository;

import com.revature.model.Director;
import com.revature.model.Movie;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class MovieRepository {


    public void addMovie(Movie m) {

        try {
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            session.persist(m);
            transaction.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
