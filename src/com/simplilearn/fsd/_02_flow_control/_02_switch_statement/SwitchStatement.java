package com.simplilearn.fsd._02_flow_control._02_switch_statement;

public class SwitchStatement {

	public static void main(String[] args) {

        int day = 4;

        /*
         * The code below translates the day's number into the day's name according to,
         *
         *     1  --> Monday
         *     2  --> Tuesday
         *     3  --> Wednesday
         *     4  --> Thursday
         *     5  --> Friday
         *     6  --> Saturday
         *     7  --> Sunday
         *  Other --> Invalid Day
         */
        
        switch(day) {
        case 1: System.out.println("Monday");
                break;
        case 2: System.out.println("Tuesday");
                break;
        case 3: System.out.println("Wednesday");
                break;
        case 4: System.out.println("Thursday");
                break;
        case 5: System.out.println("Friday");
                break;
        case 6: System.out.println("Saturday");
                break;
        case 7: System.out.println("Sunday");
                break;
        default: System.out.println("Invalid Day");
        }

        // Simplified Switch - As of Java 14
        
        switch(day) {
        case 1,8 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("Invalid Day");
        }
        
	}

}
