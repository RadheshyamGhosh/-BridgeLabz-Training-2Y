import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() generates [0,1). Multiply by 900000 to get range [0,899999]
        // Add 100000 to shift to [100000,999999]
        return 100000 + (int)(Math.random() * 900000);
    }
    
    // Method to check if OTPs are unique
    public static boolean checkUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        // If all 10 OTPs are unique, set size should equal 10
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Validate uniqueness
        if (checkUnique(otps)) {
            System.out.println("✅ All OTPs are unique!");
        } else {
            System.out.println("❌ Some OTPs are repeated.");
 }
}
}