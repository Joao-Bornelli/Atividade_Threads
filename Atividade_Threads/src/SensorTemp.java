import java.util.Random;

public class SensorTemp extends Thread {
    Random random = new Random();
    private float TempAtual;

    public SensorTemp(){
        super();
        start();
    }
    @Override

    public void run(){
        while(true){
            TempAtual = random.nextInt(30) + random.nextFloat();
            try{
                sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public float GetTempAtual(){
        return TempAtual;
    }
}
