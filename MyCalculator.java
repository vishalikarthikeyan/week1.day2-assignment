package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	Calculator obj = new Calculator();
	int addTwoNos = obj.addTwoNos(8,10, 12);
	System.out.println(addTwoNos);
	
	int subTwoNos = obj.subTwoNos(25, 6);
	System.out.println(subTwoNos);
	
	double multiTwoNos = obj.multiTwoNos(55, 60);
    System.out.println(multiTwoNos);
	
    float divideTwoNos = obj.divideTwoNos(23, 2);
    System.out.println(divideTwoNos);
	
	
	


}
}
