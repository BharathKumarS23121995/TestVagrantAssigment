import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int cap;
        System.out.println("Number of songs to be played");
        cap= scan.nextInt();
//        scan.nextLine();
        RecentlyPlayedStore store = new RecentlyPlayedStore(cap);

        User user = new User("Bharath");
//
        System.out.println("Enter the songs to be Played");

        for (int i=0;i<cap;i++) {
            String S1=scan.next();
            Song song1 = new Song(S1);
            store.addSong(user, song1);

        }
// to show initial songs in the recently played list
        List<Song> recentlyPlayedSongsStart = store.getRecentlyPlayedSongs(user);
        System.out.println("Recently played songs for User in the beginning:");
        for (Song song : recentlyPlayedSongsStart) {
            System.out.println(song.getName());
        }
        System.out.println("Enter the next songs to be Played:");
        String sn=scan.next();
        Song song4 = new Song(sn);
        store.addSong(user, song4);
// To display after change in the recently played list
        List<Song> recentlyPlayedSongsUpdate = store.getRecentlyPlayedSongs(user);
        System.out.println("Recently played songs for User at the last:");
        for (Song song : recentlyPlayedSongsUpdate) {
            System.out.println(song.getName());
        }

//
    }
}