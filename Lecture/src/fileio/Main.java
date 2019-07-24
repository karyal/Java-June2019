
package fileio;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        /*
        File dir1=new File("E:\\java\\MyFiles\\Folder1");
        boolean res = dir1.mkdir();
        if(res){
            System.out.println("Folder create sucessfully");
        }
        else{
            System.out.println("Error to create folder");
        }
        */
        /*
        File file1=new File("E:\\java\\MyFiles\\Folder1\\info.txt");
        if(file1.exists()==true){
            System.out.println("File already exist");
        }
        else{
            //crate new file.
            file1.createNewFile();
            System.out.println("Create file sucessfully");
        }
    }
                */
     
        File file=new File("C:\\Windows");
        String []files = file.list();
        System.out.println(files.length);
        for(int i=0; i<files.length; i++){
            String str="";
            File f=new File("C:\\Windows\\"+files[i]);
            if(f.isDirectory()==true)
                str="<dir>";
            System.out.println(files[i]+"\t\t"+str);
        }
    }
    
}
