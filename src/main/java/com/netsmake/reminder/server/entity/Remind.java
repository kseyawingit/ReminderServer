package com.netsmake.reminder.server.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "remind")
public class Remind {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "remind_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date remindDate;

    public Remind() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }
}
