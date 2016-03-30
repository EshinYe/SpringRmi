package com.eshin.rmi;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-*.xml" })
public class RunMain {
	@Resource(name="helloService")
	HelloService helloService;
	@Test
	public void TestselectHomeProv() {
     String str = helloService.doHello("yezhixin");
     System.out.println(str);
	}
}
