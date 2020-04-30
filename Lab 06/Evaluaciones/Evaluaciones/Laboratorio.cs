namespace Evaluaciones
{
    public class Laboratorio : Evaluacion
    {
        private string tipo;

        public Laboratorio(int porcentaje, string nombre, string tipo) : base(porcentaje, nombre)
        {
            this.tipo = tipo;
        }

        public override string ToString()
        {
            return "LABORATORIO \nPorcentaje: " + porcentaje + "\nNombre: " + nombre + "\nTipo: " + tipo + "\n";
        }
    }
}