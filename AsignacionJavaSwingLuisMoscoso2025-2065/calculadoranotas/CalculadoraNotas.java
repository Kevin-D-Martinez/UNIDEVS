/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoranotas;

/**
 *
 * @author Luis
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraNotas extends JFrame {
    // Campos de texto
    private JTextField txtNombre, txtMatricula, txtCarrera;
    private JTextField txtPracticas, txtParciales, txtAsignaciones, txtExamen;
    private JLabel lblResultado, lblEstado;
    private JButton btnCalcular, btnLimpiar;

    public CalculadoraNotas() {
        setTitle("Registro Académico - Evaluación");
        setSize(480, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        // Panel de entrada (Formulario)
        JPanel panelForm = new JPanel(new GridLayout(11, 2, 8, 8));
        panelForm.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panelForm.add(new JLabel("Nombre Completo:"));
        txtNombre = new JTextField(); panelForm.add(txtNombre);

        panelForm.add(new JLabel("Matrícula:"));
        txtMatricula = new JTextField(); panelForm.add(txtMatricula);

        panelForm.add(new JLabel("Carrera:"));
        txtCarrera = new JTextField(); panelForm.add(txtCarrera);

        panelForm.add(new JLabel("Prácticas (Máx 40):"));
        txtPracticas = new JTextField(); panelForm.add(txtPracticas);

        panelForm.add(new JLabel("Parciales (Máx 20):"));
        txtParciales = new JTextField(); panelForm.add(txtParciales);

        panelForm.add(new JLabel("Asignaciones (Máx 20):"));
        txtAsignaciones = new JTextField(); panelForm.add(txtAsignaciones);

        panelForm.add(new JLabel("Examen Final (Máx 20):"));
        txtExamen = new JTextField(); panelForm.add(txtExamen);

        panelForm.add(new JLabel("NOTA TOTAL:"));
        lblResultado = new JLabel("0.0", SwingConstants.CENTER);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 18));
        panelForm.add(lblResultado);

        panelForm.add(new JLabel("ESTADO:"));
        lblEstado = new JLabel("-", SwingConstants.CENTER);
        lblEstado.setFont(new Font("Arial", Font.BOLD, 18));
        panelForm.add(lblEstado);

        // Panel de Botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        btnCalcular = new JButton("Calcular Resultado");
        btnLimpiar = new JButton("Limpiar Campos");
        panelBotones.add(btnCalcular);
        panelBotones.add(btnLimpiar);

        add(panelForm, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Eventos
        btnCalcular.addActionListener(e -> ejecutarCalculo());
        btnLimpiar.addActionListener(e -> limpiarCampos());
    }

    private void ejecutarCalculo() {
        try {
            // Validar campos vacíos
            if (txtNombre.getText().trim().isEmpty() || txtMatricula.getText().trim().isEmpty()) {
                throw new Exception("Debe completar los datos personales.");
            }

            // Validar números y rangos
            double p1 = validarRango(txtPracticas.getText(), 40, "Prácticas");
            double p2 = validarRango(txtParciales.getText(), 20, "Parciales");
            double a = validarRango(txtAsignaciones.getText(), 20, "Asignaciones");
            double ef = validarRango(txtExamen.getText(), 20, "Examen Final");

            double total = p1 + p2 + a + ef;
            lblResultado.setText(String.valueOf(total));

            if (total >= 60) {
                lblEstado.setText("APROBADO");
                lblEstado.setForeground(new Color(34, 139, 34)); // Verde Bosque
            } else {
                lblEstado.setText("REPROBADO");
                lblEstado.setForeground(Color.RED);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Ingrese solo números válidos en las calificaciones.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }

    private double validarRango(String valor, double max, String campo) throws Exception {
        double n = Double.parseDouble(valor);
        if (n < 0 || n > max) {
            throw new Exception(campo + " debe estar entre 0 y " + max);
        }
        return n;
    }

    private void limpiarCampos() {
        txtNombre.setText(""); txtMatricula.setText(""); txtCarrera.setText("");
        txtPracticas.setText(""); txtParciales.setText(""); 
        txtAsignaciones.setText(""); txtExamen.setText("");
        lblResultado.setText("0.0");
        lblEstado.setText("-");
        lblEstado.setForeground(Color.BLACK);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraNotas().setVisible(true));
    }
}
