package main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        double valorReal, valorAproximado;
        Errores er;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones para calculo de errores\n\n"
                        + "1. Error absoluto\n"
                        + "2. Error relativo\n"
                        + "3. Error relativo porcentual\n"
                        + "4. Salir.\n\n"));
                switch (opcion) {
                    case 1:
                        valorReal = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor real"));
                        valorAproximado = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor aproximado"));
                        er = new Errores(valorReal, valorAproximado);
                        JOptionPane.showMessageDialog(null, "el resultado es " + er.ErrorAbsoluto(), "Error absoluto", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        valorReal = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor real"));
                        valorAproximado = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor aproximado"));
                        er = new Errores(valorReal, valorAproximado);
                        JOptionPane.showMessageDialog(null, "el resultado es " + er.ErrorRelativo(), "Error relativo", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        valorReal = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor real"));
                        valorAproximado = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor aproximado"));
                        er = new Errores(valorReal, valorAproximado);
                        JOptionPane.showMessageDialog(null, "el resultado es " + er.ErrorRelativoPorcentual() + "%", "Error relativo porcentual", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta", null, JOptionPane.ERROR_MESSAGE);
                        break;

                }
            } catch (NumberFormatException k) {
            }

        } while (opcion != 4);
    }

}
