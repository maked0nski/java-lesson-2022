package homework.cw_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Opel", 700, 9200, 2012, new Owner("Sasha", 31, 2));
        Car car2 = new Car("Audi", 900, 10100, 2020, new Owner("Oleg", 28, 5));
        Car car3 = new Car("Reno", 400, 7200, 2011, new Owner("Igor", 35, 14));
        Car car4 = new Car("Peugeot", 500, 8520, 2015, new Owner("Andrey", 45, 18));
        Car car5 = new Car("Opel", 800, 10150, 2013, new Owner("Viktor", 42, 21));
        Car car6 = new Car("Kia", 700, 9500, 2004, new Owner("Inna", 46, 23));
        Car car7 = new Car("VAZ", 450, 2100, 2000, new Owner("Vira", 32, 15));
        Car car8 = new Car("Citroen", 620, 8700, 2001, new Owner("Taras", 38, 9));
        Car car9 = new Car("Lamborghini", 1200, 28650, 2019, new Owner("Sergey", 29, 3));
        Car car10 = new Car("Mercedes", 850, 15800, 2020, new Owner("Misha", 31, 8));

        car3.setPower();

        ArrayList<Car> autopark = new ArrayList<>();
        autopark.add(car1);
        autopark.add(car2);
        autopark.add(car3);
        autopark.add(car4);
        autopark.add(car5);
        autopark.add(car6);
        autopark.add(car7);
        autopark.add(car8);
        autopark.add(car9);
        autopark.add(car10);
        System.out.println(autopark);


        System.out.println("Зробили половині автопарку ремонт мотору,\n" +
                "що збільшить потужність автомобілів на 10% :");
        List<Car> collect1
                = autopark.stream()
                .map(car -> {
                    double power = car.getPower();
                    car.setPower();
                    return car;
                })
                .collect(Collectors.toList());
        collect1.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("На відремонтовані автомобілі найняти нових водіїв");
        car1.setOwner(new Owner("Jara", 55, 18));
        car3.setOwner(new Owner("Roman", 26, 1));
        collect1.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Якщо досвід водія менший за 5 років, але його вік більший за 25");
        collect1.forEach(Car::checkExperience);
        System.out.println("--------------------------------------");

        System.out.println("порахувати суму, яку потрібно потратити для покупки\n" +
                "всіх цих авто");
        Integer costAllCars
                = autopark.stream()
                .mapToInt(Car::getPrice)
                .sum();

        System.out.println(costAllCars);
        System.out.println("--------------------------------------");

    }
}
