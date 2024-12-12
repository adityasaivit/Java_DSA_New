import java.util.*;
public class switchcase
{
  public static void main(String args[])
  {

    Scanner scan=new Scanner(System.in);

    while(true)
    {
    
        int n=scan.nextInt();
        if(n==-1)
        {
          break;
        }
        else
        {
          switch(n)
          {
            case 1:
              System.out.println("monday");
              break;
            
            case 2:
              System.out.println("tuesday");
              break;

            case 3:
              System.out.println("wednesday");
              break;

            case 4:
              System.out.println("Thursday");
              break;

            case 5:
              System.out.println("Friday");
              break;

            case 6:
              System.out.println("saturday");
              break;

            case 7:
              System.out.println("Sunday");
              break;

            default:
              System.out.println("invalid number");
          }
        }
    }
    scan.close();


  }
}
