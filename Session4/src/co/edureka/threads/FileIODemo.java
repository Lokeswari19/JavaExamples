package co.edureka.threads;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class FileIODemo {
	void readFromFile(){
		try{
			//Which file you wish to read?
			File file=new File("/Users/lokim/downloads/SyncDemo.java");
			 //Binary Stream
			/*FileInputStream fis=new FileInputStream(file);
			
			
			int ch =0;
			while ((ch=fis.read())!=-1){
				System.out.print((char)ch);
			}
			fis.close();
			*/
			//Character Stream
			
			FileReader reader =new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line="";
			while ((line=buffer.readLine())!=null){
				System.out.println(line);
			}
			buffer.close();
			reader.close();
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	void writeInFile(){
		try{
			File file=new File("/users/lokim/Downloads/SyncDemo1.txt");
			if (!file.exists()){
				file.createNewFile();
				
			}
			String line="Hello Java world";
			FileWriter writer=new FileWriter(file);
			writer.write(line);
			writer.close();
		}catch (Exception e){
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FileIODemo fdRef =new FileIODemo();
		fdRef.readFromFile();
		fdRef.writeInFile();

	}

}
