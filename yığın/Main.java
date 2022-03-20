import java.util.Scanner;//klavyeden veri almak için 
public class Main {
    public static void main(String[] args) {
        List ogrNo= new List();
        int veri,secim;
        Node e;
        Node etail;
        do {
            System.out.println(" 1-15 arası komutu giriniz:");
			Scanner oku = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
			secim = oku.nextInt();

            switch(secim){
                case 1:
                    System.out.println("Liste Başına eknecek öğrenci numarası giriniz= ");
                    Scanner deger = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                    veri = deger.nextInt();// veri alınır
                    e = new Node(veri);//node çevrilir
				    ogrNo.listHeadAdd(e);//liste eklenir
                    ogrNo.listPrint();//yazdırma
                    break;

                case 2:
                    System.out.println("Liste Sonuna eknecek öğrenci numarası giriniz= ");
                    Scanner deger2 = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                    veri = deger2.nextInt();// veri alınır
                    etail = new Node(veri);//node çevrilir
                    ogrNo.listTailAdd(etail);//liste eklenir
                    ogrNo.listPrint();//yazdırma
                    break;
                case 3:
                    System.out.println("Listede aranacak elemanı giriniz= ");
                    Scanner eleman = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                    veri = eleman.nextInt();// veri alınır
                    int sonuc=ogrNo.listSearch(veri);
                    if(sonuc==-1)
                        System.out.println("Listede "+veri+" bulunamadı!");
                    else
                        System.out.println("Listede aranan"+veri+" sayısı "+sonuc+". sıradadır.");
                    break;                    
                case 4:
                    ogrNo.listHeadDelete();//liste başında bir eleman sil
                    ogrNo.listPrint();//yazdırma
                    break;
                case 5:
                    ogrNo.listTailDelete();//liste sonunda bir eleman sil
                    ogrNo.listPrint();//yazdırma
                    break;
                case 6:
                    ogrNo.listeSondanSil();//liste sonunda bir eleman sil
                    ogrNo.listPrint();//yazdırma
                    break;
                case 7:
                    System.out.println("silinecek elemanı giriniz= ");
                    Scanner sil = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                    veri = sil.nextInt();// veri alınır
                    int sonuc2=ogrNo.ortadanSil(veri);
                    if(sonuc2==-1)
                        System.out.println("Listede "+veri+" bulunamadı!");
                    else
                        System.out.println("Listede aranan "+sonuc2+". silindi.");
                    ogrNo.listPrint();//yazdırma
                    break;
                    
                case 8:
                    System.out.println("Eklenecek elemanı giriniz= ");
                    Scanner ekle = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                    veri = ekle.nextInt();// veri alınır
                    e = new Node(veri);//node çevrilir
                    
                    System.out.println(veri+" sayısı kaçıncı sıraya eklensin= ");
                    Scanner sira = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                    int siraNo = sira.nextInt();// veri alınır
                    
                    ogrNo.ortayaEkle(e,siraNo);
                    ogrNo.listPrint();//yazdırma
                    break;
//--------------------stack--------------------------------                
                case 9:
                    Yigin y= new Yigin();
                    System.out.println("Diziye Eklenecek elemanı giriniz= ");
                    Scanner sayi = new Scanner(System.in);//kullanıcıdan değer almak için kütüphane çağrılır
                    veri = sayi.nextInt();// veri alınır
                    y.push(veri);//diziye ekle
                    //System.out.println("fgfg");
                    y.diziYazdir();//diziyi yazdır.

                    //System.out.println("ssss");
                    break;
                default:
				    
				break;
            }
            //oku.close();
        } while (secim!=20);
    }
}