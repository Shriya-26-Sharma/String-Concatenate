import java.util.*;
class ConcatString{
    public static void main(String[] args) {
     Scanner sc =new Scanner (System.in);
     System.out.println("Enter First Name:");
     String first=sc.nextLine();
     System.out.println("Enter Second Name: ");
     String second=sc.nextLine();
     String concatenateString=first.concat(" ").concat(second);
     System.out.println("Full Name is : Mr/Mrs/Miss "+concatenateString);
     sc.close();
    }
}