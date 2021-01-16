# **Brick Breaker**

***

Brick Breaker adalah sebuah aplikasi game yang dapat ditemukan pada ponsel-ponsel lawas. Premis dari game ini cukup sederhana, yakni menghancurkan setiap blok-blok yang ada pada bagian atas layar menggunakan sebuah bola yang diarahkan oleh Paddle atau pemukul. Paddle tersebut digerakkan oleh pemain menggunakan input keyboard, atau pada kasus ponsel menggunakan tombol ponsel itu sendiri. Pemain dinyatakan kalah apabila bola menyentuh bagian bawah layar melewati Paddle. Namun jika pemain berhasil menghancurkan semua blok, maka pemain berhasil memenangkan permainan.
***
# **Fitur**
  
## **Sistem Skor**
  
Skor yang diperoleh pemain didapat berasal dari setiap blok yang dihancurkan saat bermain. Skor pada setiap level akan disimpan pada file Score.txt, kemudian akan digunakan untuk menampilkan High Score.
  
## **Level**
  
Level pada game ini terbagi menjadi 2 kategori, yakni Level bawaan serta Level Custom yang dibuat sendiri oleh pengguna. Level Custom memanfaatkan fitur I/O Java.  

## **Main Menu**
   
Main menu berfungsi sebagai 'landing page' ketika pemain pertama kali memulai aplikasi.
     
## **Level Selector**

Pemain dapat memilih level yang tersedia dalam game, baik itu level bawaan ataupun level custom.
       
## **Credit Page**
    
Konten yang ada pada Credits adalah keterlibatan pihak-pihak yang telah memebrikan  kontribusi pada project game ini.

## **Power Up**
   
Saat permainan berlangsung, pemain dapat menjumpai *power up* yang akan memberikan pemain beberapa keuntungan seperti menambah jumlah bola yang dapat digunakan untuk menghancurkan blok-blok yang ada.
   
## **Game Progression**

Pada saat petama kali bermain, pemain hanya disediakan satu level saja, kemudian seiring berjalannya progres yang dilakukan pemain akan lebih banyak level yang dapat dimainkan. Progres yang telah dicapai oleh pemain akan disimpan oleh sistem.  

***
# **Class**
   
Class yang ada pada Project ini dibagi berdasarkan kategori umum Class tersebut. Class tersebut berada pada package masing-masing kategori.
___
## **Files**
Pada package ini class yang terdapat mengurusi masalah I/O yang dilakukan oleh game.

   ###  **Files.java**
   Class ini mengatasi masalah I/O utama yang dibutuhkan oleh game, seperti loading level custom, loading High Score, dan pengecekan file.
      
   ### **Level.java**
   Class ini berfungsi untuk menyimpan level bawaan yang telah disediakan oleh game dalam bentuk array 2 dimensi.
___   
## **Handler**
Pada package ini class yang ada bertanggung jawab atas fungsi kontrol pada game. Kontrol keyboard dan kontrol mouse ada pada package ini.
   
   ### **KeyHandler.java**
   Class ini berisikan fungsi fungsi yang dipakai program sebagai input keyboard.
      
   ### **mouseHandler.java**
   Class ini melakukan handling untuk input mouse yang diberikan.
___      
## **Main**
Package ini berisikan class-class utama yang digunakan oleh game.
   
   ### **Controller.java**
   Class ini adalah *backbone* dari program ini. Class Controller berfungsi untuk mengatur dan mengubungkan setiap bagian utama pada game. Sebagai contoh saat tombol **Play** pada screen main menu dipencet, maka class ini akan menghubungkan event OnClick Mouse tersebut ke level select screen, sehingga main menu mempunyai transisi ke level select.
   
   ### **CreateLevel.java**
   Class bagian ini berfungsi untuk menyediakan mode *sandbox* untuk pemain yang ingin membuat level mereka sendiri. Level kemudian akan disimpan pada sebuah file CustomLevel yang menyimpan data tersebut dalam bentuk array dua dimensi.
    
   ### **Credits.java**
   Class ini akan menampilkan pihak pihak yang telah terlibat dalam memberikan kontribusi dalam game ini. Terdapat link source code sebagai penghargaan kepada pembuat asli proyek game ini.

   ### **Frame.java**
   Class ini adalah class yang memiliki method Main yang akan dijalankan pertama kali saat program dinyalakan.

   ### **Game..java**
   Class ini akan menciptakan level sesuai dengan spesifikasi yang telah ditentukan setelah pemain memilih level mana yang akan dimainkan.

   ### **GameOver.java**
   Class ini berfungsi untuk memberikan pernyataan kalah kepada pemain serta memberikan STATE.GameOver yang akan diproses oleh class Controller.

   ### **HighScore.java**
   Class ini menampilkan skor tertinggi untuk setiap level yang ada. Data skor disimpan pada file Score.txt.

   ### **ImageLoader.java**
   Class ini bertugas untuk melakukan *loading* untuk setiap asset sprite dan gambar yang dibutuhkan oleh game.

   ### **MainMenu.java**
   Class ini berfungsi sebagai *landing page* atau tampilan utama yang akan dijumpai oleh pemain.

   ### **PickLevel.java**
   Class ini akan menampilkan pilihan level yang telah disediakan untuk dimainkan.

   ### **PickUserLevel.java**
   Class ini akan menampilkan pilihan level yang dapat diubah dan dimainkan oleh pemain.
    
   ### **WinScreen.java**
   Class ini berfungsi untuk memberikan pernyataan menang kepada pemain serta memberikan STATE.GameWin yang akan diproses oleh class Controller.
___
## **Parts**
Package ini berisikan class-class yang berfungsi untuk mengatur game object seperti paddle dan ball.

   ### **Ball.java**
   Class ini memiliki fungsi yang digunakan untuk memproses *physics* objek Ball pada saat game berjalan.

   ### **Brick.java**
   Class ini memiliki fungsi yang digunakan untuk memproses *physics* objek Brick pada saat game berjalan.

   ### **Paddle.java**
   Class ini memiliki fungsi yang digunakan untuk memproses *physics* objek Paddle pada saat game berjalan.

   ### **Powerup.java**
   Class ini memiliki fungsi yang digunakan untuk memproses  power up yang ada pada sat game berjalan.   

*** 
# **Modifikasi**
Berikut adalah perubahan signifikan yang telah terjadi pada proyek.

## **Asset Sprite**
### **Old Sprites**

   ![](/Images/BrickBreakerForeground.png)

   ![](/Images/Ball.png)
   
   ![](/Images/FireBall.png)

   ![](/Images/Bricks.png)

   ![](/Images/Paddle.png)

   ![](/Images/PUFireball.png)

   ![](/Images/PUGrowth.png)

   ![](/Images/PUMulitBall.png)

### **New Sprites**
   
   ![](/Brick%20Breaker/images/BrickBreakerForeground.png)

   ![](/Brick%20Breaker/images/Ball.png)

   ![](/Brick%20Breaker/images/FireBall.png)

   ![](/Brick%20Breaker/images/Bricks.png)

   ![](/Brick%20Breaker/images/Paddle.png)

   ![](/Brick%20Breaker/images/PUFireball.png)

   ![](/Brick%20Breaker/images/PUGrowth.png)

   ![](/Brick%20Breaker/images/PUMulitBall.png)
___

## **Class**
   
### **Credits.java**
   Class ini adalah class baru yang ditambahkan pada proyek game ini. Fungsinya adalah menampilkan pihak yang memberikan kontribusi pada proyek game ini.

### **HighScore.java**
   Class ini adalah class baru yang ditambahkan pada proyek game ini. Fungsinya adalah menampilkan skor tertinggi untuk setiap level yang ada.

### **Controller.java**
   Class ini mengalami penambahan beberapa state untuk menghubungkan class HighScore dan Credits sehingga dapat diakses dari class MainMenu.

### **File.class**
   Class ini mendapatkan beberapa fungsi baru yang digunakan class HighScore untuk masalah I/O nya. Fungsi tersebut adalah fungsi read, write, dan create.

### **MainMenu.java**
   Class ini mengalami penyesuaian sehingga dapat menampilkan tombol Credits dan Highscore.

   **Before**

   ![](/images/Old.PNG)

   **After**
   
   ![](/images/New.PNG)

***     
# **Dokumentasi**
## **Class Diagram**
![Class Diagram](/images/CDiag.PNG)

## **Footage Gameplay**
![Gameplay 1](GP1.pNG)
  
![Gameplay 2](GP2.PNG)

![Gameplay 3](GP3.pNG)

## **Video**

[Link Video](http://www.youtube.com)
  
=======

# **Referensi**
  
[Source Code](http://www.neehaw.com)

