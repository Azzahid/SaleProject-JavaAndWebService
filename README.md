# Tugas 2 IF3110 Pengembangan Aplikasi Berbasis Web

### Deskripsi Singkat

*SaleProject* adalah aplikasi marketplace berbasis web untuk membeli dan menjual barang apapun yang Anda inginkan.

### Anggota Tim PejuangWBD
Berikut anggota tim kami:
* 13514029 | [Muhammad Farhan Majid](https://www.facebook.com/hanmajid)
* 13514041 | [Varian Caesar](https://www.facebook.com/varian.caesar?fref=ts)
* 13514095 | [Muhammad Az-zahid Adhitya Silp](https://www.facebook.com/Azzahid025?fref=ts)

### Penjelasan
#### Basis Data
Basis data *SaleProject* dibagi menjadi 2, yakni:
1. Database account (t2_akun) yang digunakan untuk menyimpan data user seperti nama, username, alamat, dsb. Database ini digunakan oleh Identity Service.
2. Database marketplace (t2_product) yang digunakan untuk menyimpan data produk dan transaksi yang ada pada sistem. Database ini digunakan oleh Marketplace Web Service.

#### Konsep *Shared Session* dengan Menggunakan REST
Session menyimpan nilai token dari user yang sedang aktif. Token ini kemudian digunakan untuk mendapatkan konteks dari client, apakah user valid atau tidak. Nilai token ini dapat digunakan bersama oleh semua file .jsp dan divalidasi dengan REST pada Identity Service. 

#### Pembangkitan Token dan Expire Time
Token dibangkitkan ketika user melakukan login atau registrasi. Token kemudian disimpan pada session dan digunakan oleh Marketplace Web Service untuk melakukan autentikasi user. Token akan tidak dapat digunakan setelah melewati expire time yang telah ditentukan atau ketika user melakukan logout.

#### Kelebihan dan Kelemahan Arsitektur Aplikasi
![Gambar Arsitektur Umum Server](http://gitlab.informatika.org/IF3110_WebBasedDevelopment_2016/TugasBesar2_JavaAndWebService/raw/3747ba2499396d04f742a589a024876964383159/arsitektur_umum.png)
Dibandingkan dengan aplikasi monolitik (login, CRUD DB, dll jadi dalam satu aplikasi), arsitektur ini memiliki beberapa kelebihan dan kekurangan, yakni:
* Kelebihan: Loose coupling, yakni masing-masing komponen pada arsitektur dapat berjalan sendiri dan masing-masing komponen tidak perlu mempedulikan internal dari komponen lainnya. Hal ini memungkinkan independensi dari bahasa pemrograman dan platform yang dapat digunakan masing-masing komponen. Arsitektur ini juga lebih fleksibel, scalable, dan mempunyai maintenance cost yang lebih rendah dibandingkan arsitektur monolitik.
* Kekurangan: REST memiliki properti stateless yang dapat berpengaruh kepada tingginya redundansi request yang dilakukan client yang dapat menambah bandwith.

### Pembagian Tugas
Berikut pembagian tugas dari tim kami:

REST :
1. Generate token : 13514041
2. Validasi token : 13514029
3. SearchServlet : 13514095
4. LoginServlet : 13514041
5. DB : 13514041
6. IdServlet : 13514029
7. RegisterServlet : 13514029
8. TokenServlet : 13514029
9. logoutServlet : 13514041

SOAP :
1. Add Product : 13513041
2. getPhoto : 13514095
3. getAllProduct : 13514095
4. getProductPurchase : 13514095
5. searchProduct : 13514095
6. changeLikeStatus : 13514095
7. insertLike : 13514095
8. confirmPurchase : 13514041
9. getPhotoPurchase : 13514095
10. deleteProduct : 13514029
11. getLike : 13514095
12. getLikeStatus : 13514095
13. getPhotoPurchase : 13514095
14. getProductSales : 13514095
15. getTotalPurchase : 13514095
16. getYouProduct : 13514029

Web app (JSP) :
1. Halaman Login : 13514041
2. Halaman Register : 13514029
3. Halaman Catalog : 13514095
4. Halaman Confirmation Purchase : 13514029
5. Halaman Your Products : 13514029
6. Halaman Add Product : 13514041
7. Halaman Edit Product : 13514041
8. Halaman Sales : 13514095
9. Halaman Purchases : 13514095
10. PhotoGenerator : 13514095
11. LikeServlet(TestServ) : 13514095

