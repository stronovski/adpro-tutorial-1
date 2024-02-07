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
