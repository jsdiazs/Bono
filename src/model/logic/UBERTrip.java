package model.logic;

public class UBERTrip implements Comparable<UBERTrip>
<<<<<<< HEAD
{			
	//Identificador �nico de la zona de origen de los viajes relacionados
	public int sourceid;
	
	// Identificador �nico de la zona de destino de los viajes relacionados
	public int dstid;
	
	// hora (entera) del d�a del servicio relacionado
	public int hod; 
	
	//tiempo promedio en segundos de los viajes relacionados
	public double mean_travel_time;

	//desviaci�n est�ndar de los viajes relacionados
	public double standard_deviation_travel_time;

	//tiempo promedio geom�trico en segundos de los viajes relacionados
	public double geometric_mean_travel_time;

	//desviaci�n est�ndar geom�trica de los viajes relacionados
	public double geometric_standard_deviation_travel_time;
	

	public UBERTrip(int pSourceid, int pDstid, int pHod, double pMean_travel_time, double pStandard_deviation_travel_time, double pGeometric_mean_travel_time, double pGeometric_standard_deviation_travel_time )
	{
		sourceid = pSourceid;
		dstid = pDstid;
		hod=pHod;
		mean_travel_time = pMean_travel_time;
		standard_deviation_travel_time = pStandard_deviation_travel_time;
		geometric_mean_travel_time = pGeometric_mean_travel_time;
		geometric_standard_deviation_travel_time = pGeometric_standard_deviation_travel_time;
	}
=======
{

	//Identificador �nico de la zona de origen de los viajes relacionados
		public int sourceid;

	// Identificador �nico de la zona de destino de los viajes relacionados
		public int dstid;
		
		//n�mero del mes de los viajes relacionados
		public int hod;
		
		//tiempo promedio en segundos de los viajes relacionados
		public double mean_travel_time;
		
		//desviaci�n est�ndar de los viajes relacionados
		public double standard_deviation_travel_time;
		
		//desviaci�n est�ndar de los viajes relacionados
		public double geometric_mean_travel_time;
		
		//desviaci�n est�ndar geom�trica de los viajes relacionados
		public double geometric_standard_deviation_travel_time;
		
		public UBERTrip(int pSourceid, int pDstid, int pHod, double pMean_travel_time, double pStandard_deviation_travel_time, double pGeometric_mean_travel_time, double pGeometric_standard_deviation_travel_time )
		{
			sourceid = pSourceid;
			dstid = pDstid;
			hod=pHod;
			mean_travel_time = pMean_travel_time;
			standard_deviation_travel_time = pStandard_deviation_travel_time;
			geometric_mean_travel_time = pGeometric_mean_travel_time;
			geometric_standard_deviation_travel_time = pGeometric_standard_deviation_travel_time;
		}

>>>>>>> 7dfe6146adb2549137fc7e9264be585fb12cfd76

	public int getSourceid() {
		return sourceid;
	}

	public void setSourceid(int sourceid) {
		this.sourceid = sourceid;
	}

	public int getDstid() {
		return dstid;
	}

	public void setDstid(int dstid) {
		this.dstid = dstid;
	}

<<<<<<< HEAD
	public int getHod() {
		return hod;
	}

	public void setMonth(int hod) {
		this.hod = hod;
=======
	public int getMonth() {
		return hod;
	}

	public void setMonth(int month) {
		this.hod = month;
>>>>>>> 7dfe6146adb2549137fc7e9264be585fb12cfd76
	}

	public double getMean_travel_time() {
		return mean_travel_time;
	}
<<<<<<< HEAD

=======
>>>>>>> 7dfe6146adb2549137fc7e9264be585fb12cfd76
	public void setMean_travel_time(double mean_travel_time) {
		this.mean_travel_time = mean_travel_time;
	}

	public double getStandard_deviation_travel_time() {
		return standard_deviation_travel_time;
	}

	public void setStandard_deviation_travel_time(double standard_deviation_travel_time) {
		this.standard_deviation_travel_time = standard_deviation_travel_time;
	}

	public double getGeometric_mean_travel_time() {
		return geometric_mean_travel_time;
	}

	public void setGeometric_mean_travel_time(double geometric_mean_travel_time) {
		this.geometric_mean_travel_time = geometric_mean_travel_time;
	}

	public double getGeometric_standard_deviation_travel_time() {
		return geometric_standard_deviation_travel_time;
	}

	public void setGeometric_standard_deviation_travel_time(double geometric_standard_deviation_travel_time) {
		this.geometric_standard_deviation_travel_time = geometric_standard_deviation_travel_time;
	}

	@Override
	public int compareTo(UBERTrip comparador) 
	{		
		if(mean_travel_time == comparador.getMean_travel_time())
		{
			if(standard_deviation_travel_time==comparador.standard_deviation_travel_time)
				return 0;
			else if	(standard_deviation_travel_time<comparador.standard_deviation_travel_time)
				return -1;
			else
				return 1;
		}
		else if(mean_travel_time<comparador.getMean_travel_time())
		{
			return -1;
		}
		else
			return 1;
	}
<<<<<<< HEAD

=======
>>>>>>> 7dfe6146adb2549137fc7e9264be585fb12cfd76
}


