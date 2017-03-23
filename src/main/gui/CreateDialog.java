package main.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Philipp on 22.03.2017.
 */
public class CreateDialog extends JFrame implements ActionListener {
    public CreateDialog(){
        System.out.println("Starting Dialog");
        setTitle("Create Graph");
        setSize(400,200);
        setLocation(200,200);

        ButtonGroup choices = new ButtonGroup();

        JRadioButton attr = new JRadioButton("Attribute",false);
        JRadioButton edge = new JRadioButton("Edge",false);
        JRadioButton weight = new JRadioButton("Weight",false);

        choices.add(attr);
        choices.add(edge);
        choices.add(weight);

        JLabel node1Label = new JLabel("First Node: ");
        JLabel node2Label = new JLabel("Second Node: ");
        JTextField node1 = new JTextField();
        node1.setColumns(4);
        JTextField node2 = new JTextField();
        node2.setColumns(4);

        JButton createGraphBtn = new JButton("Create");
        createGraphBtn.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(attr);
        panel.add(edge);
        panel.add(weight);
        panel.add(node1Label);
        panel.add(node1);
        panel.add(node2Label);
        panel.add(node2);
        panel.add(createGraphBtn);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
