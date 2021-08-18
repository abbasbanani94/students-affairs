using System.Windows.Forms;

namespace StudentsAffairs
{
    class Category
    {
        static string baseUrl = "/categories";
        internal static void findAllCategoriesCombo(ComboBox cmb)
        {
            Client.findComboDto(cmb, baseUrl + "/combo");
        }
    }
}
