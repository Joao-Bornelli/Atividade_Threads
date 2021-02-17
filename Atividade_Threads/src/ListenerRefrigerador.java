import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerRefrigerador implements ActionListener {
    JLabel txt;

    ListenerRefrigerador(JLabel txt){
        super();
        this.txt = txt;
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
    public void AtualizaTexto(float temperatura){

        txt.setText("Temperatura interna: " + (((float)((int)(temperatura*100)))/100)   );
    }
}
