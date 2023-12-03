import javax.swing.JOptionPane;


public class Ejer2ejemplo {

    /**
     * @param args
     */
    public static void main(String[] args){
        String mensaje="";
        int num1=0;
        int num2=0;
        
        mensaje = "Ingrese un número entero ";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        mensaje =" Ingrese el segundo número";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        if (Funciones.esDivisible(num1, num2)){
            mensaje = num1 + " es divisible exactamente por "+ num2;
        }else{
            mensaje= num1 + " No es divisible por exactamente por " + num2;
        }
        JOptionPane.showMessageDialog(null, mensaje);


    }}
