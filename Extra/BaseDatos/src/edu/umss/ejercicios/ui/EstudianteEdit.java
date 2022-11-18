package edu.umss.ejercicios.ui;

import edu.umss.ejercicios.dataaccess.EstudianteDAO;
import edu.umss.ejercicios.dataaccess.impl.EstudianteDAOImpl;
import edu.umss.ejercicios.model.Estudiante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EstudianteEdit {
    private JTextField txtCodigoSIS;
    private JTextField txtNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;
    private JFormattedTextField txtFechaNacimiento;
    private JButton registrarButton;
    private JButton cancelarButton;
    private JPanel mainPanel;
    private JDialog dialog;

    private EstudianteDAO estudianteDAO = new EstudianteDAOImpl();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public EstudianteEdit() {
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    estudianteDAO.registrarNuevoEstudiante(new Estudiante(
                            txtCodigoSIS.getText(),
                            txtNombre.getText(),
                            txtApellidoPaterno.getText(),
                            txtApellidoMaterno.getText(),
                            sdf.parse(txtFechaNacimiento.getText())
                    ));
                    ((EstudianteDialog)dialog.getParent()).mostrarEstudiantes();
                    dialog.dispatchEvent(new WindowEvent(dialog, WindowEvent.WINDOW_CLOSING));
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(EstudianteEdit.this.dialog, "Error: " + ex.getMessage());
                }
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispatchEvent(new WindowEvent(dialog, WindowEvent.WINDOW_CLOSING));
            }
        });
    }

    public void setData(Estudiante data) {
        txtApellidoPaterno.setText(data.getApellidoPaterno());
        txtNombre.setText(data.getNombre());
        txtApellidoMaterno.setText(data.getApellidoMaterno());
        txtFechaNacimiento.setText(sdf.format(data.getFechaNacimiento()));
        txtCodigoSIS.setText(data.getCodigoSIS());
    }

    public void getData(Estudiante data) {
        data.setApellidoPaterno(txtApellidoPaterno.getText());
        data.setNombre(txtNombre.getText());
        data.setApellidoMaterno(txtApellidoMaterno.getText());
        data.setCodigoSIS(txtCodigoSIS.getText());
        try {
            data.setFechaNacimiento(sdf.parse(txtFechaNacimiento.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isModified(Estudiante data) {
        if (txtApellidoPaterno.getText() != null ? !txtApellidoPaterno.getText().equals(data.getApellidoPaterno()) : data.getApellidoPaterno() != null)
            return true;
        if (txtNombre.getText() != null ? !txtNombre.getText().equals(data.getNombre()) : data.getNombre() != null)
            return true;
        if (txtApellidoMaterno.getText() != null ? !txtApellidoMaterno.getText().equals(data.getApellidoMaterno()) : data.getApellidoMaterno() != null)
            return true;
        if (txtCodigoSIS.getText() != null ? !txtCodigoSIS.getText().equals(data.getCodigoSIS()) : data.getCodigoSIS() != null)
            return true;
        if (txtFechaNacimiento.getText() != null ? !txtFechaNacimiento.getText().equals(sdf.format(data.getFechaNacimiento())) : data.getFechaNacimiento() != null)
            return true;
        return false;
    }

    public void showForm(JDialog parent) {
        this.dialog = new JDialog(parent, "EstudianteEdit");
        dialog.setContentPane(this.mainPanel);
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        dialog.pack();
        dialog.setVisible(true);
        dialog.setModal(true);
    }
}
