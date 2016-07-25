package Temperature;

public class Temperature {
	double ftemp;
	  Temperature(double ftemp) {
	    this.ftemp = ftemp;
	  }
	 
	  double getFahrenheit(){
	    return ftemp;
	  }
	  double getCelsius(){
	    return ((double)5/9*(ftemp-32));
	  }
	  double getKelvin(){
	    return (((double)5/9*(ftemp-32))+273);
	  }
}

