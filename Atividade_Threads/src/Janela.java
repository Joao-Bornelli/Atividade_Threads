import javax.swing.*;

public class Janela extends JFrame {

    private JLabel txt;

    public Janela(Geladeira geladeira){
        setTitle("Temperatura interna");
        txt = new JLabel();
        geladeira.getRefrigerador().addListener(new ListenerRefrigerador(txt));
        setSize(500,150);
        setLocationRelativeTo(null);
        txt.setHorizontalAlignment(SwingConstants.CENTER);

        add(txt);
    }
}
