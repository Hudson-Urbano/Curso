
public class Produto {

    String nome;
    double preco;
    double desconto;

    public Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    public Produto() {
        
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGeremte) {
        return preco * (1 - desconto);
    }
}
