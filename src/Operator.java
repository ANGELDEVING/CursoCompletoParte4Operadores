import javax.swing.*;

public class Operator {
    public static void main(String[] args) {
        int i = 5, j = 4, sum = i + j;

        System.out.println(sum);
        System.out.println("i = "+(i + j  ));
        //action the
        int subtraction = i -j;
        System.out.println("rest = " + subtraction);
        System.out.println("i = " + (i - j));
        
        int multi = i*j;
        System.out.println("multi = " + multi);

        float div = (float)i / j;
        System.out.println("div = " + div);

        int rest = 8 % 5;
        System.out.println("rest = " + rest);

        int number = Integer.parseInt (JOptionPane.showInputDialog("Into a number"));
        if(number %2 == 0)
        {
            System.out.println("number is pair");
        }else
        {
            System.out.println("Number is odd ");
        }
    }
}
