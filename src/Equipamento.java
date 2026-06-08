public class Equipamento {
    private String nome;
    private String mobilidade;
    private String qualidade;
    private int número;

    public Equipamento(int n, String m, String q, String nm) {
        this.número = n;
        this.mobilidade = m;
        this.qualidade = q;
        this.nome = nm;
    }

    public String getNome() { return nome; }
    public int getNúmero() { return número; }
    public String getMobilidade() { return mobilidade; }
    public String getQualidade() { return qualidade; }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nNúmero: " + número + 
               "\nQualidade: " + qualidade + "\nMobilidade: " + mobilidade + "\n";
    }
    
    // Método auxiliar para facilitar a busca de ID na classe Cadastro
    public int getID() { return número; }
}