import java.awt.*;
import java.awt.event.*;
// import java.util.*;
public class AWTEx2 extends Frame implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window is opened ...");
        // Handle window opened event
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing ...");
        System.exit(0);
        // Handle window closed event
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window is iconified ...");
        // Handle window iconified event
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // Handle window deiconified event
        System.out.println("Window is deiconified ...");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window is closed ...");
        // Handle window closed event
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window is activated ...");
        // Handle window activated event
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is deactivated ...");
        // Handle window deactivated event
    }
    Frame f;
    Button b1;


    public AWTEx2() {
        f = new Frame("AWT EXAPMLE 2");
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(this);
        b1 = new Button();
        b1.setLabel("HEY USER!!");
        b1.setBounds(50, 100, 200, 50); // Corrected method call to setBounds
        add(b1);
        b1.setBackground(Color.black);
        setLayout(null);
        b1.setForeground(Color.white);
    }
  


    public static void main(String[] args) {
        AWTEx2 a1 = new AWTEx2();
    }
    
}
