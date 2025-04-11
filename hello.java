public class hello {

    public void greet() {
        System.out.println("Hello, Ziggy from an object!");
    }
    public String getNameFromUser() {
    System.out.print("Please enter your name: ");
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String name = scanner.nextLine();
    scanner.close();
    return name;
}
    public static void main (String[] args) {
       hello hello = new hello();
       String name = hello.getNameFromUser();
       hello.greet();
    }
}

