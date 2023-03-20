package org.argentinaprograma.TrabajoIntegradorGrupo14;

import com.opencsv.bean.CsvBindByPosition;

public class resultados {
	
	@CsvBindByPosition(position = 0)
    private String equipoA;
	@CsvBindByPosition(position = 1)
    private Integer golesEquipoA;
    @CsvBindByPosition(position = 2)
    private Integer golesEquipoB;
    @CsvBindByPosition(position = 3)
    private String EquipoB;
	
    public String getEquipoA() {
		return equipoA;
	}
	public void setEquipoA(String equipoA) {
		this.equipoA = equipoA;
	}
	public Integer getGolesEquipoA() {
		return golesEquipoA;
	}
	public void setGolesEquipoA(Integer golesEquipoA) {
		this.golesEquipoA = golesEquipoA;
	}
	public Integer getGolesEquipoB() {
		return golesEquipoB;
	}
	public void setGolesEquipoB(Integer golesEquipoB) {
		this.golesEquipoB = golesEquipoB;
	}
	public String getEquipoB() {
		return EquipoB;
	}
	public void setEquipoB(String equipoB) {
		EquipoB = equipoB;
	}
	
       

}
