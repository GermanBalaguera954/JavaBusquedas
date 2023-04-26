/*
Busqueda Secuencial.

ARREGLO []={3,1,2,5}; dato=2;
 */
package busqueda_secuencial;

import javax.swing.JOptionPane;

public class Busqueda_secuencial {

    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 3, 2};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        //Busqueda Secuencial.
        int i = 0;
        while (i < 5 && band == false) {
            if (arreglo[i] == dato) {
                band = true;
            }
            i++;
        }
        if (band == false) {
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion: " + (i - 1));
        }
    }
}
