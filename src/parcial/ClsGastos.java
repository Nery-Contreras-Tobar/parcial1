/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.Scanner;
/**
 *
 * @author TF039
 */
public class ClsGastos {
    private Scanner teclado = new Scanner(System.in);
    private Double seguro;
    private Double flete;
    private Double aduana;
    private Double acarreo;
    private Double banco;
    

    public void ObtenerInformacion(){
        System.out.println(" Costo de los Seguros: ");
        setSeguro(Double.valueOf(gets().nextLine()));
        System.out.println(" Costo de los Fletes: ");
        setFlete(Double.valueOf(gets().nextLine()));
        System.out.println(" Costo del Pago en Aduanas: ");
        setAduana(Double.valueOf(gets().nextLine()));
        System.out.println("Monto de los Acarreos: ");
        setAcarreo(Double.valueOf(gets().nextLine()));
        System.out.println("Monto de pago a Bancos: "); 
        setBanco(Double.valueOf(gets().nextLine()));
    }

    public Scanner gets() {
        return teclado;
    }

    public void setT(Scanner teclado) {
        this.teclado = teclado;
    }

    public Double getSeguro() {
        return seguro;
    }

    public void setSeguro(Double seguro) {
        this.seguro = seguro;
    }

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public Double getAduana() {
        return aduana;
    }

    public void setAduana(Double aduana) {
        this.aduana = aduana;
    }

    public Double getAcarreo() {
        return acarreo;
    }

    public void setAcarreo(Double acarreo) {
        this.acarreo = acarreo;
    }

    public Double getBanco() {
        return banco;
    }

    public void setBanco(Double banco) {
        this.banco = banco;
    }
}


