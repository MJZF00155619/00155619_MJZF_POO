using System;
using System.Collections.Generic;

namespace Meet2304
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var p = new List<Persona>();
            
            p.Add(new Persona("Mauricio","Zaldaña",18));
            p.Add(new Persona("Mauricio",edad:18));
            p.Add(new Persona(edad: 18));
            p.Add(new Persona(apellido: "Zaldaña"));

            String buscar = "Mauricio";
            buscar = Console.ReadLine();

            p.ForEach(it =>
            {
                if (buscar.Equals(it.Nombre))
                {
                    Console.WriteLine("Nuevo nombre: ");
                    it.Nombre = Console.ReadLine();
                    Console.WriteLine(it.ToString());
                }
            });
        }
    }
}