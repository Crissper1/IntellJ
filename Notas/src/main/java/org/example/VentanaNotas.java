package org.example;

import javax.swing.*;
import javax.swing.text.AbstractDocument;

public class VentanaNotas extends JFrame {

    private JTextField txtFildMateria;
    private JTextField txtFildNotas;
    private JButton btnAgregar;
    private JButton btnBorrar;
    private JButton btnVaciar;
    private JList jListMuestra;
    private JPanel panelMain;


    public VentanaNotas() {

        // Set the title of the window
        setTitle("Ventana Notas");

        // Set the size of the window
        setSize(500, 400);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the window
        setLocationRelativeTo(null);

        //Agregar a la JList
        DefaultListModel<String> model = new DefaultListModel<>();
        jListMuestra.setModel(model);
        ((AbstractDocument) txtFildNotas.getDocument()).setDocumentFilter(new textfild());

    }

    public static void main(String[] args) {

        // Create and display the window
        VentanaNotas ventana = new VentanaNotas();
        ventana.setContentPane(ventana.panelMain);
        // Hacer visible el JFrame
        ventana.setVisible(true);


    }
}
