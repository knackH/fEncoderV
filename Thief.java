package ThiefE;

import java.io.*;


public class Thief {
    
    public static void main(String[] args) {
        String fromDirectory = "/storage/emulated/0/PLAYit/p/r/i/v/a/c/y/";
        File fromFile = new File(fromDirectory);
        String toDirectory = "/storage/emulated/0/THEIF/";
        File to = new File(toDirectory);
        
        ThiefAllFiles(fromFile);
        
        
        if(fromFile.renameTo(to)){
            System.out.println("Mission completed");
        }
        
        
        /*OperationB(to);
        
        if(to.renameTo(fromFile)){
            System.out.println("Mission completed");
        }*/
        
        
    }
    
    public static void ThiefAllFiles(File getSRC){
        if(getSRC.isDirectory()){
            File[] files = getSRC.listFiles();
            if(files!=null){
                for(File file : files){
                    if(file.getName().endsWith("playit")){
                        File fromPath = Decode(file, getSRC);
                        
                        if(file.renameTo(fromPath)){
                            System.out.println("Operation Successful");
                        }
                }
            }
            }
        }
    }
    
    
    
    public static void OperationB(File getSRC){
        if(getSRC.isDirectory()){
            File[] files = getSRC.listFiles();
            if(files!=null){
                for(File file : files){
                    if(file.getName().endsWith("mp4")){
                        Encode(file, "Malware");
                }
            }
            }
        }
    }
    
    public static File Decode(File file, File Dir){
        String fileName = file.getAbsolutePath();
        String newName = fileName.substring(0, fileName.length()-7);
        
        File result = new File(newName);
        
        return result;
    }
    
    
    public static void Encode(File file, String path){
        String newName = file.getAbsolutePath()+".playit";
        File newPath = new File(newName);
        if(file.renameTo(newPath)){
            System.out.println("Operation Successful");
        }
    }
}