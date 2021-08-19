using System.Windows.Forms;

namespace StudentsAffairs
{
    class Msg
    {
        internal static void yearOnly(KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && (e.KeyChar != '.') && (e.KeyChar != '-'))
            {
                e.Handled = true;
                Msg.errorMsg("هذا الحقل لا يقبل كتابة الحروف والرموز", "أرقام فقط");
            }
        }

        static public void doneMsg(string body, string title)
        {
            MessageBox.Show(body, title, MessageBoxButtons.OK, MessageBoxIcon.Information, MessageBoxDefaultButton.Button1, MessageBoxOptions.RtlReading);
        }

        static public void errorMsg(string body, string title)
        {
            MessageBox.Show(body, title, MessageBoxButtons.OK, MessageBoxIcon.Error, MessageBoxDefaultButton.Button1, MessageBoxOptions.RtlReading);
        }

        static public DialogResult questionMsg(string body, string title)
        {
            return MessageBox.Show(body, title, MessageBoxButtons.YesNo, MessageBoxIcon.Question, MessageBoxDefaultButton.Button1, MessageBoxOptions.RtlReading);
        }

        internal static void formAlreadyOpen(string v)
        {
            errorMsg("واجهة " + v + " مفتوحة مسبقا، لا يمكن فتح نفس الواجهة مرتين", "مفتوح مسبقا");
        }

        internal static void reportDoesntExist()
        {
            Msg.errorMsg("No report with the name you entered, please select from the list", "Error");
        }

        static public void numbersOnly(KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && (e.KeyChar != '.'))
            {
                e.Handled = true;
                errorMsg("هذا الحقل لا يقبل الحروف والرموز", "أرقام فقط");
            }
        }

        static public void lettersOnly(KeyPressEventArgs e)
        {
            if (!char.IsLetter(e.KeyChar) && e.KeyChar != (char)Keys.Back && e.KeyChar != (char)Keys.Space)
            {
                e.Handled = true;
                errorMsg("هذا الحقل لا يقبل الارقام", "حروف ورموز فقط");
            }
        }

        static public void emptyFields()
        {
            errorMsg("يجب ادخال بيانات في جميع الحقول الالزامية", "حقول فارغة");
        }

        static public void idAlreadyUsed()
        {
            errorMsg("This ID is already used, press on New button then try again", "Error");
        }

        internal static void idDoesntExistsDelete()
        {
            errorMsg("This ID doesn't exist to be deleted", "ID doesn't exists");
        }

        internal static void idDoesntExistsEdit()
        {
            errorMsg("This ID doesn't exist to be edited", "ID doesn't exists");
        }

        internal static void error500()
        {
            errorMsg("Internal Server Error", "Error 500");
        }

        internal static void edited(string name)
        {
            doneMsg(name + " edited successfully !", "Successfully");
        }

        internal static void idInSave(string name)
        {
            errorMsg("click Edit to edit this " + name, "Error");
        }

        internal static DialogResult deleteConfirm(string name)
        {
            return questionMsg("Do you want to delete this " + name + " ?", "Delete Confirmation");
        }

        internal static void deleted(string name)
        {
            doneMsg(name + " deleted successfully !", "Successfully");
        }

        internal static void saved(string name)
        {
            doneMsg(name + " saved successfully !", "Successfully");
        }

        internal static DialogResult editConfirm(string name)
        {
            return questionMsg("Do you want to edit this " + name + " ?", "Edit Confirmation");
        }
    }
}
