import java.io.*;

public class CopyFile
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		int i;
		File f1=new File("D:\\Java_Lab\\lab_cycle-2\\demo.txt");
		File f2=new File("D:\\Java_Lab\\lab_cycle-2\\newdemo.txt");
		FileInputStream in=new FileInputStream(f1);
		FileOutputStream op=new FileOutputStream(f2);
		do 
		{
			i=in.read();
			if(i!=-1)
			op.write(i);
		 
        }
        while(i!=-1);
        in.close();
		op.close();
	}
}