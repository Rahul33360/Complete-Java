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
//               throwing it to the nearest catch block. ANd inside the () is message we want to send.
            }
            else
                System.out.println("Withdrawal successful. \nRemaining: " + (balance - amount));
        }

        public static void main(String[] args) {
            int balance = 5000;
            try {
                withdraw(balance, 7000);  // Try withdrawing more than balance
            }
            catch (ArithmeticException e) {   /// Received by this e Exception. ****
                System.out.println("Error hua hai: " + e.getMessage() + ".\n" + e);
            }
            System.out.println("Transaction Ended.");
        }
}

///     We can create our own (made by self) Exceptions. We have to use the class and extend the parent Exception.
///     Google it for it if you want to know. Which is called as CUSTOM EXCEPTION

