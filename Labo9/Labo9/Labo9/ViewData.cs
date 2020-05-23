using System;
using System.Windows.Forms;

namespace Labo9
{
    public partial class ViewData : UserControl
    {
        public ViewData()
        {
            InitializeComponent();
        }


        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(""))
                
            {
                MessageBox.Show("No puede dejar los campos vacios");
            }
            else
            {
                try
                {
                    var dt = ConnectionDB.ExecuteQuery("SELECT ins.idMateria, mat.nombre " +
                                                       "FROM MATERIA mat, INSCRIPCION ins, ESTUDIANTE est " +
                                                       $"WHERE ins.idMateria = mat.idMateria " +
                                                       $"AND est.carnet = '{textBox1.Text}'");
                    dataGridView1.DataSource = dt;
                    MessageBox.Show("Datos obtenidos exitosamente");
                }
                catch (Exception esg)
                {
                    MessageBox.Show("Ha cocurrido un problema");
                }
            }
        }
    }
}