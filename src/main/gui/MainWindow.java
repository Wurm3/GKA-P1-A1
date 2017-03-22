package main.gui;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.samples.SimpleGraphDraw;
import edu.uci.ics.jung.visualization.GraphZoomScrollPane;
import edu.uci.ics.jung.visualization.VisualizationViewer;

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

        JMenuItem addGraph = new JMenuItem("Add Graph...");
        JMenuItem removeGraph = new JMenuItem("Remove Graph...");
        addGraph.setEnabled(false);
        removeGraph.setEnabled(false);

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
    }

    private void createNewGraph(){
        System.out.println("Creating new Graph...");
        GraphView view = new GraphView(width,height);
        JPanel panel = new JPanel();
        panel.setSize(width,height);
        panel.add(view.getGraph());
        panel.setVisible(true);
        getContentPane().add(panel);

        setVisible(false);
        setVisible(true);
    }
}
