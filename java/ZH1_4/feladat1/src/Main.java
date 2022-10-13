public class Main {
    public static void main(String[] args) {
        Playlist queen = new Playlist();
        Song song1 = new Song("Bohemian Rhapsody", "Queen", 360);
        Song song2 = new Song("The Show Must Go On", "Queen", 262);
        queen.add(song1);
        queen.add(song2);
        Playlist metal = new Playlist();
        Song song3 = new Song("Empire Of The Clouds", "Iron Maiden", 1080);
        Song song4 = new Song("Fear Of The Dark", "Iron Maiden", 439);
        Song song5 = new Song("Smoke on the Water", "Black Sabbath", 330);
        metal.add(song3);
        metal.add(song4);
        metal.add(song5);
        System.out.println(queen.calculateTotalLength()); // 622
        metal.printPlaylist(); // a kimenet így nézzen majd ki:
/*
Lejátszási lista:
- Empire Of The Clouds (Iron Maiden)
- Fear Of The Dark (Iron Maiden)
- Smoke on the Water (Black Sabbath)
*/
        metal.shufflePlaylist(); // véletlenszerűen összekeveri a zeneszámok sorrendjét
        metal.printPlaylist(); // egy lehetséges kimenet:
/*
Lejátszási lista:
- Empire Of The Clouds (Iron Maiden)
- Smoke on the Water (Black Sabbath)
- Fea*/
    }
}
