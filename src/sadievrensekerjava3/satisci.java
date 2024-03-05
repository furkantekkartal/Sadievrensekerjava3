package sadievrensekerjava3;

public class satisci extends calisan {
    int zam;
    int prim;
    int ciro;
    public satisci(){
        //System.out.println("Satisci objesi olusturuldu.");
    }
    
    public satisci(int yas, int boy, int kilo, int maas, int zam){
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
        prim = (int) (ciro * 0.05);
        return prim;
    }
}

