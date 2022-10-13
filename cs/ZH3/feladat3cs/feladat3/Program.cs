using System;
using System.Text;

namespace feladat3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Adja meg a nevét és a születési dátumát szóközökkel elválasztva:");
            String[] input = Console.ReadLine().Split(' ');
            StringBuilder newname = new StringBuilder();

            string datum = input[2];
            newname.Append(input[0].Substring(0,int.Parse(datum[0].ToString())).ToLower()+'.');

            int hossz = int.Parse(datum[3].ToString());

            if (hossz > input[1].Length)
            {
                hossz = input[1].Length;
            }
            
            newname.Append(input[1].Substring(0,hossz).ToLower()+'.');

            int ujszam =int.Parse(datum) / (input[0].Length * input[1].Length);
            
            newname.Append(ujszam);
            Console.WriteLine(newname);
        }
    }
}