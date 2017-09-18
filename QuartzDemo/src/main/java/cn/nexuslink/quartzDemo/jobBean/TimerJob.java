package cn.nexuslink.quartzDemo.jobBean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by 罗浩 on 2017/9/18.
 */
public class TimerJob extends TimerTask {
    @Override
    public void run() {
        System.out.println("当前执行的任务是TimerJob" );
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current time :" + sf.format(date));
    }
}
