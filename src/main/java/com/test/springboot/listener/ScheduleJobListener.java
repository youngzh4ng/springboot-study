package com.test.springboot.listener;

import com.test.springboot.timer.TestTimer;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ScheduleJobListener implements CommandLineRunner {

    private Scheduler scheduler;

    @Autowired
    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**************Starting Schedule Job...");
        String name = UUID.randomUUID().toString();
        String group = "TEST GROUP";
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/10 * * * * ?");
        JobDetail jobDetail = JobBuilder.newJob(TestTimer.class).withIdentity(name, group).build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity(name, group).withSchedule(scheduleBuilder).build();
        scheduler.scheduleJob(jobDetail, trigger);
    }
}
