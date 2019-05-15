package com.utn.reloj;

public class MainReloj {

	public static void main(String[] args) throws InterruptedException {
		
		for(int hs=0;hs<24;hs++) {
			for(int min=0;min<60;min++) {
				for(int seg=0;seg<60;seg++) {
					System.out.println(hs+":"+min+":"+seg);
					Thread.sleep(1000);
				}
			}
		}

	}

}
