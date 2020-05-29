public class Potok {
	private int currentTime = 0;//текужее врем€ выполнени€ потока
	private int maxTime;
	private String discription="ѕоток ";
	private int quant;
	
	public Potok (int number, int quant) {
		this.discription+=number;
		this.maxTime=quant;
	}
	
	 public int getQuantTime()
     {
         return quant;
     }

     public string getDescription()
     {
         return description;
     }

     public int decreaseTime()
     {
         --quant;
         return quant;
     }
}
