public class Heroes {

    private String name;
    private int age;
    private int height;
  
    private int health = 10;
  
    public void setProfile(String name, int age, int height) {
      this.name = name;
      this.age = age;
      this.height = height;
    }
  
    public void profile() {
      System.out.println("========= Profile =========");    
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      System.out.println("Height: " + this.height);
      System.out.println("Health: " + this.health);
      System.out.println("===========================");
    }
  
    private void checkHealth() {
      if(this.health <= 0) {
        System.out.println("Anda telah mati " + this.name);
      }
    }
  
    public void jalan() {
      checkHealth();
      System.out.println(this.name + " sedang berjalan...");
      this.health -= 1;
    }
  
    /* Buat method untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang method checkHealth() di dalam method yang akan dibuat
     - Tampilkan pesan kegiatan yang sedang dilakukan, misal, jika lari: " sedang berlari..."
     - ubah health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1
    */
  
    public void lari() {
        checkHealth();
      System.out.println(this.name + " sedang berlari...");
      this.health -= 2;
      
    }

    public void makan() {
        checkHealth();
      System.out.println(this.name + " sedang makan...");
      this.health += 2;
      
    }

    public void minum() {
        checkHealth();
      System.out.println(this.name + " sedang minum...");
      this.health += 2;
      
    }

    public void lompat() {
        checkHealth();
      System.out.println(this.name + " sedang lompat...");
      this.health -= 2;
      
    }

    public void duduk() {
        checkHealth();
      System.out.println(this.name + " sedang bersantai...");
      this.health += 1;
      
    } 
    
  }