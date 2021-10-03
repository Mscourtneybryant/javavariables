public class vari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter Marks: ");
		        int StudentMarks = Integer.valueOf(input.nextLine());

		     if (StudentMarks >= 90);
		     
		     System.out.println("A. You pass!");
		     else if ( StudentMarks >= 80);
		     System.out.println("B. You Pass!");
		     else if (StudentMarks >= 70);
		     System.println("C. You pass, but you can do better!");
		     else if (StudentMarks >= 55);
		     System.out.println("D. You did not pass. Do better next time!");
		     else if  (num1 < 55);
		     System.out.println("You failed. See me after class!");
		     
		    }
		    
		    int day = 4;

		    String dayString;
		    switch (day) {
		        case 1:  dayString = "Monday";
		        break;
		        case 2:  dayString = "Tuesday";
		        break;
		        case 3:  dayString = "Wednesday";
		        break;
		        case 4:  dayString = "Thurday";
		        break;
		        case 5:  dayString = "Friday";
		        break;
		        case 6:  dayString = "Saturday";
		        break;
		        case 7:  dayString = "Sunday";
		        break;
		        default: dayString = "Invalid Input";
		        break;
		                 
		    }
		    System.out.println(dayString);


		    int number =4;

		    if (number % 2 != 0) {
		        System.out.println("Odd " +"Cool");
		    }

		    else if (number % 2 == 0 && number > 2 && 5 > number ) {
		        System.out.println("Even and between 2-5 " + "Not Cool");
		    }
		    
		    
		    else if (number % 2 == 0 && number > 6 && number < 20 ) {
		        System.out.println("Even and between 6-20 " + "Cool");
		    }

		    else if (number % 2 == 0 && number >= 20 ) {
		        System.out.println("Even and greater than 20 " + "Not Cool");
		    }else {
		        System.out.println("try again");

		    }

		    
            scan.close();


	}

}
