### <a name="Defining-a-exit-CompositeState"></a>Defining an exit Composite State

```
thing fragment TestArrays4 {
 composite state c init s1 keeps history{
    state s1{
        on exit do
        end
    }
 }
}

```
All states (composite or not) can have exit actions executed when leaving the state. 
<br>
Type `on exit`. 
<br>
The block of actions must be defined.
Type `do`. 
<br>
Type `end`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br>
[Defining a Composite State](Defining-a-CompositeState)
