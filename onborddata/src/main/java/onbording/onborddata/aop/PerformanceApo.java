package onbording.onborddata.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Aspect
public class PerformanceApo {

	@Around("execution(* onbording.onborddata.controller.EmpOnbordController.save(..))")
	public Object perfApo(ProceedingJoinPoint jp) throws Throwable {

		Long startTime = System.currentTimeMillis();
		Object o = jp.proceed();
		Long endTime = System.currentTimeMillis();

		Long perTime = (endTime - startTime);
		log.info("metod end time -------" + perTime);

		return o;

	}
}
