public class Yigin {
    int kapasite=100;
    int dizi[];//Yığıt elemanları
    int p;// eleman sayısı
    int max=0;
    
    
    public Yigin(){//yapıcı yordam
        dizi=new int[kapasite];
        p=0;
        max=0;
    }
    boolean bosmu(){
        if(p==0)
            return true;
        else
            return false;
    }
    boolean dolumu(){
        if(p==dizi.length-1)
            return true;
        else
            return false;
    }
    int pop(){
        if(bosmu())//true olursa dizi boş
            return -1;
        else{
            p--;//çıkardıktan sonra indis 1 azaltılır.
            return dizi[p];//elemanı geri döndürür
        }
    }
    void push(int veri){
        System.out.println("p nin değeri: "+p);
        if(!dolumu()){
            //System.out.println("fdddddff");
            dizi[p]=veri;//
            p++;
            System.out.println("p nin değeri: "+p);
        }
    }
    void diziYazdir(){
            System.out.println(dizi.length-1);
            for(int i=dizi.length-1;i>=0;i--)
                System.out.print(dizi[i]+", ");
    }
}
