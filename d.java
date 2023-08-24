import java.util.Scanner;
public class d {
    public static void main(String[] args)
    {
        char choice;
        do
        {
            int age;
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter your age -: ");
            age= sc.nextInt();
            if (age>=18)
            {
                System.out.println("elegible for vote");
            }
            else
            {
                System.out.println("not elegible for vote");
            }
            Scanner rt = new Scanner(System.in);
            System.out.println("prss 'y' or 'Y' to do it again, press 'n' for exit");
            choice=rt.next().charAt(0);
        }
        while (choice=='y'||choice=='Y');
    }
}
