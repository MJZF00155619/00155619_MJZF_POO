using System;

namespace Ejercicio04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Ingrese la palabra o frase a verificar si es palindromo: ");
            string palabra = Console.ReadLine();
            palabra = palabra.Replace(" ","");
            palabra = palabra.ToLower();

            Console.WriteLine(palindromo(palabra));
        }
        
        public static bool palindromo(String palabra) {
            char[] caracteres;
            int ini, fin = 0;
            caracteres = palabra.ToCharArray();
            ini = 0;
            fin = caracteres.Length - 1;

            while (ini < fin) {
                if (caracteres[ini] == caracteres[fin]) {
                    ini++;
                    fin--;
                } else {
                    return false;
                }
            }
            return true;
        }
        
    }
}