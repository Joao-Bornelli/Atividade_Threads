import java.util.ArrayList;

/**
 * Write a description of class Refrigerador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Refrigerador {
    protected float temperaturaSelecionada;
    protected Carga ventilador;
    protected SensorDeTemperatura sensorTemperaturaAtual;
    protected float TempAnt;
    private final ArrayList<ListenerRefrigerador> ListenersList = new ArrayList<>();


    public Refrigerador(){
        ventilador = new Carga();
        sensorTemperaturaAtual = new SensorDeTemperatura();
        TempAnt = sensorTemperaturaAtual.getTemperaturaAtual();
    }

    public float getTemperatura(){
        return sensorTemperaturaAtual.getTemperaturaAtual();
    }
    //Setter para temperatura (Celsius).
    public void selecionarTemperatura(float temperatura) {
        temperaturaSelecionada = temperatura;
    }
    
    public void controlarTemperatura() {
        if(sensorTemperaturaAtual.getTemperaturaAtual() != TempAnt){
            attListener();
            TempAnt = sensorTemperaturaAtual.getTemperaturaAtual();
        }
        if(sensorTemperaturaAtual.getTemperaturaAtual() > temperaturaSelecionada) {
            ventilador.ligar();
        }
        else {
            ventilador.desligar();
        }
    }

    public void attListener(){
        for(ListenerRefrigerador a: ListenersList){
            a.AtualizaTexto(sensorTemperaturaAtual.getTemperaturaAtual());
        }
    }
    public void addListener(ListenerRefrigerador a){
        ListenersList.add(a);
    }
}












