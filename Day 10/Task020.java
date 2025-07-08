import java.io.*; 
class Task020 { 
    public static void main(String args[]) { 
        try { 
        byte b;
        int byteread; 
        FileInputStream infile = new FileInputStream("FileName02.txt"); 
        FileOutputStream outfile = new FileOutputStream("NewFile05.txt"); 
        while((byteread = infile.read()) != -1) { 
            b = (byte)byteread; 
            outfile.write(b); 
        }
        infile.close();
        outfile.close();
        System.out.println("Byte Copied From in.txt to out.txt FIle "); 
        } 
        catch(FileNotFoundException e) { 
        System.out.println("Sorry..!! File Not Found...!!!");  
        } 
        catch(IOException e) { 
        System.out.println(e.getMessage()); 
        } 
    } 
}