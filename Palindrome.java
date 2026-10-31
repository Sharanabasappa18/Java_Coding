class Palindrome {
    public static void main(String[] args) {
        int num = 151;
        int sum = 0;
        int t = num;

        // Reverse the number
        while (num > 0) {
            int ld = num % 10;
            sum = sum * 10 + ld;
            num = num / 10;
        }

        System.out.println("Original number: " + t);
        System.out.println("Reversed number: " + sum);

        // Check if original and reversed numbers match
        if (t == sum) {
            System.out.println(t + " is a Palindrome number.");
        } else {
            System.out.println(t + " is not a Palindrome number.");
        }
    }
}