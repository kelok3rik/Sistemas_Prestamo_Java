/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamo.mantenimiento;


import javax.swing.*;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal() {
        setTitle("Sistema de Préstamos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnMantenimientos = new JButton("Mantenimientos");
        JButton btnMovimiento = new JButton("Movimiento");
        JButton btnProcesos = new JButton("Procesos");
        JButton btnConsultas = new JButton("Consultas");

        JPanel panel = new JPanel();
        panel.add(btnMantenimientos);
        panel.add(btnMovimiento);
        panel.add(btnProcesos);
        panel.add(btnConsultas);

        add(panel);
    }
}
