import java.util.Set;

import org.w3c.dom.Node;

public class Graph {
    private Set <Node> nodes = new HashSet<> ();

    public void addNode (Node nodeA) {
        nodes.add(nodeA);
    }


}