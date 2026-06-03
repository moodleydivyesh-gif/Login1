// PART 3 STORED MESSAGES

public static void storedMessages(Scanner input) {
// menu code 

boolean back = false;

while (!back) {  

System.out.println("\n  == STORED MESSAGES ==");

System.out.println("1. Display Sender & Recipient");

System.out.println("2. Display Longest Message");

System.out.println("3. Search Message ID");

System.out.println("4. Search Recipient");

System.out.println("5. Delete Using Hash");

System.out.println("6. Display Report");

System.out.println("0. Back");

System.out.print("Choose Option: ");

String option =input.nextLine();

switch (option) {
  
case "1":

System.out.println(
Messages.printMessages());

break;

case "2":

System.out.println(Messages.displayLongestMessage());

break;

case "3":

System.out.print("Enter Message ID: ");

String id =input.nextLine();

System.out.println(Messages.searchMessageID(id));

break;

case "4":

System.out.print("Enter Recipient: ");

String recipient =input.nextLine();

System.out.println(Messages.findRecipient(recipient));

break;

case "5":

System.out.print("Enter Hash: ");

String hash =input.nextLine();

System.out.println(Messages.deleteMessageByHash(hash));

break;

case "6":

System.out.println(Messages.displayReport());

break;

case "0":

back = true;

break;

default:

System.out.println("Invalid Option");
        }
    }
}

}

