import java.util.Random;
import javax.swing.JOptionPane;
public class randomtesting {
    public static void main(String[]args){
        String name = JOptionPane.showInputDialog(null, "\t\tWelcome to Lucky Number! \nLet us know your name and the genie will give you your lucky number! ");
        //JOptionPane.showMessageDialog(null,"Hello "+name);
        Random random = new Random();
        int num = random.nextInt(50);
        JOptionPane.showMessageDialog(null,"Hello "+name+", Here's your lucky number of the day: "+num);

    }
}
