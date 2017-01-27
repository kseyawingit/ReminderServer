package com.netsmake.reminder.server.controller;

import com.netsmake.reminder.server.entity.Remind;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@Controller
@RestController
@RequestMapping("/remind")
public class RemindController {

        @RequestMapping(value = "/get", method = RequestMethod.GET)
        @ResponseBody
        /*
        public String getRemider(ModelMap model){
                return "my reminder";
        }
        */
        /*
        public Remind getRemider(ModelMap model) {
            return createMockRemind();
        }
        */
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

}
