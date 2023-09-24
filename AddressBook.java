import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    //Returns true if a new buddy was added, false if an existing buddy was updated
    public boolean addBuddy(BuddyInfo buddy){
        for (BuddyInfo friend: buddies){
            if(friend.getName().equals(buddy.getName())){
                friend.setAddress(buddy.getAddress());
                friend.setPhoneNumber(buddy.getPhoneNumber());
                return false;
            }
        }
        buddies.add(buddy);
        return true;
    }

    //Returns true if a buddy was successfully removed
    public boolean removeBuddy(BuddyInfo buddy){
        Iterator<BuddyInfo> iter = buddies.iterator();
        while(iter.hasNext()){
            if(iter.next().getName().equals(buddy.getName())){
                iter.remove();
                return true;
            }
        }
        return false;
    }
}
