import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrimeiraInterfaceGrafica {
    private JTabbedPane painelFinanceiro;
    private JPanel panel1;
    private JPanel PainelFinanceiro;
    private JPanel BaseClientes;
    private JTextField painelFinanceiroTextField;
    private JTextField codigo;
    private JTextField campoNome;
    private JTextField campoTotalContrato;
    private JButton button1;
    private JLabel Codigo;
    private JLabel nome;
    private JTextField textField6;
    private JTextField campoEntrada;
    private JComboBox campoDiaVencimento;
    private JTextField campoValorParcela;
    private JComboBox campoQntParcela;
    private JButton salvarButton;
    private JTextField textField4;
    private JTextField textField13;
    private JLabel totalContrato;
    private JLabel entrada;
    private JLabel qntParcela;
    private JLabel valorParcela;
    private JLabel diaVencimento;
    private JLabel advProcesso;
    private JLabel novoFaturamentoTitulo;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;

    public PrimeiraInterfaceGrafica() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
