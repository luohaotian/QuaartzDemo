package cn.nexuslink.quartzDemo.jobBean;

import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 罗浩 on 2017/9/18.
 */
public class JobTest2Test {
    public static void main(String[] args) throws SchedulerException {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "QuartzDemo-quartz.xml");
        StdScheduler stdScheduler = (StdScheduler) ac.getBean("startQuartz");
        System.out.println(stdScheduler.getSchedulerName());

        System.out.println("=======");
        stdScheduler.start();
    }
}