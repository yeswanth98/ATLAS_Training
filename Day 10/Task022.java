import java.io.*; 
class Task022 { 
    public static void main(String args[]) { 
        File f1 = new File("FileName01.txt"); 
        File f2 = new File("NewFile02.txt"); 
        f1.renameTo(f2); 
        System.out.println("Rename File " +f1+" To "+f2+" Sucessfully "); 
    }
} 