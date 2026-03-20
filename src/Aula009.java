public class Aula009 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
        }
        System.out.println(i);

//    int i = 0;
//    while (i <= 10){
//        System.out.println(i);
//        i++;
//    }

//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);
    }
}

/*
*   for(inicialização;condição;incremento){
*       codigo...
*   }
*
*   while(condicao){
*       codigo...
*   }
*
*   do {
*       codigo...
*   } while(condicao);
*
*
*   break;
*   continue;
* */
