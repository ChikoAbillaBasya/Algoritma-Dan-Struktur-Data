# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama  : Chiko Abilla Basya </p>
<p align = "center"> NIM   : 2341720005 </p>
<p align = "center"> Prodi : TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas : 1B </p>

<br><br><br><br><br>

<h2>2. Praktikum  
<h3>2.1 Percobaan 1: Deklarasi Class, Atribut dan Method

<h3>2.1.1 Langkah-langkah Percobaan 

![alt text](code.png)
<h3>2.1.2 Verifikasi Hasil Percobaan

![alt text](Output.jpg)
<br><br>

<h3>2.1.3 Pertanyaan <br>
<h4>1.	Sebutkan dua karakteristik class atau object! <br>
Jawab :<br> - Class adalah sebuah konsep abstrak yang tidak dapat diakses secara langsung oleh program. Class hanya dapat diwujudkan melalui pembuatan objek. Class juga dapat dianggap sebagai sebuah tipe data yang dapat dibuat sendiri oleh programmer . <br>
- Object adalah sebuah entitas yang memiliki identitas, keadaan, dan perilaku. Identitas adalah nama atau referensi yang menunjuk ke objek. Keadaan adalah nilai dari properti yang dimiliki objek. Perilaku adalah aksi yang dapat dilakukan objek melalui metode .<br>
2.	Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya! <br>
Jawab : <br>
Di class buku ada 5 atribut yaitu String (judul), String (pengarang), int halaman, int (stok), int (harga). <br>
3.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! <br> 
Jawab : <br>
di class buku ada 5 method yaitu tampilInformasi(), terjual(), gantiHarga(), tampilInformasi(), restock().<br>
4.	Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)! <br>
Jawab : <br>

![alt text](code1.png) <br>
5.	Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?<br> 
Jawab : <br>
Method restock() memiliki satu parameter berupa bilangan int karena parameter tersebut digunakan untuk menentukan jumlah tambahan stok yang akan diinputkan. Jumlah tambahan stok harus berupa bilangan bulat, dan menggunakan tipe data int adalah pilihan yang tepat untuk merepresentasikan bilangan bulat dalam Java. Dengan demikian, penggunaan tipe data int sebagai parameter untuk method restock() memungkinkan pengguna untuk dengan mudah menambahkan jumlah stok yang diinginkan.<br>
6. Commit dan push kode program ke Github <br>

<br><br><br><br><br>
<h3>2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method <br>
<h3>2.2.1 	Langkah-langkah Percobaan

![alt text](code2.png)
<h3>2.2.2 	Verifikasi Hasil Percobaan 

![alt text](<Screenshot 2024-02-21 141134.png>)

<h3>2.2.3 	Pertanyaan 
<h4>1.	Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! 
Apa nama object yang dihasilkan?  <br>
Jawab : <br>
Buku07 bk1 = new Buku07(); <br>
2.	Bagaimana cara mengakses atribut dan method dari suatu objek? <br>
Jawab : <br>
Untuk mengakses atribut dan method dari suatu objek, perlu menggunakan nama objek yang telah diinstansiasi, diikuti oleh tanda titik (.). Untuk mengakses atribut dari objek, menggunakan namaObjek.namaAtribut. Sedangkan untuk memanggil method dari objek, menggunakan namaObjek.namaMethod(). <br>
3.	Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda? <br>
Jawab : <br>
Perubahan nilai atribut objek antara pemanggilan method menyebabkan perbedaan output. 
<br><br><br><br><br>

<h3>2.3 Percobaan 3: Membuat Konstruktor <br>
<h3>2.3.1 	Langkah-langkah Percobaan 

![alt text](code4.png)

![alt text](code3.png)

<h3>2.3.2 	Verifikasi Hasil Percobaan 

![alt text](<Screenshot 2024-02-21 144954.png>)

<h3>2.3.3 	Pertanyaan 
<h4>1.	Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter! <br>
Jawab : <br>

![alt text](code5.png) 
    
2.	Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?  <br>
Jawab : <br>
Pada baris program tersebut, sebuah objek bk2 dari class Buku07 dibuat menggunakan konstruktor berparameter. Nilai-nilai yang diperlukan untuk inisialisasi objek bk2 disediakan sebagai argumen untuk konstruktor tersebut. <br>
3.	Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian! <br>
Jawab : <br>
akan mendapatkan error <br>

![alt text](<Screenshot 2024-02-21 151100.png>) <br>

karena menghapus konstruktor default, Java tidak lagi menyediakan konstruktor default secara otomatis. <br>
4.	Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya! <br>
Jawab : <br>
Tidak Harus, karena agar tidak ada ketergantungan urutan pemanggilan antar method di dalam class tersebut. <br>
5.	Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku! <br> 
Jawab : <br>

![alt text](code6.png) <br>
6.	Commit dan push kode program ke Github 
<br><br><br><br><br>

<h3>2.4 Latihan Praktikum
<h4>1. Soal 1 <br>
Jawab : <br>

![alt text](code7.png)
<br>
Hasil Program <br>

![alt text](<Screenshot 2024-02-23 185948.png>)
<br>

<h4>2. Soal 2 <br>
Jawab : <br>

![alt text](code8.png) <br>

Hasil program <br>

![alt text](<Screenshot 2024-02-26 114746.png>)