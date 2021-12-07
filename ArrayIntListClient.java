//Name: Jared Hazel
//Class: CS211
//Date: 2/21/2020
//Purpose: The purpose of this is to test problems 1, 2, 5, 8, 11

public class ArrayIntListClient{
   public static void main(String[] args){
   
   //Problem 1 test
   System.out.println("Problem 1 test");
   ArrayIntList test1 = new ArrayIntList(8);
   
   test1.add(1);
   test1.add(18);
   test1.add(2);
   test1.add(7);
   test1.add(18);
   test1.add(39);
   test1.add(18);
   test1.add(40);
   
   System.out.println(test1);
   System.out.println("lastIndexOf 18 = "+test1.lastIndexOf(18));
   System.out.println("lastIndexOf 3 = "+test1.lastIndexOf(3));
   
   //Problem 2 test
   System.out.println();
   System.out.println("Problem 2 test");
   ArrayIntList test2 = new ArrayIntList(6);
   ArrayIntList test3 = new ArrayIntList(3);
   
   test2.add(11);
   test2.add(-7);
   test2.add(3);
   test2.add(42);
   test2.add(0);
   test2.add(14);
   
   test3.add(3);
   test3.add(42);
   test3.add(0);
   System.out.println(test2 +" "+ test3);
   System.out.println("indexOfSubList = "+test2.indexOfSubList(test3));
   
   //Problem 5 test
   System.out.println();
   System.out.println("Problem 5 test");
   ArrayIntList test9 = new ArrayIntList(8);
   test9.add(2);
   test9.add(3);
   test9.add(5);
   test9.add(4);
   test9.add(7);
   test9.add(15);
   test9.add(20);
   test9.add(7);
   
   System.out.println(test9);
   ArrayIntList test11 = test9.runningTotal();
   
   System.out.println("running total: "+test11);
   
   //Problem 8 test
   System.out.println();
   System.out.println("Problem 8 test");
   ArrayIntList test4 = new ArrayIntList(8);
   test4.add(2);
   test4.add(-3);
   test4.add(2);
   test4.add(0);
   test4.add(5);
   test4.add(2);
   test4.add(2);
   test4.add(6);
   
   System.out.println(test4);
   System.out.println("count = "+test4.count(2));
   
   //Problem 11 test
   System.out.println();
   System.out.println("Problem 11 test");
   ArrayIntList test5 = new ArrayIntList(5);
   
   test5.add(8);
   test5.add(17);
   test5.add(42);
   test5.add(3);
   test5.add(8);
   
   System.out.println("Array part 1: "+test5);
   
   System.out.println("remove 1: "+test5.removeLast());
   
   System.out.println("Array part 2: "+test5);
   
   System.out.println("remove 2: "+test5.removeLast());
   
   System.out.println("Array part 3: "+test5);
   
   System.out.println("remove 3: "+test5.removeLast());
   
   System.out.println("Array part 4: "+test5);
   
   System.out.println("remove 4: "+test5.removeLast());
   
   System.out.println("Array part 5: "+test5);
   
   System.out.println("remove 5: "+test5.removeLast());
   
   System.out.println("Array part 6: "+test5);
   
   System.out.println("remove 6: "+test5.removeLast());
   
   }









}