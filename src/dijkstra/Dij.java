
package dijkstra;

public class Dij {
    
    public Dij(){
        
    }
    
    public Vertice[] vertices;
    private int[] vet;
    
    public void Dijkstra(Grafo g, Vertice s){
        vertices = g.getVertices();
        int totaldevertices = g.getTotalDeVertices();
        vet = new int[totaldevertices];
        Initialize_Single_Source(g,s);
        
        int i;
        Arco[][] matAdj = g.getMatrizDeAdjacencia();
        
    }

}
