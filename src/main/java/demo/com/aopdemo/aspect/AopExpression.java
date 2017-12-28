package demo.com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpression {
    @Pointcut("execution(* demo.com.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){}

    @Pointcut("execution(* demo.com.aopdemo.dao.*.get*(..)) ")
    public void forGetter(){}

    @Pointcut("execution(* demo.com.aopdemo.dao.*.set*(..)) ")
    public void forSetter(){}

    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
    public void forDaoPackageExcludeGetterSetter(){}
}
