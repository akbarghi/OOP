//Human.java

public abstract Hidup{
  protected String nama;
  protected Point posisi;
  
  //CONSTRUCTOR
  public Hidup(Point posisi){
    this.posisi = posisi;
  }
  public Hidup(String nama, Point posisi){
    this.nama = nama;
    this.posisi = posisi;
  }
  
  //GETTER
  public String getNama(){
    return this.nama;
  }
  public Point getPosisi(){
    return this.posisi;
  }
  
  //SETTER
  public void setNama(String nama){
    this.nama = nama;
  }
  public void setPosisi(Point posisi){
    this.posisi = posisi;
  }

  public abstract void search();
  public abstract void moveTo();
}
