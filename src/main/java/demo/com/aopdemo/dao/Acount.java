package demo.com.aopdemo.dao;

public class Acount {

    private String name;
    private String level;

    public Acount() {
    }

    public Acount(String name, String level) {
        this.name = name;
        this.level = level;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void addAcount(String name, String level){}

    @Override
    public String toString() {
        return "Acount{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
