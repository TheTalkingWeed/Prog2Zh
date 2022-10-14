using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace feladat
{
    class Program
    {
        static void Main(string[] args)
        {
            String input;
            Console.WriteLine("Input: ");
            input = Console.ReadLine();
            Console.WriteLine("output: "+removeLetter(input));
            Console.Read();
        }

        static String removeLetter(String s)
        {
            StringBuilder sb = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == ' ' || !sb.ToString().Contains(s[i]))
                {
                    sb.Append(s[i]);
                }else if (!temp.ToString().Contains(s[i]))
                {
                    temp.Append(s[i]);
                }
            }

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < sb.Length; i++)
            {
                if (!temp.ToString().Contains(sb.ToString()[i]))
                    output.Append(sb.ToString()[i]);
            }

            return output.ToString() ;
        }
    }
}
