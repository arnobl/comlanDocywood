### <a name="Defining-a-Radius"></a>Defining a Radius

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	radius : 	ex1.A 

 }
```
The radius is used to filter the sliced elements in the input model. The radius works as follows: Starting at 0, a value is incremented on each visited class instance focused by the radius. The slicing process stops when no elements can be sliced anymore or when this value is greater than the radius given as parameter. The value of the radius is specificed by the user of the slicer. The classes of the radius must be defined. The expected format is a qualified named (e.g., `pkg1.Class1`).
Then, give the value, here: `ex1.A `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)
