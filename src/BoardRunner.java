import java.util.Scanner;

public class BoardRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Message Test 1 (username-message): ");
        String input1 = scan.nextLine();
        System.out.print("Message Test 2 (username-message): ");
        String input2 = scan.nextLine();
        System.out.print("Photo Test 1 (username-filename-caption): ");
        String photoInput = scan.nextLine();
        System.out.println();

        String msg1Username = input1.substring(0, input1.indexOf("-"));
        String msg1Message = input1.substring(input1.indexOf("-") + 1);
        MessagePost message1 = new MessagePost(msg1Username, msg1Message);

        String msg2Username = input2.substring(0, input2.indexOf("-"));
        String msg2Message = input2.substring(input2.indexOf("-") + 1);
        MessagePost message2 = new MessagePost(msg2Username, msg2Message);

        String photoUsername = photoInput.substring(0, photoInput.indexOf("-"));
        String part = photoInput.substring(photoInput.indexOf("-") + 1);
        String photoFile = part.substring(0, part.indexOf("-"));
        String photoCaption = part.substring(part.indexOf("-"));
        PhotoPost photoMessage = new PhotoPost(photoUsername, photoFile, photoCaption);

        message1.display();
        System.out.println();
        message2.display();
        System.out.println();
        photoMessage.display();
    }
}
