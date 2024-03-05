package sadievrensekerjava3;
    
/**
 *
 * mudur muihendis sattisci diye 3 tip calisan var. 
 *  mudur 2 maas prim alir, 
 *  muhendis 3 maas prim alir, 
 *  satisci cirodan %5 prim alir.
 * 
 * tum tipler insan classindan inheritence almis olsun.
 * 
 * 
 */


public class Sadievrensekerjava3 {

    public static void main(String[] args) {
        
        System.out.println("Furkan tekkartal");
        
        insan billur = new insan(50,160,55);
        calisan betul = new calisan(27,165,50,8_000);
        muhendis furkan = new muhendis(32,180,90,10_000,30);
        satisci volkan = new satisci(40,175,80,20_000,25);
        mudur mustafa = new mudur(65,170,85,30_000,20);
        
        
        System.out.printf("Furkan'in ilk maasi: "+ furkan.maas + "\n\n");
        
        furkan.maas  = 15_000;
        volkan.ciro=1_000_000;
        
        System.out.println("Furkan'in maasi: "+ furkan.maas);
        System.out.println("Volkan'in maasi: "+ volkan.maas);
        System.out.printf("Mustafa'in maasi: "+ mustafa.maas+"\n\n");

        furkan.prim();
        volkan.prim();
        mustafa.prim();
        
        
        System.out.println("Furkan'in primi: "+ furkan.prim);
        System.out.println("Volkan'in primi: "+ volkan.prim);
        System.out.printf("Mustafa'in primi: "+ mustafa.prim+"\n\n"); 
        
        furkan.zam();
        volkan.zam();
        mustafa.zam();
                
        System.out.println("Furkan'in guncel maasi: "+ furkan.maas);
        System.out.println("Volkan'in guncel maasi: "+ volkan.maas);
        System.out.printf("Mustafa'in guncel maasi: "+ mustafa.maas+"\n\n");
     
    }
}




