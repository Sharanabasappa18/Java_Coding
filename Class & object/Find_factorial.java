class Find_factorial
{
    public String fact(int num){
        String result=" ";
        int factorial_result=1;
        for(int i=1;i<=num;i++)
        {
            factorial_result=factorial_result*i;

        }
        result="The factorial of "+num+" is "+factorial_result;
        return result;
    }
    public static void main(String[] args) {
        Find_factorial f=new Find_factorial();
        int num=7;
        System.out.println(f.fact(num));
        System.out.println(f.fact(6));
    }
}

