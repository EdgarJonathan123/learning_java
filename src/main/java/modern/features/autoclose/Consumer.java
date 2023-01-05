package modern.features.autoclose;

import java.io.*;


public class Consumer {

    public static void main(String[] args) {
        try (
                Room room = new Room(7);
                ){

            System.out.println("Goodbye");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    static void copy(String src,String dst)throws IOException {

        int BUFFER_SIZE = 8 * 1024;

        try(
                InputStream in =  new FileInputStream(src);
                OutputStream out = new FileOutputStream(dst);
        ){
            byte[] buf = new byte[BUFFER_SIZE];
            int n ;
            while((n = in.read(buf)) >= 0){
                out.write(buf,0,n);
            }
        }

    }
}