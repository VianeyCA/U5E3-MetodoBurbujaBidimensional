package metodoburbujaarreglobidiu5e3;
public class MetodoBurbujaArregloBidiU5E3 {
     public static void main(String[] args) {
         // TODO code application logic here
         MetodoBurbujaArregloBidiU5E3 matriz=new MetodoBurbujaArregloBidiU5E3();
         int A[][]={
             {5,4,2},
             {9,2,4},
             {4,6,7}
         };
         System.out.println("------------ Arreglo ------------");
         matriz.mostrar(A);
         int V[]= matriz.arreglo(A);
         matriz.metodoBurbuja(V);
         for (int cont=0, i = 0; i < A.length; i++) {
             for (int j = 0; j < A[i].length; j++) {
                 A[i][j]=V[cont];
                 cont++;
             }
         }
         System.out.println("---------Arreglo ordenado---------");
         matriz.mostrar(A);
     }
     public int [] arreglo(int A[][]){
         int V[]=new int [A.length*A[0].length];
         for (int cont = 0, i = 0; i <A.length; i++) {
             for (int j = 0; j < A[i].length; j++) {
                 V[cont]=A[i][j];
                 cont++;
             }
         }
         return V;
     }
     
     public void metodoBurbuja(int A[]){
         for (int i = 0; i < A.length-1; i++) {
             for (int j = 0; j < A.length-1; j++) {
                 if(A[j]>A[j+1]){
                     int contador;
                     contador = A[j];
                     A[j]=A[j+1];
                     A[j+1] = contador;                             
                 }
             }
         }
     }
     
     public void mostrar(int A[][]){
         for (int i = 0; i < A.length; i++) {
             for (int j = 0; j < A[i].length; j++) {
                 System.out.print(" "+ A[i][j]);
             }
             System.out.println("");
         }
     }  
}

