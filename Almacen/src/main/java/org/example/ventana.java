package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ventana extends JFrame {
    JPanel panelMain;
    private JTextField textFNombre;
    private JTextField textFPrecio;
    private JTextField textFCantidad;
    private JList jListResum;
    private JButton btnNewProd;
    private JButton btnAddProd;
    private JButton btnBorrar;

    public ventana() {
        // 4. Agregar a la JList
        DefaultListModel<String> model = new DefaultListModel<>();
        jListResum.setModel(model);

        btnAddProd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. Obtener datos de los JTextField
                String nombreProducto = textFNombre.getText();
                int cantidad = Integer.parseInt(textFCantidad.getText()); // Manejar posibles errores de conversión
                double precioUnitario = Double.parseDouble(textFPrecio.getText()); // Manejar posibles errores de conversión

                // 2. Calcular el costo total
                double costoTotal = cantidad * precioUnitario;

                // 3. Crear una cadena de resumen
                String resumen = String.format("%s - Cantidad: %d, Precio unitario: %.2f",
                        nombreProducto, cantidad, precioUnitario);

                model.addElement(resumen);


            }
        });
    }
    public static void main(String[] args) {

        // Crear el JFrame
        ventana h = new ventana();

        h.setContentPane(h.panelMain);

        // Configurar el JFrame (tamaño, posición, etc.)
        h.setSize(580, 250);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Hacer visible el JFrame
        h.setVisible(true);


    }
}
