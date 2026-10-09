class Reverse_string {

    public static void main(String[] args) {

        int num = 153;
        int t = num;
        int rev = 0;

        while (num > 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num = num / 10;
        }

        System.out.println("Original number: " + t);
        System.out.println("Reversed number: " + rev);
    }
}