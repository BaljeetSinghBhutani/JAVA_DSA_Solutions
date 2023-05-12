package Interfaces;

public class main {
    public static void main(String[] args) {
//       Engine car = new Car();
////        System.out.println(car.a);
//        car.start();
//        car.accelerate();
//        car.stop();
//
//        Media carMedia  = new Car();
//carMedia.start();
//carMedia.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.upgradeEngine();
        niceCar.start();
        niceCar.stop();

    }
}
