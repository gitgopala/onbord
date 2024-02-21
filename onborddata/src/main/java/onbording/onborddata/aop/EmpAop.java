package onbording.onborddata.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Aspect
public class EmpAop {

	@Before("execution(* onbording.onborddata.*.*.*(..))")
	public void beforeAsspect(JoinPoint jp) {
		String className = jp.getTarget().toString();
		String classMethod = jp.getSignature().getName();
		log.info("class starts -------" + className);
		log.info("method starts -------" + classMethod);

	}

	@After("execution(* onbording.onborddata.*.*.*(..))")
	public void afterAsspect(JoinPoint jp) {

		String className = jp.getTarget().toString();
		String classMethod = jp.getSignature().getName();
		log.info("class ends -------" + className);
		log.info("metod ends -------" + classMethod);
	}

}
