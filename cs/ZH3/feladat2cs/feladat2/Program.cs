using System;
using System.Collections.Generic;
using System.IO;
using System.Reflection.Metadata;

namespace feladat2
{
    class Program
    {
        
        static void Main(string[] args)
        {
            Random rand = new Random();
            var input = new List<string>(beolvas("achievments.txt"));
            var usernames = new List<string>();
            
            foreach (var e in input)
            {
                usernames.Add(e.Split(';')[0]);
                
            }
            
            Console.WriteLine("Adja meg a felhasznalo nevet:");
            
            var name = Console.ReadLine();
            
            
            
            if (UsernameExist(name,usernames))
            {
                Console.WriteLine("Felhasználó név foglalt!");
                Console.WriteLine($"Javaslat: {name}{rand.Next(10,1000)}");
            }
            else
            {
                Console.WriteLine("A felhasználónév nem foglalt!");
            }
            
        }

        public static bool UsernameExist(string name, List<string> usernames)
        {
            if (usernames.Contains(name))
            {
                return true;
            }
            
            return false;
        }

        public static List<string> beolvas(string filename)
        {
            List<string> result = new List<string>();

            string line;

            StreamReader sr = new StreamReader(filename);

            while ((line=sr.ReadLine()) != null)
            {
                result.Add(line);
            }
            sr.Close();
            return result;
        }
    }
}