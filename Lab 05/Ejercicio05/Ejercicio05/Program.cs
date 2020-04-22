using System;

namespace Ejercicio05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            string cadena;
            char cambiar;
            char reemplazo;
            Console.WriteLine("Escriba la cadena de texto a modificar: ");
            cadena = Console.ReadLine();
            Console.WriteLine("Ingrese el caracter que desea reemplazar: ");
            cambiar = Convert.ToChar(Console.ReadLine());
            Console.WriteLine("¿Con que caracter desea reemplazarlo? ");
            reemplazo = Convert.ToChar(Console.ReadLine());
            Console.WriteLine(cadena.Replace(cambiar, reemplazo));
        }
    }
}