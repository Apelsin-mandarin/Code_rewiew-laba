import Departament.*;

public class Main {
  public static void main(String[] args) {
    UserInput input = new UserInput();
    int choice = 2;
    int choiceTask = 0;
    int argument = 0;
    boolean exit = false;

    // FIXME: Отсутствие пробелов вокруг операторов и отступы табуляцией
    /*
		do{

			if(choice != 5){
				choiceTask = input.inputChoiceInt(1,5, "тему:\n1. Время\n2. Дом\n3. Отделы и сотрудники\n4. Пистолет\n5.Выход");
			}

			switch (choiceTask) {

				case 1:

					argument = input.inputPositiveInt(0);

					Time time = new Time(argument);
					System.out.println("Time: " + time.toString());
					System.out.println();

					break;

				case 2:

					argument = input.inputRangeInt(1,163, "кол-во этажей");

					House house = new House(argument);
					System.out.println(house.toString());

					break;

				case 3:
					Department department = new Department("IT");

					Employee emp1 = new Employee("Петров", department);
					Employee emp2 = new Employee("Козлов", department);
					Employee emp3 = new Employee("Сидоров", department);
					department.setBoss(emp2);

					Employee emp4 = new Employee("",department);

					System.out.println(department.toString());

					break;

				case 4:

					Gun pistol = new Gun();

					pistol.shoot();
					pistol.shoot();
					pistol.shoot();
					pistol.shoot();
					pistol.sho0t();

					pistol.shoot();
					break;
				case 5:exit = true;
			}
			System.out.println();
		
    */

    // FIXTO:
    do {
      if(choice != 5){
      choiceTask = input.inputChoiceInt(1, 5, 
          "тему:\n1. Время\n2. Дом\n3. Отделы и сотрудники\n4. Пистолет\n5. Выход");
      }
      switch (choiceTask) {
        case 1:
          argument = input.inputPositiveInt(0);
          Time time = new Time(argument);
          System.out.println("Time: " + time.toString());
          break;
        case 2:
          argument = input.inputRangeInt(1, 163, "кол-во этажей");
          House house = new House(argument);
          System.out.println(house.toString());
          break;
        case 3:
          Department department = new Department("IT");
          new Employee("Петров", department);
          Employee boss = new Employee("Козлов", department);
          new Employee("Сидоров", department);
          department.setBoss(boss);
          System.out.println(department.toString());
          break;
        case 4:
          Gun pistol = new Gun();
          for (int i = 0; i < 6; i++) {
            pistol.shoot(); 
          }
          break;
        case 5:
          exit = true;
          break;
        default:
          break;
      }
      System.out.println();
    } while (!exit);
  }
}