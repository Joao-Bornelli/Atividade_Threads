import java.util.Random;

public class SensorDeTemperatura extends Thread{

    private float temperaturaAtual;
    Random random = new Random();

    public SensorDeTemperatura(){
        super();
        start();
    }

    public float getTemperaturaAtual() {
        return temperaturaAtual;
    }
    public void setTemperaturaAtual(float Temp){
        this.temperaturaAtual = Temp;
    }

    public void run() {

        while (true) {
            this.setTemperaturaAtual(random.nextInt(30) + random.nextFloat());

            try {
                sleep(main.tempoAtt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
