import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City(54, "Bishkek"));
        cities.add(new City(37, "K-Ata"));
        cities.add(new City(41, "Osh"));
        cities.add(new City(72, "J-abad"));
        cities.add(new City(15, "Madrid"));
        cities.add(new City(62, "Etihad"));
        cities.add(new City(33, "Moskva"));

        Set<City> treeSet = new TreeSet<>();
        for (City city : cities) {
            if (city.getCode() % 2 == 1) {
                treeSet.add(city);
            }
        }

        for (City city : treeSet) {
            System.out.println(city);
        }
    }
}