package demo.com.aopdemo.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    public List<Acount> findAcounts(){

        List<Acount> myAcounts = new ArrayList<>();

        Acount temp1 = new Acount("John" , "Silver");
        Acount temp2 = new Acount("Madhu" , "Platinum");
        Acount temp3 = new Acount("Luca" , "Gold");

        myAcounts.add(temp1);
        myAcounts.add(temp2);
        myAcounts.add(temp3);

        return myAcounts;
    }
}
