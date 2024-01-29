package My_Aop;



import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Student_aspect {
	
	@Pointcut("execution(* My_Aop.student_pojo_class.display())")
	public void pointcutMethod() {
		//keep it's Empty
	}
	
	@Around ("pointcutMethod()")
	public Object AroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		Logger log=Logger.getLogger("");
		log.info("Before The Execution ");
		Object result=joinPoint.proceed();
		log.info("After Method Execution ");
		return result;
		
	}

}
