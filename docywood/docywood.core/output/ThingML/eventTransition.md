### <a name="Defining-a-event-Transition"></a>Defining an event Transition

```
thing fragment TestHistoryStatesWithStream {
 required port p {
   receives mArray
 }

 composite state C2 init s1 {
 state s1 {
   transition t1 -> s1
    event e : p?mArray
 }
}

```
Event allowing to trigger a transition.
Type `event`.
The name of the event can be defined.
In our example, type: `e`.
Type: `:`.
The expression of the event must be defined.
In our example, type: `p?mArray`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining a Required Port](Defining-a-RequiredPort)
