
package library;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IO {
    /** Read String from user */
    public String readString(){
        String str_tmp="";
        str_tmp=new Scanner(System.in).nextLine();
        return(str_tmp);
    }
    /** Read String from user */
    public String readString(String msg) throws Exception {
        String str_tmp="";
        System.out.print(msg+" : ");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        str_tmp=br.readLine();
        return(str_tmp);
    }
    
    public char readCharacter(){
        String str_tmp=readString();
        char ch=str_tmp.charAt(0);
        return(ch);
    }
    
    public boolean readBoolean(){
        String str_tmp=readString();
        boolean b=Boolean.parseBoolean(str_tmp.toLowerCase());
        return(b);
    }
    public byte readByte(){
        String str_tmp=readString();
        byte b=Byte.parseByte(str_tmp);
        return(b);
    }
    public short readShort(){
        String str_tmp=readString();
        short b=Short.parseShort(str_tmp);
        return(b);
    }
    public int readInteger(){
        String str_tmp=readString();
        int b=Integer.parseInt(str_tmp);
        return(b);
    }
    public long readLong(){
        String str_tmp=readString();
        long b=Long.parseLong(str_tmp);
        return(b);
    }
    public double readDouble(){
        String str_tmp=readString();
        double b=Long.parseLong(str_tmp);
        return(b);
    }
    public void printMessage(String msg){
        System.out.print(msg);
    }
    public void printMessage(String label, String value){
        System.out.print(label+ " : "+ value);
    }
    public void printMessage(String label, boolean value){
        System.out.print(label+ " : "+ value);
    }
    public void printMessage(String label, char value){
        System.out.print(label+ " : "+ value);
    }
    public void printMessage(String label, byte value){
        System.out.print(label+ " : "+ value);
    }
    public void printMessage(String label, short value){
        System.out.print(label+ " : "+ value);
    }
    public void printMessage(String label, int value){
        System.out.print(label+ " : "+ value);
    }
    public void printMessage(String label, long value){
        System.out.print(label+ " : "+ value);
    }
    public void printMessage(String label, double value){
        System.out.print(label+ " : "+ value);
    }
    public void newLine(){
        System.out.println("");
    }
}
