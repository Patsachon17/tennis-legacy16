package com.summitthai.tennis_legacy16;

public class TenisScroe {

	public static void main(String[] args) {

		int playerScroe1 = 4;
		int playerScroe2 = 1;
		int difScroe;
		String winner;

		if (playerScroe1 >= playerScroe2) {
			difScroe = playerScroe1 - playerScroe2;
			winner = "Player1";
		} else {
			difScroe = playerScroe2 - playerScroe1;
			winner = "Player2";
		}
		

		if ((playerScroe1 > 3 || playerScroe2 > 3)) {
			 
			if(difScroe > 1) {
				System.out.println("Winner = "+ winner );
			}else { 
				System.out.println("Deuce");
			}
			 

		}else {
	 
			
			
		}

	}

}
