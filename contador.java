System.out.println("\n\n--------------------------");

   int[] oNumero = new int[10];
   int[] numeroPar = new int[5];
   int[] numeroImpar = new int [5];

   int a = 0;
   int b = 0;

   for(int i = 0; i<10; ++i){
     oNumero[i]= i + 1;
   }
   for(int j = 0; j<10; j++){

     if(oNumero[j] % 2 == 0){
       numeroPar[a] = oNumero[j];
       a = a + 1;
     }
     else{
       numeroImpar[b] = oNumero[j];
       b = b + 1;
     }
   }
   for(int h=0;h < 5; h++){
     System.out.println("par: " + numeroPar[h]);
   }
   for(int m=0;m < 5; m++){
     System.out.println("impar: " + numeroImpar[m]);}
}