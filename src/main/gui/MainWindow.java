package main.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Philipp on 21.03.2017.
 */
public class MainWindow extends JFrame implements ActionListener {
    private JMenuItem createNew;
    private JMenuItem createExisting;
    private JMenuItem addGraph;
    private JMenuItem removeGraph;

    private int width = 1200;
    private int height = 800;

    public void startWindow(){
        setTitle("Coon Graphs");
        setSize(600,400);

        addMenuBar();

        setVisible(true);
    }

    private void addMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");

        createNew = new JMenuItem("New...");
        createExisting = new JMenuItem("Import Graph...");
        createNew.addActionListener(this);
        createExisting.addActionListener(this);

        file.add(createNew);
        file.add(createExisting);

        JMenu edit = new JMenu("Edit");

        addGraph = new JMenuItem("Add Graph...");
        removeGraph = new JMenuItem("Remove Graph...");
        addGraph.setEnabled(false);
        removeGraph.setEnabled(false);
        addGraph.addActionListener(this);
        removeGraph.addActionListener(this);

        edit.add(addGraph);
        edit.add(removeGraph);

        menuBar.add(file);
        menuBar.add(edit);


        setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == createNew) createNewGraph();
            else if(e.getSource() == createExisting) System.out.println("Open Project...");
            else if(e.getSource() == addGraph) createGraphDialog();
    }

    private void createNewGraph(){
        System.out.println("Creating new Graph...");
        GraphView view = new GraphView(width,height);
        JPanel panel = new JPanel();
        panel.setSize(width,height);
        panel.add(view.getGraph());
        panel.setVisible(true);
        getContentPane().add(panel);

        addGraph.setEnabled(true);
        removeGraph.setEnabled(true);

        //setVisible(false);
        setVisible(true);
    }

    private void createGraphDialog(){
        CreateDialog dialog = new CreateDialog();
    }

    public void refresh(){
        refresh();
    }
}
