import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Grafo<V,A> implements Cloneable{

    private V[] vertices;
    private A[][] arestas;
    private int ultimo = 0;
    private int tamanho;
    private MeuCloneDeX clonador;

    public Grafo(int n_vertices) throws Exception{

        if(n_vertices<=0) throw new Exception("Qtd invalida");

        this.vertices = (V[]) new Object[n_vertices];
        this.tamanho = n_vertices;

        this.clonador = new MeuCloneDeX<>();
    }

    public boolean isCheio(){
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Ultimo: " + this.ultimo);
        return tamanho == ultimo+1;
    }

    public void adicionarVertice(V vertice) throws Exception{

        if(vertice == null) throw new Exception("A informação está vazia");

        if (isCheio() == true) throw new Exception("Sem espaço pae");

        if (vertice instanceof Cloneable)
            this.vertices[this.ultimo] = (V)this.clonador.clone(vertice);
        else
            this.vertices[this.ultimo] = vertice;

        this.ultimo++;
    }

    public int buscarVertice(V vertice) throws Exception{
        if (vertice == null) throw new Exception("A info ta vazia");

        for (int i = 0; i<this.tamanho; i++){
            if(this.vertices[i] == vertice)
                return i;
        }

        return -1;
    }

    //nao sei se aqui eu teria que botar os trem p frente
    public void removerVertice(V vertice) throws Exception{
        if(vertice == null) throw new Exception("A info nao tem");

        int posicao = buscarVertice(vertice);

        if(posicao > -1){

        }

    }

    @Override 
    public String toString(){
        String ret = "[";
        for (int i = 0; i<tamanho; i++){
            ret += vertices[i];
            ret += ", ";
        }
        return ret+= "]";
    }


}