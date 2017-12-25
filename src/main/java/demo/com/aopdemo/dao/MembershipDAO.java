package demo.com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAcount(){

        System.out.println(getClass() + " : Doing add a membership");
    }
}
