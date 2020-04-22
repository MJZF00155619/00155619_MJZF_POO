using System;
using System.Collections.Generic;
using System.Linq;

namespace Ejercicio03
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Cantidad de letras: ");
            int longitud = Convert.ToInt32(Console.ReadLine());
            int cont = 0;
            List<char> vocales = new List<char>();
        
            char [] letras = new char[longitud];

            for (int i=0; i< letras.Length ; i++){
                letras[i] = Convert.ToChar(Console.ReadLine());
            }
            
            for (int i=0; i< letras.Length; i++){
                if(letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u' || letras[i] == 'A' || letras[i] == 'E' || letras[i] == 'I' || letras[i] == 'O' || letras[i] == 'U' ){
                    vocales.Add(letras[i]);
                    cont++;}
            }
            
            Console.WriteLine("LAS SIGUIENTES VOCALES FUERON ALMACENADAS EN UNA LISTA: ");

            foreach ( char letrita in vocales)
            {
                Console.WriteLine(letrita);
            }
        }
    }
}