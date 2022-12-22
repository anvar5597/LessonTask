package arrayList;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TAsk 1
        List<CircleTask1> circles1 = new ArrayList<>();
        circles1.add(new CircleTask1(15.0));
        circles1.add(new CircleTask1(10.5));
        circles1.add(new CircleTask1(8.0));
        circles1.add(new CircleTask1(9.5));
        circles1.add(new CircleTask1(25.5));
        List<CircleTask1> circles2 = new ArrayList<>(circles1);


        // Task 2
        /*
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String s = scanner.next();
            names.add(1, "Anvar");
        }
        names.add("Xolmat");
        names.add(1, "Anvar");
        names.set(2, "Olimov");
        ArrayList<String> nameList = new ArrayList<>(names);
        nameList.removeIf(name -> name.equals("Anvar"));
        nameList.removeIf(name -> name.equals("Olimov"));
        System.out.println(nameList);*/

        /*1)  Rangi, modeli va davlat raqami fieldlari bor bo’lgan Car klassini yarating.
         Main classida Car classidan 10 ta bir xil bo’lmagan object oling. Ichida Car
         toifasidagi elementlarni saqlaydigan cars nomli List yarating va 10 ta elementni joylashtiring.
         2)  Indexdan foydalangan holda cars elementlarini ekranga chiqazing
         3)  List ichidan elementlarni random qilib oladigan method yozing.
         4)  Uzunligi 5 ga teng bo’lgan, ichida Car toifasidagi elementlarni saqlaydigan cars1 nomli boshqa list yarating
         va uni ichini to’ldiring. cars1 list elementlarini cars listning 2 indexidan boshlab joylashtiring
         5)  cars listni model bo’yicha saralang
         6)  cars listidan cars1 listida bor bo’lgan elementlarni o’chiring
         7)  cars listidan cars1 listida yo’q bo’lgan elementlarni o’chiring
         */
        // Task 3
        //1
        List<CarTask3> cars = new ArrayList<>();
        cars.add(new CarTask3("red", "chevrolet", "90H001DA"));
        cars.add(new CarTask3("green", "chevrolet", "90H002DA"));
        cars.add(new CarTask3("blue", "chevrolet", "90H003DA"));
        cars.add(new CarTask3("white", "chevrolet", "90H004DA"));
        cars.add(new CarTask3("black", "chevrolet", "90H005DA"));
        cars.add(new CarTask3("grey", "chevrolet", "90H006DA"));
        cars.add(new CarTask3("yellow", "chevrolet", "90H007DA"));
        cars.add(new CarTask3("orange", "chevrolet", "90H008DA"));
        cars.add(new CarTask3("violet", "chevrolet", "90H009DA"));
        cars.add(new CarTask3("red", "mazda", "90H010DA"));
        //2
//        System.out.println(cars.get(5));
        //3
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
//        System.out.println(cars.get(randomNum));

        /*cars.forEach(System.out::println);

        Iterator<CarTask3> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        //4
        List<CarTask3> car1  =new ArrayList<>();
        int cnt = 0;
        for (CarTask3 carTask3: cars) {
            if (cnt != 0 && cnt != 1 ){
            if(carTask3 != null){
                car1.add(carTask3);
            }
            }
            if (cnt == 7)
                break;
        cnt ++;
        }
        //5
        cars.sort(Comparator.comparing(CarTask3::getModel));

        //6
        cars.forEach(System.out::println);

        //7
//        for (CarTask3 task3:cars ) {
//            cars.removeIf(carTask3 -> !carTask3.getModel().equals(task3.getModel()));
//        }


        // task 4


        /*List<String> names = new ArrayList<>();
        names.add("Anvar");
        names.add("Javohir");
        names.add("Sarvar");
        names.add("Anvar");
        names.add("Anvar");
        names.add("Anvar");
        names.add("Murod");
        names.add("Anvar");
        names.add("Anvar");
        names.sort(String::compareTo);
        System.out.println(names);
        names.removeIf(s -> s.toLowerCase(Locale.ROOT).startsWith("a"));
        System.out.println(names);
*/
        // task 5
        Random  random = new Random();
        List<Integer> integerList = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            integerList.add(random.nextInt(100));
        }

        System.out.println(integerList);
    }

}
