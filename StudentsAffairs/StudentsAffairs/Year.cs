using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentsAffairs
{
    class Year
    {
        static string baseUrl = "/years";

        internal static void findAllYearsCombo(ComboBox cmbYear, ComboBox cmbJoin)
        {
            Client.findComboDto(cmbYear, cmbJoin, baseUrl + "/combo");
        }
    }
}
