public class Cliente {
    private String nome;
    private int idade;
    private int número;

    public Cliente(int n, int x, String y) {
        this.número = n;
        this.idade = x;
        this.nome = y;
    }

    public Cliente(String nome, int idade, int número) {
        this.nome = nome;
        this.idade = idade;
        this.número = número;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getNúmero() { return número; }

    // Setters corrigidos para permitir alteração de dados
    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setNúmero(int número) { this.número = número; }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nNúmero: " + número + "\n";
    }
}