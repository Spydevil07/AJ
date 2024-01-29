package My_Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_class {

	private static ApplicationContext ctx;
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("aop_config.xml");
		student_pojo_class stu=(student_pojo_class) ctx.getBean("aop_bean");
		stu.display();
	
	}

}
