package org.argentinaprograma.TrabajoIntegradorGrupo14;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class App 
{
    public static void main(String[] args){
    	
    	//En las variable args1 y ars2 van a viajar las rutas de los archivos que queremos que abra el programa
    	
    	if(args.length == 0){
            System.out.println("ERROR: No ingresaste ningún archivo como argumento!");
            System.exit(88);
        }
    	
    	
    	List <Pronostico> pro;
    	List <resultados> resul;
        try {
            // En esta primera línea definimos los archivos que van a ingresar
            		
                    pro = new CsvToBeanBuilder(new FileReader("src/main/resources/pronosticos.csv"))
                      // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                    .withType(Pronostico.class)
                    .build()
                    .parse();
                    
                    resul = new CsvToBeanBuilder(new FileReader(args[0]))
                            // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                          .withType(resultados.class)
                          .build()
                          .parse();

              //El resultado de estos métodos nos da dos litas de objetos
                    
                    Integer puntaje=0;       
            for (Pronostico pronostico : pro) {
            	String ganador="";
            	
            	for (resultados resultado : resul){
            		
            		if(resultado.getGolesEquipoA() > resultado.getGolesEquipoB()) {
            			if (pronostico.getGanaEquipoA().equals("x") ) {
          		      
            				puntaje++;
            				ganador = resultado.getEquipoA();
            			}
            		}
            		else if (resultado.getGolesEquipoA() < resultado.getGolesEquipoB()) {
            			
            			if (pronostico.getGanaEquipoB().equals("x") ) {
                		      
            				puntaje++;
            				ganador = resultado.getEquipoB();
            			}
            		}
            		else if(resultado.getGolesEquipoA().equals(resultado.getGolesEquipoB())){
                	
            			if (pronostico.getEmpate().equals("x") ) {
              		      
            			puntaje++;
            			ganador = ("empate");
            			
            			}
                	}
                                                	
                } 	                               
              }  
            System.out.println("El puntaje obtenido es: " + puntaje);                              
         }
         catch (IOException e) {
            e.printStackTrace();
         }
        
 
  } 
}
