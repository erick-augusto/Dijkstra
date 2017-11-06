
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
    
    public void Initialize_Single_Source(Grafo g, Vertice s){
        for(int i = 0; i < vertices.length; i++){
            vertices[i].d = Constantes.INFINITO;
            vertices[i].PI = null;
            vertices[i].chave = Constantes.INFINITO;
            vet[i] = Constantes.INFINITO;
            //System.out.println("d: "+vertices[i].d);
            //System.out.println("PI: "+vertices[i].PI);
        }
        String nome = s.getNome();
        vertices[s.getIndice()].d = 0;
        vertices[s.getIndice()].chave = 0;
    }
}
