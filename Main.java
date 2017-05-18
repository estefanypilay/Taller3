
package fundamen;


public class Main {

    public static void main(String[] args) {

       CuentaBancaria cta1=new CuentaAhorro();
		CuentaBancaria cta2=new CuentaAhorro();
		//CuentaAhorro ct=new CuentaBancaria();
		CuentaAhorro cta3=new CuentaAhorro();
		
		cta1.setNombre("cta1");
		cta2.setNombre("cta2");
		cta3.setNombre("cta3");
		
		cta1.setSaldo(10);
                cta1.deposito(300);
                imprimirSaldo(cta1);
		cta2.setSaldo(20);
                cta2.deposito(300);
                imprimirSaldo(cta2);
		cta3.setSaldo(30);
                cta3.deposito(150);
                imprimirSaldo(cta3);

		// valores a la clase cuentaAhorro
                
		CuentaCorriente cta4 =new CuentaCorriente();
		cta4.setNombre("cta4");
		cta4.setSaldo(10);
		cta4.deposito(100);
		imprimirSaldo(cta4);
                
               
	}
	
	public static void imprimirSaldo(CuentaBancaria cta){
		System.out.println("Cuenta: " + cta.getNombre() + ", Saldo: " + cta.getSaldo());
	}
    }
    

