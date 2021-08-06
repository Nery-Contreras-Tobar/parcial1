/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import parcial.ClsGastos;
import parcial.ClsProducto;
import parcial.ClsProrrateo;
import java.util.Scanner;

/**
 *
 * @author TF039
 */
public class ClsPrincipal {
    private static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingresa la cantidad de los productos");
        int num = obj.nextInt();
        obj.nextLine();
        ClsProrrateo prorrateo = new ClsProrrateo(num);
        ClsGastos gastos = new ClsGastos();
        for (int i = 0; i < num; i++) {
            ClsProducto producto = new ClsProducto();
            producto.recolectarInformacion();
            prorrateo.agregaVendedorMatriz(producto);
        }
        
        gastos.ObtenerInformacion();
        prorrateo.agregaGastos(gastos);
        ClsProrrateo.ejecutar();
    }
}


