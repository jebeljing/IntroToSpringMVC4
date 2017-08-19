package com.pluralsight.controller;

import com.pluralsight.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingshanyin on 8/18/17.
 */
@RestController
public class EventsReportController {

    @RequestMapping("/events")
    public List<Event> getEvents() {
        List<Event>  events = new ArrayList<>();
        Event event1 = new Event();
        event1.setName("Java User Group");

        events.add(event1);

        Event event2 = new Event();
        event2.setName("Angular User Group");

        events.add(event2);
        return events;
    }
}
