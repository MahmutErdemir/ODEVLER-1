public class Main {
    public static void main(String[] args) {

       /*String mesaj = "  bügün hava çok güzel  ";
        System.out.println(mesaj);
        System.out.println("eleman sayısı :" +mesaj.length());
        System.out.println("5. eleman :" +mesaj.charAt(4));
        System.out.println(mesaj.concat(" .YAŞASIN! "));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("l"));
        char[] karakterler = new char[10];
        mesaj.getChars(2,4,karakterler,1);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('a'));*/


        String mesaj = "bügün hava çok güzel";
        System.out.println(mesaj);
        System.out.println(mesaj.replace(' ','-')) ;
        System.out.println(mesaj.substring(2,4));
            for (String kelime : mesaj.split(" ")){

                System.out.println(kelime);

            }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim( ));




    }
}