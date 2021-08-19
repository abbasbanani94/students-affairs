using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Data;
using System.Net.Http;
using System.Windows.Forms;

namespace StudentsAffairs
{
    class Client
    {
        public static HttpClient getHttpClient()
        {
            HttpClient client = new HttpClient();
            client.BaseAddress = new Uri("http://localhost:8080");
            client.DefaultRequestHeaders.Accept.Clear();
            client.DefaultRequestHeaders.Accept.Add(
                new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));
            client.DefaultRequestHeaders.Add("userId", User.userId);
            return client;
        }

        internal static async void findStringList(ComboBox cmb, string url)
        {
            try
            {
                cmb.ResetText();
                cmb.Items.Clear();
                HttpClient client = getHttpClient();
                var response = await client.GetStringAsync(url);
                List<string> list = JsonConvert.DeserializeObject<List<string>>(response);
                cmb.DataSource = list;
            }
            catch (Exception ex)
            {
                Msg.errorMsg(ex.Message.ToString(), "Error");
            }
        }

        internal static async void findAllDgv(DataGridView dgv, string url)
        {
            try
            {
                HttpClient client = getHttpClient();
                var response = await client.GetStringAsync(url);
                DataTable dt = (DataTable)JsonConvert.DeserializeObject(response, (typeof(DataTable)));
                dgv.DataSource = dt;
            }
            catch (Exception ex)
            {
                Msg.errorMsg(ex.Message.ToString(), "Error");
            }
        }

        internal static bool deleteRequest(string url)
        {
            try
            {
                HttpClient client = getHttpClient();
                var response = client.DeleteAsync(url);
                if (response.Result.StatusCode == System.Net.HttpStatusCode.OK)
                    return true;
                else
                {
                    Msg.errorMsg(response.Result.Content.ReadAsStringAsync().Result, "Error");
                }
            }
            catch (Exception ex)
            {
                Msg.errorMsg(ex.Message.ToString(), "Error");
            }
            return false;
        }

        internal static bool saveRequest(string url, object dto)
        {
            try
            {
                HttpClient client = getHttpClient();
                var response = client.PostAsJsonAsync(url, dto);
                if (response.Result.StatusCode == System.Net.HttpStatusCode.OK)
                    return true;
                else
                {
                    Msg.errorMsg(response.Result.Content.ReadAsStringAsync().Result, "Error");
                }
            }
            catch (Exception ex)
            {
                Msg.errorMsg(ex.Message.ToString(), "Error");
            }
            return false;
        }

        internal static bool editRequest(string url, object dto)
        {
            try
            {
                HttpClient client = getHttpClient();
                var response = client.PutAsJsonAsync(url, dto);
                if (response.Result.StatusCode == System.Net.HttpStatusCode.OK)
                    return true;
                else
                {
                    Msg.errorMsg(response.Result.Content.ReadAsStringAsync().Result, "Error");
                }
            }
            catch (Exception ex)
            {
                Msg.errorMsg(ex.Message.ToString(), "Error");
            }
            return false;
        }

        internal static async void findComboDto (ComboBox cmb,string url)
        {
            try
            {
                cmb.Items.Clear();
                HttpClient client = getHttpClient();
                var response = await client.GetStringAsync(url);
                List<ComboDto> list = JsonConvert.DeserializeObject<List<ComboDto>>(response);
                cmb.DataSource = list;
                cmb.DisplayMember = "name";
                cmb.ValueMember = "id";
                cmb.ResetText();
            }
            catch (Exception ex)
            {
                Msg.errorMsg(ex.Message.ToString(), "Error");
            }
        }

        internal static async void findComboDto(ComboBox cmb1,ComboBox cmb2, string url)
        {
            try
            {
                cmb1.Items.Clear();
                cmb2.Items.Clear();
                HttpClient client = getHttpClient();
                var response = await client.GetStringAsync(url);
                List<ComboDto> list = JsonConvert.DeserializeObject<List<ComboDto>>(response);
                cmb1.DataSource = list;
                cmb1.DisplayMember = "name";
                cmb1.ValueMember = "id";
                cmb1.ResetText();
                cmb2.DataSource = list;
                cmb2.DisplayMember = "name";
                cmb2.ValueMember = "id";
                cmb2.ResetText();
            }
            catch (Exception ex)
            {
                Msg.errorMsg(ex.Message.ToString(), "Error");
            }
        }
    }
}
