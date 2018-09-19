## Result
Static method called

## Reason
Static methods are tied to classes and not to objects. So, actually ```` staticMethodAccessOnNullObject.simpleMethod(); ```` gets converted to ```` StaticMethodAccessOnNullObject.simpleMethod(); ````. 
So, there is no chance of ````NullPointerException```` in case of static methods.