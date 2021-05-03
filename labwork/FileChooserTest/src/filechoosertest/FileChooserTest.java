
package filechoosertest;

import java.io.*;
import javax.swing.*;

public class FileChooserTest
{

    public static void main(String[] args)
    {
        
        JFileChooser chooser;
        File file, directory;
        int status;
        chooser = new JFileChooser();
        status = chooser.showOpenDialog(null);
        
        if (status == JFileChooser.APPROVE_OPTION)
        {
            
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();
            System.out.println("Directory : "+directory.getName());
            System.out.println("File Selected to Open : "+file.getName());
            System.out.println("Full Path Name : "+file.getAbsolutePath());
            
        }
        else
        {
            
            System.out.println("Open File Dialogue Cancled");
            
        }
        
        System.out.println("\n\n");
        
        status = chooser.showSaveDialog(null);
        
        if (status == JFileChooser.APPROVE_OPTION)
        {
            
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();
            System.out.println("Directory : "+directory.getName());
            System.out.println("File Selected to Save : "+file.getName());
            System.out.println("Full Path Name : "+file.getAbsolutePath());
            
        }
        else
        {
            
            System.out.println("Save File Dialogue Cancled");
            
        }
        
    }
    
}
