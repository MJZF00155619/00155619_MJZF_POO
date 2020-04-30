using System;
using System.Collections.Generic;
namespace Evaluaciones
{
    public static class CalcularNota
    {
        public static double calcular(List <Evaluacion> eva)
        {
            double notaFinal = 0;
            double nota = 0;


            foreach (var element in eva)
            {
                Console.WriteLine("Ingrese la nota que obtuvo en la evaluacion " + element.Nombre);
                nota = Convert.ToDouble(Console.ReadLine());
                notaFinal = (notaFinal + ((nota * element.Porcentaje) / 100));

            }

            return notaFinal;
        }
    }
}