package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component("t1") //스프링이 자동으로 어노테이션을 분석해서 bean을 만들어  ccontainer에 저장, 여러개 객체 만들려면  콘피그나 자바로 id준다
public class TestBean1 {

}
