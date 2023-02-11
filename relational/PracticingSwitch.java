package relational;

import java.util.Scanner;

public class PracticingSwitch {
    public static void main(String args[]) {
        // Display type of website
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a url");
        String url = scan.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        switch (protocol) {
            case "http":
                System.out.println("Hypertext Transfer Protocol");
                break;
            case "ftp":
                System.out.println("File Transfer Protocol");
                break;
            case "https":
                System.out.println("Hypertext Transfer Protocol Secure");
                break;
            default:
                System.out.println("Not a value. Please reenter a value.");
        }

        String ext = url.substring(url.lastIndexOf(".") + 1);

        switch (ext) {
            case "com":
                System.out.println("Commercial");
                break;

            case "net":
                System.out.println("Network");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:
                System.out.println("Not a valid input. Please try again!");
        }

    }

}
