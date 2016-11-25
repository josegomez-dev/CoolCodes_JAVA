using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EN_ES_Traductor
{
    

    public partial class UserControl1: UserControl
    {
        public UserControl1()
        {
            InitializeComponent();
        } 
        private void button1_Click(object sender, EventArgs e)
        {
            Dictionary<String, String> dic = new Dictionary<String, String>()
            {
                { "one", "uno"},
                { "two", "dos"},
                { "three", "tres"},
                { "four", "cuatro"},
                { "five", "cinco"},
                { "six", "seis"},
                { "seven", "siete"}
            };

            foreach (KeyValuePair<string, string> var in dic)
            {
                if (this.textBox1.Text == var.Key)
                {
                    this.textBox2.Text = var.Value;
                    break;
                }else
                {
                    this.textBox2.Text = "No existe";
                }

            }
            
        }
    }
}
