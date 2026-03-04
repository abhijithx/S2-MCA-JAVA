
class StringManipulation7 {

    public static void main(String[] args) {

        // Original String
        String text = "  Java Programming  ";

        // 1. Trim
        String trimmed = text.trim();
        System.out.println("Trimmed: " + trimmed);

        // 2. Length
        System.out.println("Length: " + trimmed.length());

        // 3. Uppercase & Lowercase
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 4. Substring
        System.out.println("Substring (0-4): " + trimmed.substring(0, 4));

        // 5. Replace
        System.out.println("Replace: " + trimmed.replace("Java", "Python"));

        // 6. Contains
        System.out.println("Contains 'Java'? " + trimmed.contains("Java"));

        // 7. Split
        String[] words = trimmed.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 8. String Comparison
        String str1 = "Java";
        String str2 = "Java";
        System.out.println("Using == : " + (str1 == str2));
        System.out.println("Using equals(): " + str1.equals(str2));

        // 9. StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println("StringBuilder result: " + sb);

        // 10. Type Conversion
        int number = Integer.parseInt("123");
        String numStr = String.valueOf(456);
        System.out.println("String to int: " + number);
        System.out.println("int to String: " + numStr);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("Formatted: " + formatted);
    }
}
