import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    private static void copyFile(File src, File dest) throws IOException {
        Files.copy(src.toPath(), dest.toPath());
    }
    private static String pleaseEnter(String text){
        return ("Please Enter The "+text);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(pleaseEnter("Path Of Your Lib"));
        String path = (String) input.nextLine();
        System.out.println(pleaseEnter("The Location Of Your Jre/JDK/etc"));
        String libBeInThisPath = (((String) input.nextLine()));

    }
}
