#include <stdio.h>
#include <stdlib.h>
#include <time.h>
 
int main (){
 
 int i, auxI;
 char auxC;
 
 srand (time(NULL));
 
 printf ("Numeros Aleatorios: ");
 for (i=0; i<10; i++){
  auxI = rand() % 10 + 1; //(Vfinal - Vinicial + 1) + Vinicial
  printf ("%d ", auxI);
 }
 printf ("\n");
 
 printf ("Letras Aleatorias: ");
 for (i=0; i<10; i++){
  auxC = 'A'+ ( rand() % ('Z' - 'A') ); //Genera una letra aleatoria
  printf ("%c ", auxC);
 }
 printf ("\n");
 
 
printf ("\n");
system ("PAUSE");
return 0;  
}

