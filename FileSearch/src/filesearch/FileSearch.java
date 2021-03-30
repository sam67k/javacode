
package filesearch;

import java.io.*;

public class FileSearch
{

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        
        File directory = new File("C:\\Users\\Samama_2\\Anaconda3");
        
        String filename[] = directory.list();
        
        for (int i = 0; i < filename.length; i++)
        {
            
            System.out.println(filename[i]);
            
        }
        
        File outFile = new File("C:\\Users\\Samama_2\\sample.data");
        
        FileOutputStream outStream = new FileOutputStream(outFile);
        
        byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80};
        
        outStream.write( byteArray );
        
        outStream.close();
        
    }
    
}
