package cn.nexuslink.quartzDemo.jobBean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * Created by 罗浩 on 2017/9/18.
 */
public class TimerRun {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current time :" + sf.format(date));
        System.out.println("开始执行定时任务========");
        Timer timer = new Timer();
        TimerJob myTimeJob = new TimerJob();
        timer.schedule(myTimeJob,2000L,1000L);
    }
}
