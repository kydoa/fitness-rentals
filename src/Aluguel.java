import java.util.*;

public class Aluguel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CadastroCliente cadastro = new CadastroCliente();
        CadastroEquipamento equip = new CadastroEquipamento();
        int opcao;

        do {
            System.out.println("\n===== MENU XFit Equipamentos =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Mostrar todos os clientes");
            System.out.println("3 - Cadastrar equipamento");
            System.out.println("4 - Mostrar todos equipamentos");
            System.out.println("5 - Fechar conta do cliente (Remover)");
            System.out.println("6 - Remover equipamento");
            System.out.println("7 - Alterar cadastro do equipamento");
            System.out.println("8 - Alterar cadastro do cliente");
            System.out.println("9 - Consultar período restante de aluguel");
            System.out.println("10 - Ajuda");
            System.out.println("11 - Sair");
            System.out.println("====================================");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastro.cadastrarConta();
                    break;
                case 2:
                    cadastro.mostrarContas();
                    break;
                case 3:
                    equip.cadastrarEquipamento();
                    break;
                case 4:
                    equip.mostrarEquipamentos();
                    break;
                case 5:
                    System.out.print("Digite o número da conta a ser encerrada: ");
                    int numConta = entrada.nextInt();
                    cadastro.removerCliente(numConta);
                    break;
                case 6:
                    System.out.print("Digite o número do equipamento a ser removido: ");
                    int numEquip = entrada.nextInt();
                    equip.removerEquipamento(numEquip);
                    break;
                case 7:
                    System.out.print("Digite o número do equipamento para alterar: ");
                    int idEquip = entrada.nextInt();
                    equip.alterarEquipamento(idEquip, entrada);
                    break;
                case 8:
                    System.out.print("Digite o número da conta para alterar: ");
                    int idCliente = entrada.nextInt();
                    cadastro.alterarCliente(idCliente, entrada);
                    break;
                case 9:
                    System.out.print("Digite o número do equipamento para verificar aluguel: ");
                    int idAluguel = entrada.nextInt();
                    equip.consultarPeriodoRestante(idAluguel);
                    break;
                // Localize o case 10 dentro do switch(opcao) no arquivo Aluguel.java [3]
                case 10:
                    System.out.print("\f"); // Limpa a tela para focar na ajuda
                    System.out.println("========== CENTRAL DE AJUDA XFit ==========");
                    System.out.println("As opções de 1 a 9 permitem o gerenciamento completo");
                    System.out.println("de clientes e equipamentos no sistema.");
                    System.out.println("\n--- Informações de Contato ---");
                    System.out.println("Responsável: Suporte Técnico XFit");
                    System.out.println("Organização: XFit Equipamentos LTDA");
                    System.out.println("E-mail: suporte@xfit.com.br");
                    System.out.println("Telefone: (11) 4002-8922");
                    System.out.println("==========================================");
                    break;
                case 11:
                    System.out.println("\nEncerrando o programa...\nObrigado por usar!");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
            }
        } while (opcao != 11);
    }
}