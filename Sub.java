public class Sub {
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
        Car billy = new Car(100);
        Car james = new Car(150);
        Car jake = new Car(120);
        Car[] raceCars = new Car[]{billy, james, jake};
        Fleet race = new Fleet(raceCars);
        p(billy);
        p(james);
        p(jake);
        p("");
        System.out.println(race.findMax());

    }
}
