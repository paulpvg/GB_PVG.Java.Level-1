import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setVisible(true);
        setLocation(400, 400);
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("Выход");
        JButton btn2 = new JButton("Дальше");

        JPanel panel = new JPanel(new GridLayout(1,2));

        panel.add(btn1);
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);

        ActionListener closeListener = new CloseActionListener();
        btn1.addActionListener(closeListener);

    }
}
