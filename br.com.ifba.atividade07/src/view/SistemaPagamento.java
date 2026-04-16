
package view;

import javax.swing.JOptionPane;
import modelo.*;

public class SistemaPagamento {
    public static void main(String[] args) {

        String[] opcoes = {"Dinheiro", "Cartão", "Pix"};

        int tipo = JOptionPane.showOptionDialog(
                null,
                "Escolha o tipo de pagamento:",
                "Sistema de Pagamento",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        double valor = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor da compra:")
        );

        Pagamento pagamento = null;

        switch (tipo) {
            case 0:
                pagamento = new PagamentoDinheiro(valor);
                break;
            case 1:
                pagamento = new PagamentoCartao(valor);
                break;
            case 2:
                pagamento = new PagamentoPix(valor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
        }

        double total = pagamento.calcularTotal();

        JOptionPane.showMessageDialog(null,
                "Valor final: R$ " + total);

        pagamento.imprimirRecibo();
    }
}
