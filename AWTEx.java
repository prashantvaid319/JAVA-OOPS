// import java.awt.Frame;
// import java.awt.Label;
// import java.awt.TextField;
// import java.awt.Button;
// import java.awt.Color;
// import java.awt.event.WindowAdapter;
// import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;

public class AWTEx extends Frame implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {
        // Handle window opened event
        System.out.println(e);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Is Closing ...");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // Handle window closed event
        System.out.println(e);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // Handle window iconified event
        System.out.println(e);
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // Handle window deiconified event
        System.out.println(e);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // Handle window activated event
        System.out.println(e);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // Handle window deactivated event
        System.out.println(e);
    }
    public AWTEx(){
        Container cc = new Container();
        cc.setLayout(new FlowLayout());
        cc.setBackground(Color.gray);
        cc.setForeground(Color.white);
        cc.setBounds(0, 0, 400, 500); // Corrected method call to setBounds
        // add(cc);
        // cc.setVisible(true);



        List list = new List();
        list.setBounds(50, 400, 100, 100); // Corrected method call to setBounds
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        add(list);
        list.setBackground(Color.gray);
        list.setForeground(Color.white);


        Choice c = new Choice();
        c.setBounds(50, 360, 100, 30); // Corrected method call to setBounds
        add(c);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.setBackground(Color.gray);
        c.setForeground(Color.white);


        TextArea t1 = new TextArea();
        t1.setBounds(50, 250, 200, 100); // Corrected method call to setBounds
        add(t1);
        t1.setBackground(Color.black);
        t1.setForeground(Color.white);

        Checkbox c1 = new Checkbox();
        c1.setBounds(50, 150, 100, 30); // Corrected method call to setBounds
        add(c1);
        c1.setBackground(Color.gray);
        c1.setForeground(Color.white);




        TextField textfield = new TextField();
        textfield.setBounds(50,200,100,30);
        add(textfield);
        textfield.setBackground(Color.black);
        textfield.setForeground(Color.white);



        Label label = new Label("Welcome To AWT");
        label.setBounds(50, 50, 100, 30); // Corrected method call to setBounds
        add(label);
        label.setBackground(Color.black);
        // label.setFont(font);
        label.setForeground(Color.white);


        Button b = new Button("Click Here");
        b.setBounds(50, 100, 100, 30);
        add(b);
        setLayout(null); // Set layout to null for absolute positioning
        //        b.setBounds(rect(50, 100, 100, 30)); // Removed invalid method call
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked ...");
            }
        });



        setTitle("AWT Example");
        setSize(400, 500);
        setVisible(true);
        addWindowListener(this);
        //setBackground(Color.black);
        
    }
   

    

    public static void main(String[] args) {
        new AWTEx();
        
    }
}
