package main;

import robo.AbstractRobot;
import robo.BetaRobot;
import robo.CharlieRobot;
import robo.RobotFactory;
import tests.SimpleTest;
import tests.ChargeTest;
import tests.DiagonalWalkTest;

public class Application {
        public static void main(String[] args) {
		
     	AbstractRobot robo = RobotFactory.getRobot("Alpha","Bob");
		AbstractRobot robo1 = RobotFactory.getRobot("Beta","Jack");
		AbstractRobot robo2 = RobotFactory.getRobot("Charlie","Optimus");
		
		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(robo));
        System.out.printf("Charge test passed %d%%\n", ChargeTest.chargeTest((BetaRobot)robo1));
        System.out.printf("Diagonal test passed %d%%\n", DiagonalWalkTest.diagonalTest((CharlieRobot) robo2)); 
	}
}
