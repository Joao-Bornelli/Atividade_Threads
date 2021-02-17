
/**
 * Representa uma Geladeira conforme o exercicio #1 da Lista #1.
 *
 * @author adami
 * @version 0.1
 */
public class Geladeira extends Thread{
    private int nivelDaTemperatura;
    private Congelador   congelador;
    private Refrigerador refrigerador;

    
    public Geladeira() {
        super();
        nivelDaTemperatura = 0; //0 eh o minimo.
        //instanciar os componentes.
        congelador = new Congelador();
        refrigerador = new Refrigerador();
        start();
    }
    
    //Setter o valor para o nivelDaTemperatura.
    public void selecionarTemperatura(int nivel) {
        nivelDaTemperatura = nivel;
        refrigerador.selecionarTemperatura((nivel+1) * 5);
        congelador.selecionarTemperatura((nivel+1) * - 10);
    }
    //
    public void controlarTemperatura() {
        congelador.controlarTemperatura();
        refrigerador.controlarTemperatura();
    }

    public Refrigerador getRefrigerador(){
        return refrigerador;
    }

    public void run() {
        while (true) {
            this.controlarTemperatura();
            try {
                sleep(main.tempoAtt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
