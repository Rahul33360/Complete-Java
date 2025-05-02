///    80

//  The throw is used to throw any Exception to the catch block.
//  or
//  throw keyword is used to manually trigger (or throw) an exception
//  or
//  ( means - throw keyword is used to explicitly invoke an exception(catch block))


public class throwKeyword {
        public static void withdraw(int balance, int amount) {
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance");  // this messege is ****
//               " new ArithmeticException()" - this is object creation using new keyword. And
//               throwing it to the nearest catch block.
            }
            else
                System.out.println("Withdrawal successful. \nRemaining: " + (balance - amount));
        }

        public static void main(String[] args) {
            int balance = 5000;
            try {
                withdraw(balance, 2000);  // Try withdrawing more than balance
            }
            catch (ArithmeticException e) {   /// Received by this e Exception. ****
                System.out.println("Error hua hai: " + e.getMessage());
            }
            System.out.println("Transaction Ended.");
        }
}

