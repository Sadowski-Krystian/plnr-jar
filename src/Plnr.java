import javax.swing.*;
import java.awt.*;

public class Plnr {

    JFrame win = new JFrame();
    JPanel actBar = new JPanel(new BorderLayout());
    JPanel lstBox = new JPanel(new BorderLayout());

    Plnr(){
        win.setTitle("Harmonogram zajęć");
        win.setLayout(new BorderLayout());
        JLabel lbl0, lbl1, lbl2, lbl3,lbl4;
        lbl0 = new JLabel("Tutaj będzie panel narzędziowo-edycyjny");
        //lbl1 = new JLabel("Tutaj będzie lista zajęć");
        actBar.add(lbl0);
        lstBox.add(new ListaTematow());
        win.add(actBar, BorderLayout.PAGE_START);
        win.add(lstBox);
        win.setIconImage(Toolkit.getDefaultToolkit().getImage("app.png"));
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(640, 480);
        win.setVisible(true);
    }

    public static void main(String[] args) {
        new Plnr();
    }
}
