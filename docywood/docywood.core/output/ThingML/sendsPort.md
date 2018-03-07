### <a name="Defining-a-sends-RequiredPort"></a>Defining a sends Required Port

```
thing TestArrays4 {
 optional required port myPort {
  sends rep
 }
}
```
A thing can send a set of messages asynchronously. Messages are sent via ports.
Type `sends`. 
The message must be defined.
In our example, type: `rep`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Required Port](Defining-a-RequiredPort)
