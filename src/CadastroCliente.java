import java.util.*;

public class CadastroCliente {
    private Cliente[] contas = new Cliente[10];
    private int total = 0;
    Scanner entrada = new Scanner(System.in);

    public void cadastrarConta() {
        System.out.print("\f");
        if (total < contas.length) {
            System.out.print("Digite o nome do usuário: ");
            String nome = entrada.next();
            System.out.print("Digite a idade do usuário: ");
            int idade = entrada.nextInt();
            System.out.print("Digite o número da nova conta: ");
            int número = entrada.nextInt();
            contas[total] = new Cliente(número, idade, nome);
            System.out.println("\fConta cadastrada comamente!");
            total++;
        } else {
            System.out.println("\fLimite de contas atingido.");
        }
    }

    public void mostrarContas() {
        System.out.print("\f");
        if (total == 0) System.out.println("Nenhum cliente cadastrado.");
        for (int i = 0; i < total; i++) {
            System.out.println(contas[i]);
        }
    }

    public void removerCliente(int numero) {
        for (int i = 0; i < total; i++) {
            if (contas[i].getNúmero() == numero) {
                for (int j = i; j < total - 1; j++) {
                    contas[j] = contas[j + 1];
                }
                total--;
                System.out.println("Conta encerrada com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void alterarCliente(int numero, Scanner entrada) {
        for (int i = 0; i < total; i++) {
            if (contas[i].getNúmero() == numero) {
                System.out.print("Novo nome: ");
                String novoNome = entrada.next();
                contas[i].setNome(novoNome);
                System.out.println("Cadastro atualizado!");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
}