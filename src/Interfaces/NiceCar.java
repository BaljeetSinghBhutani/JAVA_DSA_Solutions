package Interfaces;

public class NiceCar {
    private Engine engine;
    private Media MusicPlayer = new CDPlayer();

    public NiceCar() {
        engine =  new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic()
    {
        MusicPlayer.start();
    }

    public void stopMusic()
    {
         MusicPlayer.stop();
    }
    public void upgradeEngine()
    {
        this.engine  = new ElectricEngine();
    }






}
