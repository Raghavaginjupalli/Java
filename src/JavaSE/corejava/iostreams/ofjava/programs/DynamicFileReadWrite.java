package JavaSE.corejava.iostreams.ofjava.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DynamicFileReadWrite {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);


        int data;
        while ((data = fis.read()) != -1){
            fos.write(data);
        }

        /*
            By using fis.read() read only one one byte
            By using fis.write() write only one one byte

         */
        fos.close();
        fis.close();

    }

}
