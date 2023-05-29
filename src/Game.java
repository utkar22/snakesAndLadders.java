package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Floor> list_of_floors = new ArrayList<>(14);
	static Dice dice = new Dice(2);
	
	static void add_floors(){
		list_of_floors.add(new Normal(0));
		list_of_floors.add(new Normal(1));
		list_of_floors.add(new Elevator());
		list_of_floors.add(new Normal(3));
		list_of_floors.add(new Tornado(4));
		list_of_floors.add(new Snake());
		list_of_floors.add(new Normal(6));
		list_of_floors.add(new Normal(7));
		list_of_floors.add(new Ladder());
		list_of_floors.add(new Tornado(9));
		list_of_floors.add(new Normal(10));
		list_of_floors.add(new Cobra());
		list_of_floors.add(new Normal(12));
		list_of_floors.add(new Normal(13));
		
	}
	
	static int roll_dice(){
		System.out.println("Hit enter to roll the dice");
		sc.nextLine();
		int face = dice.roll();
		System.out.println("Dice gave "+face);
		return face;
	}
	
	static void land_at_floor(Player player){
		Floor floor = list_of_floors.get(player.get_position());
		
		player.print_position();
		floor.display(player);
		floor.update_points(player);
		player.print_points();
		player.set_position(floor.get_new_floor());
		
		if (!floor.is_empty()){
			land_at_floor(player);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the player name and hit enter\n");
		String p_name = sc.nextLine();
		Player player = new Player(p_name);
		add_floors();
		System.out.println("The game setup is ready");
		
		while (true){
			int face = roll_dice();
			if (face==2) {
				System.out.println("Game cannot start until you get 1");
			}
			else {
				land_at_floor(player);
				break;
			}
		}
		
		while (true) {
			int face = roll_dice();
			player.update_position(face);
			land_at_floor(player);
			
			if (player.if_win()) {
				break;
			}
		}
		
		System.out.println("Game over");
		player.final_points();
	}

}
