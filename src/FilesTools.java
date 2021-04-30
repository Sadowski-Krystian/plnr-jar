import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesTools {
    private String fileName;
    private String content;
    FilesTools(String nazwaPliku){
        this.fileName = nazwaPliku;
    }

    public Boolean store(String content){
        //zapisywanie
        return false;
    }

    public String read(String name){
        String content="";
        try{
            File file = new File(name);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){

                content+=scan.nextLine();
                content+="\n";

            }
            scan.close();
        }catch (FileNotFoundException ex){

        }
        return content;

    }
}
