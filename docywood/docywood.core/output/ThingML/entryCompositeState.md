### <a name="Defining-a-entry-CompositeState"></a>Defining an entry Composite State

```
thing fragment TestArrays4 {
 composite state c init s1 keeps history{
    state s1{
        on entry do
        end
    }
 }
}

```
All states (composite or not) can have entry actions executed when entering the state. 
<br>
Type `on entry`. 
<br>
The block of actions must be defined.
Type `do`. 
<br>
Type `end`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br>
[Defining a Composite State](Defining-a-CompositeState)
