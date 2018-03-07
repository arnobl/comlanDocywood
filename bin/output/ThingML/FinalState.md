### <a name="Defining-a-FinalState"></a>Defining a Final State

```
thing fragment TestArrays4 {
 composite state c init s1 {
    final state s1{}
 }
}

```
State from which it can't be any outgoing transition.<br>
Type `final`. <br>
The state must be defined.<br>
Type `}`.<br>
Type `}`. 

See also:<br/>
[Defining a Thing](Defining-a-Thing)
[Defining a Composite State](Defining-a-CompositeState)