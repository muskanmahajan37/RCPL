/*
WAP to create separate folder for each unique user.
The folder of name should be same as the name of the user. All the folders should be inside a parent folder named user.

Author - Vinit Shahdeo

*/
import java.io.File;
import java.util.Scanner;
class UserFolder{
    public static void main(String ... args)
    {
        File f=new File("Users");
        if(!f.exists())
        {
            f.mkdir();
        }
        Scanner sc=new Scanner(System.in);  
        String name;
        System.out.print("Enter your name - ");
        name=sc.nextLine();
        File f1=new File("Users/"+name);
        if(f1.exists())
        {
            System.out.println("User Folder already exists");
        }
        else{
            f1.mkdirs();
            System.out.println("Folder created for "+name+" at location "+f1.getAbsolutePath());
        }
    }
}