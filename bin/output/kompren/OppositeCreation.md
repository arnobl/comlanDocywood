### <a name="Defining-a-OppositeCreation"></a>Defining a OppositeCreation

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedProperty : ex1.C.ce 	opposite ( ceOpposite )

 }
```
An opposite can be used when the slicer has to go throw a relation in its opposite way. The `name` of the opposite reference must be defined. It defines the name of the new relation that goes in the opposite way than the relation specified. The expected format is a simple variable name (i.e. must follow the Java naming convention).
Type `opposite (`. 

Then, give the value, here: `ceOpposite `.


Type `)`. 

See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedProperty](Defining-a-SlicedProperty)
