using System;
using System.Collections.Generic;

namespace Evaluaciones
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var l = new List<Evaluacion>();
            byte opc;
            int porcentaje;
            string nombre;
            string tipo;
            int cantPreguntas;
            byte dia;
            byte mes;
            DateTime FechaEntrega;
            

            do
            {
                try
                {
                    int porcenTotal = 0;
                    Console.WriteLine(
                        "Elija una opcion: \n 1. Agregar Evaluacion \n 2. Mostrar evaluaciones almacenadas \n 3. Eliminar evaluacion \n 4. Terminar programa \n");
                    opc = Convert.ToByte(Console.ReadLine());

                    switch (opc)
                    {
                        case 1:
                            Console.WriteLine(
                                "¿Que tipo de evaluacion registrara? \n 1.Laboratorio\n 2.Parcial\n 3.Tarea \n");
                            byte tipoE = Convert.ToByte(Console.ReadLine());
                            foreach (var element in l)
                            {
                                porcenTotal = porcenTotal + element.Porcentaje;
                            }

                            if (porcenTotal < 100)
                            {
                                switch (tipoE)
                                {
                                    case 1:
                                        int auxiliar = porcenTotal;
                                        Console.WriteLine("Ingrese el porcentaje sin el simbolo %:");
                                        porcentaje = Convert.ToInt32(Console.ReadLine());
                                        if (porcentaje + auxiliar > 100)
                                        {
                                            Console.WriteLine(
                                                "Ese promedio hace que se sobrepase el 100%, no puede ser almacenado");
                                        }
                                        else
                                        {
                                            Console.WriteLine("Ingrese el Nombre de la evaluacion:");
                                            nombre = Console.ReadLine();
                                            Console.WriteLine("Ingrese el Tipo de evaluacion :");
                                            tipo = Console.ReadLine();
                                            l.Add(new Laboratorio(porcentaje, nombre, tipo));
                                        }

                                        break;
                                    case 2:
                                        int auxiliar2 = porcenTotal;
                                        Console.WriteLine("Ingrese el porcentaje sin el simbolo %:");
                                        porcentaje = Convert.ToInt32(Console.ReadLine());
                                        if (porcentaje + auxiliar2 > 100)
                                        {
                                            Console.WriteLine(
                                                "Ese promedio hace que se sobrepase el 100%, no puede ser almacenado");
                                        }
                                        else
                                        {
                                            Console.WriteLine("Ingrese el Nombre de la evaluacion:");
                                            nombre = Console.ReadLine();
                                            Console.WriteLine("Ingrese la cantidad de preguntas");
                                            cantPreguntas = Convert.ToInt32(Console.ReadLine());
                                            l.Add(new Parcial(porcentaje, nombre, cantPreguntas));
                                        }

                                        break;
                                    case 3:
                                        int auxiliar3 = porcenTotal;
                                        Console.WriteLine("Ingrese el porcentaje sin el simbolo %");
                                        porcentaje = Convert.ToInt32(Console.ReadLine());
                                        if (porcentaje + auxiliar3 > 100)
                                        {
                                            Console.WriteLine(
                                                "Ese promedio hace que se sobrepase el 100%, no puede ser almacenado");
                                        }
                                        else
                                        {
                                            Console.WriteLine("Ingrese el Nombre de la evaluacion:");
                                            nombre = Console.ReadLine();
                                            Console.WriteLine("Ingrese el dia de entrega(numero)");
                                            dia = Convert.ToByte(Console.ReadLine());
                                            Console.WriteLine("Ingrese el mes (numero)");
                                            mes = Convert.ToByte(Console.ReadLine());
                                            FechaEntrega = new DateTime(2020, mes, dia);
                                            l.Add(new Tarea(porcentaje, nombre, FechaEntrega));
                                        }

                                        break;
                                    default:
                                        Console.WriteLine("Opcion fuera de los limites");
                                        break;
                                }
                            }
                            else
                            {
                                Console.WriteLine("No puede sobrepasar el 100%");
                            }

                            break;
                        case 2:
                            foreach (var element in l)
                            {
                                Console.WriteLine(element.ToString());
                            }

                            break;
                        case 3:
                            Console.WriteLine("Ingrese el nombre del elemento que desea eliminar: ");
                            string nom = Console.ReadLine();
                            Evaluacion aux = null;

                            foreach (var element in l)
                            {
                                if (element.Nombre.ToLower().Equals(nom))
                                {
                                    aux = element;
                                }
                            }

                            if (aux == null)
                            {
                                Console.WriteLine("No se ha encontrado el elemento");
                            }
                            else
                            {
                                l.Remove(aux);
                                Console.WriteLine("Elemento eliminado");
                            }

                            break;
                        case 4:
                            bool repetir;
                            do
                            {
                                double nota = CalcularNota.calcular(l);
                                if (nota < 0 || nota > 10)
                                {
                                    Console.WriteLine("No se colocaron notas validas entre 0 y 10");
                                    repetir = true;
                                }
                                else
                                {
                                    Console.Write("Su nota final es: " + nota);
                                    repetir = false;
                                }
                            } while (repetir);

                            break;
                        default:
                            Console.WriteLine("Opcion fuera de los limites");
                            break;
                    }
                }
                catch (FormatException)
                {
                    Console.WriteLine("Error, el formato que has ingresado es incorrecto");
                    opc = 0;
                }
                catch (OverflowException)
                {
                    Console.WriteLine("Error, valor fuera de los limites");
                    opc = 0;
                }
            } while (opc !=4);
        }
    }
}