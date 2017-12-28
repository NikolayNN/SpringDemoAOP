package demo.com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalyticsAspect {

    @Before("demo.com.aopdemo.aspect.AopExpression.forDaoPackageExcludeGetterSetter()")
        public void performApiAnalitics(){
            System.out.println("\n =====>>> Perfoming API analitics()");
    }
}
