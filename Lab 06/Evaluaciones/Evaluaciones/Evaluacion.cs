using System;

namespace Evaluaciones
{
    public class Evaluacion
    {
        protected int porcentaje;
        protected string nombre;

        public Evaluacion(int porcentaje, string nombre)
        {
            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }

        public int Porcentaje => porcentaje;

        public string Nombre => nombre;
        
        public override string ToString()
        {
            return "Porcentaje: " + porcentaje + "\nNombre: " + nombre+ "\n";
        }
        
    }
}