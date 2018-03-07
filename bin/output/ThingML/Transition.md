### <a name="Defining-a-Transition"></a>Defining a Transition

```
thing fragment TestHistoryStatesWithStream {
 composite state C2 init s1 {
 state s1 {
   transition t1 -> s1 
 }
}

```
Describes a transition from one state to another (can be the same). Can be triggered automatically or by a given event. 
Type `transition`.
The name of the transition must be defined. The expected format is an identifier. In our example, type: `t1`.
The targeted state of the transition must be defined. The expected format is an identifier.
Then, give the value, here: `s1`.


See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)
