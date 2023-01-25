package br.dev.diegocorte.module4.challenges;

import br.dev.diegocorte.landonhotel.Guest;
import br.dev.diegocorte.landonhotel.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author diego
 */
public class GuestService {

  private List<Guest> checkinList = new ArrayList<>(100);

  public static List<Guest> filterByFavoriteRoom(List<Guest> guests, Room room) {

    /*
     *  1. Returns a new collection that contains guests from the provided collection
     *  who have indicated the provided room as the first preference in their preferred
     *  room list. 
     */
    return guests.stream()
            .filter(guest -> guest.getPreferredRooms().indexOf(room) == 0)
            .collect(Collectors.toList());

  }

  public void checkIn(Guest guest) {

    /*
     *  2. Adds a guest to the checkinList, placing members of the loyalty program
     *  ahead of those guests not in the program. Otherwise, guests are arranged in the
     *  order they were inserted.
     */
    if (guest.isLoyaltyProgramMember() && !this.checkinList.isEmpty()) {
      int i = 0;
      for (; i < this.checkinList.size(); i++) {
        if (this.checkinList.get(i).isLoyaltyProgramMember()) {
          continue;
        }
        break;
      }
      this.checkinList.add(i, guest);
    } else {
      this.checkinList.add(guest);
    }
  }

  public void swapPosition(Guest guest1, Guest guest2) {

    /*
     *  3.  Swaps the position of the two provided guests within the checkinList.
     *  If guests are not currently in the list no action is required.
     */
    if (this.checkinList.containsAll(List.of(guest1, guest2))) {
      int position1 = this.checkinList.indexOf(guest1);
      int position2 = this.checkinList.indexOf(guest2);
      this.checkinList.set(position2, guest1);
      this.checkinList.set(position1, guest2);
    }
  }

  public List<Guest> getCheckInList() {
    return List.copyOf(this.checkinList);
  }
}
