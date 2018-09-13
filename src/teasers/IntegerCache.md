## Result and Explanation
Results are written in comments:

````
Integer first1 = 1;
Integer second1 = 1;
Integer obj1 = new Integer(1);

Integer first128 = 128;
Integer second128 = 128;
Integer obj128 = new Integer(128);

System.out.println(first1 == second1); // true, Cause Integer objects from value range -128 to +127
													// are cached. So, both are referencing to same cached object

System.out.println(first1 == obj1); // false, Cause declaring new keyword creates a new object

System.out.println(first128 == second128); // false, as 128 is greater than +127, Integer literals
														// points to new objects

System.out.println(first128 == obj128); // false, Cause declaring new keyword creates a new object
````