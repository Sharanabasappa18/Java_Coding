// if condition
class Vote
{
    public static void main(String[] args)
    {
        int age=18;
        if(age<=18)
        {
            System.out.println("not eligible for vote");
        }
        else
        {
            System.out.println("eligible for vote");
        }
    }
}

// if-else if-else 
class conditionals
{
    public static void main(String[] args) {
        String name="sharanu";
        if (name == "sharanu")
        {
          System.out.println("Accesss granted");
        }
        else if(name=="tm")
        {
            System.out.println("Access granted");
        }
        else{
             System.out.println("Access denied");
        }
    }
}


// if-else if-else comparing using .equals()
class conditional
{
    public static void main(String[] args) {
        String name="tm";

        if(name.equals("sharanu"))
        {
          System.out.println("Accesss granted");
        }
        else if(name.equals("tm"))
        {
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }
    }
}