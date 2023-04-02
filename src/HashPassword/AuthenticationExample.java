package HashPassword;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthenticationExample {

    private static List<User> referenceData = new ArrayList<User>();

    public static void main(String[] args) {

        // Dummy data for demonstration purposes
        referenceData.add(new User(1, "Alice", hashPassword("password123")));
        referenceData.add(new User(2, "Bob", hashPassword("letmein")));
        referenceData.add(new User(3, "Charlie", hashPassword("123456")));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String username = scanner.nextLine();

        System.out.println("Please enter your password:");
        String password = scanner.nextLine();

        boolean isAuthenticated = authenticate(username, password);

        if (isAuthenticated) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed.");
        }
    }

    private static boolean authenticate(String username, String password) {
        for (User user : referenceData) {
            if (user.getUsername().equals(username)) {
                String hashedPassword = hashPassword(password);
                return user.getPasswordHash().equals(hashedPassword);
            }
        }
        return false;
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static class User {
        private int id;
        private String username;
        private String passwordHash;

        public User(int id, String username, String passwordHash) {
            this.id = id;
            this.username = username;
            this.passwordHash = passwordHash;
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getPasswordHash() {
            return passwordHash;
        }
    }
}