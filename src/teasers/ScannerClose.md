## Explanation
If you close a scanner object, it will automatically close underlying 'System.in' object. 
If we close 'System.in' object once, we cannot re-open it until we exit from the program.

## Conclusion
So, be sure not to close Scanner object if you need to take input from keyboard again.
