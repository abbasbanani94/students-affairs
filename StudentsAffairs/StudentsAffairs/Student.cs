using System;
using System.Windows.Forms;

namespace StudentsAffairs
{
    class Student
    {
        static string baseUrl = "/students";
        internal static void findGendersCombo(ComboBox cmbGender)
        {
            Client.findComboDto(cmbGender, "/genders/combo");
        }

        internal static void findDistinctPob(ComboBox cmbPob)
        {
            Client.findStringList(cmbPob, baseUrl + "/pob-combo");
        }

        internal static void findDistinctNationality(ComboBox cmbNationality)
        {
            Client.findStringList(cmbNationality, baseUrl + "/nationality-combo");
        }

        internal static void findDistinctBlood(ComboBox cmbBlood)
        {
            Client.findStringList(cmbBlood, baseUrl + "/blood-combo");
        }

        internal static void findIdentityCombo(ComboBox cmbIdentity)
        {
            Client.findComboDto(cmbIdentity, "/Identity/combo");
        }

        internal static void findCertificateCombo(ComboBox cmbCertificate)
        {
            Client.findStringList(cmbCertificate, baseUrl + "/certificate-combo");
        }

        internal static void findSchoolCombo(ComboBox cmbSchool)
        {
            Client.findStringList(cmbSchool, baseUrl + "/school-combo");
        }

        internal static void findSchoolYearCombo(ComboBox cmbSchoolYear)
        {
            Client.findStringList(cmbSchoolYear, baseUrl + "/school-year-combo");
        }

        internal static void findStatusCombo(ComboBox cmbStatus)
        {
            Client.findComboDto(cmbStatus, "/student-status/combo");
        }

        internal static void findCityCombo(ComboBox cmbCity)
        {
            Client.findStringList(cmbCity, baseUrl + "/city-combo");
        }
    }
}
