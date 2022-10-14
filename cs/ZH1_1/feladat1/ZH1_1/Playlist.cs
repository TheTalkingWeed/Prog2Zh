using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ZH1_1
{
    internal class Playlist
    {
        private List<Game> playlist;

        public Playlist()
        {
            this.playlist = new List<Game>();
        }

        public void add(Game game)
        {
            playlist.Add(game);
        }
        public Game getBestGame() 
        {
            Game bestGame = null;
            int max = 0;
            foreach (Game game in playlist)
            {
                if (game.getScore() > max) {
                    max = game.getScore();
                    bestGame = game;
                }
            }

            return bestGame;
        }
        
        public Game getLongestGame() 
        {
            Game logestGame = null;
            double max = 0;
            foreach (Game game in playlist)
            {
                if (game.getTime() > max) {
                    max = game.getTime();
                    logestGame = game;
                }
            }

            return logestGame;
        }
        public Game getShortestGame() 
        {
            Game shortestGame = null;
            double min = getLongestGame().getTime();
            foreach (Game game in playlist)
            {
                if (game.getTime() < min) {
                    min = game.getTime();
                    shortestGame = game;
                }
            }

            return shortestGame;
        }
    }
}
