
import java.io.File;

class Makingfolder{
    public static void main(String[] args) {
     try {
        //  making a folder in documents folder
        File folder=new File("C:\\Users\\Admin\\OneDrive\\Documents\\5th_sem_notes");
        if(folder.exists()){
            System.out.println("The folder already exists,,,.no need to create");
        }
        else{
            folder.mkdir();
            System.out.println("Folder created successfully !");
        }
     } catch (Exception ex) {
        ex.printStackTrace();
     }   
    }
}