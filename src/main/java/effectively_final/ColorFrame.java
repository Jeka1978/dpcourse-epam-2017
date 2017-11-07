package effectively_final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {
    public ColorFrame( int counter[]) throws HeadlessException {

        setSize(500,500);
        JButton button = new JButton("click to change color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(counter[0]++);
            }
        });
    }
}
