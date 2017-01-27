package com.netsmake.reminder.server.controller;

import com.netsmake.reminder.server.entity.Remind;
import com.netsmake.reminder.server.service.RemindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

//***********************

@RestController
@RequestMapping("/remind")
public class RemindController {

         @RequestMapping(value = "/get", method = RequestMethod.GET)
        @ResponseBody
        public Remind getRemider() {
            return createMockRemind();
        }

        private Remind createMockRemind() {
            Remind remind = new Remind();
            remind.setId(1);
            remind.setRemindDate(new Date());
            remind.setTitle("My first remind");

            return remind;
        }


//**********************

/*
    @RestController
    public class RemindController {

    @Autowired
    private RemindService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindID) {
        return service.getById(remindID);
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveRemider(@RequestBody Remind remind) {
        return service.save(remind);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
*/


}
