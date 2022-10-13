using System;
using System.Collections.Generic;
using System.IO;


namespace feladat1
{
    class Program
    {
        static void Main(string[] args)
        {
            if (args.Length != 1 || int.Parse(args[0])<0 )
            {
                Console.WriteLine("Hiba! Adj meg egy nemnegatív egész számot!");
            }
            else
            {
                Console.WriteLine($"Parancssori argumentum : {args[0]}");
                var input = new List<string>(beolvas("achievments.txt"));
                List<User> users= new List<User>();
                List<string> templist = new List<string>();
                string[] temp;
                foreach (string e in input)
                {
                    temp = e.Split(';');

                    for (int i = 1; i < temp.Length; i++)
                    {
                        templist.Add(temp[i]);
                    }
                
                    users.Add(new User(temp[0],templist));
                    templist.Clear();
                }

                foreach (var e in users)
                {
                    if (e.achievments.Count > int.Parse(args[0]))
                    {
                        Console.WriteLine($"{e.username}: {e.achievments.Count}");
                    }
                }
                
            }
          
            
            
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

    class User
    {
        public string username;
        public List<string> achievments;

        public User(string username, List<string> achievments)
        {
            this.username = username;
            this.achievments = new List<string>(achievments);
        }

        
    }
}
