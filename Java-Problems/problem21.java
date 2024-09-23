import java.util.Scanner;
// decimal to hexadecimal 
public class problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String octal = Integer.toOctalString(decimal);
        
        System.out.println("Hexadecimal representation: " + octal);
    }
}
