package main.gui;

import javax.swing.*;

/**
 * Created by Philipp on 21.03.2017.
 */
public class MainWindow extends JFrame {
    public void startWindow(){
        setTitle("Coon Graphs");
        setSize(600,400);

        JButton createNewGraph = new JButton("Create new Graph");
        JButton createFromExistingSource = new JButton("Create Graph from Existing Source");

        addMenuBar();

        setVisible(true);
    }


    private void addMenuBar(){
        JMenuBar menuBar =  new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem createNew = new JMenuItem("New...");
        JMenuItem createExisting = new JMenuItem("Import Graph...");

        file.add(createNew);
        file.add(createExisting);

        menuBar.add(file);
        menuBar.setLocation(0,0);
        setJMenuBar(menuBar);
    }
}
