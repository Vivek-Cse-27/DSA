//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another
class Converter {
    // Function to convert decimal to binary
    static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        return binary.toString();
    }
    
    // Function to convert binary to decimal
    static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int power = 0;
        
        // Iterate through the binary string from right to left
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        
        return decimal;
    }
}

public class NumberConverter {
    public static void main(String[] args) {
        // Example: Convert decimal 25 to binary
        int decimalNumber = 25;
        String binary = Converter.decimalToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + ": " + binary);
        
        // Example: Convert binary "11001" to decimal
        String binaryNumber = "11001";
        int decimal = Converter.binaryToDecimal(binaryNumber);
        System.out.println("Decimal value of binary " + binaryNumber + ": " + decimal);
    }
}
