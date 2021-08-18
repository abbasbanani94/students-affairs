using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentsAffairs
{
    class Batch
    {
        static string baseUrl = "/batches";

        internal static void findAllBatchesCombo(ComboBox cmb)
        {
            Client.findComboDto(cmb, baseUrl + "/combo");
        }
    }
}
