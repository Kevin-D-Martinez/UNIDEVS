/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis
 */
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JTextField txtNum1, txtNum2, txtResultado;
    
    // Instancias de nuestras clases (POO)
    private Calculadora calc = new Calculadora();
    private ConversorTemperatura conv = new ConversorTemperatura();
    private Raizcuadrada_Exponente adv = new Raizcuadrada_Exponente();

    public Main() {
        setTitle("Calculadora Pro Multiuso - Luis");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 10, 10));
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        // Panel 1: Entrada de datos
        JPanel p1 = new JPanel();
        p1.add(new JLabel("Valor A:")); txtNum1 = new JTextField(7); p1.add(txtNum1);
        p1.add(new JLabel("Valor B:")); txtNum2 = new JTextField(7); p1.add(txtNum2);
        
        // Panel 2: Aritmetica (Calculadora Basica Ligada)
        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("Aritmetica"));
        JButton btnSuma = new JButton("+");
        JButton btnResta = new JButton("-");
        JButton btnMult = new JButton("x");
        JButton btnDiv = new JButton("/");
        p2.add(btnSuma); p2.add(btnResta); p2.add(btnMult); p2.add(btnDiv);

        // Panel 3: Avanzado
        JPanel p3 = new JPanel();
        p3.setBorder(BorderFactory.createTitledBorder("Avanzado"));
        JButton btnRaiz = new JButton("Raiz de A");
        JButton btnExp = new JButton("A elevado a B");
        p3.add(btnRaiz); p3.add(btnExp);

        // Panel 4: Temperatura
        JPanel p4 = new JPanel();
        p4.setBorder(BorderFactory.createTitledBorder("Conversor (Usa Valor A)"));
        JButton btnCtoF = new JButton("C a F");
        JButton btnFtoC = new JButton("F a C");
        p4.add(btnCtoF); p4.add(btnFtoC);

        // Panel 5: Resultado Final
        JPanel p5 = new JPanel();
        p5.add(new JLabel("RESULTADO:"));
        txtResultado = new JTextField(20);
        txtResultado.setEditable(false);
        txtResultado.setBackground(Color.WHITE);
        p5.add(txtResultado);

        // Asignacion de Eventos
        btnSuma.addActionListener(e -> txtResultado.setText("" + calc.sumar(getA(), getB())));
        btnResta.addActionListener(e -> txtResultado.setText("" + calc.restar(getA(), getB())));
        btnMult.addActionListener(e -> txtResultado.setText("" + calc.multiplicar(getA(), getB())));
        
        btnDiv.addActionListener(e -> {
            try {
                txtResultado.setText("" + calc.dividir(getA(), getB()));
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error Div/0", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnRaiz.addActionListener(e -> {
            try { txtResultado.setText("" + adv.calcularRaiz(getA())); } 
            catch (Exception ex) { JOptionPane.showMessageDialog(this, ex.getMessage()); }
        });

        btnExp.addActionListener(e -> txtResultado.setText("" + adv.calcularExponente(getA(), getB())));

        btnCtoF.addActionListener(e -> txtResultado.setText("" + conv.celsiusAFahrenheit(getA())));
        btnFtoC.addActionListener(e -> txtResultado.setText("" + conv.fahrenheitACelsius(getA())));

        // Agregar paneles a la ventana
        add(p1); add(p2); add(p3); add(p4); add(p5);
    }

    private double getA() { return Double.parseDouble(txtNum1.getText()); }
    private double getB() { return Double.parseDouble(txtNum2.getText()); }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
