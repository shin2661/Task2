package com.crizen.task2.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.web.context.support.*;

import com.crizen.task2.service.RemoveOvertimeService;

public class RemoveOvertimeJob extends QuartzJobBean {
	// 실제 실행될 테스크
    private RemoveOvertimeService removeOvertimeService;
    
    // 실제 실행될 테스크를 setter 방식 주입
    public void setRemoveOvertimeService(RemoveOvertimeService removeOvertimeService) {
        this.removeOvertimeService = removeOvertimeService;
    }
    

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		
		System.out.println("========================================================= RemoveOvertimeJob =======================================");
		removeOvertimeService.removeOvertime();
	}
    
    
}
