public class Main {
    private static void p(String text){
        System.out.println(text);
    }
    private static void p(int num){
        System.out.println(num);
    }
    private static void p(Car vroom){
        System.out.println(vroom);
    }
    private static void p(int[] arrayNum){
        System.out.println(arrayNum);
    }
    private static void p(Car[] arrayCar){
        System.out.println(arrayCar);
    }

    public static void main(String[] args){
        Car[] billsUsedCars = new Car[16];
        for (int i = 0; i < billsUsedCars.length ; i++) {
            billsUsedCars[i] = new Car((int)(100*Math.random()));
        }
        Fleet billsCarsFleet = new Fleet(billsUsedCars);
        p(billsCarsFleet.findMax());


    }
}