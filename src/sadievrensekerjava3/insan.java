package sadievrensekerjava3;

public class insan {
    
    int yas;
    int boy;
    int kilo;

    public insan(){
        //System.out.println("Insan objesi olusturuldu.");
    }
    
    public insan(int yas, int boy, int kilo){
        this();
        this.yas= yas;
        this.boy= boy;
        this.kilo=kilo;
    }
    
    void yemek(){
        kilo++;                
    }
}