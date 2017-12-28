package demo.com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;

    public void addAcount(Acount acount, boolean isVip){

        System.out.println(getClass() + ": Doing my db work: adding account");
    }

    public String getName() {
        System.out.println(getClass() + ": run getter method");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": run setter method");
        this.name = name;
    }
}
