
import java.io.File;


class Maketextfile{
    public static void main(String[] args) {
     try {
        //  making a folder in documents folder
        File textfile =new File("C:\\Users\\Admin\\OneDrive\\Documents\\5th_sem_notes\\java_notes\\FileHandling_notes\\1.txt");
        if(textfile.exists()){
            System.out.println("The textfile already exists,,,.no need to create");
        }
        else{
            textfile.createNewFile();
            System.out.println("text file created successfully !");
        }
     } catch (Exception ex) {
        ex.printStackTrace();
     }   
    }
}