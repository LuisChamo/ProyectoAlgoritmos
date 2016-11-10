import java.util.Scanner;

public class ProyectoCalculadora {

public static void main(String[] args )  {
Scanner entrada=new Scanner(System.in);
String almacenamiento[]= new String [7];
double valor, valor2, valor3;
int dato4, calculadora, borrar;
       
	do {
	System.out.println("Bienvenidos a mi Proyecto Calculadora");        
	System.out.println("1: Suma de dos numeros");
	System.out.println("2: Resta de dos numeros");
	System.out.println("3: Multiplicacion de dos numeros");
	System.out.println("4: Division de dos numeros");
	System.out.println("5: Ver bitacora");
	System.out.println("6: Borrar bitacora");
	System.out.println("7: Salir");
	System.out.println("\nSeleccione la opcion deseada");
	calculadora=entrada.nextInt();

	switch(calculadora){

	case 1:
	   	System.out.println("\nUsted selecciono la opcion 1. Suma de dos numeros ");
		System.out.println("Ingrese el primer numero ");
		valor=entrada.nextDouble();
		System.out.println("Ingrese el segundo numero ");
		valor2=entrada.nextDouble();
		valor3=valor+valor2;
		System.out.println("El resultado es " + valor3);
		System.out.println("\n");
		if(almacenamiento[0]==null){
		almacenamiento[0]=(valor + " + " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[1]==null){
		almacenamiento[1]=(valor + " + " + valor2 + " = " + valor3);
		}
		else {
		if(almacenamiento[2]==null){
		almacenamiento[2]=(valor + " + " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[3]==null){
		almacenamiento[3]=(valor + " + " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[4]==null){
		almacenamiento[4]=(valor + " + " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[5]==null){
		almacenamiento[5]=(valor + " + " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[6]==null){
		almacenamiento[6]=(valor + " + " + valor2 + " = " + valor3);
		}
		}
		}
		}
		}
		}
		}
	break;


	case 2:
		System.out.println("Usted selecciono la opcion 2: Resta de dos numeros ");
		System.out.println("Ingrese el primer numero: ");
		valor=entrada.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		valor2=entrada.nextDouble();
		valor3=valor-valor2;
		System.out.println("El resultado es: " +  valor3);
		System.out.println("\n");
		if(almacenamiento[0]==null){
		almacenamiento[0]=(valor + " - " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[1]==null){
		almacenamiento[1]=(valor + " - " + valor2 + " = " + valor3);
		}
		else {
		if(almacenamiento[2]==null){
		almacenamiento[2]=(valor + " - " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[3]==null){
		almacenamiento[3]=(valor + " - " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[4]==null){
		almacenamiento[4]=(valor + " - " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[5]==null){
		almacenamiento[5]=(valor + " + " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[6]==null){
		almacenamiento[6]=(valor + " + " + valor2 + " = " + valor3);
		}
		}
		}
		}
		}
		}
		}
	break;


	case 3:
		System.out.println("Usted selecciono la opcion 3: Mutiplicacion de dos numeros ");
		System.out.println("Ingrese el primer numero: ");
		valor=entrada.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		valor2=entrada.nextDouble();
		valor3=valor*valor2;
		System.out.println("El resultado es: " + valor3);
		System.out.println("\n");
		if(almacenamiento[0]==null){
		almacenamiento[0]=(valor + " x " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[1]==null){
		almacenamiento[1]=(valor + " x " + valor2 + " = " + valor3);
		}
		else {
		if(almacenamiento[2]==null){
		almacenamiento[2]=(valor + " x " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[3]==null){
		almacenamiento[3]=(valor + " x " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[4]==null){
		almacenamiento[4]=(valor + " x " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[5]==null){
		almacenamiento[5]=(valor + " + " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[6]==null){
		almacenamiento[6]=(valor + " + " + valor2 + " = " + valor3);
		}
		}
		}
		}
		}
		}
		}
	break;


	case 4:
		System.out.println("Usted selecciono la opcion 4: Division de dos numeros ");
		System.out.println("Ingrese el primer numero: ");
		valor=entrada.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		valor2=entrada.nextDouble();
		if (valor2==0){
		System.out.println("Error: La operacion de Dividir entre 0 ¡NO ESTA PERMITIDA!");
		System.out.println("\n");
		if(almacenamiento[0]==null){
		almacenamiento[0]=(valor + " / " + valor2 + " = " + "Error");
		}
		else{
		if(almacenamiento[1]==null){
		almacenamiento[1]=(valor + " / " + valor2 + " = " + "Error");
		}
		else {
		if(almacenamiento[2]==null){
		almacenamiento[2]=(valor + " / " + valor2 + " = " + "Error");
		}
		else{
		if(almacenamiento[3]==null){
		almacenamiento[3]=(valor + " / " + valor2 + " = " + "Error");
		}
		else{
		if(almacenamiento[4]==null){
		almacenamiento[4]=(valor + " / " + valor2 + " = " + "Error");
		}
		else{
		if(almacenamiento[5]==null){
		almacenamiento[5]=(valor + " + " + valor2 + " = " + "Error");
		}
		else{
		if(almacenamiento[6]==null){
		almacenamiento[6]=(valor + " + " + valor2 + " = " + "Error");
		}
		}
		}
		}
		}
		}
		}
		}
		else {
		valor3=valor/valor2;
		System.out.println("El resultado es: " +  valor3);
		System.out.println("\n");    
		if(almacenamiento[0]==null){
		almacenamiento[0]=(valor + " / " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[1]==null){
		almacenamiento[1]=(valor + " / " + valor2 + " = " + valor3);
		}
		else {
		if(almacenamiento[2]==null){
		almacenamiento[2]=(valor + " / " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[3]==null){
		almacenamiento[3]=(valor + " / " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[4]==null){
		almacenamiento[4]=(valor + " / " + valor2 + " = " + valor3);
		}
		else{
		if(almacenamiento[5]==null){
		almacenamiento[5]=(valor + " + " + valor2 + " = " + valor3);
		}
		else{	
		if(almacenamiento[6]==null){
		almacenamiento[6]=(valor + " + " + valor2 + " = " + valor3);
		}
		}
		}
		}
		}
		}
		}
		}
	break;
		
		
	case 5:
		System.out.println("Usted selecciono la opcion 5: Ver bitacora ");
		for (dato4=0;dato4<=6;dato4++){
		if(almacenamiento[dato4]==null){
		System.out.println("");
		}
		else {
		System.out.println(almacenamiento[dato4]);
		}
		} 
		System.out.println("\n");
		break;
		
	case 6:
	System.out.println("\nUsted a elegido la opcion 6. Borrar Bitacora ");
	System.out.println("\nEsta seguro de borrar la Bitacora");
	System.out.println("1: Si");
	System.out.println("2: No");
	System.out.println("\nIngrese un numero:");
	borrar=entrada.nextInt();
	if (borrar==1){
	for (dato4=0;dato4<=5;dato4++){
	almacenamiento[dato4]=null;
	}
	System.out.println("\nEspere... Su Bitacora esta siendo borrada.");
	System.out.println("\nBitacora Borrada\n ");
	}
	else{
	System.out.println("\nSu bitacora no fue Borrada.\n");
	}
	break;
	default:
	if(calculadora!=7){
	System.out.println("Numero fuera de rango establecido");
	}
	}
	}

	while(calculadora!=7);

}
}