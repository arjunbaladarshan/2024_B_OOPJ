public class ArrayDemo{
	public static void main(String[] args) {
		// 61 - wicket
		// 62 - wide
		// 63 - no ball
		int[][][] runs = {
			{
				{5,61,3,6,2,1},
				{5,1,62,6,61,1},
				{5,2,5,63,2,1}
			},
			{
				{5,2,3,6,2,1},
				{5,1,2,6,61,1},
				{5,2,5,2,2,1}
			}
		};
		//System.out.println(runs[0][0].length);

		
		
		for(int k=0;k<runs.length;k++){
			int total = 0;
			int totalWicket = 0;
			int extraRuns = 0;
			for(int j=0;j<runs[k].length;j++){
				for(int i=0;i<runs[k][j].length;i++){
					if(runs[k][j][i]>60){
						if(runs[k][j][i]==61){
							totalWicket++;
						}
						else if(runs[k][j][i]==62 || runs[k][j][i]==63){
							extraRuns++;
							total++;
						}
					}
					else{
						total += runs[k][j][i];	
					}
					
				}
			}
			System.out.println(total+"/"+totalWicket);
			System.out.println("Extras = "+extraRuns);
		}
		

		Light l1 = new Light();
		l1.powerConsumption = 100;
		Light l2 = new Light();
		l2.powerConsumption = 200;
	}
}


class Light{
	String color;
	double luninocity;
	double powerConsumption;
	String brandName;
	String modelNumber;
	double priceActual;
	double discountPercentage;
	double width;
	double length;
	String shape;
	int noOfYearsWarrenty;
	String material;


	public void on(){

	}

	public void off(){

	}

	public void changeLuninosity(){

	}

	public void changeColor(){

	}

}