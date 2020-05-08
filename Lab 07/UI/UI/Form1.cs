using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UI
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            comboBox1.DataSource = new List<String>() {"Cian","Verde Agua","Rosado"};
        }

        private void buttonRed_Click(object sender, EventArgs e)
        {
            BackColor = Color.Red;
        }

        private void buttonBlue_Click(object sender, EventArgs e)
        {
            BackColor = Color.Blue;
        }

        private void buttonGreen_Click(object sender, EventArgs e)
        {
            BackColor = Color.Green;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BackColor = ColorTranslator.FromHtml("#"+textBox1.Text);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            String cian = "#59ffd8", vAqua = "#40f57f", rosado = "#fca9e8";

            switch (comboBox1.SelectedIndex)
            {
                case 0 : BackColor = ColorTranslator.FromHtml(cian);
                    break;
                case 1 : BackColor = ColorTranslator.FromHtml(vAqua);
                    break;
                case 2 : BackColor = ColorTranslator.FromHtml(rosado);
                    break;
            }
        }
    }
}