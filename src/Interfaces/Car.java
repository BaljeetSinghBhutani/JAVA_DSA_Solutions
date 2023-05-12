package Interfaces;

public class Car implements Engine, Brake, Media  {
int a =  30;
    @Override
    public void brake() {
        System.out.println("I am a normal Brake!!");
    }

    @Override
    public void start() {
        System.out.println("I am a normal Start!!");
    }

    @Override
    public void stop() {

        System.out.println("I am a normal Stop!!");
    }

    @Override
    public void accelerate() {
        System.out.println("I am a normal Accelerate!!");

    }
}
