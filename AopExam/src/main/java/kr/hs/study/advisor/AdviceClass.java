package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
public class AdviceClass {
	
	public void beforMethod() {
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
	}

	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		pjp.proceed(); //���� �ٽɸ޼��� ����
	
	}
	
}	