using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace ZH1_1
{
    class Game
    {
        private string title;
        private int score;
        private double time;

        public Game(string title, string score, string time)
        {
            this.title = title;
            this.score = Int32.Parse(score.Split("%")[0]);
            this.time = Double.Parse(time.Split(" ")[0]);
        }

        public string getTitle() { return title; }
        public int getScore() { return score; }
        public double getTime() { return time; }

        public bool isBetterThan(Game other) {
            return score > other.getScore();
        }

        public bool isLonger(Game other) {
            return time > other.getTime();
        }


        public override string? ToString()
        {
            return String.Format("{0} ({1}%), {2} hours to beat",title,score,time);
        }
    }
}
