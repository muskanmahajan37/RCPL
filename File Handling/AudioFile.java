/* Copying a mp3 file to another mp3 file */
// Author - Vinit Shahdeo
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class AudioFile{
	public static void main(String ... args)
	{
		File f=new File("hbd.mp3");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		if(f.exists())
		{
			System.out.println("File exists");
		}
		else{
			System.out.println("File doesn't exists");
		}
		try{
		 fis=new FileInputStream(f);
		 fos=new FileOutputStream("new.mp3");
		
		while(fis.available()>0)
		{
			int data=fis.read();
			fos.write(data);
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
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
	}
}