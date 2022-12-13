package functionalInterface;

import java.util.Objects;

public class InerfaceDemo {
    public static void main(String[] args) {
        Integer[] mass = {5, 9, 7, 8, 5, 99, 5};

        // task 1
        DetermineSignTask1 string = a -> (a > 0) ? "Musbat" : "Manfiy";


        //task2
        MaxTask2<Integer, Integer> maxTask2 = (a, b) -> (a > b) ? a : b;

        //task3
        MassivMaxTask3<Integer> result = arr -> {
            int max = arr[0];
            for (Integer integer : arr) {
                if (integer > max)
                    max = integer;
            }
            return max;
        };

        System.out.println(result.max(mass));

        //task4
        AddMassivElementsTask4<Integer> summaMassiv = arr -> {
            int s = 0;
            for (Integer a : arr) {
                s += a;
            }
            return s;
        };
        System.out.println(summaMassiv.add(mass));

        //task 5
        DetermineNumber<Integer> isHas  = (arr, b) ->{
            for (Integer a: arr){
                if(Objects.equals(a, b)){
                    return true;
                }
            }
            return false;
        } ;
        int b = 9;
        System.out.println(isHas.determine(mass,b));

        //task 6
        AddPositivaNubmers<Integer> addPositivaNubmers = (arr)-> {
            int s=0;
            for (Integer a: arr){
                if(a>0){
                    s+=a;
                }
            }
            return s;
        };
        //task 7
        AddOddNumbers<Integer>  integerAddOddNumbers = (arr) ->{
          int s=0;
          for (Integer a: arr){
              if(a % 2 == 1){
                  s+=a;
              }
          }
          return s;
        };
        System.out.println(integerAddOddNumbers.addOddNumbers(mass));

        //task 8
        AddPrimeNumbers<Integer> integerAddPrimeNumbers = (arr) ->{
            int s=0;
            for (Integer a: arr){
                int cnt = 0;
                for (int i = 1; i <= a; i++) {
                    if(a % i == 0) cnt++;
                }
                if (cnt == 2){
                    s+=a;
                }
            }
            return s;
        };
        System.out.println(integerAddPrimeNumbers.addPrimeNumbers(mass));

        //task 9
        S1ContainsS2 s1ContainsS2 = (a, b1) -> {
            if (a.contains(b1))
                return true;
            return false;
        };
        System.out.println(s1ContainsS2.s1ContainsS2("salom" , "sal"));

        //task 10
        VoweoCount voweoCount  = (a) ->{
          int cnt = 0;
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i)=='a' ||a.charAt(i)=='e' ||a.charAt(i)=='u'
                        ||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='y' )
                    cnt++;
            }
          return cnt;
        };
        System.out.println(voweoCount.vowelCount("salom"));

    }
}
