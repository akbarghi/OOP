//Praktikan.java

public class Praktikan extends Hidup{
  public Praktikan(String nama, Point posisi){
    super(nama, posisi);
  }
  
  public Point search(Char p){
  
  }
  
  public void moveTo(Point orig, Point dest){
    public int dx = orig.x - dest.x;
    public int dy = orig.y - dest.y;
    
    if (dy < 0){
      while (dy < 0){
       this.posisi.setY(this.posisi.getY + 1);
       System.out.println("Asisten " + this.nama + " berjalan ke " + this.posisi.toString() + " [KANAN]");     }
       dy++;
       Thread.sleep(1000);
      }
    } else {
      while (dy > 0){
       this.posisi.setY(this.posisi.getY - 1);
       System.out.println("Asisten " + this.nama + " berjalan ke " + this.posisi.toString() + " [KANAN]");     }
       dy--;
       Thread.sleep(1000);
      }
    }
    
    if (dx < 0){
      while (dx < 0){
       this.posisi.setX(this.posisi.getX + 1);
       System.out.println("Asisten " + this.nama + " berjalan ke " + this.posisi.toString() + " [KANAN]");     }
       dx++;
       Thread.sleep(1000);
      }
    } else {
      while (dx > 0){
       this.posisi.setX(this.posisi.getX - 1);
       System.out.println("Asisten " + this.nama + " berjalan ke " + this.posisi.toString() + " [KANAN]");     }
       dx--;
       Thread.sleep(1000);
      }
    }
  

}
