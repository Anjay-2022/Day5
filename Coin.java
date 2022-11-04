package assignment;

public class Coin {
	int hc=0,tc=0;

	public void generate() {
		for(int i = 0; i < 20; i++ ) {
			int coin= (int) (Math.random()*(2));
			if (coin == 0) {
				hc++;
				System.out.println("Head");
			} else {
				tc++;
				System.out.println("Tail");
			}
		}System.out.println("head"+hc);
		System.out.println("head"+tc);
		}
		public void percentage() {
			float perhead=0,pertail=0;
			perhead=(float) (hc*100/(hc+tc));
        System.out.println("percentage head occur"+perhead);
        pertail=(float)(tc*100/(hc+tc));
        System.out.println("percentage tail occur"+pertail);

		} 
		public static void main(String[] args) {
			Coin c = new Coin();
			c.generate();
			c.percentage();
		}
	}
