package study;

import org.springframework.stereotype.Service;
//编写功能类的Bean
@Service
public class FunctionService {
    public String sayHello(String word){
    	return "hello"+word;
    }
}
