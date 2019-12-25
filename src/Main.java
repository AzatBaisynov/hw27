
import places.*;

public class Main {
    public static void main(String[] args) {
        District[] districts = new District[5];
        districts[0] = new District(5000, "one", "first");
        districts[1] = new District(4000, "two", "second");
        districts[2] = new District(4500, "three", "third");
        districts[3] = new District(4700, "four", "fourth");
        districts[4] = new District(5200, "five", "fifth");

        City city = new City(districts, "Bishkek", 123456,"someone");
        District search = city.findByHead("someone", districts);

        if (search != null){
            System.out.println(search.getName());
        } else if (search == null) {
            System.out.println("Такого района нет");
        }
    }
}
