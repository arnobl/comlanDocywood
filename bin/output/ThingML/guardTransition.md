### <a name="Defining-a-guard-Transition"></a>Defining a guard Transition

```
thing fragment TestHistoryStatesWithStream {
 property c : char 

 composite state C2 init s1 {
 state s1 {
   transition t1 -> s1 
   guard c == 'n'
 }
}

```
Optionally transitions can have a guard condition.
Type `guard`.
The expression must be defined.
In our example, type: `c == 'n'`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining a Property](Defining-a-Property)
