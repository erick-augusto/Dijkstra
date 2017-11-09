
package dijkstra;

public class Dijkstra {

    public static void main(String[] args) {
        //Leitura do teclado
        GrafoPonderado g = new GrafoPonderado();
        g.leDoTeclado();
        
        int n = g.totalDeVertices;
        int distancias[][] = new int[n][n];
        int[] vet = new int[n];
        int i, j;
        
        //g.imprimeNaTela();

        //Início do cálculo do BFS 
        Dij dijkstra = new Dij();
        for (i = 0; i < n; i++) {
            dijkstra.Dijkstra(g, g.vertices[i]);
            vet = dijkstra.getVet();
            for (j = 0; j < n; j++){
                distancias[g.vertices[i].getIndice()][j] = vet[j];
                System.out.print(distancias[i][j]+" ");
            }
            System.out.println();
        }
    }
}
