import java.io.*;

public class ByteArray {
    
    public static void main(String args[]) throws IOException{

// reading    
        byte[] bytes = {1,-1,0};
    
        ByteArrayInputStream in = new ByteArrayInputStream(bytes); 
        int readedInt = in.read(); // readedInt=1
        System.out.println("first element read is: " + readedInt);

        readedInt = in.read();
        // readedInt=255. Однако 
        // (byte)readedInt даст значение -1
        System.out.println("second element read is: " + (byte)readedInt);

        readedInt = in.read(); // readedInt=0
        System.out.println("third element read is: " + readedInt);

// writing
       ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
       out.write("str".getBytes());
       byte[] barray = out.toByteArray();


       System.out.println("barray length: " + barray.length);  
       for (int i=0; i<barray.length; i++){
           System.out.println((char)barray[i]); 
       }
    }
}
