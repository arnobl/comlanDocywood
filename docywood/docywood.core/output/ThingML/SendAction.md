### <a name="Defining-a-SendAction"></a>Defining a Send Action

```
thing fragment TestArrays4 {
 required port myPort {
  sends rep
 }
	
 composite state c init s1 keeps history{
    state s1{
        on entry do
          myPort!rep('\'A\'')
        end
    }
 }
}

```
Sending of a message on a port with given parameters.
The name of the port must be defined.<br>
In our example, type: `myPort`.<br>
Type `!`.<br>
The expression of the message must be defined.<br>
In our example, type: `rep('\'A\'')`.<br>

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining an entry Composite State](Defining-a-entry-CompositeState)<br/>
[Defining a Required Port](Defining-a-RequiredPort)