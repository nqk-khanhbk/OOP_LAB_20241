// bài 2.2.3
package hust.soict.dsai.lab01.ExampleClass;
import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null,"Hi " + result + "!");
        System.exit(0);
    }
}
