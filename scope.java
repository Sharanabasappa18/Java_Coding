
// Scope of variables
class Scope
{
    int b=10;              //u can write here static also 
    public  void add() {   //if u write above static here also u have to write static
        int a=70;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scope obj =new Scope();             //if u above use static u have to write just add();
        obj.add();
        
    }
}