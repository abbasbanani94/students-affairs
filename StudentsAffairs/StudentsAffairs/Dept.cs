using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Windows.Forms;

namespace StudentsAffairs
{
    class Dept
    {
        static string baseUrl = "/depts";
        internal static void findAllDeptsByUser(ComboBox cmb)
        {
            Client.findComboDto(cmb, baseUrl + "/combo");
        }
    }
}
