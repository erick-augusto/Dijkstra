/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

public class FilaDePrioridade {
    // Vetor para os elementos da fila de prioridade.
    protected Vertice[] fila; 

    // Construtor recebe um vetor de elementos a serem inseridos
    // na fila de prioridade.
    public FilaDePrioridade(Vertice Vetor[]) { 
        fila = new Vertice[Vetor.length];
        for (int i = 0; i < Vetor.length; i++)
            fila[i] = Vetor[i];
    }
    
    // Devolve verdadeiro se fila vazia.
    // Devolve falso, caso contrario.
    public boolean filaVazia() {
        for (int i = 0; i < fila.length; i++)
            if (fila[i] != null)
                return false;
        // Se todas as posicoes do vetor sao null, entao a fila está vazia.
        return true;  
    }

    // Remove e devolve o elemento com chave minima.
    public Vertice extraiMinimo() {
        int minChave = Constantes.INFINITO, min = -1;
        // Inicializa o minimo como sendo o 1o elemento encontrado.
        int i;
        for (i = 0; i < fila.length; i++)
            if (fila[i] != null) {
                // Podemos acessar diretamente o atributo "d" do vertice.
                minChave = fila[i].chave; 
                min = i;
                break;
            }
        // Continua a procurar pelo minimo no restante do vetor.
        for (; i < fila.length; i++)
            if (fila[i] != null && fila[i].chave < minChave) {
                minChave = fila[i].chave;
                min = i;
            }
        // Assume que a fila nao está vazia, ou seja, que existe um minimo.
        Vertice v = fila[min];
        fila[min] = null;  // Remove o elemento da fila.
        return v;
    }

    // Devolve verdadeiro se o elemento está na fila.
    // Devolve falso, caso contrario.
    public boolean estaNaFila(Vertice x) {
        for (int i = 0; i < fila.length; i++)
            if (fila[i] != null && fila[i] == x)
                return true;
        return false;
    }

}
