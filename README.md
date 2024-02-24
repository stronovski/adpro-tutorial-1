## Tutorial 1

### Refleksi 1
Di dalam program yang telah saya buat, terdapat beberapa prinsip _clean code_ yang telah saya implementasikan, diantaranya adalah sebagai berikut:

1. _Meaningful Names_
   Di dalam program yang telah saya tulis, dilakukan penamaan variabel dan juga fungsi yang memiliki tujuan dan arti yang jelas, sehingga dapat memberikan kemudahan untuk memahami program tersebut.
2. _One function does one thing_
   Fungsi-fungsi yang ada di dalam program ini dibuat agar masing-masing fungsi dapat melaksanakan tugasnya masing-masing, sehingga tidak ada bagian yang _overlap_ dengan fungsi lain dan meningkatkan koherensi program.
3. Menghilangkan _commented-out codes_
   Meskipun terdapat kode yang sebelumnya 'disimpan' dalam bentuk _comment_ agar penulis kode dapat kembali lagi ke kode tersebut jika suatu saat memerlukan titik untuk kembali, akan lebih baik jika _commented-out codes_ dihapus untuk meningkatkan kerapihan kode.
4. Menulis komentar seperlunya
   Meskipun komentar diperlukan untuk menambahkan penjelasan mengenai kode yang telah ditulis, komentar tidak dapat menggantikan peran kode yang memiliki koherensi yang kurang baik, sehingga lebih baik menuliskan komentar seperlunya dibandingkan dengan menjelaskan kode secara keseluruhan melalui komentar.

Hal yang dapat dikembangkan dari program saya adalah sebagai berikut:
1. Terdapat beberapa bagian kode yang dirasa masih cukup _redundant_, sehingga kode dapat dinilai kurang efisien
2. Terdapat _pass_ dan _return_ terhadap null, sehingga kedepannya kode perlu diperbaiki di dalam bagian _error handling_


### Refleksi 2

1. Setelah melakukan _unit testing_, saya menjadi makin yakin atas kebenaran kode yang telah ditulis. Jumlah _unit testing_ sendiri ditentukan dari seberapa banyak bagian yang perlu untuk diverifikasi dan bergantung dengan alur dari kode tersebut. Dalam konteks _code coverage_, semakin tinggi persentasi _coverage_ dari sebuah kode, maka akan dapat memberikan lebih banyak _assurance_ mengenai kode tersebut. Akan tetapi, _code coverage_ tidak dapat menjamin bahwa suatu program akan bebas dari error 100% karena adanya kemungkinan terjadi kasus-kasus yang terjadi di luar dugaan. Tingginya persentase _code coverage_ akan menurunkan persentase terjadinya _error_ dalam program, akan tetapi tidak dapat menjamin ketiadaan masalah.

2. Karena java class yang mirip dengan java class yang akan dibentuk sudah tersedia, maka hal tersebut dapat mengurangi kebersihan kode dan menjadikan kode tersebut lebih _redundant_ karena adanya pengulangan kode.  Akan lebih baik jika fungsi-fungsi yang telah tersedia diubah sesuai dengan kebutuhan dan juga memisahkan antara test function dan juga instansiasi product menjadi dua function yang berbeda agar setiap fungsi dapat berfokus dalam tujuannya masing-masing.

## Tutorial 3

### Jelaskan Prinsip SOLID yang Diterapkan di Project Ini!

- Single Responsibility Principle <br />
  Pada awalnya, class CarController berada di dalam class ProductController. Karena class ProductController dan CarController memiliki fungsionalitas dan berasal dari modul yang berbeda, maka dilakukan pemisahan antara keduanya untuk menjamin bahwa kedua kelas tersebut dapat mengerjakan tugasnya masing-masing secara terpisah dan tidak _overlap_, sehingga dapat meningkatkan _maintainability_ dari program tersebut. Selain itu, extends ProductController yang terdapat di dalam class CarController juga dihilangkan karena tidak memiliki keterkaitan yang signifikan dengan ProductController.
  
- Open-Closed Design Principle<br />
  Dibuat fungsi update di dalam class Car agar dapat lebih mudah untuk di-_extend_ di class maupun function lain, meskipun tidak dapat dimodifikasi di luar class tersebut.
  
- Liskov Substitution Principle <br />
   Pada awalnya, class CarController berada di dalam class ProductController. Meskipun begitu, class CarController memiliki _behavior_ yang berbeda dengan _superclass_-nya karena terdapat beberapa perbedaan dalam penggunaan _method_, sehingga objek _superclass_ tidak dapat tergantikan oleh _subclass_nya sendiri. Untuk itu, class ProductController harus dipisahkan dari classController agar keduanya dapat menjalankan tugasnya masing-masing. Pemisahan antara kedua kelas ini juga memiliki keterkaitan dengan Single Responsibility Principle.
  
- Interface Segregation Principle<br />
  Karena CarService dan ProductService sudah dipisahkan di dalam _source code_, maka prinsip _interface segregation_ telah dilaksanakan dengan baik. Masing-masing telah memiliki fungsionalitasnya sendiri sehingga perlu dibedakan untuk membuat program menjadi lebih komprehensif dan efisien.
  
- Delegation Principles<br />
  Pada awalnya, _function_ carController bergantung langsung dengan CarServiceImpl, sedangkan class CarServiceImpl bukan merupakan _abstract class_ maupun _interface_, melainkan sebuah _class_ biasa. Untuk itu, carController diubah agar bergantung kepada CarService, sehingga dapat mengurangi resiko adanya kerusakan yang terjadi jika seandainya terdapat perubahan di dalam class CarServiceImpl. 
  

### Jelaskan Keuntungan dari Penerapan Prinsip SOLID di Dalam Proyek Ini!
Dengan menggunakan prinsip SOLID, kode yang dibuat dapat menjadi lebih mudah untuk di-_maintain_ dan meningkatkan _readibility_ dari code tersebut. Karena sifatnya yang lebih mudah untuk di-_manage_, maka kualitas proyek yang dikembangkan akan menjadi lebih baik dan dapat mengurangi biaya pengembangan dan juga _maintenance_ dari waktu ke waktu. Setiap prinsip SOLID memiliki keuntungannya masing-masing untuk diimplementasikan, misalnya SRP yang dapat mengurangi resiko adanya efek samping dari penggunaan modul yang dipakai dengan fungsionalitas yang digabung, ataupun OCP yang dapat membuat perubahan _requirements_ dan juga penggunaan kembali kode yang telah dibuat menjadi lebih mudah tanpa harus menulis kembali, sehingga menambah _reusability_ dari kode tersebut.

### Jelaskan Kerugian Jika Tidak Melakukan Penerapan Prinsip SOLID di Dalam Proyek Ini!
Jika tidak menggunakan prinsip SOLID, maka program akan lebih sulit untuk di-_manage_, sehingga dapat menambah biaya untuk pengembangan dari proyek tersebut. Selain itu, kode yang dibuat akan lebih sulit untuk dibaca dan juga dimodifikasi, terutama jika bekerja di dalam sebuah tim. Unit Testing juga akan lebih sulit untuk dilakukan, sehingga akan lebih baik untuk mengimplementasikan prinsip SOLID di dalam setiap kode yang ditulis.
