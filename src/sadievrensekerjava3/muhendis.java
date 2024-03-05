package sadievrensekerjava3;

public class muhendis extends calisan {
    int zam;
    int prim;
    public muhendis(){
        //System.out.println("Muhendis objesi olusturuldu.");
    }  
    
    public muhendis(int yas, int boy, int kilo, int maas, int zam){
        this();
        this.yas  = yas;
        this.boy  = boy;
        this.kilo = kilo;
        this.maas = maas;
        this.zam = zam;
    }
    
    int zam(){
        maas = maas + maas * zam /100;
        return maas;
    }
    
    int prim(){
        prim = maas * 3;
        return prim;
    }
}
