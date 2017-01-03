package kz.kaznitu.lessons;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgramm {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml") ;
        SingletonBean singletonBean = (SingletonBean)context.getBean("singletonBean") ;

        PrototypeBean prototypeBeanA = singletonBean.getPrototypeBean() ;
        PrototypeBean prototypeBeanB = singletonBean.getPrototypeBean() ;

        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);
        System.out.println("prototypeBeanA және prototypeBeanB  бір ма? " + (prototypeBeanA==prototypeBeanB));
    }
}
