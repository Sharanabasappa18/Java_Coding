class Static_nonstatic
{
    static int a=10; int b=20;
    public void add(){
        int x=20; int y=20;
        System.out.println(x+y);

    }
    public static void main(String[] args) {
        System.out.println(a);
        Static_nonstatic s = new Static_nonstatic();
        System.out.println(s.b);
        // System.out.println(s.a);
        s.add();

    }
}