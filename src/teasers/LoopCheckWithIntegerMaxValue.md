## Result 
The program will be fall into an infinite loop.

## Reason
Look at this part closely again:
````
	for (int i = startPosition; i <= highestLimit; i++) {
        count++;
    }
````
When i gets to ```` Integer.MAX_VALUE ```` it performs a addition. And then perform ```` i++ ```` again before checking if it is greater than or equal to ```` highestLimit ````. After performing that ```` i++```` , the value of ```` i ````  becomes ```` Integer.MIN_VALUE ````  as overflow happens.

## Conclusion
Do not use ```` Integer.MAX_VALUE ```` in loop if you are checking if an integer value is less than or equal to ```` Integer.MAX_VALUE ````. 

Do not use ```` Integer.MIN_VALUE ```` in loop if you are checking if an integer value is greater than or equal to ```` Integer.MIN_VALUE ````. 
