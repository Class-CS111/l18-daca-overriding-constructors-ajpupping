/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient test = new DACArecipient();

    System.out.println("Test: " + test);

    DACArecipient test2 = new DACArecipient("Miranda", "Ana", "Mexico", "123-4-567", 
    2415021, 24115021, 2415021, 'F');

    System.out.println("Test 2: " + test2);


  }
}