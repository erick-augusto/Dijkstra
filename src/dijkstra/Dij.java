
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
        //int cont = 0;
        FilaDePrioridade Q = new FilaDePrioridade(vertices);
        while(!Q.filaVazia()){
            Vertice u = Q.extraiMinimo();           
            //System.out.println("u.d:"+u.d);
            //int l = vertices.length;
            String nome = u.getNome();
            //System.out.println("u:"+nome);
            int d = u.d;
            //vet[cont] = d;
            for (i = 0; i < vertices.length; i++) {
                Arco a = matAdj[u.getIndice()][i];
                if (a != null) {
                    String v = a.getDestino().getNome();
                    int p = a.getPeso();
                    Relax(u,a.getDestino(),a.getPeso());
                }
            }
            //System.out.print(vet[cont]+" ");
            //cont++;
        }
        //System.out.println();
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
    
    public void Relax(Vertice u, Vertice v, int w){
        if(v.d > (u.d + w)){
            vertices[v.getIndice()].d = u.d + w;
            vertices[v.getIndice()].chave = u.d + w;
            vertices[v.getIndice()].PI = u; 
            vet[v.getIndice()] = vertices[v.getIndice()].chave;
            //v.d = u.d + w;
            //v.PI = u;
        }
        //vet[v.getIndice()] = vertices[v.getIndice()].chave;
    }
    
    public int[] getVet(){
        return vet;
    }
}
