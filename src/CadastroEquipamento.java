import java.util.*;

public class CadastroEquipamento {
    private Equipamento[] contas = new Equipamento[50];
    private int total = 0;
    Scanner entrada = new Scanner(System.in);

    public void cadastrarEquipamento() {
        System.out.print("\f");
        if (total < contas.length) {
            System.out.print("Digite o nome do equipamento: ");
            String nome = entrada.next();
            System.out.print("Digite qual é a mobilidade do equipamento: ");
            String mobilidade = entrada.next();
            System.out.print("Digite qual é a qualidade do equipamento: ");
            String qualidade = entrada.next();
            System.out.print("Digite o número do equipamento: ");
            int número = entrada.nextInt();
            contas[total] = new Equipamento(número, mobilidade, qualidade, nome);
            System.out.println("\fEquipamento cadastrado com sucesso!");
            total++;
        } else {
            System.out.println("\fLimite de equipamentos atingido.");
        }
    }

    public void mostrarEquipamentos() {
        System.out.print("\f");
        if (total == 0) System.out.println("Nenhum equipamento cadastrado.");
        for (int i = 0; i < total; i++) {
            System.out.println(contas[i]);
        }
    }

    public void removerEquipamento(int numero) {
        for (int i = 0; i < total; i++) {
            if (contas[i].getNúmero() == numero) {
                for (int j = i; j < total - 1; j++) {
                    contas[j] = contas[j + 1];
                }
                total--;
                System.out.println("Equipamento removido!");
                return;
            }
        }
        System.out.println("Equipamento não encontrado.");
    }

    public void alterarEquipamento(int numero, Scanner entrada) {
        for (int i = 0; i < total; i++) {
            if (contas[i].getNúmero() == numero) {
                System.out.print("Novo nome do equipamento: ");
                String novoNome = entrada.next();
                // Reconstruindo o objeto com os dados existentes e o novo nome
                contas[i] = new Equipamento(numero, contas[i].getMobilidade(), contas[i].getQualidade(), novoNome);
                System.out.println("Equipamento atualizado!");
                return;
            }
        }
        System.out.println("Equipamento não encontrado.");
    }

    // OPERAÇÃO ESPECIAL: Simulação de consulta de período restante
    public void consultarPeriodoRestante(int numero) {
        for (int i = 0; i < total; i++) {
            if (contas[i].getNúmero() == numero) {
                int diasAlugados = (int)(Math.random() * 15); // Simulação de dias passados
                int prazoTotal = 30;
                int restante = prazoTotal - diasAlugados;

                System.out.println("--- Consulta de Aluguel ---");
                System.out.println("Equipamento: " + contas[i].getNome());
                System.out.println("Dias utilizados: " + diasAlugados);
                System.out.println("Dias restantes para devolução: " + restante + " dias.");
                return;
            }
        }
        System.out.println("Equipamento não encontrado.");
    }
}