import java.util.Scanner;
import javax.swing.JOptionPane;
public class conditionalstates {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        //System.out.println("\n\tWelcome to Song Generator");
        String name = JOptionPane.showInputDialog(null, "\n\tWelcome to the MoodSong App\nEnter your name: ");
        //System.out.println("\n-What's your name? ");
        //String name = scanner.next();
        //System.out.println("\n-What's your current mood?\nA) Happy \nB) Sad \nC) Adventurous \nD) Studious \nE) Pumped Up");
        //String typeofuser = scanner.next();
        String typeofuser = JOptionPane.showInputDialog(null, "What's your current mood?\nA) Happy \nB) Sad \nC) Adventurous \nD) Studious \nE) Pumped Up");
        //JOptionPane.showMessageDialog(null,name+", your song is: \n");
        //System.out.println(name+", your song is: \n");
        if(typeofuser.equals("A")|| typeofuser.equals("a")){
            JOptionPane.showMessageDialog(null,name+", based on your mood we recommended the song: Beautiful Day by U2\n");
            //System.out.print("\n\t\tBeautiful Day by U2\n");
        }
        else if(typeofuser.equals("B")|| typeofuser.equals("b")){
            JOptionPane.showMessageDialog(null,name+", based on your mood we recommended the song: The Scientist by Coldplay\n");
            //System.out.print("\n\t\tThe Scientist by Coldplay\n");
        }
        else if(typeofuser.equals("C")|| typeofuser.equals("c")){
            JOptionPane.showMessageDialog(null,name+", based on your mood we recommended the song: Strangers Like Me by Phil Collins\n");
            //System.out.print("\n\t\tStrangers Like Me by Phil Collins\n");
        }
        else if(typeofuser.equals("D")|| typeofuser.equals("d")){
            JOptionPane.showMessageDialog(null,name+", based on your mood we recommended the song: Experience by Ludovico Eunaldi\n");
            //System.out.print("\n\t\tExperience by Ludovico Eunaldi\n");
        }
        else if(typeofuser.equals("E")|| typeofuser.equals("e")){
            JOptionPane.showMessageDialog(null,name+", based on your mood we recommended the song: I Got A Feeling by The Black Eyes Peas\n");
            //System.out.print("\n\t\tI Gotta A Feeling by The Black Eyes Peas\n");
        }
        else{
            JOptionPane.showMessageDialog(null,"\n\tInvalid Answer. Try Again\n");
            //System.out.println("Invalid answer.Try again");
        }
    }

}
