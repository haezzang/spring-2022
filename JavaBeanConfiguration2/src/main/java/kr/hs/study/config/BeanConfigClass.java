package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;


//이 파일은 bean을 만들라고 명령하는 설정파일이다.===config.xml과 동일
@Configuration
public class BeanConfigClass {

		@Bean //나는 아래 메서드 실행한 애를 bean으로 만들어 컨테이너에 저장
		public TestBean1 java1() {
				TestBean1 t1=new TestBean1();
				return t1;
			
		}
		@Bean(name="new")
		public TestBean1 java2() {
			TestBean1 t2=new TestBean1();
			return t2;
		}
		@Bean
		@Lazy
		@Scope("prototype")
		public TestBean1 java3() {
			return new TestBean1();
		}
}
