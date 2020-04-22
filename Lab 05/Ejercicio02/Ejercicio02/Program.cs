using System;

namespace Ejercicio02
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el valor de n: ");
            byte n = Convert.ToByte(Console.ReadLine());
            int i = 1;

            if (i < n)
            {
                for (i = 1; i < n; i++) {
                    Console.Write(i+" ");
                }
            }
            for(i=n; i>0; i--){
               Console.Write(i+" ");
            }
        }
    }
}