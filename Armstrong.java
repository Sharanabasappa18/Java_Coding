class Armstrong {
    public static void main(String[] args) {

        int num = 153;
        int t = num;
        int sum = 0;

        while (num > 0) {
            int ld = num % 10;
            sum = sum + ld * ld * ld;
            num = num / 10;
        }

        System.out.println("Original number: " + t);
        System.out.println("Armstrong sum: " + sum);

        if (t == sum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }
}