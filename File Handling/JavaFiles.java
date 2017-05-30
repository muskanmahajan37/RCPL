/* 
WAP to show all the .java files contained in a folder. Also, count the number files ending with .java and find the tota lnumber of files. 
Author - Vinit Shahdeo
*/
import java.io.File;
class JavaFiles{
    public static void main(String ... args)
    {
        File f=new File("C:\\Users\\Sony vaio\\Desktop\\Java RCPL");
        String [] list$files=f.list();
        int count=0;
        System.out.println();
        System.out.println("Total number of Files = "+list$files.length);
        for(String file$Name : list$files)
        {
            if(file$Name.endsWith(".java"))
            {   
                System.out.println(file$Name);
                count++;
            }
        }
        System.out.println("Number of java files = "+count);
        
    }
}