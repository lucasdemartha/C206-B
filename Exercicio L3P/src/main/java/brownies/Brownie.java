package brownies;

public abstract class Brownie implements Comparable<Brownie> {
    protected String nome;
    protected double preco;

    public Brownie(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void mostraInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println(" ");
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Brownie o) {
        return Double.compare(this.getPreco(), o.getPreco());
    }
}
