using Newtonsoft.Json;
using System;
using System.Net.Http;
using System.Windows.Forms;

namespace StudentsAffairs
{
    class Year
    {
        static string baseUrl = "/years";

        internal static void findAllYearsCombo(ComboBox cmbYear, ComboBox cmbJoin)
        {
            Client.findComboDto(cmbYear, baseUrl + "/combo");
            Client.findComboDto(cmbJoin, baseUrl + "/combo");
        }

        internal static async void findCurrentYear(ComboBox cmbYear)
        {
            try
            {
                HttpClient client = Client.getHttpClient();
                var response = await client.GetStringAsync(baseUrl + "/current-year");
                ComboDto dto = JsonConvert.DeserializeObject<ComboDto>(response);
                cmbYear.SelectedValue = dto.id;
                cmbYear.Text = dto.name;
            }
            catch (Exception ex)
            {
                Msg.errorMsg(ex.Message.ToString(), "Error");
            }
        }
    }
}
