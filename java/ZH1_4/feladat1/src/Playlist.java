import java.util.*;

public class Playlist {
    private Song[] songs;
    private int count;
    private int sizeofarray;
    public Playlist() {
        songs = new Song[1];
        count = 0;
        sizeofarray = 1;
    }

    public void add(Song song){
        if (count == sizeofarray)
        {
            Song[] temp = null;
            temp = new Song[sizeofarray * 2];
            {
                if (sizeofarray >= 0) System.arraycopy(songs, 0, temp, 0, sizeofarray);
            }
            songs = temp;
            sizeofarray= sizeofarray * 2;
        }
        songs[count] = song;
        count++;
    }

    public int calculateTotalLength(){
        int result = 0;
        for (Song song : songs) {
            result += song.getLength();
        }

        return result;
    }

    public void printPlaylist(){
        System.out.println("Lejátszási lista:");
        for (int i = 0; i < songs.length-1; i++) {
            System.out.printf("\t- %s (%s)\n",songs[i].getTitle(),songs[i].getArtist());
        }
    }

    public void shufflePlaylist(){
        List<Song> randomized = Arrays.asList(songs);
        Collections.shuffle(randomized);
        randomized.toArray(songs);
    }


}
