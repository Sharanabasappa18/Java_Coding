public class Switch{
    public static void main(String[] args) {
        String username="ironman";
        switch(username){
            
            case "ironman":{
                System.out.println("access granted, Username correct.");
                break;
                }
            case "hulk":{
                System.out.println("access granted,username correct.");
                break;}
            case "thor":{
                System.out.println("access granted ,username correct");
                break;}
            default:
                {
                    System.out.println("access denied,username not correct");
                }
        }
    
    }
}