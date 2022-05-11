package ru.alx.tracker.finder.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.alx.tracker.finder.model.Coordinates;

import java.sql.Timestamp;

@Repository
public class CoordinatesDaoImpl implements CoordinatesDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Coordinates findById(int id) {
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        Coordinates coord = (Coordinates)session.get(Coordinates.class, id);
//        session.close();
//        return coord;

        return sessionFactory.getCurrentSession().get(Coordinates.class, id);
//        return null;
    }

    public Coordinates create(Coordinates coords) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(coords);
//        tx.commit();
        session.getTransaction().commit();
        session.close();
        return coords;
    }
}
