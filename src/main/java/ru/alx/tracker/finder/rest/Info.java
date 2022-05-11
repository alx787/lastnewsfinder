package ru.alx.tracker.finder.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.alx.tracker.finder.model.Coordinates;
import ru.alx.tracker.finder.service.CoordinatesService;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping("/test")
public class Info {
    private static final Logger log = LogManager.getLogger(Info.class);

    @Autowired
    private CoordinatesService coordsService;

    @RequestMapping(value = "/hw", method = RequestMethod.GET)
    @ResponseBody
    public String getHelloWorld() {
        log.warn("Hello, World !!!");
        return "Hello, World !!!";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public String createTestCoord() {
        Timestamp timestamp = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse("1999-01-30 10:00:00.000");
            timestamp = new Timestamp(parsedDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            log.warn(e);
        }

        if (timestamp != null) {
            Coordinates coord = new Coordinates(Double.valueOf(1), Double.valueOf(2), timestamp, timestamp);
            coordsService.create(coord);
            log.warn("Create test !!!");
            return "Create test !!!";
        }

        log.warn("Dont create test !!!");
        return "Dont create test !!!";

    }

}
