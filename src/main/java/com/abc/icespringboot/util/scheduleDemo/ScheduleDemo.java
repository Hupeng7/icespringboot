package com.abc.icespringboot.util.scheduleDemo;

import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/**
 * 定时任务 1：方法上添加 @Schedule  2：在程序系统入口添加注解 @EnableScheduling
 * cron属性
 * 这是一个时间表达式，可以通过简单的配置就能完成各种时间的配置，我们通过CRON表达式几乎可以完成任意的时间搭配，它包含了六或七个域：
 *
 * Seconds : 可出现", - * /"四个字符，有效范围为0-59的整数
 * Minutes : 可出现", - * /"四个字符，有效范围为0-59的整数
 * Hours : 可出现", - * /"四个字符，有效范围为0-23的整数
 * DayofMonth : 可出现", - * / ? L W C"八个字符，有效范围为0-31的整数
 * Month : 可出现", - * /"四个字符，有效范围为1-12的整数或JAN-DEc
 * DayofWeek : 可出现", - * / ? L C #"四个字符，有效范围为1-7的整数或SUN-SAT两个范围。1表示星期天，2表示星期一， 依次类推
 * Year : 可出现", - * /"四个字符，有效范围为1970-2099年
 *
 * 下面简单举几个例子：
 *
 * "0 0 12 * * ?"    每天中午十二点触发
 * "0 15 10 ? * *"    每天早上10：15触发
 * "0 15 10 * * ?"    每天早上10：15触发
 * "0 15 10 * * ? *"    每天早上10：15触发
 * "0 15 10 * * ? 2005"    2005年的每天早上10：15触发
 * "0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发
 * "0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发
 * "0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发
 * "0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发
 * "0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发
 * "0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发
 *
 */

@Component
@Slf4j
public class ScheduleDemo {
    private int countA = 0;
    private int countB = 0;
    private int countC = 0;
    private int countD = 0;

    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 每3秒钟执行一次该方法
     */
    @Scheduled(cron = "0/3 * * * * ?")
    public void scheduleTestA() {
        ++countA;
        log.info("************* start scheduleTestA() 第 " + countA + " 次 *************");
        //todo your method
        log.info(sdf.format(DateTime.now().toDate()) + "*********方法scheduleTestA()每3秒执行一次进入测试");
        log.info("************* end schdule *************");
    }

    /**
     * 是上一次调用开始后再次调用的延时（不用等待上一次调用完成）
     */
    @Scheduled(fixedRate = 1000 * 2)
    public void scheduleFixedRateTestB() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ++countB;
        log.info("************* start scheduleFixedRateTestB() 第 " + countB + " 次 *************");
        //todo your method
        log.info(sdf.format(DateTime.now().toDate()) + "*********方法scheduleFixedRateTestB()频率每2秒 延迟2秒执行一次进入测试");
        log.info("************* end schdule *************");
    }

    /**
     * 上一次调用完成后再次调用的延时调用
     */
    @Scheduled(fixedDelay = 1000 * 1)
    public void scheduleFixedDelayTestC() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ++countC;
        log.info("************* start scheduleFixedRelayTestC() 第 " + countC + " 次 *************");
        //todo your method
        log.info(sdf.format(DateTime.now().toDate()) + "*********方法 scheduleFixedDelayTestC() 延迟1秒 休眠3秒执行一次 进入测试");
        log.info("************* end schdule *************");
    }

    /**
     * 第一次调用前延时 单位：毫秒
     */
    @Scheduled(initialDelay = 1000 * 5, fixedDelay = 1000 * 2)
    public void scheduleInitialDelayTestD() {
        ++countD;
        log.info("************* start scheduleInitialDelayTestD() 第 " + countD + " 次 *************");
        //todo your method
        log.info(sdf.format(DateTime.now().toDate()) + "方法 scheduleInitialDelayTestD() 初始化5秒后 延迟2秒执行一次  进入测试");
        log.info("************* end schdule *************");
    }


}
