package main.model;

/**
 * Created by Philipp on 21.03.2017.
 * Represents a Model of a graph
 */
public class GraphFormat {
    private String node1;
    private String node2;
    private String attr1;
    private String edge;
    private String weight;

    public GraphFormat(String node1, String node2, String attr1, String weight,String edge){

        //Test if to many Arguments were given.
        if(node2 != null){
            if(attr1 != null && weight != null)
                throw new IllegalArgumentException();
            if(attr1 != null && edge != null)
                throw new IllegalArgumentException();
            if(weight != null && edge != null)
                throw new IllegalArgumentException();
        }

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

    public String getAttr1() {
        return attr1;
    }

    public String getEdge(){return edge;}

    public void setNode1(String node1) {
        this.node1 = node1;
    }

    public void setNode2(String node2) {
        this.node2 = node2;
    }

    public void setAttr1(String attr1) {
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
            str += "," + node2;
            if(attr1 != null)
                return str + " :" + attr1;
            if(edge != null)
                return str + " (" + edge + ")";
            if(weight != null)
                return str + " :: " + weight;
            return str;
        }
        return attr1 == null ? str : str + ":" + attr1;
    }
}