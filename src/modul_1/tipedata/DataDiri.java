package modul_1.TipeData;

public class DataDiri {
    public static void main(String[] args) {

        String nama = "zamharira";
        String alamat = "Blang paseh";
        String agama = "Islam";
        int usia = 19;
        float tinggi = 174f;
        boolean statusMahasiswa = true;
        char gender = 'L';
        String jurusan = "Tik (Teknik Informatika)";
        String politeknik = "Politeknik Negeri Lhokseumawe";


        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Agama           : " + agama);
        System.out.println("Usia            : " + usia + " tahun");
        System.out.println("Tinggi          : " + tinggi + " cm");
        System.out.println("Gender          : " + gender);
        System.out.println("Status Mahasiswa: " + (statusMahasiswa ? "Aktif" : "Tidak Aktif"));
        System.out.println("Jurusan         : " + jurusan);
        System.out.println("politeknik      : " + politeknik);
    }
}