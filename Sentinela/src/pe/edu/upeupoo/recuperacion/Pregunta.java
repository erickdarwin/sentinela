package pe.edu.upeupoo.recuperacion;

import java.util.Scanner;

public class Pregunta {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int num,i,n=4,cont=2,j=0;  
	5.	    int cad[1000];  
	6.	    printf("ingrese un numero\n");  
	7.	    scanf("%d",&num);  
	8.	    if(num>2){  
	9.	        printf("2 3");  
	10.	        while(cont<num){  
	11.	            i=2;  
	12.	            while(i<=n){  
	13.	                if(i==n){  
	14.	                    cad[j]=n;  
	15.	                    printf(" %d ",cad[j]);  
	16.	                    j++;  
	17.	                    cont=cont+1;  
	18.	                }else{  
	19.	                if(n%i==0){  
	20.	                    i=n;  
	21.	                }  
	22.	                }  
	23.	                i=i+1;  
	24.	            }  
	25.	            n=n+1;  
	26.	        }  
	27.	    }else{  
	28.	    if(num>0){  
	29.	        if(num==1){  
	30.	            System.out.println("es primo 2");  
	31.	        }else{  
	32.	            System.out.println("es primo 2, 3");  
	33.	        }  
	34.	    }else{  
	35.	        System.out.println("ingrese numeros positivos");  
	36.	    }  
	37.	    }  
	38.	   return 0;  
	39.	}  
		
		
	
	
		
	
	
		
	
}

