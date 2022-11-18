package edu.umss.ejercicios.ui;

import edu.umss.ejercicios.dataaccess.EstudianteDAO;
import edu.umss.ejercicios.dataaccess.impl.EstudianteDAOImpl;
import edu.umss.ejercicios.model.Estudiante;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class EstudianteDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable tblEstudiante;
    private JButton nuevoEstudianteButton;
    private EstudianteDAO estudianteDAO = new EstudianteDAOImpl();

    public void mostrarEstudiantes() {
        List<Estudiante> estudiantes = estudianteDAO.obtenerEstudiantes();
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String[] columnas = {
                "Código SIS",
                "Nombre",
                "Apellido Paterno",
                "Apellido Materno",
                "Fecha Nacimiento"
        };

        tableModel.addColumn("Código SIS");
        tableModel.setColumnIdentifiers(columnas);

        for (Estudiante estudiante : estudiantes) {
            Object[] data = new Object[5];
            data[0] = estudiante.getCodigoSIS();
            data[1] = estudiante.getNombre();
            data[2] = estudiante.getApellidoPaterno();
            data[3] = estudiante.getApellidoMaterno();
            data[4] = estudiante.getFechaNacimiento();
            tableModel.addRow(data);
        }

        tblEstudiante.setModel(tableModel);
    }

    public EstudianteDialog() {
        //contentPane = new JPanel();
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        mostrarEstudiantes();

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        nuevoEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EstudianteEdit estudianteEdit = new EstudianteEdit();
                estudianteEdit.showForm(EstudianteDialog.this);
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        EstudianteDialog dialog = new EstudianteDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
