using System;

namespace Ejercicio01
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int num = 0, anterior = 0, pos = 1;


            Console.WriteLine("Ingrese cuantos terminos Fibonacci desea: ");
            int numero = Convert.ToInt32(Console.ReadLine());
            
            for (int i = 0; i < numero; i++)
            {
                anterior = pos;
                pos = num;
                num = anterior + pos;

                Console.Write(num + " ");
            }
        }
    }
}