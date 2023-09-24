public class Main {
    public static void main(String[] args) {
        BuddyInfo friend = new BuddyInfo("Homer", "123 abc street", "111-222-333");
        System.out.println("Hello " + friend.getName());

        AddressBook contacts = new AddressBook();
        contacts.addBuddy(friend);
        contacts.removeBuddy(friend);
    }
}