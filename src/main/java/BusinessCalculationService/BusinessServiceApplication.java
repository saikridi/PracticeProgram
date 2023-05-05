package BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessServiceApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(BusinessServiceApplication.class)){
            System.out.println(context.getBean(BusinessService.class).FindMax());
        }
    }
}
