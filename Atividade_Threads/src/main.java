
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static int tempoAtt = 100;
    public static void main(String[] args) {
       Geladeira geladeira = new Geladeira();
       
       geladeira.selecionarTemperatura(1);
       Janela janela = new Janela(geladeira);
       janela.setVisible(true);
   }
   
}
