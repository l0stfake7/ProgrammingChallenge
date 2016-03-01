/*
Features: add names, find names, generate random name from base, generate names based on user set letters
*/
#include <iostream>

int main()
{
	std::cout << "\t\t\tName Generator" << std::endl << std::endl;
	std::cout << "Menu" << std::endl;
	std::cout << "1. Add name" << std::endl << "2. Remove name" << std::endl << "3. Find name" 	<< std::endl
		<< "4. Generate random name" << std::endl << "5. Generate random name from letter(s)" << std::endl
		<< "6. Exit" << std::endl << std::endl;
	std::cout << "Type option number:" << std::endl;
	short optionNumber = 0;
	std::cin >> optionNumber;
	if(optionNumber > 0 && optionNumber < 6)
	{
		switch(optionNumber)
		{
			case 1:
				main();
				break;
			case 2:
				main();
				break;
			case 3:
				main();
				break;
			case 4:
				main();
				break;
			case 5:
				main();
				break;
		}
	}
	system("pause");
	return 0;
}