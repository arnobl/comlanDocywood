### <a name="Defining-a-SlicedClass"></a>Defining a SlicedClass

```
slicer aStrictSlicer {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : 	ex1.A 

 }
```
When a sliced class is selected from the input metamodels, instances of this class will be sliced and put in the output model slice. The sliced element must be defined. It defines the element of metamodel targeted by this slicing feature. The expected format is a qualified named (e.g., `pkg1.Class1`).
Then, give the value, here: `ex1.A `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)
