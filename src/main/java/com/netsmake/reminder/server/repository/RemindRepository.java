package com.netsmake.reminder.server.repository;


import com.netsmake.reminder.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RemindRepository extends JpaRepository<Remind, Long> {


}
