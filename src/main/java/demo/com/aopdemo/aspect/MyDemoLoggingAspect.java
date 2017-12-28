package demo.com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {

//    @Before("execution(public void add*())")
//    @Before("execution(* add*(demo.com.aopdemo.dao.Acount, ..))")
//    @Before("execution(* add*(..))")
//    @Before("execution(* demo.com.aopdemo.dao.*.*(..))")
//    @Before("execution(* demo.com.aopdemo.dao.AccountDAO.*(..))")
//    @Before("execution(* demo.com.aopdemo.dao.Account*.*(..))")

//    @Pointcut("execution(* demo.com.aopdemo.dao.*.*(..))")
//    private void forDaoPackage(){}
//
//    @Pointcut("execution(* demo.com.aopdemo.dao.*.get*(..)) ")
//    private void forGetter(){}
//
//    @Pointcut("execution(* demo.com.aopdemo.dao.*.set*(..)) ")
//    private void forSetter(){}
//
//    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
//    private void forDaoPackageExcludeGetterSetter(){}
//
//    @Before("forDaoPackageExcludeGetterSetter()")
//    public void beforeAddAccountAdvice() {
//        System.out.println("\n =====>>> executing @Before advice on addAccount()");
//    }

    @Before("demo.com.aopdemo.aspect.AopExpression.forDaoPackageExcludeGetterSetter()")
    public void performApiAnalitics(){
        System.out.println("\n =====>>> performing demo");
    }
}
