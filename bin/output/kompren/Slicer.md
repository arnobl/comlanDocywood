### <a name="Defining-a-Slicer"></a>Defining a Slicer

```
slicer aStrictSlicer {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 }
```
A model slicer is a tool that extracts a subset of model elements for a specific purpose. This is the root concept of the Kompren language. Type `slicer`. 

The `name` of the slicer must be defined. The name of the slicer. The expected format is a qualified named (e.g., `pkg1.Class1`). In our example, type: `aStrictSlicer `.


Type `{`. 

The source metamodel URIs must be defined. It defines the URI of the Ecore models used to define the slicer. The slicer will be based on the model elements of these metamodels. Genmodels of the metamodels must be provided here. The expected format is a string literal (between double quotes).
Type `domain :`. 
Then, give the value, here: `'platform:/resource/test/src/main/ex1.genmodel' `.

The input classes must be defined. It defines the classes of the input metamodels that will be considered during the slicing process. The expected format is a qualified named (e.g., `pkg1.Class1`).
Type `input :`. 
Then, give the value, here: `ex1.A `.


Type `}`. 
