import java.io.FileWriter;
import java.io.IOException;
class ReadToFileDemo {
    public static void main(String[] args) throws IOException{
        try{
            FileWriter myWriter = new FileWriter("Java.txt");
            myWriter.write("Hello Dharmik");
            myWriter.close();
            System.out.println("Sucssesfully Wrote in file....");
        }
        catch(IOException e)
        {
            System.out.println("An Error Occured!!");
            e.printStackTrace();
        }
    }
}