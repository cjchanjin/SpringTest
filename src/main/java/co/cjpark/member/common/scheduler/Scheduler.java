package co.cjpark.member.common.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

	@Autowired
	MailServiceImpl mailService;
	
	/**
	* 매 10초마다 실행하는 스케줄
	* 어노테이션 주석처리 하면 스케줄 작동 안함
	*/
	@Scheduled(cron = "0/10 * * * * *")
	public void cronTest1(){
		mailService.sendMail();
	}
	
	//매일 10시 40분에 실행
	@Scheduled(cron = "0 40 10 * * * ")
	public void cronTest2 () {
		System.out.println("매일 10시 40분에 실행 ");
	}
}
