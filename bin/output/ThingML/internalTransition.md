### <a name="Defining-a-internal-Transition"></a>Defining an internal Transition

```
thing fragment TestHistoryStatesWithStream {
 required port p {
   receives mArray
 }
 
 composite state C2 init s1 {
  state s1 {
    internal event e : p?mArray
    action do
    end
  }
}

```
Internal transitions can be used to implement event handlers on states which do not exit and reenter the state.<br>
Type `internal`.<br>
The event of the internal transition must be defined.<br>
Actions of the transition can be defined. <br>
Type `}`.<br>
Type `}`.<br>


See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Required Port](Defining-a-RequiredPort)<br/>
[Defining a Composite State](Defining-a-CompositeState)
