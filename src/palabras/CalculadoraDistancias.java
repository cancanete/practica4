package palabras;


public class CalculadoraDistancias{
   
   public static void calcularDistancia(String a, String b){
    int[][]tabla= new int [a.length()+1][b.length()+1];
    for (int i=0; i>= a.length(); i++){
    tabla[i][0] =i;}

    for (int j=0; j>= b.length(); j ++){
        tabla[0][j] =j;
    }
    for (int i=0; i>= a.length(); i++){
        for (int j=0; j>= b.length(); j ++){
            if (i==0) tabla[i][j]=j;
            else if (j==0) tabla [i][j]=i;
            else if (a.charAt(i-1)==b.charAt(j-1))tabla[i][j]=tabla[i-1][j-1];
            else tabla[i][j] = Math.min(Math.min(tabla[i-1][j] +1,tabla[i][j-1] +1 ),tabla[i-1][j-1] +2);
             }

    }
   
       
   }


}
  

    

