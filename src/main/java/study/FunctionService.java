package study;

import org.springframework.stereotype.Service;
//��д�������Bean
@Service
public class FunctionService {
    public String sayHello(String word){
    	return "hello"+word;
    }
}
