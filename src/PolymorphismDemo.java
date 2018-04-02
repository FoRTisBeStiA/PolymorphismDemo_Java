/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jowin
 */
public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Person[] people = new Person[7];

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
                people[4] = new Faculty("Ross, Bob", 1988, "Art", "Paint Master");
                people[5] = new Staff("Knale, Rusty", 1266, "Maintenence", 16);
                people[6] = new Employee("Nail, Senior", 1344, "Stuffs");

		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}
