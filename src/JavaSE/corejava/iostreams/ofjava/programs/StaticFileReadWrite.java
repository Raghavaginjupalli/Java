package JavaSE.corejava.iostreams.ofjava.programs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StaticFileReadWrite {
    public static void main(String[] args) throws FileNotFoundException, IOException  {

        FileInputStream fis = new FileInputStream("file.txt");
        FileOutputStream fos = new FileOutputStream("file1.txt");

//        int data = fio.read();                  // read only one byte(0 - 255) of character/digit in the file in unicode value.
//        // NOTE: if there is no data in the file or pointer throws "-1".
//
//        System.out.println(data);              // input: hi        output: 104  -> h ASCII value
//        System.out.println((char) data);       // input: hi        output: h    -> because of casting

        int data1;
        while ((data1 = fis.read()) != -1){
            fos.write(data1);
        }

        /*
            By using fis.read() read only one one byte
            By using fis.write() write only one one byte

         */
        fos.close();
        fis.close();



    }
}
