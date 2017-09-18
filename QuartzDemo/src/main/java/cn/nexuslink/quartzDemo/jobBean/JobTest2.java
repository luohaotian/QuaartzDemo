package cn.nexuslink.quartzDemo.jobBean;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 罗浩 on 2017/9/18.
 * description 采用MethodInvokingJobDetailFactoryBean
 */

@Component("jobTest2")
public class JobTest2 {

    public void execute(){
        System.out.println("当前执行的任务是JobTest2" );
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current time :" + sf.format(date));
        System.out.println("===========");

    }
}
