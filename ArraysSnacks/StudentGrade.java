import java.util.Scanner;
import java.util.Arrays;

	public class StudentGrade{

			private int numberOfStudent;
			private int subjectNum;
			private int[][] scores;
			private int[] total;
			private int[] positions;
			private double[] average;
			private int subjectScore;
			private int sum;


			Scanner input = new Scanner(System.in);


			public static void main(String[] args){

				StudentGrade studentGrade = new StudentGrade();
				studentGrade.collectInput();
				studentGrade.collectAnotherInput();
				studentGrade.calculateTotal();
				studentGrade.calculateAverage();
				studentGrade.getPosition();
				studentGrade.printFormat();
				studentGrade.printFormat1();
				studentGrade.printFormat2();


			}

			public void collectInput(){
				System.out.println("How many students do you have?");
				numberOfStudent = input.nextInt();
		
				System.out.println("How many subject do they offer?");
				subjectNum = input.nextInt();
	
				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Saved sucessfully");
				System.out.println();


		}



		public void collectAnotherInput(){
			scores = new int[numberOfStudent][subjectNum];
			for(int index = 0; index < numberOfStudent; index++){
			//System.out.println("Entering score for student "+ (index + 1));
				for(int index2 = 0; index2<subjectNum; index2++){ 
					System.out.println("Entering score for student "+ (index + 1));
					System.out.println("Enter score for subject " + (index2 + 1));
					subjectScore = input.nextInt();
					System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Saved sucessfully");
					System.out.println();
			
					while(subjectScore <0 || subjectScore > 100){
					System.out.print("Invalid Score. please enter a score between 0 and 100");
					System.out.println("Enter score for subject " + (index2 + 1));
					subjectScore = input.nextInt();
					System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Saved sucessfully");
				}
			
				scores[index][index2] = subjectScore;
				}
				
				System.out.println();
			}
		

		}

		public void calculateTotal(){
			total = new int[numberOfStudent];
			 for(int index = 0; index < numberOfStudent; index++){
			        sum = 0; 
				for(int index2 = 0; index2 < subjectNum; index2++){
			        	sum += scores[index][index2];
				
				}
				total[index] = sum;
				
			}
	
			
		}
			

		public void calculateAverage(){
			average = new double[numberOfStudent];
			for(int index = 0; index < total.length; index++){
				average[index] = (double) total[index]/numberOfStudent;
			}


		}


		public int[] sortArray(int[] array){
			for(int index = 0; index < array.length; index++){
				for(int index2 = index+1; index2 < array.length; index2++){
					if(array[index] < array[index2]){
						int temp = array[index];
						array[index] = array[index2];
						array[index2] = temp;
						}
					}
			
				}
				return array;
		}


		public void getPosition(){
			positions =  new int[total.length];
			int[] sortedTotal = Arrays.copyOf(total, total.length);
			sortedTotal = sortArray(sortedTotal);
			for(int index = 0; index < total.length; index++){
				for(int index2 = 0; index2 < sortedTotal.length; index2++){
					if(total[index] == sortedTotal[index2]){
						positions[index] = index2 + 1;
 						}
					}
				
			}
								
	}


		public void printFormat(){
			System.out.println("============================".repeat(numberOfStudent));
			System.out.print("STUDENT\t");
			for(int index = 0; index < numberOfStudent; index++){
				System.out.print("SUB" +(index + 1) + "\t"); 
			}	
			System.out.print("TOT \tAVE \tPOS\n");
												System.out.println("============================".repeat(numberOfStudent));
			for(int index = 0; index < numberOfStudent; index++){
				System.out.print("Student" +(index + 1) + " ");
				for(int index2 = 0; index2 < subjectNum; index2++){
					System.out.print(scores[index][index2] + "\t");
				
				}
				System.out.print(total[index]+ "\t" );
				System.out.printf("%.2f",average[index]);
				System.out.println("\t" + positions[index]);
				


			}
			System.out.println("""
			================================================================== 												""");
				
		}

		public void printFormat1(){
			System.out.println("SUBJECT SUMMARY");
			
			for(int subject = 0; subject < subjectNum; subject++){
				int max = scores[0][subject];
				int highestIndex = 1;
				int passes = 0;
				int fails = 0;
				int min =  scores[0][subject];
				int lowestIndex = 1; 
				int totalScore = 0;
				System.out.println("Subject" + (subject + 1));

				
				for(int students = 0; students < numberOfStudent; students++){
					int subjectScore = scores[students][subject];	
					totalScore += subjectScore;
					
					if(subjectScore > max){
						max = subjectScore;
						highestIndex = students + 1;	
							
					}else if(subjectScore < min){
						min = subjectScore;
						lowestIndex= students + 1;
					}
					if(subjectScore >= 50){
						passes++;
					}else {
						fails++;
					}
							

				}
				double averageScore = (double) totalScore/numberOfStudent;

				System.out.printf("Highest scoring student is:  Student %d  scoring %d%nLowest scoring student is: Student %d scoring %d%n", highestIndex, max, lowestIndex, min);
				System.out.println("Total score: " + totalScore);
				System.out.printf("Average Score: %.2f%n", averageScore);
				System.out.println("Number of Passes: " + passes);
				System.out.println("Number of Fails: " + fails);
				System.out.println();	
				}

			}
			
			
		public void printFormat2(){
				int hardestSubjectIndex = 0;
				int easiestSubjectIndex = 0;
				int bestGraduatingStudent = 0;
				int worstGraduatingStudent = 0;
				int lowestIndex = 0;
				int highestIndex = 0; 
				int classTotalScore = 0;
				int lowestTotal = Integer.MAX_VALUE;
				int highestTotal = Integer.MIN_VALUE;
				int overallHighestScore = 0;
				int overallLowestScore = Integer.MAX_VALUE;
				int easiestSubjectPasses = Integer.MIN_VALUE;
				int hardestSubjectFails = Integer.MIN_VALUE;
				
				for(int subject = 0; subject < subjectNum; subject++){	
					int totalScore = 0;
					int passCounter = 0;
					int failCounter = 0;
					
					for(int students = 0; students < numberOfStudent; students++){
						totalScore += scores[students][subject];	
					
						if(scores[students][subject] < 50){
							failCounter ++;
						}else{
							passCounter++;
						}
					}
					
					if(failCounter > hardestSubjectFails){
						hardestSubjectIndex = subject + 1;
						hardestSubjectFails = failCounter;
					
					}
					
					if(passCounter > easiestSubjectPasses){
						easiestSubjectIndex = subject + 1;
						easiestSubjectPasses = passCounter;
						
					}
						
				//}

			
				/**for(int subject = 0; subject < subjectNum; subject++){
					int totalScore = 0;
					int passCounter = 0;
					int failCounter = 0;**/
				 
					for(int students = 0; students < numberOfStudent; students++){
					int subjectScore = scores[students][subject];	
					totalScore += subjectScore;
					if(subjectScore > highestTotal){
						highestTotal = subjectScore;
						highestIndex = students;
					}
					if(subjectScore < lowestTotal){
						lowestTotal = subjectScore;
						lowestIndex = students;
					}
					
					if(subjectScore >= 50){
							passCounter+=1;
					}else {
							failCounter+=1;
					}
				}
			}
				
				for(int students = 0; students < numberOfStudent; students++){
					int studentTotal = total[students];

					if(studentTotal > overallHighestScore){
						overallHighestScore = studentTotal;
						bestGraduatingStudent = students + 1;
					}
					if(studentTotal < overallLowestScore){
						overallLowestScore = studentTotal;
						worstGraduatingStudent = students + 1;
					}
						
					classTotalScore += studentTotal;
				
				}



			double classAverage = (double) classTotalScore / numberOfStudent;
			System.out.print("The hardest subject is subject" + hardestSubjectIndex + " with " + hardestSubjectFails + " failures "+ "\n");
			System.out.print("The easiest subject is subject" + easiestSubjectIndex + " with " + easiestSubjectPasses  + " passes" + "\n");
			System.out.print("The overall Highest score is scored by student" + (highestIndex + 1) + " scoring " + highestTotal + "\n");
			System.out.print("The overall lowest score is scored by student" + (lowestIndex + 1) +  " scoring " + lowestTotal+"\n");
			System.out.println("""
			======================================================================= 
			""");
			System.out.println("CLASS SUMMARY");
			System.out.println("""
			================================================================== 												""");
			System.out.printf("Best Graduating student is student %d scoring %d%n", bestGraduatingStudent, overallHighestScore);
			System.out.println("""
			================================================================== 												""");
			System.out.println();
			System.out.println("""
			!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 												""");

			System.out.printf("Worst Graduating student is student %d scoring %d%n", worstGraduatingStudent, overallLowestScore);

			System.out.println("""
			!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 												""");

			System.out.println();


			System.out.println("""
			================================================================== 												""");

			System.out.println("Class Total score: " + classTotalScore);
			System.out.printf("Class Average score: %.2f%n ", classAverage);
			System.out.println("""
			================================================================== 												""");

						}
				

}


			
