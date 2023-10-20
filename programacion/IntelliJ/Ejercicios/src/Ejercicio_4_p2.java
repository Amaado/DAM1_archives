import javax.swing.JOptionPane;

public class Ejercicio_4_p2 {
    public static void main(String[] args){
        String nome=JOptionPane.showInputDialog("Introduce o teu nome ");
        String idade=JOptionPane.showInputDialog("Introduce a tá idade ");
        int idade2=Integer.parseInt(idade);

        JOptionPane.showMessageDialog(null, "Ola "+nome+", a túa idade dentro dun ano será "+(idade2+1));
    }
}
