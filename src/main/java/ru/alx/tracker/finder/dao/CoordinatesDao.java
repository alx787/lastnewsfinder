package ru.alx.tracker.finder.dao;

import ru.alx.tracker.finder.model.Coordinates;

import java.sql.Timestamp;

public interface CoordinatesDao {
    Coordinates findById(int id);
    Coordinates create(Coordinates coordinates);
}
