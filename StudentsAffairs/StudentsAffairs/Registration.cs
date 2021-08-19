using System.Windows.Forms;

namespace StudentsAffairs
{
    class Registration
    {
        static string baseUrl = "/registrations";
        internal static void findRegistrationDgv(string deptId, string batchId, DataGridView dgv)
        {
            if (deptId.IndexOf('{') == -1 && batchId.IndexOf('{') == -1)
            {
                Client.findAllDgv(dgv, baseUrl + "/dgv/" + deptId + "/" + batchId);
            }
        }
    }
}
