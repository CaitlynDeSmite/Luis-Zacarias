
package soma;
import javax.swing.JOptionPane;
public class Soma {
     public static void main(String[] args) {
         String firstNumber=
                 JOptionPane.showInputDialog("Digite o primeiro valor: ");
         
         String secondNumber=
                 JOptionPane.showInputDialog("Digite o  segundo valor: ");
                 
         int  number1 = Integer.parseInt(firstNumber);
         int number2 = Integer.parseInt(secondNumber);
         
        int soma =number1+number2;
         
        JOptionPane.showMessageDialog(null,"a soma é de: "+soma,"soma de dois inteiros",JOptionPane.PLAIN_MESSAGE);
   
     }
    
}
