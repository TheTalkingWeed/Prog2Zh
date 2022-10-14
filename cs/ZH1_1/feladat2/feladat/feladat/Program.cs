using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace feladat
{
    class Program{
        static void Main(string[] args) {

            if (args.Length != 3){
                Console.WriteLine("Hibas paracssori argumentumok");
            }
            else {
                Console.WriteLine("Koztes eredmeny: "+removeLetter(args[0], args[1]));
                Console.WriteLine("Veges eredmeny: "+removeLetter(removeLetter(args[0], args[1]), args[2]));
            }
        
        }

        static string removeLetter(string s1,string s2) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s1.Length; i++)
            {
                if (s2.Contains(s1[i])) sb.Append(s1[i]);
            }

            return sb.ToString();
        }
    }
}
