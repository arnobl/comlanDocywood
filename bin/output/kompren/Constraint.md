### <a name="Defining-a-Constraint"></a>Defining a Constraint

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.D 	constraint : checkDAttr [[ theD.dAttr ]]
 

 }
```
A constraint can be added to restrict the slicing process. The produced slicer will have a parameter to state whether this constraint has to be used. The `name` of the constraint must be defined. It defines the name of the constraint that will be the name of the corresponding parameter of the slicer. The expected format is a simple variable name (i.e. must follow the Java naming convention). In our example, type: `checkDAttr `.


The boolean expression of the constraint must be defined. It defines the predicate (to write in Xtend) that will be used to checked whether the constraint can be applied. The expected format is a block of Xtend code (between `[[` `]]`). In our example, type: `[[ theD.dAttr ]]
 `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)
