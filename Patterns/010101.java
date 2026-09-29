class Pattern{
    public static void main(String[] args) {
        int num=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(num);
                if(num==0){
                    num=1;
                }
                else{
                    num=0;
                }
                
            }System.out.println();
        }
    }
}