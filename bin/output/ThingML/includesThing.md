### <a name="Defining-a-includes-Thing"></a>Defining an includes Thing

```
thing fragment TestArrays4 {
}

thing TestArrays3 includes TestArrays4 {
}
```
Even though ThingML is not an OO language, and thus does not provide plain inheritance, it provides some basic mechanisms to improve the modularity/reusability of fragments of ThingML provides.
A thing fragment can been seen as an interface or abstract class. Typically it declares some messages, but could also define any feature we can find in plan things. 
<br>
Type `includes`.<br>
The name of the thing to include must be defined. The expected format is an identifier. 
In our example, type: `TestArrays4`.
<br>
Type `{`. <br>
Type `}`. 
