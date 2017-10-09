package com.ocajexam.exercises.chapter2;

public class TransferOfControl {
	
	public static void fishingByHour() {
		int totalHoursFishing = 0;
		int hoursAllowedFishing = 4;
		for (int i = 1; i < 25; i++){
			++totalHoursFishing;
			if (totalHoursFishing > hoursAllowedFishing) {
				break;
			}
			System.out.println("Fishing for hour " + i + ".");
		}
	}
	
	public static void activitiesByDay() {
		int totalDaysCamping = 0;
		int daysAllowedFishing = 5;
		for (int i = 1; i < 8; ++i) {
			System.out.print("\nDay " + i + ": camping ");
			totalDaysCamping++;
			if (totalDaysCamping > daysAllowedFishing) continue;
			System.out.print("and fishing");
		}
	}
	
	public static int getTotalFishTypes(int saltWaterFishTotal, int freshWaterFishTotal, int brackFishTotal) {
		int fishTypesTotal = saltWaterFishTotal + freshWaterFishTotal + brackFishTotal;
		return fishTypesTotal;
	}
	
	public static int getTotalCaughtFish(int keeperFish, int throwBackFish) {
		return keeperFish + throwBackFish;
	}
	
	public static void labeledBreakTest() {
		myBreakLabel:
			while (true) {
				System.out.println("While loop 1");
				while (true) {
					System.out.println("While loop 2");
					while (true) {
						System.out.println("While loop 3");
						break myBreakLabel;
					}
				}
			}
	}
	
	public static void labeledContinueTest() {
		myContinueLabel:
			while (true) {
				System.out.println("While loop 1");
				while (true) {
					System.out.println("While loop 2");
					while (true) {
						System.out.println("While loop 3");
						continue myContinueLabel;
//						Unreachable code
//						while (true) {
//							System.out.println("While loop 4");
//						}
					}
				}
			}
	}

	public static void main(String[] args) {
//		fishingByHour();
//		activitiesByDay();
//		System.out.println("total fish types: " + getTotalFishTypes(2, 3, 4));
//		System.out.println("total caught fish: " + getTotalCaughtFish(5, 10));
//		labeledBreakTest();
		labeledContinueTest();
		
	}

}
