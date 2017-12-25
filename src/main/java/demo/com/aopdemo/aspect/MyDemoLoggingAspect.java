package demo.com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//    @Before("execution(public void add*())")
//    @Before("execution(* add*(demo.com.aopdemo.dao.Acount, ..))")
//    @Before("execution(* add*(..))")
//    @Before("execution(* demo.com.aopdemo.dao.*.*(..))")
//    @Before("execution(* demo.com.aopdemo.dao.AccountDAO.*(..))")
//    @Before("execution(* demo.com.aopdemo.dao.Account*.*(..))")

    @Before("execution(* demo.com.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice() {

        System.out.println("\n =====>>> executing @Before advice on addAccount()");


    }
}
