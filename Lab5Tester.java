package cmsc123Lab5;

// LABORATORY EXERCISE NO. 5 TESTER
// Created by: Jayvee B. Castañeda

// !!! W A R N I N G !!!
// DO NOT EDIT THE CONTENTS OF THIS FILE UNLESS PROMPTED TO DO SO
// ANY UNSOLICITED MODIFICATIONS TO THIS FILE WILL RESULT TO A SCORE OF '0' IN THIS EXERCISE

// NOTE: This tester does not ultimately test your program code.
// It will only print out your output and the desired output for you to compare.

import java.util.Scanner;
import java.util.Random;

public class Lab5Tester{

	public static String randomString(){
		Random rng = new Random();
		int length = 10;
		String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789" + "!@#$%^&*+-/=?,.";
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++){
	        text[i] = allChars.charAt(rng.nextInt(allChars.length()));
	    }
	    return new String(text);
	}

	// ArrayBT Tester
	public static void ArrayBTTest() throws NullPointerException{
		ArrayBT testArrayBT = new ArrayBT(20);

		String[] randStrings = new String[15];
		for (int i=0; i<10; i++){
			randStrings[i] = randomString();
		}

		testArrayBT.setRoot(new Element(1,randStrings[0]));
		testArrayBT.setLeft(1,new Element(2,randStrings[1]));
		testArrayBT.setRight(1,new Element(3,randStrings[2]));
		testArrayBT.setLeft(2,new Element(4,randStrings[3]));
		testArrayBT.setRight(2,new Element(5,randStrings[4]));
		testArrayBT.setLeft(3,new Element(6,randStrings[5]));
		testArrayBT.setRight(3,new Element(7,randStrings[6]));
		testArrayBT.setLeft(4,new Element(8,randStrings[7]));
		testArrayBT.setRight(4,new Element(9,randStrings[8]));
		testArrayBT.setLeft(5,new Element(10,randStrings[9]));
		testArrayBT.setRight(5,new Element(11,randStrings[10]));
		testArrayBT.setLeft(6,new Element(12,randStrings[11]));
		testArrayBT.setRight(6,new Element(13,randStrings[12]));
		testArrayBT.setLeft(7,new Element(14,randStrings[13]));
		testArrayBT.setRight(7,new Element(15,randStrings[14]));

		// INORDER TRAVERSAL
		System.out.println("===============");
		System.out.println("=   INORDER   =");
		System.out.println("===============");
		System.out.println("= YOUR OUTPUT =");
		System.out.println("===============");
		testArrayBT.inorder(0);
		System.out.println("\n==================");
		System.out.println("= DESIRED OUTPUT =");
		System.out.println("==================");
		System.out.println(randStrings[7]);
		System.out.println(randStrings[3]);
		System.out.println(randStrings[8]);
		System.out.println(randStrings[1]);
		System.out.println(randStrings[9]);
		System.out.println(randStrings[4]);
		System.out.println(randStrings[10]);
		System.out.println(randStrings[0]);
		System.out.println(randStrings[11]);
		System.out.println(randStrings[5]);
		System.out.println(randStrings[12]);
		System.out.println(randStrings[2]);
		System.out.println(randStrings[13]);
		System.out.println(randStrings[6]);
		System.out.println(randStrings[14]);

		// PREORDER TRAVERSAL
		System.out.println("===============");
		System.out.println("=   PREORDER  =");
		System.out.println("===============");
		System.out.println("= YOUR OUTPUT =");
		System.out.println("===============");
		testArrayBT.preorder(0);
		System.out.println("\n==================");
		System.out.println("= DESIRED OUTPUT =");
		System.out.println("==================");
		System.out.println(randStrings[0]);
		System.out.println(randStrings[1]);
		System.out.println(randStrings[3]);
		System.out.println(randStrings[7]);
		System.out.println(randStrings[8]);
		System.out.println(randStrings[4]);
		System.out.println(randStrings[9]);
		System.out.println(randStrings[10]);
		System.out.println(randStrings[2]);
		System.out.println(randStrings[5]);
		System.out.println(randStrings[11]);
		System.out.println(randStrings[12]);
		System.out.println(randStrings[6]);
		System.out.println(randStrings[13]);
		System.out.println(randStrings[14]);

		// POSTORDER TRAVERSAL
		System.out.println("===============");
		System.out.println("=  POSTORDER  =");
		System.out.println("===============");
		System.out.println("= YOUR OUTPUT =");
		System.out.println("===============");
		testArrayBT.postorder(0);
		System.out.println("\n==================");
		System.out.println("= DESIRED OUTPUT =");
		System.out.println("==================");
		System.out.println(randStrings[7]);
		System.out.println(randStrings[8]);
		System.out.println(randStrings[3]);
		System.out.println(randStrings[9]);
		System.out.println(randStrings[10]);
		System.out.println(randStrings[4]);
		System.out.println(randStrings[1]);
		System.out.println(randStrings[11]);
		System.out.println(randStrings[12]);
		System.out.println(randStrings[5]);
		System.out.println(randStrings[13]);
		System.out.println(randStrings[14]);
		System.out.println(randStrings[6]);
		System.out.println(randStrings[2]);
		System.out.println(randStrings[0]);

		System.out.println("= end of test =");
	}

	// LinkedBT Tester
	public static void LinkedBTTest() throws NullPointerException{
		LinkedBT testLinkedBT = new LinkedBT();

		String[] randStrings = new String[15];
		for (int i=0; i<10; i++){
			randStrings[i] = randomString();
		}

		BTNode rootNode = new BTNode(randStrings[0]);
		testLinkedBT.setRoot(rootNode);
		testLinkedBT.setLeft(rootNode, randStrings[1]);
		testLinkedBT.setRight(rootNode, randStrings[2]);
		testLinkedBT.setLeft(rootNode.getLeft(), randStrings[3]);
		testLinkedBT.setRight(rootNode.getLeft(), randStrings[4]);
		testLinkedBT.setLeft(rootNode.getRight(), randStrings[5]);
		testLinkedBT.setRight(rootNode.getRight(), randStrings[6]);
		testLinkedBT.setLeft(rootNode.getLeft().getLeft(), randStrings[7]);
		testLinkedBT.setRight(rootNode.getLeft().getLeft(), randStrings[8]);
		testLinkedBT.setLeft(rootNode.getLeft().getRight(), randStrings[9]);
		testLinkedBT.setRight(rootNode.getLeft().getRight(), randStrings[10]);
		testLinkedBT.setLeft(rootNode.getRight().getLeft(), randStrings[11]);
		testLinkedBT.setRight(rootNode.getRight().getLeft(), randStrings[12]);
		testLinkedBT.setLeft(rootNode.getRight().getRight(), randStrings[13]);
		testLinkedBT.setRight(rootNode.getRight().getRight(), randStrings[14]);

		// INORDER TRAVERSAL
		System.out.println("===============");
		System.out.println("=   INORDER   =");
		System.out.println("===============");
		System.out.println("= YOUR OUTPUT =");
		System.out.println("===============");
		testLinkedBT.inorder(rootNode);
		System.out.println("\n==================");
		System.out.println("= DESIRED OUTPUT =");
		System.out.println("==================");
		System.out.println(randStrings[7]);
		System.out.println(randStrings[3]);
		System.out.println(randStrings[8]);
		System.out.println(randStrings[1]);
		System.out.println(randStrings[9]);
		System.out.println(randStrings[4]);
		System.out.println(randStrings[10]);
		System.out.println(randStrings[0]);
		System.out.println(randStrings[11]);
		System.out.println(randStrings[5]);
		System.out.println(randStrings[12]);
		System.out.println(randStrings[2]);
		System.out.println(randStrings[13]);
		System.out.println(randStrings[6]);
		System.out.println(randStrings[14]);

		// PREORDER TRAVERSAL
		System.out.println("===============");
		System.out.println("=   PREORDER  =");
		System.out.println("===============");
		System.out.println("= YOUR OUTPUT =");
		System.out.println("===============");
		testLinkedBT.preorder(rootNode);
		System.out.println("\n==================");
		System.out.println("= DESIRED OUTPUT =");
		System.out.println("==================");
		System.out.println(randStrings[0]);
		System.out.println(randStrings[1]);
		System.out.println(randStrings[3]);
		System.out.println(randStrings[7]);
		System.out.println(randStrings[8]);
		System.out.println(randStrings[4]);
		System.out.println(randStrings[9]);
		System.out.println(randStrings[10]);
		System.out.println(randStrings[2]);
		System.out.println(randStrings[5]);
		System.out.println(randStrings[11]);
		System.out.println(randStrings[12]);
		System.out.println(randStrings[6]);
		System.out.println(randStrings[13]);
		System.out.println(randStrings[14]);

		// POSTORDER TRAVERSAL
		System.out.println("===============");
		System.out.println("=  POSTORDER  =");
		System.out.println("===============");
		System.out.println("= YOUR OUTPUT =");
		System.out.println("===============");
		testLinkedBT.postorder(rootNode);
		System.out.println("\n==================");
		System.out.println("= DESIRED OUTPUT =");
		System.out.println("==================");
		System.out.println(randStrings[7]);
		System.out.println(randStrings[8]);
		System.out.println(randStrings[3]);
		System.out.println(randStrings[9]);
		System.out.println(randStrings[10]);
		System.out.println(randStrings[4]);
		System.out.println(randStrings[1]);
		System.out.println(randStrings[11]);
		System.out.println(randStrings[12]);
		System.out.println(randStrings[5]);
		System.out.println(randStrings[13]);
		System.out.println(randStrings[14]);
		System.out.println(randStrings[6]);
		System.out.println(randStrings[2]);
		System.out.println(randStrings[0]);

		System.out.println("= end of test =");
	}

	// Main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("LABORATORY EXERCISE #5 TESTER\nOptions:\n1 - Array Binary Tree\n2 - Linked Binary Tree\n* - Exit");
		System.out.print("Choice:");
		int choice = scanner.nextInt();

		if (choice == 1){
			ArrayBTTest();
		}
		else if (choice == 2){
			LinkedBTTest();
		}
		else{
			System.exit(0);
		}
	}
}