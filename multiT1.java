class p1 implements Runnable {
	public void run() {
	      int i;
		for(i=100;i<=500;i++) {
		System.out.println("runp1:"+i);
	}
    }
}

class p2 implements Runnable {
	public void run() {
	for(int i=500;i<=700;i++){
	System.out.println("Runp2:"+i);

	}
    }
}

class multiT1 {
	public static void main(String[]args) {
	p1 c1=new p1();
	p2 c2=new p2();
	Thread a1=new Thread(c1);
	Thread a2=new Thread(c2);
	a1.start();
	a2.start();
     }
}