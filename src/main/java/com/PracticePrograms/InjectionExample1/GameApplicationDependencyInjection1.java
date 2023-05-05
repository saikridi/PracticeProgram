package com.PracticePrograms.InjectionExample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
class BusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;

    /*
    This is the constructor Injection. The best thing In the constructor injection is to have the
     */
    @Autowired
    public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
        System.out.println("Constructor Injection in the Business class.");
    }
    /*
    // These are the Auto wired for the Fields
    @Autowired
    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;
     */

    /*
    // These are the Autowired for the Setter and Similar code to the getter field.
    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter for: - Set Dependency 1");
        this.dependency1 = dependency1;
    }
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter for: - Set Dependency 2");
        this.dependency2 = dependency2;
    } */

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class GameApplicationDependencyInjection1 {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(GameApplicationDependencyInjection1.class)){
            Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class).toString());
        }
    }
}
