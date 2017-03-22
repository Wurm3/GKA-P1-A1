package main.gui;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;
import edu.uci.ics.jung.samples.SimpleGraphDraw;
import edu.uci.ics.jung.visualization.VisualizationViewer;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

/**
 * Created by Philipp on 22.03.2017.
 */
public class GraphView{
    private Graph graph = new SparseGraph();
    private int width;
    private int height;

    public GraphView(int width,int height){
        this.width = width;
        this.height = height;
    }

    public VisualizationViewer getGraph(){
        Layout layout = new CircleLayout(graph);
        layout.setSize(new Dimension(width,height));
        VisualizationViewer viewer = new VisualizationViewer(layout);
        viewer.setPreferredSize(new Dimension(width,height));
        viewer.setVisible(true);
        viewer.setBackground(Color.WHITE);
        System.out.println("Created Graph");
        return viewer;
    }
}
