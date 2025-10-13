package sanika;

import java.util.Scanner;

class CricketPlayer{
	String name;
	int no_of_innings;
	int no_of_times_notout;
	int totalruns;
	double batavg;
	
	CricketPlayer(String name, int no_of_innings,int no_of_times_notout,int totalruns){
		this.name=name;
		this.no_of_innings=no_of_innings;
		this.no_of_times_notout=no_of_times_notout;
		this.totalruns=totalruns;
	}
	
	static double avg(CricketPlayer player) {
		int timesBatted = player.no_of_innings-player.no_of_times_notout;
		return timesBatted == 0? 0: (double) player.totalruns/timesBatted;
	}
	
	static void sort(CricketPlayer[] player) {
		for(int i=0;i<player.length-1;i++) {
			for(int j=0;j<player.length-i-1;j++) {
				if(avg(player[j])<avg(player[j+1])) {
					CricketPlayer temp= player[j];
					player[j]=player[j+1];
					player[j+1]=temp;
				}
			}
		}
	}
	
	public String toString() {
		return "Name:" + name + " Batting Average:" + avg(this);
	}
}


public class CricketMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Players:");
		int n = sc.nextInt();
		
		CricketPlayer[] players= new CricketPlayer[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Details of player:");
			System.out.println("enter name:");
			String name=sc.next();
			System.out.println("Enter No of innings:");
			int no_of_innings=sc.nextInt();
			System.out.println("Enter No of times notout:");
			int no_of_times_notout= sc.nextInt();
			System.out.println("Enter total runs:");
			int totalruns=sc.nextInt();
			
			players[i] = new CricketPlayer(name,no_of_innings,no_of_times_notout,totalruns);
		}
		
		CricketPlayer.sort(players);
		
		System.out.println("Player details");
		for(CricketPlayer player : players) {
			System.out.println(player);
		}
	}
}
