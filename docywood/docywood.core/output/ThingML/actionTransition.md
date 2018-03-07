### <a name="Defining-a-action-Transition"></a>Defining an action Transition

```
thing fragment TestHistoryStatesWithStream {
 property c : char 

 composite state C2 init s1 {
 state s1 {
   transition t1 -> s1 
   action do
   end
 }
}

```
Optionally transitions can have actions.
Type `action`.
The action block must be defined.
Type: `do`.
Type: `end`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining a Property](Defining-a-Property)
