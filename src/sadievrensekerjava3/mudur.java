package sadievrensekerjava3;

public class mudur extends calisan {
int zam;
int prim;

    public mudur(){
        //System.out.println("Mudur objesi olusturuldu.");
    }
    
    public mudur(int yas, int boy, int kilo, int maas, int zam){
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
        prim = maas * 2;
        return prim;
    }
    
}
