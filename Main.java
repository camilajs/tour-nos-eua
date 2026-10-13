public class Main {
    public static void main(String[] args) throws Exception{
        Grafo g = new Grafo<>(3);
        g.adicionarVertice("Campinas");
        g.adicionarVertice("Louveira");
        System.out.println(g);
    }
}
