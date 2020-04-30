namespace Evaluaciones
{
    public class Parcial : Evaluacion
    {
        private int cantPreguntas;

        public Parcial(int porcentaje, string nombre, int cantPreguntas) : base(porcentaje, nombre)
        {
            this.cantPreguntas = cantPreguntas;
        }
        
        public override string ToString()
        {
            return "PARCIAL \nPorcentaje: " + porcentaje + "\nNombre: " + nombre + "\nCantidad de preguntas: " + cantPreguntas+ "\n";
        }
        
    }
    
}