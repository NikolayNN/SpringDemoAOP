package demo.com.aopdemo;

import demo.com.aopdemo.dao.Acount;
import demo.com.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.com.aopdemo.dao.AccountDAO;

import java.util.List;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        accountDAO.setName("John");
        accountDAO.getName();

        List<Acount> result = accountDAO.findAcounts();

        System.out.println("Main program : found Account" + result);

        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        accountDAO.addAcount(new Acount(), true);
        membershipDAO.addAcount();

        context.close();

    }
}

