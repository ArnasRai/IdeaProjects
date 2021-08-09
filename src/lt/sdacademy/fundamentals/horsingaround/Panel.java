package lt.sdacademy.fundamentals.horsingaround;

import javax.swing.*;

public class Panel {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("user");
        JLabel label2 = new JLabel("admin");
        label.setBounds(10,20,80,25);
        label2.setBounds(40,20,80,25);
        panel.add(label);
        panel.add(label2);

    }
}
