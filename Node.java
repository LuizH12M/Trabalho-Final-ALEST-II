public class Node {
    private String nome;
    private List <Node> menorCaminho = new LinkedList <> ();
    private Integer distancia = Integer.MAX_VALUE;
    Map <Node, Integer> adjacentes = new HashMap<>();

    public void addDestino (Node destino, int distancia) {
    adjacentes.put(destino, distancia);
    }

    public Node (String n) {
        this.nome = n;
    }

    



}