## Result And Reason (In comment)
````
String str1  = "string";
String str2 = "string";
String strobj1 = new String("string");

String partStr1 = "str";
String partStr2 = "ing";

System.out.println(str1 == str2); // true, Cause we are using String literal. 
                              // So, this string is saved in string pool and all string literals are pointing 
                              // at same object in that pool 
                              
System.out.println(str1.equals(str2)); //true, Cause we are checking value not object

System.out.println(str2 == strobj1); // false, Cause the second item is an object. Defining an object instead of string literal
                                  // will always result in creating new object every time
System.out.println(str2.equals(strobj1)); // true, Cause we are checking the value

System.out.println(str1 == (partStr1 + partStr2)); // false, in C#, we would have true output. But, java does not 
                                                // add those literals and cache that addition result in string literal pool
System.out.println(str1.equals(partStr1 + partStr2)); // true, Cause we are checking value

String parts = (partStr1 + partStr2).intern(); // we are explicitly telling compiler to add this literal to string literal pool
                                            // if it does not exist already

System.out.println(str1 == parts); // true, as we are explicitly telling compiler to cache the value in pool if not exist
System.out.println(str1.equals(parts)); // true, Cause we are checking value
````
