### <a name="Defining-a-SlicedProperty"></a>Defining a SlicedProperty

```
slicer Slicer1 {
 		domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 		input : ex1.A 
 		slicedProperty : 		ex1.A.d 

 }
```
When a property is selected from the input metamodels, instances of this property will be sliced and put in the output model slice. The sliced element must be defined. It defines the element of metamodel targeted by this slicing feature. The expected format is a qualified named (e.g., `pkg1.Class1`).
Then, give the value, here: `ex1.A.d `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)
