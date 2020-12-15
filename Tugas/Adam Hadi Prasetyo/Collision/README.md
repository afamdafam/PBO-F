# Collision Detection

Program ini adalah contoh penggunaan Collision Detection, salah satu physics yang sering digunakan dalam game.
pada program ini contoh yang akan digunakan adalah Alien Shooter.

  
Untuk contoh kali ini akan digunakan dua tipe collision, ketika proyektil misil mengenai target, dan ketika pesawat menabrak target.
  
Class yang terdapat di program sebagai berikut :

## Sprite.java
  
kode yang terdapat pada class ini akan diturunkan ke class SpaceShip, Alien, dan Missile untuk _rendering_ sprite, serta memberikan hitbox yang akan digunakan dalam deteksi collision.
  
## SpaceShip.java
kode pada class ini merepresentasikan pesawat yang digerakkan oleh pemain. 
  
   `private List<Missile> missiles;`

semua misil yang ditembakkan pesawat akan disimpan pada list, 
  
`public void fire() {
    missiles.add(new Missile(x + width, y + height / 2));
}`
  
misil baru yang ditembakkan pesawat akan berada pada list Missile, hingga misil yang ada di list menabrak target atau keluar dari layar.
  
## Board.java
  
Class ini digunakan untuk membuat board yang akan dipakai sebagai arena game. Objek pesawat dan target akan berada pada board ini.
  
`private final int[][] pos = {
    {2380, 29}, {2500, 59}, {1380, 89},
    {780, 109}, {580, 139}, {680, 239},
    {790, 259}, {760, 50}, {790, 150},
    {980, 209}, {560, 45}, {510, 70},
    {930, 159}, {590, 80}, {530, 60},
    {940, 59}, {990, 30}, {920, 200},
    {900, 259}, {660, 50}, {540, 90},
    {810, 220}, {860, 20}, {740, 180},
    {820, 128}, {490, 170}, {700, 30}
};`
  
kode ini akan memberikan koordinat tempat awal munculnya target.

`public void initAliens() {
    
    aliens = new ArrayList<>();

    for (int[] p : pos) {
        aliens.add(new Alien(p[0], p[1]));
    }
}`

kode di atas akan digunakan untuk menginisialisasi objek target serta memberinya koordinat tempat muncul.
  
## Alien.java
  
Class Alien ini adalah class target yang akan ditembak pemain, untuk kode pergerakan target sebagai berikut :
  
`public void move() {

    if (x < 0) {
        x = INITIAL_X;
    }

    x -= 1;
}`
  
Target ini kemudian akan kembali ke bagian kanan layar setelah melebihi batas layar sebelah kiri.
  
## Missile.java
  
Class misil ini akan bergerak ke satu arah saja, kemudian akan menghilang setelah mencapai batas layar sebelah kanan. berikut adalah kode pergerakan misil : 
  
`public void move() {

    if (x < 0) {
        x = INITIAL_X;
    }

    x -= 1;
}`

  
## CollisionEx.java
  
Class ini adalah class utama yang digunakan untuk menjalankan program.

# Dokumentasi


  ![](https://cdn.discordapp.com/attachments/428559198171955200/788259825502126110/Diag.PNG)
  ![](https://cdn.discordapp.com/attachments/428559198171955200/788259819185897472/Shoot.PNG)
  
