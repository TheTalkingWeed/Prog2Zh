namespace ZH1_1 {
    class Program
    {
        static void Main(string[] args)
        {
            Game g1 = new Game("Subnautica", "84%","43 hours");
            Game g2 = new Game("Danganronpa 1", "82%","28,5 hours");
            Game g3 = new Game("Immortal fenyx rising", "77%","41,5 hours");



            Console.WriteLine(g1);
            Console.WriteLine(g1.getTitle());
            Console.WriteLine(g1.getScore());
            Console.WriteLine(g1.getTime());
            Console.WriteLine(g1.isBetterThan(g2));
            Console.WriteLine(g3.isBetterThan(g2));
            Console.WriteLine(g3.isLonger(g2));

            Playlist winter = new Playlist();

            winter.add(g1);
            winter.add(g2);
            winter.add(g3);

            Console.WriteLine(winter.getBestGame());
            Console.WriteLine(winter.getLongestGame());
            Console.WriteLine(winter.getShortestGame());
            
            
        }

    }
}