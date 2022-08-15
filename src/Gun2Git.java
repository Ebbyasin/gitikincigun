public class Gun2Git {

    public static void main(String[] args) {
        /*
        1-git init-->local repo olusturmak icin yani .git ile klasorumuzun icindeki dosyalari
        iliskilendirmek icin kullanilir.
        2-git add . --> working space'den(yani yerel) dosyalarimi staging area'ya yani commitlemek icin
        beklenen yere gonderir.
        3-git status -->working space 'deki ve staging area daki durumu gosterir.
        3-git commit -m "mesaj" -->Staging area'dan store a dosyalarimi gondermek icin(commit yani versiyon yani
        surum olusturmus olurum.)
        4-git push-->uzak repo'ya (yani remote - Github) a gondermek icin kullandigimiz kod.
        yalniz git push komutunu direk kullanmak istersek 1 kez
              --->   git remote add origin -github da olusturdugumuz repositonun adresi-//yani remote ye uzaga
                 orjinal olarak su adresi ekle demek.git commit ten sonra ilk kez bu yapilir
              -->   git push -u origin master
        NOT:Ustte en son yazdigimiz bu iki komutu tek seferde kullandiktan sonra ikinci commit'lerim icin
        sadece git push kullaniriz.

        dunkuler
        --------Komutlar
         git --version
         git config --global user.email "email_adresiniz"
         git config --global user.name "isminiz"
         git config --global -l --> Ayarları listeler
         git init --> git ile ilişkilendirir
         git status --> Working Space ve Staged deki değişiklikleri gösterir
         git add . --> Working'den staging area'ya gönderir
         git status
         git diff --> Working space deki değişikliği gösterir
         git diff --staged --> Staging Area daki değişiklikleri gösterir
         git commit -m "first commit"
         git show "hashcode" --> Versiyondaki değişiklikleri gösterir
         git log --oneline
         git remote add origin https://github.com/techproed2020/Git_...
         git push -u origin master
         NOT: git log --online--> Commitlerimdeki yani versiyonlarimdaki durumu gosterir.
         Not:Github ogrendim.
         */

        System.out.println("github ı da ogrendim");




    }
}
