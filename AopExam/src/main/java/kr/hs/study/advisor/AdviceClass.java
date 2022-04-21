package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
public class AdviceClass {
	
	public void beforMethod() {
		System.out.println("충고 advice 횡단관심사");
	}

	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		pjp.proceed(); //실제 핵심메서드 실행
	
	}
	
}	