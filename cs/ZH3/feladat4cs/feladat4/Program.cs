using System;
using System.Collections.Generic;
using System.IO;

namespace feladat4
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> input = new List<string>(beolvas("offers.txt"));

            List<string> offernames = new List<string>();

            foreach (var e in input)
            {
                offernames.Add(e.Split(',')[1]);
            }

            Dictionary<string, int> result = new Dictionary<string, int>();

            result["Burger"] = 0;
            result["Drink"] = 0;
            result["Wrap"] = 0;
            result["Salad"] = 0;
            result["Menu"] = 0;
            
            foreach (var e in offernames)
            {
                if(e.ToLower().Contains("burger")) result["Burger"] += 1;
                if(e.ToLower().Contains("drink")) result["Drink"] += 1;
                if(e.ToLower().Contains("wrap")) result["Wrap"] += 1;
                if(e.ToLower().Contains("salad")) result["Salad"] += 1;
                if(e.ToLower().Contains("menu")) result["Menu"] += 1;
                
                
                    
                
            }

            foreach (var e in result.Keys)
            {
                Console.WriteLine($"{e}: {result[e]}");
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
}