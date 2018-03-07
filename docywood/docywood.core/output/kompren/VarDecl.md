### <a name="Defining-a-VarDecl"></a>Defining a VarDecl

```
slicer Slicer1 {
 		domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 		input : ex1.A 
 		slicedClass : ex1.A 		theA 

 }
```
In some cases, a variable declaration to required to perform some actions while slicing a model. `varName` must be defined. It defines the name of the declared variable. The expected format is a simple variable name (i.e. must follow the Java naming convention).
Then, give the value, here: `theA `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)
