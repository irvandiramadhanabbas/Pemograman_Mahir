package LinkedList;

public class PlaylistLagu {

    class Song {
        String title;
        Song next;

        Song(String title) {
            this.title = title;
            this.next = null;
        }
    }

    class Playlist {
        private Song head;

        public void addSong(String title) {
            Song newSong = new Song(title);

            if (head == null) {
                head = newSong;
            } else {
                Song current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newSong;
            }
        }

        public void displayPlaylist() {
            if (head == null) {
                System.out.println("Playlist kosong.");
                return;
            }

            Song current = head;
            System.out.println("Playlist Lagu:");
            while (current != null) {
                System.out.println("- " + current.title);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        PlaylistLagu pl = new PlaylistLagu();
        Playlist playlist = pl.new Playlist();

        playlist.addSong("Menemukanmu - Seventeen");
        playlist.addSong("Indonesia Raya");
        playlist.addSong("Satu Bulan - Bernadya");

        playlist.displayPlaylist();
    }
}
