import java.util.Scanner ;
public class Main {
   public static void main(String[] args) {

    int sayac1 , sayac2=0;

    Scanner Scan=new Scanner(System.in);
// kullanıcının tahmini al
    System.out.println("oyun başlıyor ...");
    System.out.println("0-taş ,1-kağıt ,2-makas";
// random sayı al ve oyuna başla
    for(int i=0 ;i<3;i++){
      int num = (int)(Math.random() * 3);
    System.out.prtintln("senin sıran:")
        tahmin=Scan.nextInt();

if(tahmin==0&&num == 2 || tahmin==1&&num==0 || tahmin==2&&num==1){
  sayac1++;
}
if(num==0&&tahmin == 2 || num==1&&tahmin==0 || num==2&&tahmin==1){
  sayac2++;
}
}
//sonuçları ilan et
  if(sayac1 > sayac2){System.out.println("bilgisayar:"+sayac2+"oyuncu:"+sayac1+"Tebrikler Kazandınız!");}
  if(sayac1 < sayac2){System.out.println("bilgisayar:"+sayac2+"oyuncu:"+sayac1+"Kaybettiniz!");}
  if(sayac1 == sayac2){System.out.println("bilgisayar:"+sayac2+"oyuncu:"+sayac1+"Berabere!");}
  }
}
