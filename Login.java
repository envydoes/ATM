import java.util.Scanner;

public class Login {
    private String username = "user123"; // default username
    private String password = "pass123"; // default password
    private boolean authenticated = false; // Track login status6
    public boolean authenticate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter Password: ");
        String inputPassword = sc.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return false;
        }
    }

    public void changePin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current password: ");
        String currentPassword = sc.nextLine();

        // Verify the current password before allowing a change
        if (currentPassword.equals(password)) {
            System.out.print("Enter new password: ");
            String newPassword = sc.nextLine();

            System.out.print("Confirm new password: ");
            String confirmPassword = sc.nextLine();

            if (newPassword.equals(confirmPassword)) {
                password = newPassword;
                System.out.println("Password has been successfully changed!");
            } else {
                System.out.println("New passwords do not match. Please try again.");
            }
        } else {
            System.out.println("Current password is incorrect. Access denied.");
        }
    }
}
