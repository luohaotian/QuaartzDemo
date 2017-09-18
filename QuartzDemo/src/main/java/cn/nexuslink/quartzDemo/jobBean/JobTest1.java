package cn.nexuslink.quartzDemo.jobBean;

import org.quartz.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 罗浩 on 2017/9/18.
 * description 采用quartz请提供的Job接口
 */
public class JobTest1 implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobKey jobKey = jobDetail.getKey();
        String name = jobKey.getName();
        String group = jobKey.getGroup();

        System.out.println("当前执行的任务是test1JobDetail： name和group：" + name + "  and  " + group);
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current time :" + sf.format(date));
        System.out.println("===========");
    }
}
