using System;

namespace Evaluaciones
{
    public class Tarea : Evaluacion
    {
        private DateTime fechaEntrega;

        public Tarea(int porcentaje, string nombre, DateTime fechaEntrega) : base(porcentaje, nombre)
        {
            this.fechaEntrega = fechaEntrega;
        }

        public DateTime FechaEntrega => fechaEntrega;
        
        public override string ToString()
        {
            return "TAREA \nPorcentaje: " + porcentaje + "\nNombre: " + nombre + "\nFecha de Entrega: " + fechaEntrega.ToString("dd/MM/yyyy") +"\n";
        }
        
    }
}