using System.Runtime;

namespace Lab10
{
    public class CuentaBancaria
    {
        public readonly string _nombre;
        public readonly double _saldoActual;

        public CuentaBancaria(string nombre = "unnamed", double saldo = 0)
        {
            _nombre = nombre;
            _saldoActual = saldo;
        }
    }
}