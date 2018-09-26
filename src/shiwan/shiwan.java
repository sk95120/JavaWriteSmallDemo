package shiwan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class shiwan {

	public static void main(String[] args) {
		int i = 0 ;
		String path = System.getProperty("user.dir");
        System.out.println(path);
        String fileName = path+File.pathSeparator+"File"+
        File.pathSeparator+"1.txt";
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
        FileWriter fr;
		try {
			fr = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fr); 
	        PrintWriter out = new PrintWriter(bw);
	        for(;i<100000;i++) {
	        	out.println(i+1);
	        }
	        
	        out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   

		
	}

}
