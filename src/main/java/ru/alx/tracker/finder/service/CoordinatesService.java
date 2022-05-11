package ru.alx.tracker.finder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alx.tracker.finder.dao.CoordinatesDao;
import ru.alx.tracker.finder.model.Coordinates;

@Service
public class CoordinatesService {

    @Autowired
    private CoordinatesDao coordsDao;

    public Coordinates findById(int id) {
        return coordsDao.findById(id);
    }

    public void create(Coordinates coords) {
        coordsDao.create(coords);
    }
}
