package com.netsmake.reminder.server.service;


import com.netsmake.reminder.server.entity.Remind;

import java.util.List;

public interface RemindService {

    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void remove(long id);
}
