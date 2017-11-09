package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext aca =new AnnotationConfigApplicationContext(FunctionConfig.class);
		UseFunctionService  useFunctionService =aca.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.useFun("lalalalalalalala"));
		aca.close();

	}

}
