using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace feladat
{
    internal class Program
    {
        static void Main(string[] arg) {
            List<string> inputFromFile = new List<string>(readFile("numbers.txt"));
            List<int> numbers = new List<int>();
            string[] temp;
            int sum = 0;
            foreach (string s in inputFromFile)
            {
                temp = s.Split(' ');
                foreach (string num in temp)
                {
                    sum += Int32.Parse(num);
                }
                numbers.Add(sum);
                sum = 0;
            }

            Console.WriteLine("A legkisseb osszeg {0} az {1}. sorban",numbers.Min(),numbers.IndexOf(numbers.Min())+1);  
            Console.WriteLine("A legnagyobb osszeg {0} az {1}. sorban",numbers.Max(),numbers.IndexOf(numbers.Max())+1);  
            
        }

        public static List<string> readFile(string filename)
        {
            List<string> output = new List<string>();
            string line;
            var f = new StreamReader(filename);
            while ((line = f.ReadLine()) != null)    // line doesn't contain '\n' at the end!
            {
                output.Add(line);
            }
            f.Close();

            return output;
        }
    }
}
