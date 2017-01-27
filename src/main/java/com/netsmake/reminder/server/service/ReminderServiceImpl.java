package com.netsmake.reminder.server.service;

import com.netsmake.reminder.server.entity.Remind;
import com.netsmake.reminder.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReminderServiceImpl implements RemindService{

    @Autowired
    private RemindRepository repository;

    public List<Remind> getAll() {
        return repository.findAll();
    }

    public Remind getById(long id) {
        return repository.findOne(id);
    }

    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
