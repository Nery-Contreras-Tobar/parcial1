/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;
import java.util.Scanner;
/**
 *
 * @author TF039
 */
public class datos {
    //datos a ingresar 
    String producto;// nombre del producto 
    int unidades ;// cantidad de productos
    int valor_unidad ; // valor de producto
    int seguro; 
    int impuesto;
    int comiciones;
    int flete ;
    int acarreo;
    int peso; // por producto
    int valor_total ;
    int gastos_valor ;
    // variables para procedimientos
    int coeficiente ;
    int gastos_al_valor;
    int peso_total ;
    int gastos_peso ;
    int coeficiente_gasto;
    int gastos_peso_producto;
    int costo_por_unidad;
    int precio_final;
    int precio_final_unitario;
    
    public void leeDatos () {
        
        Scanner datosl = new Scanner(System.in); 
        System.out.println("ingresa el nombre del producto");
        producto=datosl.nextLine();
        System.out.println("ingresa el numero de productos");
        unidades=datosl.nextInt();
        System.out.println("ingresa el valor de las unidades");
        valor_unidad=datosl.nextInt();
        System.out.println("ingresa el costo del seguro ");
        seguro=datosl.nextInt();
        System.out.println("ingresa el costo del impuesto");
        impuesto=datosl.nextInt();
        System.out.println("ingresa el costo de las comisiones ");
        comiciones=datosl.nextInt();
        System.out.println("ingresa el costo del flete");
        flete=datosl.nextInt();
        System.out.println("ingresa el costo del acarreo");
        acarreo=datosl.nextInt();
        System.out.println("ingresa el peso del producto");
        peso=datosl.nextInt();
        
        valor_total = unidades*valor_unidad;
        gastos_valor = seguro+impuesto+comiciones;
        coeficiente = gastos_valor/valor_total;
        gastos_al_valor = valor_unidad*coeficiente;
        peso_total = peso*unidades;
        gastos_peso = flete+acarreo;
        coeficiente_gasto = gastos_peso/peso_total;
        gastos_peso_producto = peso*coeficiente_gasto;
        costo_por_unidad = valor_unidad+gastos_al_valor+gastos_peso_producto;
        precio_final = costo_por_unidad*unidades;
        precio_final_unitario = precio_final/unidades;
    }
    public void mostrarDatos(){
        
   
      // System.out.println("el valor total es;"+valor_total );
      // System.out.println("el gasto del valor es;"+gastos_valor );
      // System.out.println("el coeficiente es;"+coeficiente );
      // System.out.println("el gasto por valor es;"+ gastos_al_valor );
      // System.out.println("el peso total es;"+peso_total);
      // System.out.println("el gasto por peso es;"+gastos_peso);
      // System.out.println("el coeficiente por gasto es;"+coeficiente_gasto);
      // System.out.println("el gasto por peso de producto es;"+gastos_peso_producto);
       System.out.println("el precio final es"+precio_final);
       System.out.println("el precio final unitario es"+precio_final_unitario);

    
    }
}
