package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayDemo {
    public static void main(String[] args) {
        // TAsk 1
        List<Circle> circles1 = new ArrayList<>();
        circles1.add(new Circle(15.0));
        circles1.add(new Circle(10.5));
        circles1.add(new Circle(8.0));
        circles1.add(new Circle(9.5));
        circles1.add(new Circle(25.5));
        List<Circle> circles2 = new ArrayList<>(circles1);


        // Task 2
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String s = scanner.next();
            names.add(1,"Anvar");
        }
        names.add("Xolmat");
        names.add(1,"Anvar");
        names.set(2,"Olimov");
        ArrayList<String> nameList =  new ArrayList<>(names);
        nameList.removeIf(name -> name.equals("Anvar"));
        nameList.removeIf(name -> name.equals("Olimov"));
        System.out.println(nameList);


        // Task 3
        //1
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("red" , "chevrolet" , "90H001DA"));
        cars.add(new Car("green" , "chevrolet" , "90H002DA"));
        cars.add(new Car("blue" , "chevrolet" , "90H003DA"));
        cars.add(new Car("white" , "chevrolet" , "90H004DA"));
        cars.add(new Car("black" , "chevrolet" , "90H005DA"));
        cars.add(new Car("grey" , "chevrolet" , "90H006DA"));
        cars.add(new Car("yellow" , "chevrolet" , "90H007DA"));
        cars.add(new Car("orange" , "chevrolet" , "90H008DA"));
        cars.add(new Car("violet" , "chevrolet" , "90H009DA"));
        cars.add(new Car("red" , "mazda" , "90H010DA"));
        //2
        System.out.println(cars.get(5));
        //3
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        System.out.println(cars.get(randomNum));

        cars.forEach(System.out::println);

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
