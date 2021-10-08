package Computer;

public class Computer {
    
    private String name;
    private int year;
    private double cost;
    

    public Computer(String name, int year, double cost) {
        this.name = name;
        this.year = year;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
