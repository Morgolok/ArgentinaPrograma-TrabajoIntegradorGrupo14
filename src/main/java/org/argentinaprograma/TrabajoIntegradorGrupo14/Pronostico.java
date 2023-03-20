package org.argentinaprograma.TrabajoIntegradorGrupo14;

import com.opencsv.bean.CsvBindByPosition;

public class Pronostico {
	
	@CsvBindByPosition(position = 0)
    private String equipoA;
	@CsvBindByPosition(position = 1)
    private String ganaEquipoA;
    @CsvBindByPosition(position = 2)
    private String empate;
    @CsvBindByPosition(position = 3)
    private String ganaEquipoB;
    @CsvBindByPosition(position = 4)
    private String equipoB;
	
    public String getEquipoA() {
		return equipoA;
	}
	public void setEquipoA(String equipoA) {
		this.equipoA = equipoA;
	}
	public String getGanaEquipoA() {
		return ganaEquipoA;
	}
	public void setGanaEquipoA(String ganaEquipoA) {
		this.ganaEquipoA = ganaEquipoA;
	}
	public String getEmpate() {
		return empate;
	}
	public void setEmpate(String empate) {
		this.empate = empate;
	}
	public String getGanaEquipoB() {
		return ganaEquipoB;
	}
	public void setGanaEquipoB(String ganaEquipoB) {
		this.ganaEquipoB = ganaEquipoB;
	}
	public String getEquipoB() {
		return equipoB;
	}
	public void setEquipoB(String equipoB) {
		this.equipoB = equipoB;
	}

   
}
