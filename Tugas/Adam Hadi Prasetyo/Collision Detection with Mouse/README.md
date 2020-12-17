# Collision Detection with Mouse
  
Pada proyek ini terjadi beberapa perubahan dan penyesuaian. Perubahan tersebut terdapat pada class-class berikut :

## Board.java
  
Pada class Board.java terdapat beberapa perubahan. Yang pertama adalah penghilangan method updateShip() karena dianggap tidak sesuai penggunaannya dengan method move() yang ada pada class SpaceShip.java. 
  
Yang kedua adalah perubahan class TAdapter yang semulanya meng-extend KeyAdapter menjadi MouseAdapter, lalu ada pula penyesuaian method sehingga program dapat mendeteksi tombol mouse yang dipencet, data class ini akan diolah pada method buttonPressed di class SpaceShip.java.
  
Yang ketiga adalah penambahan class MAdapter yang mengimplementasikan MouseMotionListener. Fungsi dari class ini adalah untuk meng-capture koordinat atau lokasi mouse pada aplikasi. Koordinat kemudian akan diolah pada method move() milik class SpaceShip.java.

## SpaceShip.java
  
Pada class SpaceShip.java terdapat dua perubahan besar pada method. Yang pertama adalah penghapusan dan penyesuaian method dengan event 'Key', keyPressed() diubah menjadi buttonPressed() dengan isi method yang digunakan untuk meng-capture Mouse Button 1 (Left Click) — sebagai tombol untuk menembak misil. Method keyRelease() dihilangkan karena fungsi pergerakan pesawat sudah berada pada method move().

Pada method move() sekarang membutuhkan parameter tipe data MouseEvent. method move() ini sekarang digunakan untuk mengolah data dari class MAdapter sehingga pesawat dapat berada sesuai dengan posisi mouse, yang mana berarti pergerakan pesawat mengikuti pergerakan mouse.


# Dokumentasi


  ![](https://cdn.discordapp.com/attachments/428559198171955200/789153906868486154/Diag3.PNG)
  Link Video : 
  
  
