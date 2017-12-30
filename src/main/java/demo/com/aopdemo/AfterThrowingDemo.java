package demo.com.aopdemo;

import demo.com.aopdemo.dao.AccountDAO;
import demo.com.aopdemo.dao.Acount;
import demo.com.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class AfterThrowingDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        List<Acount> result = new ArrayList<>();

        try {

            result = accountDAO.testThrowException();

        }catch (Exception exc){
            System.out.println("Main program!");
        }

        context.close();
    }
}
