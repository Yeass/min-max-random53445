public class Main {

    public static void main(String[] args) {
    int min = 101;
    int max = 0;
	int i = 1;
	while (i <= 10){
		i++;
	    int randomnumb = (int)(Math.random() * (100 - 1));
	    System.out.println(randomnumb);
	    if (randomnumb < min){
			min = randomnumb;
		} if (randomnumb > max){
	    	max = randomnumb;
		}
    }
    System.out.println("Najmniejsza liczba to: " + min);
	System.out.println("Najwieksza liczba to: " + max);
    }
}
