import java.util.*;

public class RecentlyPlayedStore {
    private int capacity;
    private Map<User, LinkedList<Song>> store;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
    }
// to add the song in to the linkedlist of songs and put into store of Map
    public void addSong(User user, Song song) {
        if (store.containsKey(user)) {
            LinkedList<Song> songs = store.get(user);
            songs.addFirst(song);
            if (songs.size() > capacity) {
                songs.removeLast();
            }
        } else {
            LinkedList<Song> songs = new LinkedList<>();
            songs.add(song);
            store.put(user, songs);
        }
    }
    // used to return list of songs recently played
    public List<Song> getRecentlyPlayedSongs(User user) {
        if (store.containsKey(user)) {
            return store.get(user);
        }
        return Collections.emptyList();
    }
}
