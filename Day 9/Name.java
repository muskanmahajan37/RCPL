import java.util.Scanner;

class Name
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String NAME;
        char ch;
        boolean upper = false;
        boolean lower = false;
        System.out.println("ENTER YOUR NAME:");
        NAME = stdIn.nextLine();
        ch = NAME.charAt(0);
			if(!(Character.isLowerCase(ch)))
            {
                for (int i=0; i<NAME.length(); i++)
                {
                   ch = NAME.charAt(i);

                    if (!(Character.isLowerCase(ch)))
                       {  
                        System.out.println("VALID NAME");
                        NAME = "";
                       }
					else{
						System.out.println("INVALID NAME! It should not contain lower case");
                        NAME="";				
				}   
                } 
			}
			else if(!(Character.isUpperCase(ch)))
            {
                 System.out.println("INVALID NAME!!! Lower cases are not allowed!");
                        NAME="";
			}
			
    
    }
} 