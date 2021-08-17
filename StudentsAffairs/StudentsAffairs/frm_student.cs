﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentsAffairs
{
    public partial class frm_student : Form
    {
        public frm_student()
        {
            InitializeComponent();
        }

        private void cmbDept_KeyPress(object sender, KeyPressEventArgs e)
        {
            Msg.lettersOnly(e);
        }

        private void cmbBatch_KeyPress(object sender, KeyPressEventArgs e)
        {
            Msg.numbersOnly(e);
        }

        private void cmbYear_KeyPress(object sender, KeyPressEventArgs e)
        {
            Msg.yearOnly(e);
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}