import java.io.*; 
class Task021 { 
    public static void main(String args[]) { 
        try { 
            FileInputStream file1 = new FileInputStream("NewFile02.txt"); 
            FileInputStream file2 = new FileInputStream("FileName02.txt"); 
            SequenceInputStream file3 = new SequenceInputStream(file1, file2); 
            BufferedInputStream br1 = new BufferedInputStream(file3); 
            
            FileOutputStream outputFile = new FileOutputStream("MergedFile.txt");
            BufferedOutputStream br2 = new BufferedOutputStream(outputFile);
            
            int ch; 
            while((ch = br1.read()) != -1) { 
                br2.write(ch);  // Removed the (char) casting as it's not needed
            } 
            
            // Close all streams
            br1.close(); 
            br2.close(); 
            file1.close(); 
            file2.close(); 
            file3.close();
            outputFile.close();
            
            System.out.println("Files merged successfully into MergedFile.txt"); 
        } 
        catch(IOException e) { 
            System.out.println("File not found"); 
        } 
    } 
}