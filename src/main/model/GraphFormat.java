package main.model;

/**
 * Created by Philipp on 21.03.2017.
 * Represents a Model of a graph
 */
public class GraphFormat {
    private String node1;
    private String node2;
    private int attr1;
    private String edge;
    private double weight;

    public GraphFormat(String node1, String node2, int attr1, double weight,String edge){
        this.node1 = node1;
        this.node2 = node2;
        this.attr1 = attr1;
        this.edge = edge;
        this.weight = weight;
    }

    public String getNode1() {
        return node1;
    }

    public String getNode2() {
        return node2;
    }

    public int getAttr1() {
        return attr1;
    }

    public String getEdge(){return edge;}

    public void setNode1(String node1) {
        this.node1 = node1;
    }

    public void setNode2(String node2) {
        this.node2 = node2;
    }

    public void setAttr1(int attr1) {
        this.attr1 = attr1;
    }

    public void setEdge(String edge) {
        this.edge = edge;
    }

    @Override
    public String toString(){
        String str = "";
        str += node1;
        if(node2 != null){
            //hi
            str += "," + node2;
            if(attr1 != 0)
                return str + " :" + attr1;
            if(edge != null)
                return str + " (" + edge + ")";
            if(weight != 0)
                return str + " :: " + weight;
        }
        if(attr1 == 0)
            return str;
        return str + ":" + attr1;
    }
}
