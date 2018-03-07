### <a name="Defining-an-optional-element-to-slice"></a>Defining an optional element to slice

```
slicer aStrictSlicer {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.A option
 }
```
If optional, an option will be added to the slicer to state whether this slicing element has to be considered during the slicing. Type `option`. 


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)
