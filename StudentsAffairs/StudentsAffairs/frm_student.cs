using System;
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

        private void frm_student_Load(object sender, EventArgs e)
        {
            Dept.findAllDeptsByUser(cmbDept);
            Batch.findAllBatchesCombo(cmbBatch);
            Category.findAllCategoriesCombo(cmbCategory);
            Term.findAllTermsCombo(cmbTerm);
            Year.findAllYearsCombo(cmbYear,cmbJoin);
            Year.findCurrentYear(cmbYear);
            Student.findGendersCombo(cmbGender);
            Student.findIdentityCombo(cmbIdentity);
            Student.findStatusCombo(cmbStatus);
            load();
        }

        private void load()
        {
            cmbStatus.SelectedValue = 1;
            cmbStatus.Text = "منتظم";
            Student.findDistinctPob(cmbPob);
            Student.findDistinctNationality(cmbNationality);
            Student.findDistinctBlood(cmbBlood);
            Student.findCertificateCombo(cmbCertificate);
            Student.findSchoolCombo(cmbSchool);
            Student.findSchoolYearCombo(cmbSchoolYear);
            Student.findCityCombo(cmbCity);
        }

        private void cmbDept_SelectedIndexChanged(object sender, EventArgs e)
        {
            if(cmbBatch.SelectedValue != null && cmbDept.SelectedValue != null)
                Registration.findRegistrationDgv(cmbDept.SelectedValue.ToString(), cmbBatch.SelectedValue.ToString(),
                dgv);
        }

        private void btnBrowse_Click(object sender, EventArgs e)
        {
            OpenFileDialog o = new OpenFileDialog();
            o.Filter = "JPEG (*.jpeg)|*.jpeg|PNG (*.png)|*.png|All Files (*.*)|*.*";
            if (o.ShowDialog() == DialogResult.OK)
            {
                pic.Image = Image.FromFile(o.FileName);
            }
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            
        }
    }
}
