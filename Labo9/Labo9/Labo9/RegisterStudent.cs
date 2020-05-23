using System;
using System.Windows.Forms;

namespace Labo9
{
    public partial class RegisterStudent : UserControl
    {
        public RegisterStudent()
        {
            InitializeComponent();
        }


        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Equals("") ||
                textBox2.Equals("") ||
                textBox3.Equals("") ||
                textBox4.Equals(""))
            {
                MessageBox.Show("No puede dejar los campos vacios");
            }
            else
            {
                try
                {
                    ConnectionDB.ExecuteNonQuery($"INSERT INTO ESTUDIANTE VALUES(" +
                                                 $"'{textBox3.Text}'," +
                                                 $"'{textBox1.Text}'," +
                                                 $"'{textBox2.Text}'," +
                                                 $"{textBox4.Text})");
                    MessageBox.Show("Se ha registrado el estudiante");
                }
                catch (Exception esg)
                {
                    MessageBox.Show("Ha ocurrido un error");
                }

            }
        }
    }
}