# Brick Breaker

***

Brick Breaker adalah sebuah aplikasi game yang dapat ditemukan pada ponsel-ponsel lawas. Premis dari game ini cukup sederhana, yakni menghancurkan setiap blok-blok yang ada pada bagian atas layar menggunakan sebuah bola yang diarahkan oleh Paddle atau pemukul. Paddle tersebut digerakkan oleh pemain menggunakan input keyboard, atau pada kasus ponsel menggunakan tombol ponsel itu sendiri. Pemain dinyatakan kalah apabila bola menyentuh bagian bawah layar melewati Paddle. Namun jika pemain berhasil menghancurkan semua blok, maka pemain berhasil memenangkan permainan.

## Fitur
  
### Sistem Skor
  
Skor yang diperoleh pemain didapat berasal dari setiap blok yang dihancurkan saat bermain. Untuk saat ini sistem skor hanya meliputi skor per level, sedangkan fitur untuk menyimpan skor tertinggi belum diimplementasikan.
  
### Level
  
Hingga saat tulisan ini dibuat aplikasi Brick Breaker hanya memiliki satu level fungsional. Level tersebut sudah memenuhi kriteria yang diperlukan untuk bisa dimainkan. Kriteria tersebut adalah kondisi menang dan kalah, serta tujuan permainan.
  
### Main Menu (TBA)
### Level Selector (TBA)
### Credit Page (TBA)

***

## Class-Class yang Digunakan
  
### Ball.java
  
Class ini menyimpan semua fungsi yang diperlukan oleh bola. Fungsi tersebut merupakan physics yang digunakan oleh bola, seperti pergerakan dan pemantulan bola.

### Board.java
  
Class ini bertugas untuk mengurus level pada game. Mulai dari instansiasi level, mengurus objek yang akan digunakan seperti Paddle, Ball dan blok, serta kondisi menang kalah.

### Breakout.java

Class ini adalah class utama yang menggerakan aplikasi. Fungsi Main() berada pada class ini.

### Brick.java
  
Class ini berisikan fungsi dan properti yang digunakan oleh blok-blok yang ada pada game.
   
### Commons.java
  
Class ini adalah interface yang mana propertinya digunakan oleh beberapa Class lainnya.
  
### Paddle.java
  
Class Paddle berisikan properti dan fungsi yang digunakan Paddle.
  
### Sprite.java
  
Class ini berisi properti dan fungsi yang diturunkan kepada Paddle, Brick, dan Ball.
 
***
  
##Referensi
[Brick Breaker](http://zetcode.com/javagames/breakout/)
[Source Code](https://github.com/janbodnar/Java-Breakout-Game)

