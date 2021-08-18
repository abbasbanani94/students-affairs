using System.Windows.Forms;

namespace StudentsAffairs
{
    class Term
    {
        static string baseUrl = "/terms";

        internal static void findAllTermsCombo(ComboBox cmb)
        {
            Client.findComboDto(cmb, baseUrl + "/combo");
        }
    }
}
