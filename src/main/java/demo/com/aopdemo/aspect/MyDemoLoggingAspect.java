package demo.com.aopdemo.aspect;

import demo.com.aopdemo.dao.Acount;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

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
    public void performApiAnalitics(JoinPoint joinPoint){

        Signature signature = joinPoint.getSignature();

        Object[] obj = joinPoint.getArgs();

        String arg = new String();
        for (Object o : obj) {
            arg = arg + o.toString() + ", ";
        }

        System.out.println(String.format("\n =====>>> method: %s  performing with arguments: %s", signature, arg));
    }


    @AfterReturning(
            pointcut = "execution(* demo.com.aopdemo.dao.AccountDAO.findAcounts(..))",
            returning = "result"
    )
    public void afterReturningFindAccountAdvice(JoinPoint joinPoint, List<Acount> result){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("========>>> Executing @AftreReturning on method: " + method);

        System.out.println("========>>> Result is: " + result);

        //post process data
        accountNamesToUpperCase(result);
        System.out.println("========>>> Result is: " + result);
    }

    private void accountNamesToUpperCase(List<Acount> result) {

        result.stream()
                .forEach(acount -> acount.setName(acount.getName().toUpperCase()));
    }

    @AfterThrowing(
            pointcut = "execution(* demo.com.aopdemo.dao.AccountDAO.*(..))",
            throwing = "theExc"
    )
    public void loggingException(JoinPoint joinPoint, Throwable theExc){

        String methodName = joinPoint.getSignature().toShortString();

        System.out.println(methodName + " throw the exception " + theExc);

    }
}
