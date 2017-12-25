package demo.com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAcount(Acount acount, boolean isVip){

        System.out.println(getClass() + ": Doing my db work: adding account");
    }
}
